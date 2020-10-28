
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
    private String gender;

    /**
     * Constructor with person's name
     */
    public Person(){
        personCount ++;
        ID = personCount;
    }

    /**
     * Contructor with person's name
     * add gender
     * @param fname
     * @param lname
     */
    public Person(String fname, String lname,String gender){
        this();
        this.setFName(fname);
        this.setLName(lname);
        this.setGender(gender);
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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
