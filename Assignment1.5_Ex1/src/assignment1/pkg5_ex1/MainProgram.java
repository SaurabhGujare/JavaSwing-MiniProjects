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

public class MainProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Person ob=new Person();
        
        //Assigning Input 
        ob.setFirst_name("Joe");
        ob.setLast_name("Smith");
      
        ob.getWork_address().setAddress_line1("360 Huntington Ave");
        ob.getWork_address().setAddress_line2("Apt 5");
        ob.getWork_address().setCity("Boston");
        ob.getWork_address().setState("MA");
        ob.getWork_address().setZipcode("02115");
        
        ob.getHome_address().setAddress_line1("100 Main Street");
        ob.getHome_address().setAddress_line2("Apt 6");
        ob.getHome_address().setCity("Boston");
        ob.getHome_address().setState("MA");
        ob.getHome_address().setZipcode("02115");
        
        ob.getLocal_address().setAddress_line1("201 Best Street");
        ob.getLocal_address().setAddress_line2("Apt 6");
        ob.getLocal_address().setCity("Boston");
        ob.getLocal_address().setState("MA");
        ob.getLocal_address().setZipcode("02115");
        
        //Displaying Output
        System.out.print("Person\n1. First name:"+ob.getFirst_name());
        System.out.print("\n2. Last name: "+ob.getLast_name());
        System.out.print("\n\n"+"Work Address");
        System.out.print("\n1. Address Line1: "+ob.getWork_address().getAddress_line1());
        System.out.print("\n2. Address Line2: "+ob.getWork_address().getAddress_line2());
        System.out.print("\n3. City: "+ob.getWork_address().getCity());
        System.out.print("\n4. State: "+ob.getWork_address().getState());
        System.out.print("\n5. Zipcode: "+ob.getWork_address().getZipcode()+"\n");
        
        System.out.print("\n\n"+"Home Address");
        System.out.print("\n1. Address Line1: "+ob.getHome_address().getAddress_line1());
        System.out.print("\n2. Address Line2: "+ob.getHome_address().getAddress_line2());
        System.out.print("\n3. City: "+ob.getHome_address().getCity());
        System.out.print("\n4. State: "+ob.getHome_address().getState());
        System.out.print("\n5. Zipcode: "+ob.getHome_address().getZipcode()+"\n"); 
  
        System.out.print("\n\n"+"Local Address");
        System.out.print("\n1. Address Line1: "+ob.getLocal_address().getAddress_line1());
        System.out.print("\n2. Address Line2: "+ob.getLocal_address().getAddress_line2());
        System.out.print("\n3. City: "+ob.getLocal_address().getCity());
        System.out.print("\n4. State: "+ob.getLocal_address().getState());
        System.out.print("\n5. Zipcode: "+ob.getLocal_address().getZipcode()+"\n");
    }
    
}
