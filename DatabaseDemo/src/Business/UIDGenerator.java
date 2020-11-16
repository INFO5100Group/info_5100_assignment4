/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.UUID;

/**
 *  生成UID
 * @author Bohan Feng
 */
public class UIDGenerator {
    public static int generateUniqueId() {      
        UUID idOne = UUID.randomUUID();
        String str=""+idOne;        
        int uid=str.hashCode();
        return uid > 0 ? uid : uid * -1;
    }
}
