/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Travel;

import Business.Airliner.AirlinerDirectory;

/**
 *
 * @author Administrator
 */
public class TravelAgency {
    
    public AirlinerDirectory airlinerDirectory;
    
    public TravelAgency(){
        airlinerDirectory= new AirlinerDirectory();
    }

    public AirlinerDirectory getAirlinerDirectory() {
        return airlinerDirectory;
    }

    public void setAirlinerDirectory(AirlinerDirectory airlinerDirectory) {
        this.airlinerDirectory = airlinerDirectory;
    }


    
}
