package com.oxigen.hardware.penstore;

public class Product {

    String product_key;
    String imgPath;
    String product_name;
    int product_price;
    int product_stock;

    public Product(String product_key,
                   String imgPath,
                   String product_name,
                   int product_price,
                   int product_stock){
        this.imgPath = imgPath;
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_stock = product_stock;
    }

    public String getProduct_key() {
        return product_key;
    }

    public void setProduct_key(String product_key) {
        this.product_key = product_key;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getProduct_price() {
        return product_price;
    }

    public void setProduct_price(int product_price) {
        this.product_price = product_price;
    }

    public int getProduct_stock() {
        return product_stock;
    }

    public void setProduct_stock(int product_stock) {
        this.product_stock = product_stock;
    }

}
