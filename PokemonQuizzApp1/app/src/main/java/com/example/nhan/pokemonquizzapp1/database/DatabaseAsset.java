package com.example.nhan.pokemonquizzapp1.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.nhan.pokemonquizzapp1.models.Pokemon;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nhan on 9/14/2016.
 */
public class DatabaseAsset {

    private SQLiteOpenHelper openHelper;
    private SQLiteDatabase database;

    private static DatabaseAsset instance;

    public DatabaseAsset(Context context) {
        this.openHelper = new DatabaseOpenHelper(context);
    }

    public static DatabaseAsset getInstance(Context context){
        if(instance == null){
            instance = new DatabaseAsset(context);
        }
        return instance;
    }

    public void open(){
            this.database = openHelper.getWritableDatabase();
    }

    public void close(){
        if(database != null){
            this.database.close();
        }
    }

    public List<Pokemon> getDataPokemon(){
        List<Pokemon> list = new ArrayList<>();
        Cursor cursor = database.rawQuery("SELECT name, tag, img, color FROM pokemon", null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            String name = cursor.getString(0);
            String tag = cursor.getString(1);
            String img = cursor.getString(2);
            String color = cursor.getString(3);
            list.add(new Pokemon(name, tag, img, color));
            cursor.moveToNext();
        }
        cursor.close();
        return list;
    }
}
