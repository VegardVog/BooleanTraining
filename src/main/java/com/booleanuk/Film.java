package com.booleanuk;

public class Film {
    String title = "Captain America";
    String publisher = "Marvel";

    int year = 2015;

    double rating = 4.5;

    double runtimeInMin = 156.23;





    public static void main(String[] args) {

        Film film = new Film();



        System.out.println("Title: " + film.title + "\n" + "Publisher : " + film.publisher + "\n" + "Year: " + film.year + "\n" + "Rating: " + film.rating + "\n" + "Runtime: " + film.runtimeInMin + "\n");

    }

}
