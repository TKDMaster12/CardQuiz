package com.example.cardquiz;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.shashank.sony.fancydialoglib.Animation;
import com.shashank.sony.fancydialoglib.FancyAlertDialog;
import com.shashank.sony.fancydialoglib.FancyAlertDialogListener;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Navigation extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private UserLocalStore userLocalStore;
    private ProgressDialog progressBar;
    private TextView nav_header_name;
    private TextView nav_header_email;

    // UI references.
    @BindView(R.id.authorsBtn) Button categoryBooks;
    @BindView(R.id.capitalsBtn) Button categoryCapitals;
    @BindView(R.id.computerBtn) Button categoryComputers;
    @BindView(R.id.currencyBtn) Button categoryCurrency;
    @BindView(R.id.englishBtn) Button categoryEnglish;
    @BindView(R.id.generalBtn) Button categoryGeneral;
    @BindView(R.id.inventionsBtn) Button categoryInventions;
    @BindView(R.id.mathsBtn) Button categoryMaths;
    @BindView(R.id.scienceBtn) Button categoryScience;
    @BindView(R.id.sportsBtn) Button categorySports;

    @BindView(R.id.toolbar) Toolbar toolbar;
    @BindView(R.id.nav_view) NavigationView navigationView;
    @BindView(R.id.drawer_layout) DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        ButterKnife.bind(this);

        //connect navigation toolbar
        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);

        View header = navigationView.getHeaderView(0);//Used to get a reference to navigation header

        nav_header_name = header.findViewById(R.id.nav_header_name);
        nav_header_email = header.findViewById(R.id.nav_header_email);

        //add OnClickListener when books button clicked
        categoryBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlertDialog(v, "books");
            }
        });

        //add OnClickListener when capitals button clicked
        categoryCapitals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlertDialog(v, "capitals");
            }
        });

        //add OnClickListener when computers button clicked
        categoryComputers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlertDialog(v, "computer");
            }
        });

        //add OnClickListener when currency button clicked
        categoryCurrency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlertDialog(v, "currency");
            }
        });

        //add OnClickListener when english button clicked
        categoryEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlertDialog(v, "english");
            }
        });

        //add OnClickListener when general button clicked
        categoryGeneral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlertDialog(v, "general");
            }
        });

        //add OnClickListener when inventions button clicked
        categoryInventions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlertDialog(v, "inventions");
            }
        });

        //add OnClickListener when maths button clicked
        categoryMaths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlertDialog(v, "maths");
            }
        });

        //add OnClickListener when science button clicked
        categoryScience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlertDialog(v, "science");
            }
        });

        //add OnClickListener when sports button clicked
        categorySports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlertDialog(v, "sports");
            }
        });

        userLocalStore = new UserLocalStore(this);
    }

    private void selectedCategory(View v, final String category, final String size) {
        //To show button click
        new Handler().postDelayed(new Runnable() {@Override public void run(){}}, 400);

        progressBar = new ProgressDialog(v.getContext());//Create new object of progress bar type
        progressBar.setCancelable(false);//Progress bar cannot be cancelled by pressing any where on screen
        progressBar.setMessage("Getting Questions Ready ...");//Title shown in the progress bar
        progressBar.setProgressStyle(ProgressDialog.STYLE_SPINNER);//Style of the progress bar
        progressBar.setProgress(0);//attributes
        progressBar.setMax(100);//attributes
        progressBar.show();//show the progress bar
        //This handler will add a delay of 2 seconds
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Intent start to open the navigation drawer activity
                progressBar.cancel();//Progress bar will be cancelled (hide from screen) when this run function will execute after 3.5seconds
                Intent intent = new Intent(Navigation.this, MainGame.class);
                intent.putExtra("Category", category);
                intent.putExtra("Size", size);
                startActivity(intent);
            }
        }, 2000);
    }

    @Override
    protected void onStart(){
        super.onStart();
        //check if user logged in, if yes get username , if no redirect to login page
        if (!authenticate()) {
            Intent intent = new Intent(getApplicationContext(), Login.class);
            startActivityForResult(intent, 0);
        }
        else
            getUserName();
    }

    private boolean authenticate()
    {
        return userLocalStore.getUserLoggedIn();
    }

    private void getUserName()
    {
        User user = userLocalStore.getLoggedInUser();
        //Set name, email in the navigation side drawer to those we enter in the login page
        nav_header_name.setText(user.name);
        nav_header_email.setText(user.email);
    }

    @Override
    public void onBackPressed() {
        //on back if side navigation open then close , else go to previous page
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_ScoreCard) {
            Intent intent = new Intent(this, Scores.class);
            startActivity(intent);
        } else if (id == R.id.nav_Setting) {
            Intent intent = new Intent(this, Settings.class);
            startActivity(intent);
        } else if (id == R.id.nav_Rules) {
            Intent intent = new Intent(this, Rules.class);
            startActivity(intent);
        } else if (id == R.id.nav_Logout) {
            showLogoutDialog();
        }

        drawerLayout.closeDrawer(GravityCompat.START);

        return true;
    }

    private void showLogoutDialog()
    {
        new FancyAlertDialog.Builder(this)
                .setTitle("Log Out")
                .setBackgroundColor(Color.parseColor("#b4485f"))  //Don't pass R.color.colorvalue
                .setMessage("Are you sure you want to Log Out?")
                .setNegativeBtnText("CANCEL")
                .setPositiveBtnBackground(Color.parseColor("#b4485f"))  //Don't pass R.color.colorvalue
                .setPositiveBtnText("LOG OUT")
                .setNegativeBtnBackground(Color.parseColor("#FFA9A7A8"))  //Don't pass R.color.colorvalue
                .setAnimation(Animation.POP)
                .isCancellable(false)
                .OnPositiveClicked(new FancyAlertDialogListener() {
                    @Override
                    public void OnClick() {
                        userLocalStore.clearUserData();
                        userLocalStore.setUserLoggedIn(false);
                        finish();
                        Intent intent = new Intent(getApplicationContext(), Login.class);
                        startActivityForResult(intent, 0);
                    }
                })
                .OnNegativeClicked(new FancyAlertDialogListener() {
                    @Override
                    public void OnClick() {
                    }
                })
                .build();
    }

    private void showAlertDialog(final View v , final String category)
    {
        new FancyAlertDialog.Builder(this)
                .setTitle("What Size Quiz?")
                .setMessage("Short 10 question Quiz?\nOr try and answer ALL the questions for that category?")
                .setBackgroundColor(Color.parseColor("#b4485f"))  //Don't pass R.color.colorvalue
                .setNegativeBtnText("Short")
                .setPositiveBtnBackground(Color.parseColor("#b4485f"))  //Don't pass R.color.colorvalue
                .setPositiveBtnText("Full")
                .setNegativeBtnBackground(Color.parseColor("#FFA9A7A8"))  //Don't pass R.color.colorvalue
                .setAnimation(Animation.POP)
                .isCancellable(false)
                .OnPositiveClicked(new FancyAlertDialogListener() {
                    @Override
                    public void OnClick() {
                        selectedCategory(v, category, "full");
                    }
                })
                .OnNegativeClicked(new FancyAlertDialogListener() {
                    @Override
                    public void OnClick() {
                        selectedCategory(v, category, "short");
                    }
                })
                .build();
    }
}