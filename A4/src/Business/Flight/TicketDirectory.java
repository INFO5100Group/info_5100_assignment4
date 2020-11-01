package Business.Flight;

import java.util.ArrayList;
import java.util.stream.Collectors;

import Business.Persona.*;

public class TicketDirectory extends ArrayList<Ticket> {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    public static int TicketDirectoryCount = 0;

    private int ID;

    public TicketDirectory(){
        TicketDirectoryCount ++;
        this.ID = TicketDirectoryCount;
    }

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    

    /**
     * get ticket by customer
     * @param customer
     * @return
     */
    public TicketDirectory getTicketsByCustomer(Customer customer){
        return this.stream()
        .filter(t -> t.getTicketCustomer().getID() == customer.getID())
        .collect(Collectors
        .toCollection(TicketDirectory::new));
    }
    
    public Ticket getTicketByID(int ID){
        return (Ticket)this.stream()
                .filter(t -> t.getID() == ID)
                .toArray()[0];
    }
}
