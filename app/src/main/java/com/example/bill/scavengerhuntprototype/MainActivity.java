package com.example.bill.scavengerhuntprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.util.Log;
import java.util.Vector;


public class MainActivity extends AppCompatActivity {

    private Button mCreateGameButton;
    private Button mCreateTeamButton;
    private Button mPlayGameButton;
    private Team mTeam;
    private String appName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCreateTeamButton = (Button) findViewById(R.id.mCreateTeam);
        mCreateTeamButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, CreateTeam.class);
                MainActivity.this.startActivity(myIntent);
            }
        });

        mCreateGameButton = (Button) findViewById(R.id.mCreateGame);
        mCreateGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, CreateGame.class);
                MainActivity.this.startActivity(myIntent);
            }
        });

        mPlayGameButton = (Button) findViewById(R.id.mPlayGame);
        mPlayGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, PlayGame.class);
                MainActivity.this.startActivity(myIntent);
            }
        });

        //Test the Team class
        appName = "ScavengerHuntPrototype";

        mTeam = new Team();
        mTeam.setName("Team 1");
        Log.w(appName, "Test get Team name: "+mTeam.getName());
        mTeam.setNumLosses(2);
        mTeam.setNumWins(3);
        Log.w(appName,"Test get Team record: "+mTeam.getRecord());
        mTeam.addPlayer("Bill G");
        mTeam.addPlayer("Bill Z");
        mTeam.addPlayer("Brandon");
        Vector<String> players = mTeam.getPlayers();
        for (int i = 0; i < players.size(); i++) {
            Log.w(appName, "Player: " + players.elementAt(i));
        }
    }
}
