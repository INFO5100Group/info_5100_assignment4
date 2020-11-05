/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;
import Business.Organization;
import Business.OrganizationDirectory;
import Business.Role.RestaurantRole;
import Business.Role.Role;
import java.util.ArrayList;



public class Customer extends Organization{
    private String name;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Customer() {
        super(Organization.Type.Customer.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RestaurantRole());
        return roles;
    }


}