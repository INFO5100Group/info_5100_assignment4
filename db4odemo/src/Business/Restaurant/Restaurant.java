/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Organization;
import Business.Role.Role;
import java.util.ArrayList;
import Business.Role.RestaurantRole;

public class Restaurant extends Organization{
    private ArrayList<Food> foodList;

    public ArrayList<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(ArrayList<Food> foodList) {
        this.foodList = foodList;
    }
    
    
    public Restaurant() {
        super(Organization.Type.RestaurantAdmin.getValue());       
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RestaurantRole());
        return roles;
    }
    public Food CreateAndaddFood(){
        Food food = new Food();
        foodList.add(food);
        return food;
    }
}