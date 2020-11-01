/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Business.Flight.Flight;
import Business.Flight.FlightSchedule;
import Business.Flight.Seat;
import Business.Flight.Ticket;
import Business.Flight.TicketDirectory;
import Business.Persona.Customer;
import Business.Persona.CustomerDirectory;
import Business.Airliner.*;
import java.util.Date;

/**
 *
 * @author Bohan Feng
 */
public class InitEverything {
    /**
     * this one create some customers
     * @return 
     */
    public static CustomerDirectory createCustomers(){
        String fnames[] = new String[]{
            "Joe",
            "Mark",
            "Sam",
            "Seraphine",
            "Abby"
        };
        String lnames[] = new String[]{
            "Doe",
            "Bacchi",
            "Wafer",
            "Yanek",
            "Smith",
        };
        String genders[] = new String[]{
            "male",
            "female",
            "other"
        };
        
        CustomerDirectory re = new CustomerDirectory();
        
        int genIndex = 0;
        for(String fname: fnames){
            for(String lname : lnames){
                re.add(new Customer(fname, lname, genders[genIndex % 3]));
                genIndex ++;
            }
        }
        
        return re;
    }
    
    public static Fleet createAirplanes(){
        Fleet re = new Fleet();
        
        for(int i = 0; i < 10; i++){
            Airplane newPlane = new Airplane("airmodel" + (99 - i), "airMaunfacture" + i);
            newPlane.setSeatNum(20 * i);
            re.add(newPlane);
        }
        return re;
    }
    
    public static FlightSchedule createFlightScheduleForLiner(String lname){
        FlightSchedule re = new FlightSchedule();
        
        String placeNames[] = new String[]
        {
            "Mars",
            "Jupiter",
            "Saturn",
            "Neptune",
            "Mercury",
            "Venus",
            "Uranus",
            "Earth"
        };
        
        for(int i = 0; i < 10; i++){
            Flight f = new Flight(lname + "00" + i);
            f.setDestination(placeNames[(int)(Math.random() * 10) % 8]);
            f.setDeparture(placeNames[(int)(Math.random() * 10)% 8]);
            f.setDepartTime(randDate());
            re.add(f);
        }
        return re;
    }
        
    public static AirlinerDirectory createAirliners(){
        AirlinerDirectory re = new AirlinerDirectory();
        String lnames[] = new String[]{
          "BIG",  
          "SML",  
          "XXX",  
          "YUZ",  
          "ASD",  
          "FGH",  
        };
        for(int i = 0; i < 6; i ++){
            Airliner newLiner = new Airliner(createFlightScheduleForLiner(lnames[i]),createAirplanes());
            newLiner.setLinerName(lnames[i] + " Airline");
            re.add(newLiner);
        }
        return re;
    }
    
    public static TicketDirectory createTickets(CustomerDirectory cd){
        TicketDirectory re = new TicketDirectory();
        String placeNames[] = new String[]
        {
            "Mars",
            "Jupiter",
            "Saturn",
            "Neptune",
            "Earth"
        };
        
        String flightNames[] = new String[]
        {
            "sad-01",
            "dsf-02",
            "fg-03",
            "pp-04"
        };
        String seatLocation[] = new String[]
        {
            "window",
            "middle",
            "Aisle"
        };
        int custCount = 0;
        
        for(int i = 0; i < 2; i++){
            for(Customer c : cd){
            custCount++;
            Seat s = new Seat(custCount);
            s.setRowNum(custCount/4);
            s.setColumnNum(custCount%4);
            s.setLocation(seatLocation[custCount % 3]);
            Flight f = new Flight(flightNames[custCount % 4]);
            f.setDeparture(placeNames[custCount % 5]);
            f.setDestination(placeNames[4 - (custCount % 5)]);
            f.setDepartTime(randDate());
            Ticket t = new Ticket(c, s, f);
            re.add(t);
            }
        } 
        return re;
    }
    
    public static Date randDate(){
        int year = (int)(Math.random() * 10 + 115);
        int month = (int)(Math.random() * 11 + 1);
        int day = (int)(Math.random() * 27 + 1);
        int hour = (int)(Math.random() * 23 + 1);
        int min = (int)(Math.random() * 59 + 1);
        return new Date(year, month, day, hour, min);
    }
    
    
}
