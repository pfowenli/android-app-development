package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(teamAScore);
    }

    /**
     * This method is called when plus 3 points button of Team A is clicked.
     */
    public void addThreePointsForTeamA(View view) {
        teamAScore += 3;
        displayForTeamA(teamAScore);
    }

    /**
     * This method is called when plus 3 points button of Team B is clicked.
     */
    public void addThreePointsForTeamB(View view) {
        teamBScore += 3;
        displayForTeamB(teamBScore);
    }

    /**
     * This method is called when plus 2 points button of Team A is clicked.
     */
    public void addTwoPointsForTeamA(View view) {
        teamAScore += 2;
        displayForTeamA(teamAScore);
    }

    /**
     * This method is called when plus 2 points button of Team B is clicked.
     */
    public void addTwoPointsForTeamB(View view) {
        teamBScore += 2;
        displayForTeamB(teamBScore);
    }

    /**
     * This method is called when free throw button of Team A is clicked.
     */
    public void addOnePointForTeamA(View view) {
        teamAScore += 1;
        displayForTeamA(teamAScore);
    }

    /**
     * This method is called when free throw button of Team B is clicked.
     */
    public void addOnePointForTeamB(View view) {
        teamBScore += 1;
        displayForTeamB(teamBScore);
    }

    /**
     * This method is called when reset button is clicked.
     */
    public void resetScores(View view) {
        teamAScore = 0;
        teamBScore = 0;
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
