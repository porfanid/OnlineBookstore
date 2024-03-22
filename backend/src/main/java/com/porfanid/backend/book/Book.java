package com.porfanid.backend.book;

import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class Book {
    @Id
    private String title;
    private String author;
    private String category;
    private String summary;

    private String username;

    // Constructors
    public Book() {}

    public Book(String title, String author, String category, String summary, String username) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.summary = summary;
        this.username = username;
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

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
