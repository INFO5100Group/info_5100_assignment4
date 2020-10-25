
package Business.Persona;

/**
 *
 * @author Administrator / Bohan Feng
 */
public class Person {
    public static int personCount = 0;

    private int ID;
    private String fName;
    private String lName;

    /**
     * Constructor with person's name
     */
    public Person(){
        personCount ++;
        ID = personCount;
    }

    /**
     * Contructor with person's name
     * @param fname
     * @param lname
     */
    public Person(String fname, String lname){
        this();
        this.setFName(fname);
        this.setLName(lname);
    }

    public int getID() {
        return this.ID;
    }

    public String getFName() {
        return this.fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getLName() {
        return this.lName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    @Override
    public String toString() {
        return "{" +
            " ID='" + ID + "'" +
            ", fName='" + fName + "'" +
            ", lName='" + lName + "'" +
            "}";
    }
    
}
