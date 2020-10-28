package Business.Airliner;


/**
 *
 * @author Administrator / Bohan Feng
 */
public class Airplane {

    public static int planeCount = 0;

    private int ID;
    private String model;
    private String manufacturer;
    private int SeatNum;

    public Airplane(){
        planeCount++;
        this.ID = planeCount;
    }

    public Airplane(String mode, String manu){
        this();
        this.model = mode;
        this.manufacturer = manu;
    }

    /**getter and setters */

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getSeatNum() {
        return this.SeatNum;
    }

    public void setSeatNum(int SeatNum) {
        this.SeatNum = SeatNum;
    }



}
