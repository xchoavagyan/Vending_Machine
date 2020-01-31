package com.company;

import com.company.products.Product;

import java.util.ArrayList;

public class ProductsInRow {
    //region Properties
    private ArrayList<ProductList> productListsInRow;
    //endregion

    //region Constructors
    public ProductsInRow(Product product1, Product product2, Product product3) {

        makeProductsRow(product1, product2, product3);
    }
    //endregion

    //region public Methods
    private ArrayList<ProductList> makeProductsRow(Product product1, Product product2, Product product3) {
        this.productListsInRow = new ArrayList<ProductList>();
        this.productListsInRow.add(new ProductList(product1));
        this.productListsInRow.add(new ProductList(product2));
        this.productListsInRow.add(new ProductList(product3));
        return productListsInRow;
    }
    //endregion

    //region Getters and Setters
    public ArrayList<ProductList> getProductListsInRow() {
        return productListsInRow;
    }

    public void setProductListsInRow(ArrayList<ProductList> productListsInRow) {
        this.productListsInRow = productListsInRow;
    }
    //endregion

    //region Equals HashCode toString

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductsInRow that = (ProductsInRow) o;

        return productListsInRow != null ? productListsInRow.equals(that.productListsInRow) : that.productListsInRow == null;
    }

    @Override
    public int hashCode() {
        return productListsInRow != null ? productListsInRow.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "ProductsInRow{" +
                "productListsInRow=" + productListsInRow +
                '}';
    }
    //endregion





}
