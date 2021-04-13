package com.example.heroku.members;

public class TeamUI {

    private String firstName;
    private String lastName;

    public TeamUI(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString() {
        return String.format("Team[firstName='%s', lastName='%s']", firstName, lastName);
    }
}