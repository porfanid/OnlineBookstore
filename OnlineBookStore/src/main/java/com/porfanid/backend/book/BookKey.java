package com.porfanid.backend.book;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;
@Embeddable
public class BookKey implements Serializable {

    private String title;
    private String username;


    public BookKey(String title, String username) {
        this.title = title;
        this.username = username;
    }

    public BookKey() {
    }

    // Getters and setters (required for JPA)

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

    // Implement equals and hashCode for composite key
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookKey bookKey = (BookKey) o;
        return Objects.equals(title, bookKey.title) &&
                Objects.equals(username, bookKey.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, username);
    }
}
