
package Business.Airliner;

import java.util.ArrayList;

/**
 *
 * @author Administrator / Bohan Feng
 */
public class Fleet extends ArrayList<Airplane>{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public static int fleetCount;
    private int ID;
    private String name;

    //TODO: find, update, remove, add plane

    public Fleet(){
        fleetCount ++;
        this.ID = fleetCount;
    }

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    } 

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
