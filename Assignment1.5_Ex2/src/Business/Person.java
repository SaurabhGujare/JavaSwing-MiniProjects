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
public class Person {
    
    String first_name="Joe";
    String last_name="Smith";
    String dob="1993/11/23";
    Address local_address;
    Address work_address;
    Address home_address;

    
    public Person(){
        local_address=new Address();
        work_address=new Address();
        home_address=new Address();
        
        work_address.setAddress_line1("360 Huntington Ave");
        work_address.setAddress_line2("Apt 5");
        work_address.setCity("Boston");
        work_address.setState("MA");
        work_address.setZipcode("02115");
        work_address.setCountry("USA");
        
        local_address.setAddress_line1("100 Main Street");
        local_address.setAddress_line2("Apt 6");
        local_address.setCity("Boston");
        local_address.setState("MA");
        local_address.setZipcode("02115");
        local_address.setCountry("USA");
        
        home_address.setAddress_line1("201 Best Street");
        home_address.setAddress_line2("Apt 7");
        home_address.setCity("Boston");
        home_address.setState("MA");
        home_address.setZipcode("02115");
        home_address.setCountry("USA");
    }
    
    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Address getLocal_address() {
        return local_address;
    }

    public void setLocal_address(Address local_address) {
        this.local_address = local_address;
    }

    public Address getWork_address() {
        return work_address;
    }

    public void setWork_address(Address work_address) {
        this.work_address = work_address;
    }

    public Address getHome_address() {
        return home_address;
    }

    public void setHome_address(Address home_address) {
        this.home_address = home_address;
    }
    

}
