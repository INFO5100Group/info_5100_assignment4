package Business.Airliner;

import Business.Flight.FlightSchedule;

/**
 *
 * @author Administrator / Bohan Feng
 */
public class Airliner {
    public static int linerCount = 0;

    private int ID;
    private String linerName;
    
    private FlightSchedule schedule;
    private Fleet fleet;
    private String adress;

    /**getter and setter */
    public Airliner() {
        linerCount ++;
        this.ID = linerCount;
    }

    public Airliner(FlightSchedule s, Fleet f){
        this();
        this.schedule = s;
        this.fleet = f;
    }

    public FlightSchedule getSchedule() {
        return this.schedule;
    }

    public void setSchedule(FlightSchedule schedule) {
        this.schedule = schedule;
    }

    public Fleet getFleet() {
        return this.fleet;
    }

    public void setFleet(Fleet fleet) {
        this.fleet = fleet;
    }

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getLinerName() {
        return this.linerName;
    }

    public void setLinerName(String linerName) {
        this.linerName = linerName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    
}
