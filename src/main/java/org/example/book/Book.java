package org.example.book;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

public class Book {
    private String ISBN;
    private String title;
    private Date publishingYear;
    private List<String> authors;

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(Date publishingYear) {
        this.publishingYear = publishingYear;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public Book(String ISBN, String title, Date publishingYear, List<String> authors) {
        this.ISBN = ISBN;
        this.title = title;
        this.publishingYear = publishingYear;
        this.authors = authors;
    }

    public Book() {
    }
}
