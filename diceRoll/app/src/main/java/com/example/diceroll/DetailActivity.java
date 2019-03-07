package com.example.diceroll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toolbar;

import java.sql.Timestamp;
import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

    Toolbar mToolbar;
    ImageView imageView;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;
    ImageView imageView7;
    ArrayList<ArrayList<String>> listOfList;
    ArrayList<Timestamp> timeStamps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mToolbar = (Toolbar) findViewById(R.id.toolbar2);

        Bundle mBundle = getIntent().getExtras();
        listOfList = (ArrayList<ArrayList<String>>) mBundle.getSerializable("rollNumber");
        timeStamps = (ArrayList<Timestamp>) mBundle.getSerializable("timeStamps");

    }
}
