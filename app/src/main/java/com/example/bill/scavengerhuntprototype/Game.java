package com.example.bill.scavengerhuntprototype;
import java.util.Vector;
import java.util.Timer;
import java.util.TimerTask;

public class Game {
    private int mGameId;
    private Vector<Team> mTeams;
    //Replace this with the real ScavengedItem class
    private Vector<Integer> mScavengedItems;
    private Timer mTimer;
    private GameTimer mGameTimer;
    //Need a timer task to run the timer

    enum GameState {
        NOT_STARTED,
        IN_PROGRESS,
        ENDED
    };
    GameState mGameState;
    private static final int mMaxTeams = 5;

    public Game(int gameId) {
        mGameId = gameId;
        mGameState = GameState.NOT_STARTED;
        mTeams = new Vector<Team>();
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
        mTimer = new Timer();
        mGameTimer = new GameTimer();
        //Start a timer to run immediately and repeat every second
        mTimer.schedule(mGameTimer,0,1000);
        mGameState = GameState.IN_PROGRESS;
    }

    public void stopGame() {
        mGameTimer.cancel();
        mGameState = GameState.ENDED;
    }

    public GameState getGameStatus() {
        return mGameState;
    }
}
