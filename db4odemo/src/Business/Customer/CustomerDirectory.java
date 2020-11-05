/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Organization;
import Business.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CustomerDirectory extends ArrayList<Customer>{
    private ArrayList<Customer> customerList;

    public CustomerDirectory() {
        customerList = new ArrayList();
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }
    
   public Organization createCustomer(Type type){
       Customer customer = null;
       if (type.getValue().equals(Type.Customer.getValue())){
        customerList.add(customer);
        }
        return customer;
    }
    
     public void setCustomerList(ArrayList<Customer> customerList){
        this.customerList = customerList;
    }

    public Customer createAndAddCustomer() {
        Customer customer=new Customer();
        customerList.add(customer);
        return customer;
    }
}
