package com.porfanid.backend.user;

import jakarta.persistence.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.util.stream.Collectors;

@Entity
@Table(name = "user_creds")
public class User {
    @Id
    private String username;
    private String password;
    private String fullName;
    private String address;
    private Integer age;
    private String phoneNumber;
    private String categories;
    @Column(columnDefinition = "TEXT") // To handle large strings
    private String favouriteAuthors;

    // Constructors
    public User() {
        this.categories = "";
        this.favouriteAuthors = "";
    }

    public User(String username, String password, String fullName, String address, Integer age, String phoneNumber) {
        this.username = username;
        this.password = hashPassword(password);
        this.fullName = fullName;
        this.address = address;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.categories = "";
        this.favouriteAuthors = "";
    }

    // Getters and setters

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean verifyPassword(String password) {
        return this.password.equals(hashPassword(password));
    }

    public void setPassword(String password) {
        this.password = hashPassword(password);
    }

    public String getPassword() {
        return password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public List<String> getFavouriteAuthors() {
        return convertTSVToList(favouriteAuthors);
    }

    public void setFavouriteAuthors(List<String> favouriteAuthors) {
        this.favouriteAuthors = convertListToTSV(favouriteAuthors);
    }

    public void addCategory(String category){
        categories+=","+category;
    }

    public List<String> getCategoriesAsList(){
        if (categories.isEmpty()) {
            return Collections.emptyList();
        } else {
            return Arrays.asList(categories.split(","));
        }
    }

    public void removeCategory(String category){
        StringBuilder tempCategories = new StringBuilder();
        for(String tempCategory:categories.split(",")){
            if (!tempCategory.equalsIgnoreCase(category)){
                tempCategories.append(",").append(tempCategory);
            }
        }
        setCategories(tempCategories.toString());
    }

    public boolean isFavouriteCategory(String category){
        for(String tempCategory:categories.split(",")){
            if (tempCategory.equalsIgnoreCase(category)){
                return true;
            }
        }
        return false;
    }

    private String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = md.digest(password.getBytes());

            // Convert byte array to hexadecimal string
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashedBytes) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "User{", "}");
        joiner.add("username='" + username + "'");
        joiner.add("fullName='" + fullName + "'");
        joiner.add("address='" + address + "'");
        joiner.add("age=" + age);
        joiner.add("phoneNumber='" + phoneNumber + "'");
        joiner.add("categories='" + categories + "'");
        joiner.add("favouriteAuthors=" + getFavouriteAuthorsAsString());

        return joiner.toString();
    }

    private String getFavouriteAuthorsAsString() {
        List<String> authors = getFavouriteAuthors();
        if (authors.isEmpty()) {
            return "[]";
        } else {
            return "[" + String.join(", ", authors) + "]";
        }
    }

    private String convertListToTSV(List<String> list) {
        return String.join("\t", list);
    }

    private List<String> convertTSVToList(String tsv) {
        return Arrays.asList(tsv.split("\t"));
    }
}
