
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
    private int rowNum;
    private int columnNum;
    private String Location;


    public Seat() {
        seatCount ++;
        this.ID = seatCount;
        isTaken = false;
    }

    public Seat(int num){
        this();
        this.SeatNum = num;
    }

    public Seat(int row, int col, String lo){
        this();
        this.columnNum = col;
        this.rowNum = row;
        this.Location = lo;
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

    public int getRowNum() {
        return rowNum;
    }

    public void setRowNum(int rowNum) {
        this.rowNum = rowNum;
    }

    public int getColumnNum() {
        return columnNum;
    }

    public void setColumnNum(int columnNum) {
        this.columnNum = columnNum;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
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
