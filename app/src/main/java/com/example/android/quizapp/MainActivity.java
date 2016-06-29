package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    String qOneChosenAnswer;
    int correctAnswers = 0;
    int totalQuestions = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void questionOneAnswered(View v) {
        switch (v.getId()) {
            case R.id.q_one_a:
                Log.v("Answer", "Answer A chosen");
                qOneChosenAnswer = "A";
                correctAnswers += 1;
                break;
            case R.id.q_one_b:
                Log.v("Answer", "Answer B chosen");
                qOneChosenAnswer = "B";
                break;
            case R.id.q_one_c:
                Log.v("Answer", "Answer C chosen");
                qOneChosenAnswer = "C";
                break;
            case R.id.q_one_d:
                Log.v("Answer", "Answer D chosen");
                qOneChosenAnswer = "D";
                break;
        }
    }

    public void submitAnswersTapped(View v) {
        int score = correctAnswers / totalQuestions;
        Log.v("Score: ", Integer.toString(score * 100) + "%");
    }

}
