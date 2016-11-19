package com.example.dawestho.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.microsoft.azure.mobile.MobileCenter;
import com.microsoft.azure.mobile.analytics.Analytics;
import com.microsoft.azure.mobile.crashes.Crashes;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileCenter.start(getApplication(), "19ad565c-cfeb-4642-ae45-d8a816e51fb3",
                Analytics.class, Crashes.class);



        //This is my first time using sonoma.... 


    }
}
