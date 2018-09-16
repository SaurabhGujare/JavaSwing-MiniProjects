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
public class Medical {
    private String record_num;
    private String allergy1;
    private String allergy2;
    private String other;

    public String getRecord_num() {
        return record_num;
    }

    public void setRecord_num(String record_num) {
        this.record_num = record_num;
    }

    public String getAllergy1() {
        return allergy1;
    }

    public void setAllergy1(String allergy1) {
        this.allergy1 = allergy1;
    }

    public String getAllergy2() {
        return allergy2;
    }

    public void setAllergy2(String allergy2) {
        this.allergy2 = allergy2;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
    
}
