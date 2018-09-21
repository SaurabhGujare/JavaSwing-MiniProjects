/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author 123
 */
public class Product {
    private String name;
    private String price;
    private String availNum;
    private String description;
    private Supplier supplier;

    public Product(){
        supplier = new Supplier();
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
    
    
    public String getAvailNum() {
        return availNum;
    }

    public String getDescription() {
        return description;
    }
    
    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public void setAvailNum(String availNum) {
        this.availNum = availNum;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    
}
