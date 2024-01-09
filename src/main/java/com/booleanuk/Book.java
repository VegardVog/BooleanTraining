package com.booleanuk;

import java.util.Date;

public class Book {
    private int numberOfPages = 654;

    private String title = "Lord of the Vegards";
    private String author = "Vegard";
    private String publisher = "Vegard";
    private int year = 2024;

    private double price = 9.99;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    private String genre = "Fantasy";

    public static void main(String[] args) {
        Book book = new Book();

        System.out.println("Author: " + book.getAuthor());
        System.out.println("Publisher: " + book.getPublisher());
        System.out.println("Price: " + book.getPrice());
        System.out.println("Title: " + book.getTitle());

    }




}
