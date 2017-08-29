package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(teamAScore);
    }

    /**
     * This method is called when plus 3 points button is clicked.
     */
    public void addThreePointsForTeamA(View view) {
        teamAScore += 3;
        displayForTeamA(teamAScore);
    }

    /**
     * This method is called when plus 2 points button is clicked.
     */
    public void addTwoPointsForTeamA(View view) {
        teamAScore += 2;
        displayForTeamA(teamAScore);
    }

    /**
     * This method is called when free throw button is clicked.
     */
    public void addOnePointForTeamA(View view) {
        teamAScore += 1;
        displayForTeamA(teamAScore);
    }



    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
}
