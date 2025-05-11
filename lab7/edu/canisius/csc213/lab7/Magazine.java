package edu.canisius.csc213.lab7;

import java.time.LocalDate;

public class Magazine extends Item implements PrettyPrint {
    private LocalDate year;
    private String issueNumber;

    public Magazine(String title, String location, LocalDate date, String issueNumber) {
        super(title, location, false);
        this.year = date;
        this.issueNumber = issueNumber;
    }

    public String getIssueNumber() {
        return issueNumber;
    }

    public LocalDate getYear() {
        return year;
    }

    @Override
    public String prettyPrint() {
        StringBuilder sb = new StringBuilder();
        sb.append("_________________________\n");
        sb.append(String.format("| Type: %-16s |\n", "Magazine"));
        sb.append(String.format("| Title: %-14s |\n", getTitle()));
        sb.append(String.format("| Date: %-16d |\n", year.getYear()));
        sb.append(String.format("| Issue: %-14s |\n", issueNumber));
        sb.append(String.format("| Can be borrowed: %-6s |\n", isBorrowable() ? "Yes" : "No"));
        sb.append(String.format("| Location: %-12s |\n", getLocation()));
        sb.append("_________________________");
        return sb.toString();
    }
}

