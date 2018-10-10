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
    private Seat[][] seatArray;
    Airliner airliner;

    public Flight(Airliner airliner) {
        this.airliner=airliner;
        
    }
    
    public void initFlight(){
        seatArray = new Seat[25][6];
        
        for(int i = 0 ; i<25;i++){
            for(int j =0 ;j<6;j++){
                seatArray[i][j] = new Seat(this);
                seatArray[i][j].setSeat(true);
                if(j==0)seatArray[i][j].setSeatNo("A"+" "+(i+1));
                    else if (j==1)seatArray[i][j].setSeatNo("B"+" "+(i+1));
                    else if (j==2)seatArray[i][j].setSeatNo("C"+" "+(i+1));
                    else if (j==3)seatArray[i][j].setSeatNo("D"+" "+(i+1));
                    else if (j==4)seatArray[i][j].setSeatNo("E"+" "+(i+1));
                    else seatArray[i][j].setSeatNo("F"+" "+(i+1));
            }
        }
    }

    public Airliner getAirliner() {
        return airliner;
    }

    public void setAirliner(Airliner airliner) {
        this.airliner = airliner;
    }

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

    public Seat[][] getSeatArray() {
        return seatArray;
    }

    public void setSeatArray(Seat[][] seatArray) {
        this.seatArray = seatArray;
    }
    
    @Override
    public String toString() {
        return flightNo;
    }
}
