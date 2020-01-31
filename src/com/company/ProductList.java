package com.company;

import com.company.products.Product;

import java.util.ArrayList;

public class ProductList {

    //region Properties
    private ArrayList<Product> productArrayList;
    //endregion

    //region Constructors
    public ProductList(Product product) {
        makeProductList(product);
    }
    //endregion

    //region public Methods
    private ArrayList<Product> makeProductList(Product product) {
        this.productArrayList = new ArrayList<Product>();
        for (int i = 0; i < 10; i++) {
            this.productArrayList.add(product);
        }
        return productArrayList;
    }
    //endregion

    //region Getters and Setters
    public ArrayList<Product> getProductArrayList() {
        return productArrayList;
    }

    public void setProductArrayList(ArrayList<Product> productArrayList) {
        this.productArrayList = productArrayList;
    }
    //endregion

    //region Equals HashCode toString

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductList that = (ProductList) o;

        return productArrayList != null ? productArrayList.equals(that.productArrayList) : that.productArrayList == null;
    }

    @Override
    public String toString() {
        return "ProductList{" +
                "productArrayList=" + productArrayList +
                '}';
    }

    @Override
    public int hashCode() {
        return productArrayList != null ? productArrayList.hashCode() : 0;

    }

    //endregion


}
