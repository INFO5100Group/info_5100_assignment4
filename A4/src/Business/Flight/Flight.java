/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Flight;

import java.util.ArrayList;
import java.util.Date;
import Business.Airliner.Airplane;
/**
 *
 * @author Administrator / Bohan Feng
 */
public class Flight extends ArrayList<Seat> {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public static int flightCount = 0;

    private int ID;
    private String flightName;
    private String departure;
    private String destination;
    private Date departTime, arriveTime;

    private Airplane plane;

    public Flight(){
        flightCount ++;
        this.ID = flightCount;
    }

    public Flight(String name){
        this();
        this.flightName = name;
    }

    /**
     * set the avaliability of seat in speicfic index
     * @param index
     * @param avaliable
     */
    public void setSeatAvaliable(int index, boolean avaliable){
        this. get(index).setIsTaken(!avaliable);
    }

    /**
     * get the avaliability of eat in specific index
     * @param index
     * @return
     */
    public boolean getSeatAvaliable(int index){
        return this.get(index).getIsTaken();
    }

    /**getter and setters */
    public boolean getAvaliable(){
        for(Seat s : this){
            if(s.getIsTaken() == false){
                return true;
            }
        };
        return false;
    }

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFlightName() {
        return this.flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getDeparture() {
        return this.departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return this.destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDepartTime() {
        return this.departTime;
    }

    public void setDepartTime(Date departTime) {
        this.departTime = departTime;
    }

    public Date getArriveTime() {
        return this.arriveTime;
    }

    public void setArriveTime(Date arriveTime) {
        this.arriveTime = arriveTime;
    }

    public Airplane getPlane() {
        return this.plane;
    }
    
    /**
     * once plane for flight is defined, define all the seats we have in this flight
     * and check the seat number of plane is not 0;
     * 
     * @throws Exception
     */
    public void setPlane(Airplane plane) throws Exception {
        if(plane.getSeatNum() == 0){
            throw new Exception("Plane seat number not set");
        }
        this.plane = plane;
        for(int i = 0; i < this.plane.getSeatNum(); i++){
            Seat s = new Seat(i);
            this.add(s);
        }
    }

    /** to string */
    @Override
    public String toString() {
        return "{" +
            " ID='" + getID() + "'" +
            ", flightName='" + getFlightName() + "'" +
            ", departure='" + getDeparture() + "'" +
            ", destination='" + getDestination() + "'" +
            ", departTime='" + getDepartTime() + "'" +
            ", arriveTime='" + getArriveTime() + "'" +
            "}";
    }


}
