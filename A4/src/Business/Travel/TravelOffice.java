/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Travel;

import Business.Persona.CustomerDirectory;

/**
 *
 * @author Administrator
 */
public class TravelOffice {
    CustomerDirectory customerDirecotry;
    
    public TravelOffice(){
        customerDirecotry = new CustomerDirectory();
    }

    public CustomerDirectory getCustomerDirecotry() {
        return customerDirecotry;
    }

    public void setCustomerDirecotry(CustomerDirectory customerDirecotry) {
        this.customerDirecotry = customerDirecotry;
    }
    
}
