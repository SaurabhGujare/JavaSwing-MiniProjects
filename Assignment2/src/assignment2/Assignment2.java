/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

/**
 *
 * @author saurabhgujare
 */
public class Assignment2 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    static void getData(BufferedReader reader, Product product) throws IOException{
        
        String productName;
        float productPrice;
        int availabilityNumber;
        String description;
        String supplierName;
        String supplierPhone;
        String supplierEmail;
        
        System.out.println("\nENTER THE PRODUCT NAME: ");   
        productName=reader.readLine();
        product.setName(productName);
        
        
        try{
        System.out.println("\nENTER THE PRODUCT PRICE: ");
        productPrice=Float.parseFloat(reader.readLine());
        product.setPrice(productPrice);
        }catch(NumberFormatException e){System.out.println("Not a valid input");}
        
        try{
        System.out.println("\nENTER THE AVAILABILITY NUMBER: ");
        availabilityNumber=Integer.parseInt(reader.readLine());
        product.setAvailNum(availabilityNumber);
        }catch(NumberFormatException e){System.out.println("Not a valid input");}
       
        System.out.println("\nDESCRIBE THE PRODUCT: ");
        description=reader.readLine();
        product.setDescription(description);
        
        System.out.println("\nENTER SUPPLIER NAME: ");
        supplierName=reader.readLine();
        product.getSupplier().setSuppliername(supplierName);
        
        System.out.println("\nENTER SUPPLIER PHONE NUMBER: ");
        supplierPhone=reader.readLine();
        product.getSupplier().setSupplier_phone(supplierPhone);
        
        System.out.println("\nENTER SUPPLIER EMAIL ADDRESS: ");
        supplierEmail=reader.readLine();
        product.getSupplier().setSupplier_email(supplierEmail);
          
    }
    
    static void showData(Product product) {
        System.out.println("\n*******PRODUCT DETAILS*********");
        System.out.println("\nProduct Name: "+product.getName());
        System.out.println("\nProduct Price: "+product.getPrice()+"$");
        System.out.println("\nProduct Avilability: "+product.getAvailNum());
        System.out.println("\nProduct Description: "+product.getDescription());
        System.out.println("\nSupplier Name: "+product.getSupplier().getSuppliername());
        System.out.println("\nSupplier Phone No.: "+product.getSupplier().getSupplier_phone());
        System.out.println("\nSupplier Email ID.: "+product.getSupplier().getSupplier_email());
        System.out.println("************************************");
       
    }
    static void updateData(Product product, BufferedReader reader) throws IOException{
        String productName;
        float productPrice;
        int availabilityNumber;
        String description;
        String supplierName;
        String supplierPhone;
        String supplierEmail;
        int j=chooseUpdateAction(reader);
        while(j!=8){
            if(j==1){
                System.out.println("\nENTER THE PRODUCT NAME: ");   
                productName=reader.readLine();
                product.setName(productName);    
            }
            else if(j==2){
                try{
                System.out.println("\nENTER THE PRODUCT PRICE: ");
                productPrice=Float.parseFloat(reader.readLine());
                product.setPrice(productPrice);
                }catch(NumberFormatException e){System.out.println("***ERROR:Not a valid input***");}       
            }
            else if(j==3){
                try{
                System.out.println("\nENTER THE AVAILABILITY NUMBER: ");
                availabilityNumber=Integer.parseInt(reader.readLine());
                product.setAvailNum(availabilityNumber);
                }catch(NumberFormatException e){System.out.println("***ERROR:Not a valid input***");}         
            }
            else if(j==4){
                System.out.println("\nDESCRIBE THE PRODUCT: ");
                description=reader.readLine();
                product.setDescription(description);      
            }
            else if(j==5){
                System.out.println("\nENTER SUPPLIER NAME: ");
                supplierName=reader.readLine();
                product.getSupplier().setSuppliername(supplierName);               
            }
            else if(j==6){
                System.out.println("\nENTER SUPPLIER PHONE NUMBER: ");
                supplierPhone=reader.readLine();
                product.getSupplier().setSupplier_phone(supplierPhone);
                 
            }
            else if(j==7){
                System.out.println("\nENTER SUPPLIER EMAIL ADDRESS: ");
                supplierEmail=reader.readLine();
                product.getSupplier().setSupplier_email(supplierEmail);            
            }
            else{
                System.out.print("\n**ALERT** Please select appropriate Option"); 
            }
            j=chooseUpdateAction(reader);
        } 
         
    }
    static int chooseAction(BufferedReader reader) throws IOException{
        System.out.println("\nEnter the corresponding number to perform actions given below:\n\t1. VIEW PRODUCT\n\t2. UPDATE PRODUCT\n\t3. EXIT");
        int chooseOption=Integer.parseInt(reader.readLine());
        return chooseOption;
    }
    static int chooseUpdateAction(BufferedReader reader) throws IOException{
        System.out.println("\n\t\tChoose what you wanna update");
         System.out.println("\n\t\t1. Product Name");
         System.out.println("\n\t\t2. Product Price");
         System.out.println("\n\t\t3. Product Availability");
         System.out.println("\n\t\t4. Product Description");
         System.out.println("\n\t\t5. Supplier Name");
         System.out.println("\n\t\t6. Supplier Phone");
         System.out.println("\n\t\t7. Supplier Email");
         System.out.println("\n\t\t8. Exit");
         
        int chooseUpdateOption=Integer.parseInt(reader.readLine());        
        return chooseUpdateOption;
    }
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        Product product=new Product();
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
           
        //Create a Product
        System.out.println("****Create a product***");
        getData(reader, product);
        //View the Product
        System.out.println("\nThe product entered is as follows: ");
        showData(product);
        try{
        int i=chooseAction(reader);
       
        while(i!=3){
            if(i==1){
                showData(product);   
            }
            else if(i==2){
               updateData(product,reader);  
            }
            else{
                System.out.print("\n**ALERT** Please select appropriate Option"); 
            }
            try{
            i=chooseAction(reader);
            }catch(NumberFormatException e){System.out.println("**ALERT** Please select appropriate Option");}
        }
    }catch(NumberFormatException e){System.out.println("**ALERT** Please select appropriate Option");}
          
} 
    
}
