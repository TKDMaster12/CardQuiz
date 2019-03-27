package com.example.cardquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import java.util.Objects;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Result extends AppCompatActivity {

    // UI references.
    @BindView(R.id.result_correct) TextView correctTxt;
    @BindView(R.id.result_incorrect) TextView incorrectTxt;
    @BindView(R.id.result_attempted) TextView attemptedTxt;
    @BindView(R.id.result_score) TextView scoreTxt;
    @BindView(R.id.result_you) TextView youTxt;
    @BindView(R.id.toolbar) Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        ButterKnife.bind(this);

        //connect navigation toolbar
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        //get data passed from mainGame activity
        Intent intent = getIntent();
        int correct = intent.getIntExtra("correct", 0);
        int attempt = intent.getIntExtra("attempt", 0);
        boolean highScore = intent.getBooleanExtra("highScore", false);

        //calculate amount incorrect
        int incorrect = attempt - correct;
        //calculate final score
        int score = 10 * correct;

        //set textViews
        attemptedTxt.setText(String.valueOf(attempt));
        correctTxt.setText(String.valueOf(correct));
        incorrectTxt.setText(String.valueOf(incorrect));

        String x;
        if (highScore)
            x = "High Score : " + score;
        else
            x = "Score : " + score;

        scoreTxt.setText(String.valueOf(x));

        //calculate percent correct to set specific message
        double y = correct * 100;
        double percent = y / attempt;

        if (percent < 40)
            youTxt.setText(getString(R.string.results_bad));
        else if (percent < 70)
            youTxt.setText(getString(R.string.results_average));
        else if (percent < 90)
            youTxt.setText(getString(R.string.results_above));
        else
            youTxt.setText(getString(R.string.results_brilliant));
    }
}
