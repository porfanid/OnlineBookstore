package com.porfanid.backend.service.requests;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;

import java.io.Serializable;
@Embeddable
public class RequestsId implements Serializable {
    public String title;
    public String holder;
    public String username;

    public RequestsId(String username, String title, String holder) {
        this.username = username;
        this.title = title;
        this.holder = holder;
    }

    public RequestsId() {
    }


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

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

}
