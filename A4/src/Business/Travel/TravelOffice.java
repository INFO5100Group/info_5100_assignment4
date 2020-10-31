/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Travel;

import Business.Persona.*;
import Business.Flight.*;

/**
 *
 * @author Administrator / Bohan Feng
 */
public class TravelOffice {
    CustomerDirectory customerDirecotry;
    TicketDirectory ticketDirectory;
    
    public TravelOffice(){
        customerDirecotry = new CustomerDirectory();
        ticketDirectory = new TicketDirectory();
    }

    public CustomerDirectory getCustomerDirecotry() {
        return customerDirecotry;
    }

    public void setCustomerDirecotry(CustomerDirectory customerDirecotry) {
        this.customerDirecotry = customerDirecotry;
    }

    public TicketDirectory getTicketDirectory() {
        return this.ticketDirectory;
    }

    public void setTicketDirectory(TicketDirectory ticketDirectory) {
        this.ticketDirectory = ticketDirectory;
    }
 
}
