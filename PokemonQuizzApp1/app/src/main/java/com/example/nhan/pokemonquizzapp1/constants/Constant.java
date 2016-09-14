package com.example.nhan.pokemonquizzapp1.constants;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.Display;

/**
 * Created by Nhan on 9/14/2016.
 */
public class Constant {
    public static float getActivityHeight(Activity activity){
        DisplayMetrics metrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(metrics);
        return (float)metrics.heightPixels;
    }
    public static float getActivityWidth(Activity activity){
        DisplayMetrics metrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(metrics);
        return (float)metrics.widthPixels;
    }
}
