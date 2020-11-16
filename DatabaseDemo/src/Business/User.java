/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Bohan Feng
 */
public class User extends DatabaseSerializeableObject{
    public String Firstname, Lastname;
    public int AccountID;
    
    public User(){
        super();
    }
    
    public User(String fname, String lname, Account ac){
        this.Firstname=fname;
        this.Lastname = lname;
        this.AccountID = ac.UID;
        ac.AccountType = "user";
    }
}
