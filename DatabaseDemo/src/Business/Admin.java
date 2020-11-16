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
public class Admin extends DatabaseSerializeableObject{
    public int AccountID;
    public Admin(){
        super();
        AccountID = -1;
    }
    
    public Admin(Account ac){
        this();
        this.AccountID = ac.UID;
        ac.AccountType = "admin";
    }
}
