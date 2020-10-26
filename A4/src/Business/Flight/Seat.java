
package Business.Flight;

/**
 *
 * @author Administrator / Bohan Feng
 */
public class Seat {
    public static int seatCount = 0;

    private int ID;

    private int SeatNum;
    private boolean isTaken;


    public Seat() {
        seatCount ++;
        this.ID = seatCount;
        isTaken = false;
    }

    public Seat(int num){
        this();
        this.SeatNum = num;
    }

    /**getter and setters */
    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getSeatNum() {
        return this.SeatNum;
    }

    public void setSeatNum(int SeatNum) {
        this.SeatNum = SeatNum;
    }

    public boolean isIsTaken() {
        return this.isTaken;
    }

    public boolean getIsTaken() {
        return this.isTaken;
    }

    public void setIsTaken(boolean isTaken) {
        this.isTaken = isTaken;
    }

    @Override
    public String toString() {
        return "{" +
            " ID='" + ID + "'" +
            ", SeatNum='" + SeatNum + "'" +
            ", isTaken='" + isTaken + "'" +
            "}";
    }

}
