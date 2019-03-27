package com.example.cardquiz;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

//Create database to store userdata
// insert new registered user
// get userdata to check if credentials are correct
class UserDB extends SQLiteOpenHelper {

    private final static int DB_VERSION = 10;
    private static final String DB_NAME = "UserTriviaQuiz.db";

    public UserDB(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String query = "create table logins (userId INTEGER primary key autoincrement, " +
                " email TEXT, password TEXT, name TEXT)";
        sqLiteDatabase.execSQL(query);

        sqLiteDatabase.execSQL(ScoreCard.CREATE_TABLE);
    }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        // Drop older table if existed
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + ScoreCard.TABLE_NAME);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS logins");

        // Create tables again
        onCreate(sqLiteDatabase);
    }

    @Override
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        System.out.println("DOWNGRADE DB oldVersion=" + oldVersion + " - newVersion=" + newVersion);
    }

    public void insertUser(User queryValues) {
        SQLiteDatabase database = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("email", queryValues.email);
        values.put("password", queryValues.password);
        values.put("name", queryValues.name);
        database.insert("logins", null, values);

        ContentValues values2 = new ContentValues();
        values2.put(ScoreCard.COLUMN_BOOKS, 0);
        values2.put(ScoreCard.COLUMN_CAPITALS, 0);
        values2.put(ScoreCard.COLUMN_COMPUTER, 0);
        values2.put(ScoreCard.COLUMN_CURRENCY, 0);
        values2.put(ScoreCard.COLUMN_ENGLISH, 0);
        values2.put(ScoreCard.COLUMN_GENERAL, 0);
        values2.put(ScoreCard.COLUMN_INVENTIONS, 0);
        values2.put(ScoreCard.COLUMN_MATHS, 0);
        values2.put(ScoreCard.COLUMN_SCIENCE, 0);
        values2.put(ScoreCard.COLUMN_SPORTS, 0);
        values2.put(ScoreCard.COLUMN_HIGHBOOKS, 0);
        values2.put(ScoreCard.COLUMN_HIGHCAPITALS, 0);
        values2.put(ScoreCard.COLUMN_HIGHCOMPUTER, 0);
        values2.put(ScoreCard.COLUMN_HIGHCURRENCY, 0);
        values2.put(ScoreCard.COLUMN_HIGHENGLISH, 0);
        values2.put(ScoreCard.COLUMN_HIGHGENERAL, 0);
        values2.put(ScoreCard.COLUMN_HIGHINVENTIONS, 0);
        values2.put(ScoreCard.COLUMN_HIGHMATHS, 0);
        values2.put(ScoreCard.COLUMN_HIGHSCIENCE, 0);
        values2.put(ScoreCard.COLUMN_HIGHSPORTS, 0);
        values2.put(ScoreCard.COLUMN_EMAIL, queryValues.email);
        database.insert(ScoreCard.TABLE_NAME, null, values2);

        database.close();
    }

    public User getUser(String email) {
        String query = "Select userId, password, name from logins where email ='" + email + "'";
        User myUser = new User(0, "", email, "", "");
        SQLiteDatabase database = this.getReadableDatabase();
        Cursor cursor = database.rawQuery(query, null);
        if (cursor.moveToFirst()) {
            do {
                myUser.userId = cursor.getLong(0);
                myUser.password = cursor.getString(1);
                myUser.name = cursor.getString(2);
            } while (cursor.moveToNext());
        }

        cursor.close();
        database.close();

        return myUser;
    }

    public ScoreCard getScore(String email) {
        String query = "SELECT  * FROM " + ScoreCard.TABLE_NAME + " WHERE " + ScoreCard.COLUMN_EMAIL +"='" + email + "'";
        SQLiteDatabase database = this.getWritableDatabase();
        Cursor cursor = database.rawQuery(query, null);

        if (cursor != null)
            cursor.moveToFirst();

        ScoreCard scoreCard = new ScoreCard(
                cursor.getInt(cursor.getColumnIndex(ScoreCard.COLUMN_BOOKS)),
                cursor.getInt(cursor.getColumnIndex(ScoreCard.COLUMN_CAPITALS)),
                cursor.getInt(cursor.getColumnIndex(ScoreCard.COLUMN_COMPUTER)),
                cursor.getInt(cursor.getColumnIndex(ScoreCard.COLUMN_CURRENCY)),
                cursor.getInt(cursor.getColumnIndex(ScoreCard.COLUMN_ENGLISH)),
                cursor.getInt(cursor.getColumnIndex(ScoreCard.COLUMN_GENERAL)),
                cursor.getInt(cursor.getColumnIndex(ScoreCard.COLUMN_INVENTIONS)),
                cursor.getInt(cursor.getColumnIndex(ScoreCard.COLUMN_MATHS)),
                cursor.getInt(cursor.getColumnIndex(ScoreCard.COLUMN_SCIENCE)),
                cursor.getInt(cursor.getColumnIndex(ScoreCard.COLUMN_SPORTS)),
                cursor.getInt(cursor.getColumnIndex(ScoreCard.COLUMN_HIGHBOOKS)),
                cursor.getInt(cursor.getColumnIndex(ScoreCard.COLUMN_HIGHCAPITALS)),
                cursor.getInt(cursor.getColumnIndex(ScoreCard.COLUMN_HIGHCOMPUTER)),
                cursor.getInt(cursor.getColumnIndex(ScoreCard.COLUMN_HIGHCURRENCY)),
                cursor.getInt(cursor.getColumnIndex(ScoreCard.COLUMN_HIGHENGLISH)),
                cursor.getInt(cursor.getColumnIndex(ScoreCard.COLUMN_HIGHGENERAL)),
                cursor.getInt(cursor.getColumnIndex(ScoreCard.COLUMN_HIGHINVENTIONS)),
                cursor.getInt(cursor.getColumnIndex(ScoreCard.COLUMN_HIGHMATHS)),
                cursor.getInt(cursor.getColumnIndex(ScoreCard.COLUMN_HIGHSCIENCE)),
                cursor.getInt(cursor.getColumnIndex(ScoreCard.COLUMN_HIGHSPORTS)));

        cursor.close();
        database.close();

        return scoreCard;
    }

    public void resetScore(String email) {
        String query = "Update stats SET books='0', capitals='0', computer='0', currency='0', english='0', general='0', inventions='0', maths='0', science='0', sports='0', " +
                "HighBooks='0', HighCapitals='0', HighComputer='0', HighCurrency='0', HighEnglish='0', HighGeneral='0', HighInventions='0', HighMaths='0', HighScience='0', HighSports='0' where email ='" + email + "'";
        SQLiteDatabase database = this.getWritableDatabase();
        database.execSQL(query);
        database.close();
    }

    public void updateScore(String email, String category, int score) {
        String query = "Update " + ScoreCard.TABLE_NAME + " SET " + category + "='"+ score +"' where " + ScoreCard.COLUMN_EMAIL + " ='" + email + "'";
        SQLiteDatabase database = this.getWritableDatabase();
        database.execSQL(query);
        database.close();
    }
}