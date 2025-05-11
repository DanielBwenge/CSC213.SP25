package edu.canisius.csc213.lab7;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Author adichie = new Author("Chimamanda Ngozi Adichie");
        ArrayList<Author> authors = new ArrayList<>();
        authors.add(adichie);
        Item bookItem = new Book("Half of a Yellow Sun", "Third Floor", authors);
        LocalDate date = LocalDate.ofYearDay(2023, 1);
        Item magazineItem = new Magazine("Newsweek", "First Floor", date, "1");
        
        System.out.println("Created the objects!");
        System.out.println("You have to create the pretty print function!");
        
        System.out.println(((PrettyPrint)bookItem).prettyPrint());
        System.out.println();
        System.out.println(((PrettyPrint)magazineItem).prettyPrint());
    }
}

