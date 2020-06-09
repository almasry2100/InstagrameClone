package com.example.instagrameclone;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("NL2Ht8xcBM0G9Qdb4wrLP2nVk3SieZIWUiWcPc63")
                // if defined
                .clientKey("YvP41BU2HmltNx80hICiRVzCkcnuxAD7X9tJt7bs")
                .server("https://parseapi.back4app.com/")
                .build()
        );

    }
}
