/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Travel;

import Business.Flight.FlightSchedule;


/**
 *
 * @author Administrator
 */
public class MasterTravelSchedule {
    FlightSchedule flightSchedule;
    
    public MasterTravelSchedule(){
        flightSchedule = new FlightSchedule();
    }

    public FlightSchedule getFlightSchedule() {
        return flightSchedule;
    }

    public void setFlightSchedule(FlightSchedule flightSchedule) {
        this.flightSchedule = flightSchedule;
    }
 
    
}
