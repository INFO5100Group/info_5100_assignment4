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
    
    private AirlinerDirectory airlinerDirectory;
    private MasterTravelSchedule masterTravelSchedule;
    
    public TravelAgency(){
        airlinerDirectory= new AirlinerDirectory();
        this.masterTravelSchedule = new MasterTravelSchedule();
    }

    public AirlinerDirectory getAirlinerDirectory() {
        return airlinerDirectory;
    }

    public void setAirlinerDirectory(AirlinerDirectory airlinerDirectory) {
        this.airlinerDirectory = airlinerDirectory;
    }

    public MasterTravelSchedule getMasterTravelSchedule() {
        return masterTravelSchedule;
    }

    public void setMasterTravelSchedule(MasterTravelSchedule masterTravelSchedule) {
        this.masterTravelSchedule = masterTravelSchedule;
    }

}
