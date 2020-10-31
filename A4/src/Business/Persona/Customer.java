
package Business.Persona;

/**
 *
 * @author Administrator / Bohan Feng
 * add gender
 */
public class Customer extends Person{
    
    public Customer(){
        super();
    }

    public Customer(String fname, String lname, String gender){
        super(fname, lname, gender);
    }

    @Override
    public String toString() {
        return this.getFName() + " " + this.getLName();
    }
}
