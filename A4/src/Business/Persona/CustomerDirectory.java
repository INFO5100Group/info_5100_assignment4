package Business.Persona;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 *
 * @author Administrator / Bohan Feng
 * add gender
 */
public class CustomerDirectory extends ArrayList<Customer> {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private static int dirCount = 0;
    private int ID;

    public CustomerDirectory(){
        dirCount ++;
        ID = dirCount;
    }

    public int getID(){
        return this.ID;
    }

    /**
     * add a new customer to directory
     * @param firstName first name 
     * @param lastName last name
     * @return the customer added to directory
     */
    public Customer addCustomer(String firstName, String lastName,String gender){
        Customer toAdd = new Customer(firstName, lastName,gender);
        this.add(toAdd);
        return toAdd;
    }

    /**
     * remove a customer 
     * @param c the customer to be removed
     */
    public void removeCustomer(Customer c){
        this.remove(c);
    }

    /**
     * search a customer by id
     * @param pID search id
     * @return the customer with id
     */
    public Customer searchByID(int pID){
        try{
            return (Customer)this.stream()
                    .filter(c -> c.getID() == pID)
                    .toArray()[0];
        }catch(java.lang.ArrayIndexOutOfBoundsException e){}
        return null;
    }

    /**
     * search a list of customer by given customer first name
     * @param keyword first name key word
     * @return a customer Directory that have customers have first name with key words
     */
    public CustomerDirectory searchByFirstName(String keyword){
        return this.stream()
        .filter(c -> c.getFName().contains(keyword))
        .collect(Collectors
        .toCollection(CustomerDirectory::new)); 
    }

    /**
     * search a list of customer s by given cusomer last name
     * @param keyword last name key word
     * @return a customer Directory that have customers have first name with key words
     */
    public CustomerDirectory searchByLastName(String keyword){
        return this.stream()
        .filter(c -> c.getLName().contains(keyword))
        .collect(Collectors
        .toCollection(CustomerDirectory::new)); 
    }
}
