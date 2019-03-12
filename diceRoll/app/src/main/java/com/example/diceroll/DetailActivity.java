package com.example.diceroll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import java.sql.Timestamp;
import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

    TextView textView4;
    TextView textView3;
    ImageView imageView;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;
    ImageView imageView7;
    ArrayList<String> listOfList;
    Timestamp timeStamps;

    int[] dies = {R.drawable.dice_1,
            R.drawable.dice_2,
            R.drawable.dice_3,
            R.drawable.dice_4,
            R.drawable.dice_5,
            R.drawable.dice_6,
            R.drawable.click};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        textView4 = (TextView) findViewById(R.id.textView4);
        textView3 = (TextView) findViewById(R.id.textView3);
        imageView = findViewById(R.id.image_view_dice);
        imageView2 = findViewById(R.id.image_view_dice2);
        imageView3 = findViewById(R.id.image_view_dice3);
        imageView4 = findViewById(R.id.image_view_dice4);
        imageView5 = findViewById(R.id.image_view_dice5);
        imageView6 = findViewById(R.id.image_view_dice6);
        imageView7 = findViewById(R.id.image_view_dice7);


        Bundle mBundle = getIntent().getExtras();
        listOfList = (ArrayList<String>) mBundle.getSerializable("listOfList");
        timeStamps = (Timestamp) mBundle.getSerializable("timeStamps");

        textView3.setText("On " + timeStamps.toString().substring(0,16) + " you rolled");
        setDiceToImage();
        sumAndSet();
    }

    private void setDiceToImage(){
        int size = listOfList.size();
        int number;
        int number2;
        int number3;
        int number4;
        int number5;
        int number6;
        switch(size){
            case 1:
                imageView.setVisibility(View.VISIBLE);
                imageView2.setVisibility(View.INVISIBLE);
                imageView3.setVisibility(View.INVISIBLE);
                imageView4.setVisibility(View.INVISIBLE);
                imageView5.setVisibility(View.INVISIBLE);
                imageView6.setVisibility(View.INVISIBLE);
                imageView7.setVisibility(View.INVISIBLE);
                number = Integer.parseInt(listOfList.get(0));
                imageView.setImageResource(dies[number-1]);
                break;
            case 2:
                imageView.setVisibility(View.INVISIBLE);
                imageView2.setVisibility(View.VISIBLE);
                imageView3.setVisibility(View.VISIBLE);
                imageView4.setVisibility(View.INVISIBLE);
                imageView5.setVisibility(View.INVISIBLE);
                imageView6.setVisibility(View.INVISIBLE);
                imageView7.setVisibility(View.INVISIBLE);
                number = Integer.parseInt(listOfList.get(0));
                number2 = Integer.parseInt(listOfList.get(1));
                imageView2.setImageResource(dies[number-1]);
                imageView3.setImageResource(dies[number2-1]);
                break;
            case 3:
                imageView.setVisibility(View.INVISIBLE);
                imageView2.setVisibility(View.VISIBLE);
                imageView3.setVisibility(View.VISIBLE);
                imageView4.setVisibility(View.INVISIBLE);
                imageView5.setVisibility(View.VISIBLE);
                imageView6.setVisibility(View.INVISIBLE);
                imageView7.setVisibility(View.INVISIBLE);
                number = Integer.parseInt(listOfList.get(0));
                number2 = Integer.parseInt(listOfList.get(1));
                number3 = Integer.parseInt(listOfList.get(2));
                imageView2.setImageResource(dies[number-1]);
                imageView3.setImageResource(dies[number2-1]);
                imageView5.setImageResource(dies[number3-1]);
                break;
            case 4:
                imageView.setVisibility(View.INVISIBLE);
                imageView2.setVisibility(View.VISIBLE);
                imageView3.setVisibility(View.VISIBLE);
                imageView4.setVisibility(View.VISIBLE);
                imageView5.setVisibility(View.INVISIBLE);
                imageView6.setVisibility(View.INVISIBLE);
                imageView7.setVisibility(View.VISIBLE);
                number = Integer.parseInt(listOfList.get(0));
                number2 = Integer.parseInt(listOfList.get(1));
                number3 = Integer.parseInt(listOfList.get(2));
                number4 = Integer.parseInt(listOfList.get(3));
                imageView2.setImageResource(dies[number-1]);
                imageView3.setImageResource(dies[number2-1]);
                imageView4.setImageResource(dies[number3-1]);
                imageView7.setImageResource(dies[number4-1]);
                break;
            case 5:
                imageView.setVisibility(View.INVISIBLE);
                imageView2.setVisibility(View.VISIBLE);
                imageView3.setVisibility(View.VISIBLE);
                imageView4.setVisibility(View.VISIBLE);
                imageView5.setVisibility(View.INVISIBLE);
                imageView6.setVisibility(View.VISIBLE);
                imageView7.setVisibility(View.VISIBLE);
                number = Integer.parseInt(listOfList.get(0));
                number2 = Integer.parseInt(listOfList.get(1));
                number3 = Integer.parseInt(listOfList.get(2));
                number4 = Integer.parseInt(listOfList.get(3));
                number5 = Integer.parseInt(listOfList.get(4));
                imageView2.setImageResource(dies[number-1]);
                imageView3.setImageResource(dies[number2-1]);
                imageView4.setImageResource(dies[number3-1]);
                imageView6.setImageResource(dies[number4-1]);
                imageView7.setImageResource(dies[number5-1]);
                break;
            case 6:
                imageView.setVisibility(View.INVISIBLE);
                imageView2.setVisibility(View.VISIBLE);
                imageView3.setVisibility(View.VISIBLE);
                imageView4.setVisibility(View.VISIBLE);
                imageView5.setVisibility(View.VISIBLE);
                imageView6.setVisibility(View.VISIBLE);
                imageView7.setVisibility(View.VISIBLE);
                number = Integer.parseInt(listOfList.get(0));
                number2 = Integer.parseInt(listOfList.get(1));
                number3 = Integer.parseInt(listOfList.get(2));
                number4 = Integer.parseInt(listOfList.get(3));
                number5 = Integer.parseInt(listOfList.get(4));
                number6 = Integer.parseInt(listOfList.get(5));
                imageView2.setImageResource(dies[number-1]);
                imageView3.setImageResource(dies[number2-1]);
                imageView4.setImageResource(dies[number3-1]);
                imageView5.setImageResource(dies[number4-1]);
                imageView6.setImageResource(dies[number5-1]);
                imageView7.setImageResource(dies[number6-1]);
                break;
        }
    }

    private void sumAndSet(){
        int sum = 0;
        for (int i = 0; i < listOfList.size() ; i++) {
            int number = Integer.parseInt(listOfList.get(i));
            sum = sum + number;
        }
        textView4.setText("The sum of all dice is equal to " + sum);
    }
}
