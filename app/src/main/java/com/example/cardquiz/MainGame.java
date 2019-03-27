package com.example.cardquiz;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.shashank.sony.fancydialoglib.Animation;
import com.shashank.sony.fancydialoglib.FancyAlertDialog;
import com.shashank.sony.fancydialoglib.FancyAlertDialogListener;
import com.shashank.sony.fancydialoglib.Icon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainGame extends AppCompatActivity {

    // UI references.
    @BindView(R.id.OptionA) Button OptionABtn;
    @BindView(R.id.OptionB) Button OptionBBtn;
    @BindView(R.id.OptionC) Button OptionCBtn;
    @BindView(R.id.OptionD) Button OptionDBtn;
    @BindView(R.id.play_button) Button playButton;//Play button to start the game
    @BindView(R.id.Questions) TextView TxtQuestions;
    @BindView(R.id.amountQuestions) TextView amountQuestions;
    @BindView(R.id.categoryImage) ImageView categoryImage;
    @BindView(R.id.toolbar) Toolbar toolbar;

    //Objects of different classes
    private boolean firstQuestion;
    private boolean disabled = false;
    private boolean highScore = false;
    private String table_name;
    private String QuizSize;
    private TriviaDB triviaDB;

    private int QuestionCounter;
    private int QuestionsAttempted;
    private int QuestionsCorrect;
    private int amountOfQuestions;
    private String Answer;
    private String OptionA;
    private String OptionB;
    private String OptionC;
    private String OptionD;
    private ArrayList<Integer> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_game);

        ButterKnife.bind(this);

        //connect navigation toolbar
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();//receiving the intent send by the Navigation activity
        table_name = intent.getStringExtra("Category");//converting that intent message to string using the getStringExtra() method
        QuizSize = intent.getStringExtra("Size");//converting that intent message to string using the getStringExtra() method

        //Now the linking of all the database files with the Question activity
        triviaDB = new TriviaDB(this);

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //showing the buttons which were previously invisible
                OptionABtn.setVisibility(View.VISIBLE);
                OptionBBtn.setVisibility(View.VISIBLE);
                OptionCBtn.setVisibility(View.VISIBLE);
                OptionDBtn.setVisibility(View.VISIBLE);
                amountQuestions.setVisibility(View.VISIBLE);
                categoryImage.setVisibility(View.VISIBLE);
                playButton.setVisibility(View.GONE);

                nextQuestion();
            }
        });

        OptionABtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!disabled)
                    showAlertDialog(v);
            }
        });
        OptionBBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!disabled)
                    showAlertDialog(v);
            }
        });
        OptionCBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!disabled)
                    showAlertDialog(v);
            }
        });
        OptionDBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!disabled)
                    showAlertDialog(v);
            }
        });

        //set image based on chosen category
        switch (table_name) {
            case "books":
                categoryImage.setImageDrawable(getResources().getDrawable(R.drawable.books, getApplicationContext().getTheme()));
                break;
            case "capitals":
                categoryImage.setImageDrawable(getResources().getDrawable(R.drawable.capital, getApplicationContext().getTheme()));
                break;
            case "computer":
                categoryImage.setImageDrawable(getResources().getDrawable(R.drawable.computer, getApplicationContext().getTheme()));
                break;
            case "currency":
                categoryImage.setImageDrawable(getResources().getDrawable(R.drawable.currency, getApplicationContext().getTheme()));
                break;
            case "english":
                categoryImage.setImageDrawable(getResources().getDrawable(R.drawable.english, getApplicationContext().getTheme()));
                break;
            case "general":
                categoryImage.setImageDrawable(getResources().getDrawable(R.drawable.general, getApplicationContext().getTheme()));
                break;
            case "inventions":
                categoryImage.setImageDrawable(getResources().getDrawable(R.drawable.invention, getApplicationContext().getTheme()));
                break;
            case "maths":
                categoryImage.setImageDrawable(getResources().getDrawable(R.drawable.maths, getApplicationContext().getTheme()));
                break;
            case "science":
                categoryImage.setImageDrawable(getResources().getDrawable(R.drawable.science, getApplicationContext().getTheme()));
                break;
            case "sports":
                categoryImage.setImageDrawable(getResources().getDrawable(R.drawable.sports, getApplicationContext().getTheme()));
                break;
        }

        //if saved state retrieve else initialize all
        if (savedInstanceState != null)
        {
            QuestionsAttempted = savedInstanceState.getInt("Attempted");
            QuestionsCorrect = savedInstanceState.getInt("Correct");
            amountOfQuestions = savedInstanceState.getInt("Amount");
            QuestionCounter = savedInstanceState.getInt("Counter");
            firstQuestion = savedInstanceState.getBoolean("First");
            list = savedInstanceState.getIntegerArrayList("list");
        }
        else {
            QuestionCounter = 0;
            QuestionsAttempted = 0;
            QuestionsCorrect = 0;
            amountOfQuestions = 10;
            firstQuestion = true;
        }
    }

    private void checkAnswer(View v) {//When this method is executed then there will be new question came and also same method for play button
        QuestionsAttempted++;
        disabled = true;

        switch (Answer) {
            case "A":
                if (v.getId() == R.id.OptionA) {
                    //Here we use the snackBar because if we use the toast then they will be stacked an user cannot identify which questions answer is it showing
                    showSnackbar(v, "Correct \uD83D\uDE0A");
                    QuestionsCorrect++;
                } else {
                    showSnackbar(v, "Incorrect \uD83D\uDE41\tAnswer: " + OptionA + "");
                }
                break;
            case "B":
                if (v.getId() == R.id.OptionB) {
                    showSnackbar(v, "Correct \uD83D\uDE0A");
                    QuestionsCorrect++;
                } else {
                    showSnackbar(v, "Incorrect \uD83D\uDE41\tAnswer: " + OptionB + "");
                }
                break;
            case "C":
                if (v.getId() == R.id.OptionC) {
                    showSnackbar(v, "Correct \uD83D\uDE0A");
                    QuestionsCorrect++;
                } else {
                    showSnackbar(v, "Incorrect \uD83D\uDE41\tAnswer: " + OptionC + "");
                }
                break;
            case "D":
                if (v.getId() == R.id.OptionD) {
                    showSnackbar(v, "Correct \uD83D\uDE0A");
                    QuestionsCorrect++;
                } else {
                    showSnackbar(v, "Incorrect \uD83D\uDE41\tAnswer: " + OptionD + "");
                }
                break;
        }
    }

    private void nextQuestion() {
        if (QuestionCounter == amountOfQuestions) {
            int newScore = QuestionsCorrect * 10;

            //get user email and retrieve scores from DB
            UserLocalStore userLocalStore = new UserLocalStore(getApplicationContext());
            User user = userLocalStore.getLoggedInUser();
            UserDB userDB = new UserDB(getApplicationContext());
            ScoreCard scoreCard = userDB.getScore(user.email);

            switch (table_name) {
                case "books":
                    if (scoreCard.HighBooks < newScore) {
                        //user email and update high scores from DB
                        userDB.updateScore(user.email, "HighBooks", newScore);
                        highScore = true;
                    }
                    break;
                case "capitals":
                    if (scoreCard.HighCapitals < newScore) {
                        //user email and update high scores from DB
                        userDB.updateScore(user.email, "HighCapitals", newScore);
                        highScore = true;
                    }
                    break;
                case "computer":
                    if (scoreCard.HighComputer < newScore) {
                        //user email and update high scores from DB
                        userDB.updateScore(user.email, "HighComputer", newScore);
                        highScore = true;
                    }
                    break;
                case "currency":
                    if (scoreCard.HighCurrency < newScore) {
                        //user email and update high scores from DB
                        userDB.updateScore(user.email, "HighCurrency", newScore);
                        highScore = true;
                    }
                    break;
                case "english":
                    if (scoreCard.HighEnglish < newScore) {
                        //user email and update high scores from DB
                        userDB.updateScore(user.email, "HighEnglish", newScore);
                        highScore = true;
                    }
                    break;
                case "general":
                    if (scoreCard.HighGeneral < newScore) {
                        //user email and update high scores from DB
                        userDB.updateScore(user.email, "HighGeneral", newScore);
                        highScore = true;
                    }
                    break;
                case "inventions":
                    if (scoreCard.HighInventions < newScore) {
                        //user email and update high scores from DB
                        userDB.updateScore(user.email, "HighInventions", newScore);
                        highScore = true;
                    }
                    break;
                case "maths":
                    if (scoreCard.HighMaths < newScore) {
                        //user email and update high scores from DB
                        userDB.updateScore(user.email, "HighMaths", newScore);
                        highScore = true;
                    }
                    break;
                case "science":
                    if (scoreCard.HighScience < newScore) {
                        //user email and update high scores from DB
                        userDB.updateScore(user.email, "HighScience", newScore);
                        highScore = true;
                    }
                    break;
                case "sports":
                    if (scoreCard.HighSports < newScore) {
                        //user email and update high scores from DB
                        userDB.updateScore(user.email, "HighSports", newScore);
                        highScore = true;
                    }
                    break;
            }

            //update recent score
            userDB.updateScore(user.email, table_name, newScore);

            Intent intent = new Intent(MainGame.this, Result.class);
            intent.putExtra("correct", QuestionsCorrect);
            intent.putExtra("attempt", QuestionsAttempted);
            intent.putExtra("highScore", highScore);
            startActivity(intent);
            finish();
        } else {
            if (firstQuestion) {
                amountOfQuestions = triviaDB.getLength(table_name);
                for (int i = 1; i <= amountOfQuestions; i++) {
                    list.add(i);
                }
                Collections.shuffle(list);
                firstQuestion = false;

                if(QuizSize.equals("short"))
                    amountOfQuestions = 10;
            }

            String question = triviaDB.readQuestion(list.get(QuestionCounter), table_name);
            OptionA = triviaDB.readOptionA(list.get(QuestionCounter), table_name);
            OptionB = triviaDB.readOptionB(list.get(QuestionCounter), table_name);
            OptionC = triviaDB.readOptionC(list.get(QuestionCounter), table_name);
            OptionD = triviaDB.readOptionD(list.get(QuestionCounter), table_name);
            Answer = triviaDB.readAnswer(list.get(QuestionCounter), table_name);

            TxtQuestions.setText(question);
            OptionABtn.setText(OptionA);
            OptionBBtn.setText(OptionB);
            OptionCBtn.setText(OptionC);
            OptionDBtn.setText(OptionD);

            QuestionCounter++;
            String numberOfQuestions = "Question: " + QuestionCounter + " / " + amountOfQuestions;
            amountQuestions.setText(numberOfQuestions);
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("Attempted", QuestionsAttempted);
        outState.putInt("Correct", QuestionsCorrect);
        outState.putInt("Amount", amountOfQuestions);
        if (QuestionCounter - 1 < 0)
            outState.putInt("Counter", 0);
        else
            outState.putInt("Counter", QuestionCounter - 1);
        outState.putBoolean("First", firstQuestion);
        outState.putIntegerArrayList("list", list);
    }

    private void showAlertDialog(final View view)
    {
        Button b = (Button)view;

        new FancyAlertDialog.Builder(this)
                .setTitle("Is this your Final Answer?")
                .setBackgroundColor(Color.parseColor("#b4485f"))  //Don't pass R.color.colorvalue
                .setMessage(b.getText().toString())
                .setNegativeBtnText("Cancel")
                .setPositiveBtnBackground(Color.parseColor("#b4485f"))  //Don't pass R.color.colorvalue
                .setPositiveBtnText("Yes")
                .setNegativeBtnBackground(Color.parseColor("#FFA9A7A8"))  //Don't pass R.color.colorvalue
                .setAnimation(Animation.POP)
                .isCancellable(false)
                .setIcon(R.drawable.help_drawer, Icon.Visible)
                .OnPositiveClicked(new FancyAlertDialogListener() {
                    @Override
                    public void OnClick() {
                        checkAnswer(view);
                    }
                })
                .OnNegativeClicked(new FancyAlertDialogListener() {
                    @Override
                    public void OnClick() {
                    }
                })
                .build();
    }

    private void showSnackbar(View view, String message)
    {
        // Create snackbar
        final Snackbar snackbar = Snackbar.make(view, message, Snackbar.LENGTH_INDEFINITE);

        // styling for text
        View snackBarView = snackbar.getView();
        TextView textView = snackBarView.findViewById(android.support.design.R.id.snackbar_text);
        textView.setTextSize(20);

        // Set an action on it, and a handler
        snackbar.setAction("Next", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snackbar.dismiss();
                disabled = false;
                nextQuestion();
            }
        });

        snackbar.show();
    }
}