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
    TravelOffice travelOffice;
    
    public MasterTravelSchedule(){
        flightSchedule = new FlightSchedule();
        travelOffice = new TravelOffice();
    }

    public FlightSchedule getFlightSchedule() {
        return flightSchedule;
    }

    public void setFlightSchedule(FlightSchedule flightSchedule) {
        this.flightSchedule = flightSchedule;
    }

    public TravelOffice getTravelOffice() {
        return travelOffice;
    }

    public void setTravelOffice(TravelOffice travelOffice) {
        this.travelOffice = travelOffice;
    }
    
}
