package com.company;

import com.company.products.Product;

import java.util.HashMap;

public class VendingMachine {
    //region Properties
    private HashMap<String, ProductsInRow> hashMap;
    //endregion

    //region Constructors
    public VendingMachine() {

        this.hashMap = Initialise.init();

    }
    //endregion

    //region public Methods
    public Product giveProduct(Command command) {
        Product product = this.hashMap.get(command.getLine()).getProductListsInRow().get(command.getColumn()).getProductArrayList().get(0);
        this.hashMap.get(command.getLine()).getProductListsInRow().get(command.getColumn()).getProductArrayList().remove(0);
        return product;
    }

    public Integer quantityOfProduct(Command command){
        return this.hashMap.get(command.getLine()).getProductListsInRow().get(command.getColumn()).getProductArrayList().size();
    }
    //endregion

    //region Getters and Setters

    public HashMap<String, ProductsInRow> getHashMap() {
        return hashMap;
    }

    public void setHashMap(HashMap<String, ProductsInRow> hashMap) {
        this.hashMap = Initialise.init();
    }

    //endregion

    //region Equals HashCode toString

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VendingMachine that = (VendingMachine) o;

        return hashMap != null ? hashMap.equals(that.hashMap) : that.hashMap == null;
    }

    @Override
    public int hashCode() {
        return hashMap != null ? hashMap.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "VendingMachine{" +
                "hashMap=" + hashMap +
                '}';
    }
    //endregion


}
