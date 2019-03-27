package com.example.cardquiz;

//score card to track current users score for each category
public class ScoreCard {

    public static final String TABLE_NAME = "stats";
    public static final String COLUMN_ID = "stats_id";
    public static final String COLUMN_EMAIL = "email";
    public static final String COLUMN_BOOKS = "books";
    public static final String COLUMN_CAPITALS = "capitals";
    public static final String COLUMN_COMPUTER = "computer";
    public static final String COLUMN_CURRENCY = "currency";
    public static final String COLUMN_ENGLISH = "english";
    public static final String COLUMN_GENERAL = "general";
    public static final String COLUMN_INVENTIONS = "inventions";
    public static final String COLUMN_MATHS = "maths";
    public static final String COLUMN_SCIENCE = "science";
    public static final String COLUMN_SPORTS = "sports";
    public static final String COLUMN_HIGHBOOKS = "HighBooks";
    public static final String COLUMN_HIGHCAPITALS = "HighCapitals";
    public static final String COLUMN_HIGHCOMPUTER = "HighComputer";
    public static final String COLUMN_HIGHCURRENCY = "HighCurrency";
    public static final String COLUMN_HIGHENGLISH = "HighEnglish";
    public static final String COLUMN_HIGHGENERAL = "HighGeneral";
    public static final String COLUMN_HIGHINVENTIONS = "HighInventions";
    public static final String COLUMN_HIGHMATHS = "HighMaths";
    public static final String COLUMN_HIGHSCIENCE = "HighScience";
    public static final String COLUMN_HIGHSPORTS = "HighSports";

    // Create table SQL query
    public static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + "("
            + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + COLUMN_EMAIL + " TEXT,"
            + COLUMN_BOOKS + " INTEGER,"
            + COLUMN_CAPITALS + " INTEGER,"
            + COLUMN_COMPUTER + " INTEGER,"
            + COLUMN_CURRENCY + " INTEGER,"
            + COLUMN_ENGLISH + " INTEGER,"
            + COLUMN_GENERAL + " INTEGER,"
            + COLUMN_INVENTIONS + " INTEGER,"
            + COLUMN_MATHS + " INTEGER,"
            + COLUMN_SCIENCE + " INTEGER,"
            + COLUMN_SPORTS + " INTEGER,"
            + COLUMN_HIGHBOOKS + " INTEGER,"
            + COLUMN_HIGHCAPITALS + " INTEGER,"
            + COLUMN_HIGHCOMPUTER + " INTEGER,"
            + COLUMN_HIGHCURRENCY + " INTEGER,"
            + COLUMN_HIGHENGLISH + " INTEGER,"
            + COLUMN_HIGHGENERAL + " INTEGER,"
            + COLUMN_HIGHINVENTIONS + " INTEGER,"
            + COLUMN_HIGHMATHS + " INTEGER,"
            + COLUMN_HIGHSCIENCE + " INTEGER,"
            + COLUMN_HIGHSPORTS + " INTEGER"
            + ")";

    int books;
    int capitals;
    int computer;
    int currency;
    int english;
    int general;
    int inventions;
    int maths;
    int science;
    int sports;
    int HighBooks;
    int HighCapitals;
    int HighComputer;
    int HighCurrency;
    int HighEnglish;
    int HighGeneral;
    int HighInventions;
    int HighMaths;
    int HighScience;
    int HighSports;

    public ScoreCard (int books, int capitals, int computer, int currency, int english, int general, int inventions, int maths, int science, int sports,
    int HighBooks, int HighCapitals, int HighComputer, int HighCurrency, int HighEnglish, int HighGeneral, int HighInventions, int HighMaths, int HighScience, int HighSports)
    {
        this.books = books;
        this.capitals = capitals;
        this.computer = computer;
        this.currency = currency;
        this.english = english;
        this.general = general;
        this.inventions = inventions;
        this.maths = maths;
        this.science = science;
        this.sports = sports;
        this.HighBooks = HighBooks;
        this.HighCapitals = HighCapitals;
        this.HighComputer = HighComputer;
        this.HighCurrency = HighCurrency;
        this.HighEnglish = HighEnglish;
        this.HighGeneral = HighGeneral;
        this.HighInventions = HighInventions;
        this.HighMaths = HighMaths;
        this.HighScience = HighScience;
        this.HighSports = HighSports;
    }
}
