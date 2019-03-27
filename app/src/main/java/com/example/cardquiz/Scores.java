package com.example.cardquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import java.util.Objects;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Scores extends AppCompatActivity {

    // UI references.
    @BindView(R.id.booksRecentScore) TextView booksScore;
    @BindView(R.id.computerRecentScore) TextView computerScore;
    @BindView(R.id.sportsRecentScore) TextView sportsScore;
    @BindView(R.id.inventionsRecentScore) TextView inventionsScore;
    @BindView(R.id.generalRecentScore) TextView generalScore;
    @BindView(R.id.scienceRecentScore) TextView scienceScore;
    @BindView(R.id.englishRecentScore) TextView englishScore;
    @BindView(R.id.mathsRecentScore) TextView mathsScore;
    @BindView(R.id.capitalsRecentScore) TextView capitalsScore;
    @BindView(R.id.currencyRecentScore) TextView currencyScore;
    @BindView(R.id.booksHighScore) TextView booksHighScore;
    @BindView(R.id.computerHighScore) TextView computerHighScore;
    @BindView(R.id.sportsHighScore) TextView sportsHighScore;
    @BindView(R.id.inventionsHighScore) TextView inventionsHighScore;
    @BindView(R.id.generalHighScore) TextView generalHighScore;
    @BindView(R.id.scienceHighScore) TextView scienceHighScore;
    @BindView(R.id.englishHighScore) TextView englishHighScore;
    @BindView(R.id.mathsHighScore) TextView mathsHighScore;
    @BindView(R.id.capitalsHighScore) TextView capitalsHighScore;
    @BindView(R.id.currencyHighScore) TextView currencyHighScore;
    @BindView(R.id.toolbar) Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scores);

        ButterKnife.bind(this);

        //connect navigation toolbar
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        //get user email and retrieve scores from DB
        UserLocalStore userLocalStore = new UserLocalStore(this);
        User user = userLocalStore.getLoggedInUser();
        UserDB userDB = new UserDB(getApplicationContext());
        ScoreCard scoreCard = userDB.getScore(user.email);

        //set scores to textViews
        booksScore.setText(String.valueOf(scoreCard.books));
        capitalsScore.setText(String.valueOf(scoreCard.capitals));
        computerScore.setText(String.valueOf(scoreCard.computer));
        currencyScore.setText(String.valueOf(scoreCard.currency));
        englishScore.setText(String.valueOf(scoreCard.english));
        generalScore.setText(String.valueOf(scoreCard.general));
        inventionsScore.setText(String.valueOf(scoreCard.inventions));
        mathsScore.setText(String.valueOf(scoreCard.maths));
        scienceScore.setText(String.valueOf(scoreCard.science));
        sportsScore.setText(String.valueOf(scoreCard.sports));

        //set HighScores to textViews
        booksHighScore.setText(String.valueOf(scoreCard.HighBooks));
        capitalsHighScore.setText(String.valueOf(scoreCard.HighCapitals));
        computerHighScore.setText(String.valueOf(scoreCard.HighComputer));
        currencyHighScore.setText(String.valueOf(scoreCard.HighCurrency));
        englishHighScore.setText(String.valueOf(scoreCard.HighEnglish));
        generalHighScore.setText(String.valueOf(scoreCard.HighGeneral));
        inventionsHighScore.setText(String.valueOf(scoreCard.HighInventions));
        mathsHighScore.setText(String.valueOf(scoreCard.HighMaths));
        scienceHighScore.setText(String.valueOf(scoreCard.HighScience));
        sportsHighScore.setText(String.valueOf(scoreCard.HighSports));
    }
}