/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author saurabhgujare
 */
public class AirplaneDirectory {
    private ArrayList<AirPlane> airplaneList;

    public AirplaneDirectory() {
        airplaneList = new ArrayList<AirPlane>();
    }

    public ArrayList<AirPlane> getAirplaneList() {
        return airplaneList;
    }

    public void setAirplaneList(ArrayList<AirPlane> airplaneList) {
        this.airplaneList = airplaneList;
    }
    
    public AirPlane addAirplane(){
        AirPlane airplane= new AirPlane();
        airplaneList.add(airplane);
        
        return airplane;
    }
    

    
    public void deleteAirplane(AirPlane aiplane){
        airplaneList.remove(aiplane);
    }
  
}
