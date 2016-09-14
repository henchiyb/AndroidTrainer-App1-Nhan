package com.example.nhan.pokemonquizzapp1.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

/**
 * Created by Nhan on 9/14/2016.
 */
public class DatabaseOpenHelper extends SQLiteAssetHelper {
    public DatabaseOpenHelper(Context context) {
        super(context, Helpers.DATABASE_NAME, null, Helpers.DATABASE_VERSION);
    }
}
