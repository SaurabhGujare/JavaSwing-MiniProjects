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
public class FlightDirectory {
    
    private ArrayList<Flight> flightList;
    
    public FlightDirectory(){
        flightList = new ArrayList<Flight>();
    }

    public ArrayList<Flight> getFlightList() {
        return flightList;
    }

    public void setFlightList(ArrayList<Flight> flightList) {
        this.flightList = flightList;
    }
    
    public Flight addFlight(){
        Flight flight= new Flight();
        flightList.add(flight);
        return flight;
    }
    
    public void deleteFlight(Flight flight){
        flightList.remove(flight);
    }
    
    public Flight searchFlight(Date departDate){
        for(Flight fs: this.flightList){
            if(fs.getDepartDate().equals(departDate)){
                return fs;
            }
        }
        return null;
    }
    
}
