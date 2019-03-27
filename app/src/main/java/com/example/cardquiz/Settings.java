package com.example.cardquiz;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Settings extends AppCompatActivity {

    // UI references.
    @BindView(R.id.toolbar) Toolbar toolbar;
    @BindView(R.id.reset) Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        ButterKnife.bind(this);

        //connect navigation toolbar
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        //add onClick listener to reset scores when button clicked
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get user email and reset scores in DB
                UserLocalStore userLocalStore = new UserLocalStore(getApplicationContext());
                User user = userLocalStore.getLoggedInUser();
                UserDB userDB = new UserDB(getApplicationContext());
                userDB.resetScore(user.email);

                Snackbar.make(v,"High Scores Reset Successfully", Snackbar.LENGTH_LONG).show();
            }
        });
    }
}
