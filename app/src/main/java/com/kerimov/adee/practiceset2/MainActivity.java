package com.kerimov.adee.practiceset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int countPointsTeamA = 0;
    int countPointsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    public void click3(View view) {
        countPointsTeamA = countPointsTeamA + 3;
        displayForTeamA(countPointsTeamA);
    }
    public void click2(View view) {
        countPointsTeamA = countPointsTeamA + 2;
        displayForTeamA(countPointsTeamA);
    }
    public void click1(View view) {
        countPointsTeamA = countPointsTeamA + 1;
        displayForTeamA(countPointsTeamA);
    }
    public void click3b(View view) {
        countPointsTeamB = countPointsTeamB + 3;
        displayForTeamB(countPointsTeamB);
    }
    public void click2b(View view) {
        countPointsTeamB = countPointsTeamB + 2;
        displayForTeamB(countPointsTeamB);
    }
    public void click1b(View view) {
        countPointsTeamB = countPointsTeamB + 1;
        displayForTeamB(countPointsTeamB);
    }

    public void resetButton(View view) {
        displayForTeamA(countPointsTeamA = 0);
        displayForTeamB(countPointsTeamB = 0);
    }
}
