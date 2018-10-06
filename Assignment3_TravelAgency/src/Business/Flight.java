/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;

/**
 *
 * @author saurabhgujare
 */
public class Flight {
    private String flightNo;
    private Date departDate;
    private String departLoc;
    private Date arrivalDate;
    private String arrivalLoc;
    private double priceFlight;

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public Date getDepartDate() {
        return departDate;
    }

    public void setDepartDate(Date departDate) {
        this.departDate = departDate;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getDepartLoc() {
        return departLoc;
    }

    public void setDepartLoc(String departLoc) {
        this.departLoc = departLoc;
    }   

    public String getArrivalLoc() {
        return arrivalLoc;
    }

    public void setArrivalLoc(String arrivalLoc) {
        this.arrivalLoc = arrivalLoc;
    }

    public double getPriceFlight() {
        return priceFlight;
    }

    public void setPriceFlight(double priceFlight) {
        this.priceFlight = priceFlight;
    }
    
    
}
