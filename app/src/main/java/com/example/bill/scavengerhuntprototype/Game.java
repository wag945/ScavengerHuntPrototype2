package com.example.bill.scavengerhuntprototype;
import java.util.Vector;
import java.util.Timer;

public class Game {
    private int mGameId;
    private Vector<Team> mTeams;
    //Replace this with the real ScavengedItem class
    private Vector<Integer> mScavengedItems;
    private Timer mTimer;
    enum GameState {
        NOT_STARTED,
        IN_PROGRESS,
        ENDED
    };
    private static final int mMaxTeams = 5;

    public Game(int gameId) {
        mGameId = gameId;
    }

    public void addTeam(Team team) {
        if (mTeams.size() < mMaxTeams) {
            mTeams.add(team);
        }
    }

    public Vector<Team> getTeams() {
        return mTeams;
    }

    public void addScavengedItem(int item) {
        mScavengedItems.add(item);
    }

    public Vector<Integer> getScavengedItems() {
        return mScavengedItems;
    }

    public void startGame() {

    }
}
