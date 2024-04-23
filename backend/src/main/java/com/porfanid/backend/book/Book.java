package com.porfanid.backend.book;

import jakarta.persistence.*;

@Entity
@Table(name = "book")
@IdClass(BookKey.class)
public class Book {

    @Id
    private String title;

    @Id
    private String username;

    @Column(name = "author")
    private String author;

    @Column(name = "category")
    private String category;

    @Column(name = "summary")
    private String summary;

    // Constructors
    public Book() {}

    public Book(String title, String username, String author, String category, String summary) {
        this.title = title;
        this.username = username;
        this.author = author;
        this.category = category;
        this.summary = summary;
    }

    // Getters and Setters (Omitted for brevity)

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAuthor() {
        return author;
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

    public String toString(){
        return title+" - "+ author;
    }
}
