package Business;

import Business.Employee.Employee;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.Role.RestaurantRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        Employee employee1 = system.getEmployeeDirectory().createEmployee("RRH1");
        Employee employee2 = system.getEmployeeDirectory().createEmployee("RRH2");
        Employee employee3 = system.getEmployeeDirectory().createEmployee("RRH3");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        UserAccount ub = system.getUserAccountDirectory().createUserAccount("deliverman", "deliverman", employee1, new DeliverManRole());
        UserAccount uc = system.getUserAccountDirectory().createUserAccount("restaurant", "restaurant", employee2, new RestaurantRole());
        UserAccount ud = system.getUserAccountDirectory().createUserAccount("customer", "customer", employee3, new CustomerRole());
        return system;
    }
    
}
