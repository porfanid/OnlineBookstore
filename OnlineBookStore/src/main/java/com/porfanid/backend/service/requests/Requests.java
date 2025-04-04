package com.porfanid.backend.service.requests;


import com.porfanid.backend.book.BookKey;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name = "requests")
@IdClass(RequestsId.class)
public class Requests {
    @Id
    public String username;
    @Id
    public String title;
    @Id
    public String holder;



    public Integer accepted;

    public Requests(String username, String title, String holder, Integer accepted) {
        this.username = username;
        this.title = title;
        this.holder = holder;
        this.accepted = accepted;
    }

    public Requests() {
    }

    public Integer isAccepted() {
        return accepted;
    }

    public void setAccepted(Integer accepted) {
        this.accepted = accepted;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
