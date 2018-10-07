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
    private int departureHr;
    private int arrivalHr;
    private int departureMin;
    private int arrivalMin;

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

    public int getDepartureHr() {
        return departureHr;
    }

    public void setDepartureHr(int departureHr) {
        this.departureHr = departureHr;
    }

    public int getArrivalHr() {
        return arrivalHr;
    }

    public void setArrivalHr(int arrivalHr) {
        this.arrivalHr = arrivalHr;
    }

    public int getDepartureMin() {
        return departureMin;
    }

    public void setDepartureMin(int departureMin) {
        this.departureMin = departureMin;
    }

    public int getArrivalMin() {
        return arrivalMin;
    }

    public void setArrivalMin(int arrivalMin) {
        this.arrivalMin = arrivalMin;
    }
    
    @Override
    public String toString() {
        return flightNo;
    }
}
