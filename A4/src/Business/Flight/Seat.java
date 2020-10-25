
package Business.Flight;

/**
 *
 * @author Administrator / Bohan Feng
 */
public class Seat {
    public static int seatCount = 0;

    private int ID;
    /** class for seat */
    private String seatClass;

    /**
     * Constructor with out class specification
     */
    public Seat() {
        seatCount ++;
        this.ID = seatCount;
    }

    /**
     * constuctor with class specification
     * @param classNme
     */
    public Seat(String classNme){
        this();
        this.seatClass = classNme;
    }
 
    public String getSeatClass() {
        return this.seatClass;
    }

    public void setSeatClass(String seatClass) {
        this.seatClass = seatClass;
    }

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }


    @Override
    public String toString() {
        return "{" +
            " ID='" + ID + "'" +
            ", seatClass='" + seatClass + "'" +
            "}";
    }

}
