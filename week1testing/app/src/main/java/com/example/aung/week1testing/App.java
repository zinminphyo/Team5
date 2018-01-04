package com.example.aung.week1testing;

import android.app.Application;
import android.graphics.Typeface;

/**
 * Created by aung on 1/3/18.
 */

public class App extends Application {

    public static final String LOG_TAG = "week1App";
    public static Typeface zawgyi;

    @Override
    public void onCreate() {
        super.onCreate();
        zawgyi = Typeface.createFromAsset(getAssets(), "fonts/zawgyi.ttf");
    }

}
