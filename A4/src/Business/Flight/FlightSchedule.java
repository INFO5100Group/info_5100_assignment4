
package Business.Flight;

import java.sql.Date;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 *
 * @author Administrator / Bohan Feng
 */
public class FlightSchedule extends ArrayList<Flight>{
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public static int flightSchedultCount = 0;
    
    private int ID;

    public FlightSchedule(){
        flightSchedultCount++;
        ID = flightSchedultCount;
    }

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    /**
     * add a flight to flight schedule
     * throws exception if some of flight properties is not defined
     * @param f flight to add
     * @throws Exception properties do not define
     */
    public void addFlight(Flight f) throws Exception {
        if(f.getArriveTime() == null){
            throw new Exception("Arraive time cannot be null before adding to schedule");
        }
        else if(f.getDepartTime() == null){
            throw new Exception("DepartTime time cannot be null before adding to schedule");
        }
        else if(f.getDestination() == null){
            throw new Exception("Destination cannot be null before adding to schedule");
        }
        else if(f.getDeparture() == null){
            throw new Exception("Departure cannot be null before adding to schedule");
        }
        else{
            this.add(f);
        }
    }

    /**
     * remove a flight in flight schedule
     * throws exception if flight does not exist
     * @param f the flight to be removed
     * @throws Exception flight does not exist in current schedule;
     */
    public void removeFlight(Flight f) throws Exception {
        if(!this.contains(f)){
            throw new Exception(f + "does not exist in current schedule");
        }
        else{
            this.remove(f);
        }
    }

    /**
     * find a specific flight 
     * @param fID the ID needs to be found
     * @return a flight that have a specific ID
     */
    public Flight searchByID(int fID){
        try{
            return (Flight)this.stream()
                    .filter(f -> f.getID() == fID)
                    .toArray()[0];
        }catch(java.lang.ArrayIndexOutOfBoundsException e){}
        return null;
    }

    /**
     * search a list of flight that have they keyword contained in Destination name
     * @param keyword 
     * @return
     */
    public FlightSchedule searchByDestination(String keyword){
        return this.stream()
        .filter(f -> f.getDestination().contains(keyword))
        .collect(Collectors
        .toCollection(FlightSchedule::new));
    }

    /**
     * search a list of flight that have keyword contained in Departure name
     * @param keyword
     * @return
     */
    public FlightSchedule searchByDeparture(String keyword){
        return this.stream()
        .filter(f -> f.getDeparture().contains(keyword))
        .collect(Collectors
        .toCollection(FlightSchedule::new));
    }

    /**
     * search a list of flight that have keyword contained in flight name
     * @param keyword
     * @return
     */
    public FlightSchedule searchByName(String keyword){
        return this.stream()
        .filter(f -> f.getFlightName().contains(keyword))
        .collect(Collectors
        .toCollection(FlightSchedule::new));
    }

    /**
     * search a list of flight that arrive at specific day
     * @param d
     * @return
     */
    public FlightSchedule searchByArriveTime(Date d){
        return this.stream()
        .filter(f ->
            f.getArriveTime()
            .toInstant()
            .truncatedTo(ChronoUnit.DAYS)
            .equals(
                d.toInstant()
                .truncatedTo(ChronoUnit.DAYS)))
        .collect(Collectors
        .toCollection(FlightSchedule::new));
    }
 
    /**
     * search a list of flight that depart at specific day
     * @param d
     * @return
     */
    public FlightSchedule searchByDepartTime(Date d){
        return this.stream()
        .filter(f ->
            f.getDepartTime()
            .toInstant()
            .truncatedTo(ChronoUnit.DAYS)
            .equals(
                d.toInstant()
                .truncatedTo(ChronoUnit.DAYS)))
        .collect(Collectors
        .toCollection(FlightSchedule::new));
    }
}
