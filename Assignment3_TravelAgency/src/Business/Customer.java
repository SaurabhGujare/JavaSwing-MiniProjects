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
public class Customer {
    private String firstName;
    private String lastName;
    private String emailId;
    private ArrayList<Seat> bookingHistory;

    public Customer() {
         bookingHistory = new ArrayList<Seat>();
    }

    public ArrayList<Seat> getBookingHistory() {
        return bookingHistory;
    }

    public void setBookingHistory(ArrayList<Seat> bookingHistory) {
        this.bookingHistory = bookingHistory;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    
     @Override
    public String toString() {
        return firstName+" "+lastName;
    }
    
}
