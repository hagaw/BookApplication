package com.company;

public class Book {




    private String tytle;
    private String author;
    private String desctiption;
    private int price;
    private int inStock;


    public String getTytle() {
        return tytle;
    }

    public void setTytle(String tytle) {
        this.tytle = tytle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDesctiption() {
        return desctiption;
    }

    public void setDesctiption(String desctiption) {
        this.desctiption = desctiption;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getInStock() {
        return inStock;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }


    @Override

    public String toString() {
        return "Book{" +
                "tytle='" + tytle + '\'' +
                ", author='" + author + '\'' +
                ", desctiption='" + desctiption + '\'' +
                //", price=" + price +
              //  ", inStock=" + inStock +
                '}';
    }

    public static void getDisplayText() {

}
}
