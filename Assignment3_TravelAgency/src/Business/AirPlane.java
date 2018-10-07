/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author saurabhgujare
 */
public class AirPlane {
  
    private String airplaneId;
    private String modelName;
    private FlightDirectory flightdirectory;

    public AirPlane() {
        flightdirectory= new FlightDirectory();
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

    public FlightDirectory getFlightdirectory() {
        return flightdirectory;
    }

    public void setFlightdirectory(FlightDirectory flightdirectory) {
        this.flightdirectory = flightdirectory;
    }
    
    @Override
    public String toString() {
        return airplaneId;
    }
    
}
