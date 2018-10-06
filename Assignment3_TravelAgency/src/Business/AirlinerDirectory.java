/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author saurabhgujare
 */
public class AirlinerDirectory {
    private ArrayList<AirplaneDirectory> airlinerList;
    private String airlinerName;
    private int fleetSize;

    public AirlinerDirectory() {
        airlinerList = new ArrayList<AirplaneDirectory>();
    }

    public ArrayList<AirplaneDirectory> getAirlinerList() {
        return airlinerList;
    }

    public void setAirlinerList(ArrayList<AirplaneDirectory> AirlinerList) {
        this.airlinerList = AirlinerList;
    }

    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }

    public int getFleetSize() {
        return fleetSize;
    }

    public void setFleetSize(int fleetSize) {
        this.fleetSize = fleetSize;
    }
    
    public AirplaneDirectory addAirliner(){
        AirplaneDirectory airliner= new AirplaneDirectory();
        airlinerList.add(airliner);
        return airliner;
    }
    
    public void deleteAirplane(AirplaneDirectory airliner){
        airlinerList.remove(airliner);
    }
    
}
