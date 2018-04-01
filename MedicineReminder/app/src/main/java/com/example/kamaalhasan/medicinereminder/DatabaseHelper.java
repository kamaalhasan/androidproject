package com.example.kamaalhasan.medicinereminder;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "users.db";
    public static final String TABLE_NAME = "alarm_table";
    public static final String COL1 = "ID";
    public static final String COL2 = "MED";
    public static final String COL3 = "DAT";
    public static final String COL4 = "TAM";
    public static final String COL5 = "DES";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE  IF EXISTS " + TABLE_NAME);

    }


    public boolean addData(String med, String dat, String tam, String des) {

        SQLiteDatabase db = this.getWritableDatabase();
        String createTable = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "MED TEXT,DAT TEXT, TAM TEXT, DES TEXT)";
        db.execSQL(createTable);
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL2, med);
        contentValues.put(COL3, dat);
        contentValues.put(COL4, tam);
        contentValues.put(COL5, des);

        long result = db.insert(TABLE_NAME, null, contentValues);

        //if date as inserted incorrectly it will return -1
        if (result == -1) {
            return false;
        } else {
            return true;
        }
    }
    public Cursor getListContents(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor data = db.rawQuery("SELECT * FROM " + TABLE_NAME, null);
        return data;
    }



}

