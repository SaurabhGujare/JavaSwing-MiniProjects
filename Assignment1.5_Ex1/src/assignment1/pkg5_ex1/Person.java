/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1.pkg5_ex1;


/**
 *
 * @author saurabhgujare
 */
public class Person {
    
    String first_name="Joe";
    String last_name="Smith";
    Address local_address;
    Address work_address;
    Address home_address;

    
    public Person(){
        local_address=new Address();
        work_address=new Address();
        home_address=new Address();
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
