/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bohan Feng
 */
public class DataManager {
    
    public static String[] InsertSQL(DatabaseSerializeableObject o){
        String re[] = new String[2];
        Field[] fields = o.getClass().getDeclaredFields();
        re[1] = "( " + o.UID + ", ";
        re[0] = "( UID, ";
        int len = fields.length;
        for(int i =0; i< fields.length; i++){
            try {
                if(fields[i].get(o).getClass().getSimpleName() instanceof String){
                    re[1] += "\'" + fields[i].get(o) + "\'";
                }else{
                    re[1] += fields[i].get(o);
                }
                re[0] += fields[i].getName();
                if(i != len - 1){
                    re[1] += ", ";
                    re[0] += ", ";
                }
            } catch (IllegalArgumentException | IllegalAccessException ex) {
                Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        re[1] += " )";
        re[0] += " )";
        return re;
    }
    
    public static String[] InsertObjectSQL(DatabaseSerializeableObject o){
        String[] re = new String[2];
        re[0] = "( UID, ObjectType )";
        re[1] = "( " + o.UID + ", " + "\'" + o.ObjectType +"\' )";
        return re;
    }
}
