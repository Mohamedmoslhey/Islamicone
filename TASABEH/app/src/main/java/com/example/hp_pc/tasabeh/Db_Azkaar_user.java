package com.example.hp_pc.tasabeh;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.TextView;

/**
 * Created by HP-PC on 7/22/2017.
 */

public class Db_Azkaar_user extends SQLiteOpenHelper {
    private static final String TABLE_NAME = "أذكارى";
    private static final String col1 = "ID";
    private static final String col2 = "MyAzkaar";

    public Db_Azkaar_user(Context context) {
        super(context, TABLE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL( "CREATE TABLE " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                col2 +" TEXT)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXIST AZKAAR;"+TABLE_NAME);
        onCreate(db);
    }

    public boolean InsertAzkaar(String userInput ){
      SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(col2,userInput);
        long result = db.insert(TABLE_NAME, null, contentValues);
        if (result == -1) {
            return false;
        } else {
            return true;
        }

    }

    public Cursor getData(){
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "SELECT * FROM " + TABLE_NAME;
        Cursor data = db.rawQuery(query, null);
        return data;
    }

    public Cursor getItemID(String name){
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "SELECT " + col1 + " FROM " + TABLE_NAME +
                " WHERE " + col2 + " = '" + name + "'";
        Cursor data = db.rawQuery(query, null);
        return data;
    }
    public void UpdateAzkaar(String newAzkaar,int id,  String oldAzkaar){
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "UPDATE " + TABLE_NAME + " SET " + col2 +
                " = '" + newAzkaar + "' WHERE " + col1 + " = '" + id + "'" +
                " AND " + col2 + " = '" + oldAzkaar + "'";

        db.execSQL(query);
    }

    public void DeleteAzkaar(String userInput ,int id ){
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "DELETE FROM " + TABLE_NAME + " WHERE "
                + col1 + " = '" + id + "'" +
                " AND " + col2 + " = '" + userInput + "'";

        db.execSQL(query);

    }


    }

