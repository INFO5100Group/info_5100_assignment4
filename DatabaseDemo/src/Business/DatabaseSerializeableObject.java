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
public class DatabaseSerializeableObject {
    public int UID;
    public String ObjectType;
    
    /**
     * constructor
     */
    public DatabaseSerializeableObject(){
        this.UID = UIDGenerator.generateUniqueId();
        this.ObjectType = this.getClass().getSimpleName() + "";
    }
}
