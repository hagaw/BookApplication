package com.company;

public class BookApp {



    public static void main(String[] args) {


        Book myBook=new Book();

        myBook.setAuthor("William Sheckspeer");
        myBook.setTytle("hamlet");
        myBook.setDesctiption("hamlate is the known old book ");
        myBook.setPrice( 20);
        myBook.setInStock(100);




        System.out.println(myBook.toString());






    }
}
