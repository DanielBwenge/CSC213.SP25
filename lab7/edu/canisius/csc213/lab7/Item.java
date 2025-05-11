package edu.canisius.csc213.lab7;

public class Item {
    private String title;
    private String location;
    private boolean borrowable;

    public Item(String title, String location, boolean borrowable) {
        this.title = title;
        this.location = location;
        this.borrowable = borrowable;
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }

    public boolean isBorrowable() {
        return borrowable;
    }
}

