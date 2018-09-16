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
public class Bank {
    private String bank_name;
    private String routing_num;
    private String savings_num;
    private String savings_bal;
    private String checkin_num;
    private String checkin_bal;

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getRouting_num() {
        return routing_num;
    }

    public void setRouting_num(String routing_num) {
        this.routing_num = routing_num;
    }

    public String getSavings_num() {
        return savings_num;
    }

    public void setSavings_num(String savings_num) {
        this.savings_num = savings_num;
    }

    public String getSavings_bal() {
        return savings_bal;
    }

    public void setSavings_bal(String savings_bal) {
        this.savings_bal = savings_bal;
    }

    public String getCheckin_num() {
        return checkin_num;
    }

    public void setCheckin_num(String checkin_num) {
        this.checkin_num = checkin_num;
    }

    public String getCheckin_bal() {
        return checkin_bal;
    }

    public void setCheckin_bal(String checkin_bal) {
        this.checkin_bal = checkin_bal;
    }
       
}
