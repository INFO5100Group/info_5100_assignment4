
package Business;

/**
 *
 * @author Bohan Feng
 */
public class Account extends DatabaseSerializeableObject{
    public String AccountName;
    public String Password;
    public String AccountType;
    
    public Account(){
        super();
        this.AccountType = null;
    }
    
    public Account(String un, String pw){
        this();
        this.AccountName = un;
        this.Password = pw;
    }
     
}
