package com.example.bill.scavengerhuntprototype;
import java.util.Vector;

public class Team {
    private String name;
    private int numWins;
    private int numLosses;
    private static final int maxPlayers = 5;

    //Need Player class to create array of Players on team
    private Vector<String> players;

    //Default constructor
    public Team() {
        players = new Vector<String>();
    };

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

    public void addPlayer(String playerName) {
        if (players.size() < maxPlayers) {
            players.add(playerName);
        }
    }

    public void removePlayer(String playerName) {
        players.remove(playerName);
    }

    public Vector<String> getPlayers() {
        return players;
    }
}
