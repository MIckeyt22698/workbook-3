package com.pluralsight;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args){

        ArrayList<String> books =new ArrayList<>();
        books.add("Harry Potter & The Order Of The Phoenix");
        books.add("Diary Of A Wimpy Kid");
        books.add("Lord Of The Flies");



        System.out.println(books);
        System.out.println(books.get(1));
        books.remove(1);
        System.out.println(books);
    }

    ArrayList<WorksOfArt> artWorks = new ArrayList<>();
       
}