package edu.canisius.csc213.lab7;

import java.util.ArrayList;

public class Book extends Item implements PrettyPrint {
    private ArrayList<Author> authors;

    public Book(String title, String location, ArrayList<Author> authors) {
        super(title, location, true);
        this.authors = authors;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    @Override
    public String prettyPrint() {
        StringBuilder sb = new StringBuilder();
        sb.append("_______________________________________\n");
        sb.append(String.format("| Type: %-30s |\n", "Book"));
        sb.append(String.format("| Title: %-28s |\n", getTitle()));
        sb.append(String.format("| Can be borrowed: %-17s |\n", isBorrowable() ? "Yes" : "No"));
        
        StringBuilder authorsStr = new StringBuilder();
        for (Author a : authors) {
            if (authorsStr.length() > 0) authorsStr.append(", ");
            authorsStr.append(a.getName());
        }
        sb.append(String.format("| Author(s): %-23s |\n", authorsStr.toString()));
        sb.append(String.format("| Location: %-25s |\n", getLocation()));
        sb.append("_______________________________________");
        return sb.toString();
    }
}

