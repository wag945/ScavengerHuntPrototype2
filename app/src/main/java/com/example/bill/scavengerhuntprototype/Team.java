package com.example.bill.scavengerhuntprototype;

public class Team {
    private String name;
    private int numWins;
    private int numLosses;

    //Need Player class to create array of Players on team

    //Default constructor
    public Team() {};

    //Constructor with Team Name input
    public Team(String teamName) {
        name = teamName;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        if (value.length() > 0) {
            name = value;
        }
    }

    public int getNumWins() {
        return numWins;
    }

    public void setNumWins(int value) {
        numWins = value;
    }

    public int getNumLosses() {
        return numLosses;
    }

    public void setNumLosses(int value) {
        numLosses = value;
    }

    public String getRecord() {
        String record = Integer.toString(getNumWins()) + " - " + Integer.toString(getNumLosses());
        return record;
    }
}
