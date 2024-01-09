package com.booleanuk;

public class BookDisplayer {

    public static void main(String[] args) {
        Book eBook = new Book();
        eBook.setAuthor("Vegard2");

        System.out.println(eBook.getTitle() + " by " + eBook.getAuthor());
    }
}
