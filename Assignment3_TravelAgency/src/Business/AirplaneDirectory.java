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
    private ArrayList<FlightDirectory> airplaneList;
    private String airplaneId;
    private String modelName;
    private int totalSeats;
    private double fuelCapacity;

    public AirplaneDirectory() {
        airplaneList = new ArrayList<FlightDirectory>();
    }

    public ArrayList<FlightDirectory> getAirplaneList() {
        return airplaneList;
    }

    public void setAirplaneList(ArrayList<FlightDirectory> airplaneList) {
        this.airplaneList = airplaneList;
    }

    public String getAirplaneId() {
        return airplaneId;
    }

    public void setAirplaneId(String airplaneId) {
        this.airplaneId = airplaneId;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
    
    public FlightDirectory addAirplane(){
        FlightDirectory airplane= new FlightDirectory();
        airplaneList.add(airplane);
        return airplane;
    }
    
    public void deleteAirplane(FlightDirectory aiplane){
        airplaneList.remove(aiplane);
    }
    
/*    public FlightDirectory searchAirplane(String modelname){
        for(FlightDirectory fs: this.airplaneList){
            if(fs.getFlightList()..equals(departDate)){
                return fs;
            }
        }
        return null;
    }
 */   
}
