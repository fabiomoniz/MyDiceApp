package com.example.diceroll;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements Serializable {


    private Random rng = new Random();
    private Button lessDiceBtn;
    private Button moreDiceBtn;
    private Button switchView;
    private ImageView imageView;
    private ImageView imageView2;
    private ImageView imageView3;
    private ImageView imageView4;
    private ImageView imageView5;
    private ImageView imageView6;
    private ImageView imageView7;
    private TextView tv_rollNumber;
    private int diceNumber = 1;
    ArrayList<String> rollNumbers;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rollNumbers = new ArrayList<>();
        lessDiceBtn = (Button) findViewById(R.id.button2);
        moreDiceBtn = (Button) findViewById(R.id.button);
        switchView = (Button) findViewById(R.id.button3);
        tv_rollNumber = (TextView) findViewById(R.id.tv_rollNumber);
        imageView = findViewById(R.id.image_view_dice);
        imageView2 = findViewById(R.id.image_view_dice2);
        imageView3 = findViewById(R.id.image_view_dice3);
        imageView4 = findViewById(R.id.image_view_dice4);
        imageView5 = findViewById(R.id.image_view_dice5);
        imageView6 = findViewById(R.id.image_view_dice6);
        imageView7 = findViewById(R.id.image_view_dice7);

        switchView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(MainActivity.this, listActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("rollNumber" , rollNumbers);
                mIntent.putExtras(bundle);
                startActivity(mIntent);
            }
        });


        lessDiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(diceNumber){
                    case 6:
                        moreDiceBtn.setVisibility(View.VISIBLE);
                        imageView5.setVisibility(View.INVISIBLE);
                        diceNumber = 5;
                        break;
                    case 5:
                        imageView6.setVisibility(View.INVISIBLE);
                        diceNumber = 4;
                        break;
                    case 4:
                        imageView5.setVisibility(View.VISIBLE);
                        imageView4.setVisibility(View.INVISIBLE);
                        imageView7.setVisibility(View.INVISIBLE);
                        diceNumber = 3;
                        break;
                    case 3:
                        imageView5.setVisibility(View.INVISIBLE);
                        diceNumber = 2;
                        break;
                    case 2:
                        imageView.setVisibility(View.VISIBLE);
                        imageView2.setVisibility(View.INVISIBLE);
                        imageView3.setVisibility(View.INVISIBLE);
                        lessDiceBtn.setVisibility(View.INVISIBLE);
                        diceNumber = 1;
                        break;
                }
            }
        });

        moreDiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(diceNumber){
                    case 1:
                        imageView.setVisibility(View.INVISIBLE);
                        imageView2.setVisibility(View.VISIBLE);
                        imageView3.setVisibility(View.VISIBLE);
                        lessDiceBtn.setVisibility(View.VISIBLE);
                        diceNumber = 2;
                        break;
                    case 2:
                        imageView5.setVisibility(View.VISIBLE);
                        diceNumber = 3;
                        break;
                    case 3:
                        imageView5.setVisibility(View.INVISIBLE);
                        imageView4.setVisibility(View.VISIBLE);
                        imageView7.setVisibility(View.VISIBLE);
                        diceNumber = 4;
                        break;
                    case 4:
                        imageView6.setVisibility(View.VISIBLE);
                        diceNumber = 5;
                        break;
                    case 5:
                        imageView5.setVisibility(View.VISIBLE);
                        moreDiceBtn.setVisibility(View.INVISIBLE);
                        diceNumber = 6;
                        break;
                }
            }

        });



        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                roll();
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(diceNumber){
                    case 2:
                        roll2();
                        roll3();
                        break;
                    case 3:
                        roll2();
                        roll3();
                        roll5();
                        break;
                    case 4:
                        roll2();
                        roll3();
                        roll4();
                        roll7();
                        break;
                    case 5:
                        roll2();
                        roll3();
                        roll4();
                        roll6();
                        roll7();
                        break;
                    case 6:
                        roll2();
                        roll3();
                        roll4();
                        roll5();
                        roll6();
                        roll7();
                        break;
                }
            }
        });

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(diceNumber){
                    case 2:
                        roll2();
                        roll3();
                        break;
                    case 3:
                        roll2();
                        roll3();
                        roll5();
                        break;
                    case 4:
                        roll2();
                        roll3();
                        roll4();
                        roll7();
                        break;
                    case 5:
                        roll2();
                        roll3();
                        roll4();
                        roll6();
                        roll7();
                        break;
                    case 6:
                        roll2();
                        roll3();
                        roll4();
                        roll5();
                        roll6();
                        roll7();
                        break;
                }

            }
        });

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(diceNumber){
                    case 4:
                        roll2();
                        roll3();
                        roll4();
                        roll7();
                        break;
                    case 5:
                        roll2();
                        roll3();
                        roll4();
                        roll6();
                        roll7();
                        break;
                    case 6:
                        roll2();
                        roll3();
                        roll4();
                        roll5();
                        roll6();
                        roll7();
                        break;
                }
            }
        });

        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(diceNumber){
                    case 3:
                        roll2();
                        roll3();
                        roll5();
                        break;
                    case 6:
                        roll2();
                        roll3();
                        roll4();
                        roll5();
                        roll6();
                        roll7();
                        break;
                }
            }
        });

        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(diceNumber){
                    case 5:
                        roll2();
                        roll3();
                        roll4();
                        roll6();
                        roll7();
                        break;
                    case 6:
                        roll2();
                        roll3();
                        roll4();
                        roll5();
                        roll6();
                        roll7();
                        break;
                }
            }
        });

        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(diceNumber){
                    case 4:
                        roll2();
                        roll3();
                        roll4();
                        roll7();
                        break;
                    case 5:
                        roll2();
                        roll3();
                        roll4();
                        roll6();
                        roll7();
                        break;
                    case 6:
                        roll2();
                        roll3();
                        roll4();
                        roll5();
                        roll6();
                        roll7();
                        break;
                }
            }
        });
    }



    private void roll() {
                int randomNumber = rng.nextInt(6) + 1;
                tv_rollNumber.setText("you rolled a " + randomNumber);

                switch (randomNumber) {
                    case 1:
                        imageView.setImageResource(R.drawable.dice_1);
                        rollNumbers.add("1");
                        break;

                    case 2:
                        imageView.setImageResource(R.drawable.dice_2);
                        rollNumbers.add("2");
                        break;

                    case 3:
                        imageView.setImageResource(R.drawable.dice_3);
                        rollNumbers.add("3");

                        break;

                    case 4:
                        imageView.setImageResource(R.drawable.dice_4);
                        rollNumbers.add("4");
                        break;

                    case 5:
                        imageView.setImageResource(R.drawable.dice_5);
                        rollNumbers.add("5");
                        break;

                    case 6:
                        imageView.setImageResource(R.drawable.dice_6);
                        rollNumbers.add("6");
                        break;
                }
        }


    private void roll2() {
        int randomNumber = rng.nextInt(6) + 1;
        tv_rollNumber.setText("you rolled a " + randomNumber);

        switch (randomNumber) {
            case 1:
                imageView2.setImageResource(R.drawable.dice_1);
                rollNumbers.add("1");
                break;

            case 2:
                imageView2.setImageResource(R.drawable.dice_2);
                rollNumbers.add("2");
                break;

            case 3:
                imageView2.setImageResource(R.drawable.dice_3);
                rollNumbers.add("3");
                break;

            case 4:
                imageView2.setImageResource(R.drawable.dice_4);
                rollNumbers.add("4");
                break;

            case 5:
                imageView2.setImageResource(R.drawable.dice_5);
                rollNumbers.add("5");
                break;

            case 6:
                imageView2.setImageResource(R.drawable.dice_6);
                rollNumbers.add("6");
                break;
        }
    }

    private void roll3() {
        int randomNumber = rng.nextInt(6) + 1;
        tv_rollNumber.setText("you rolled a " + randomNumber);

        switch (randomNumber) {
            case 1:
                imageView3.setImageResource(R.drawable.dice_1);
                rollNumbers.add("1");
                break;

            case 2:
                imageView3.setImageResource(R.drawable.dice_2);
                rollNumbers.add("2");
                break;

            case 3:
                imageView3.setImageResource(R.drawable.dice_3);
                rollNumbers.add("3");
                break;

            case 4:
                imageView3.setImageResource(R.drawable.dice_4);
                rollNumbers.add("4");
                break;

            case 5:
                imageView3.setImageResource(R.drawable.dice_5);
                rollNumbers.add("5");
                break;

            case 6:
                imageView3.setImageResource(R.drawable.dice_6);
                rollNumbers.add("6");
                break;
        }
    }

    private void roll4() {
        int randomNumber = rng.nextInt(6) + 1;
        tv_rollNumber.setText("you rolled a " + randomNumber);

        switch (randomNumber) {
            case 1:
                imageView4.setImageResource(R.drawable.dice_1);
                rollNumbers.add("1");
                break;

            case 2:
                imageView4.setImageResource(R.drawable.dice_2);
                rollNumbers.add("2");
                break;

            case 3:
                imageView4.setImageResource(R.drawable.dice_3);
                rollNumbers.add("3");
                break;

            case 4:
                imageView4.setImageResource(R.drawable.dice_4);
                rollNumbers.add("4");
                break;

            case 5:
                imageView4.setImageResource(R.drawable.dice_5);
                rollNumbers.add("5");
                break;

            case 6:
                imageView4.setImageResource(R.drawable.dice_6);
                rollNumbers.add("6");
                break;
        }
    }

    private void roll5() {
        int randomNumber = rng.nextInt(6) + 1;
        tv_rollNumber.setText("you rolled a " + randomNumber);

        switch (randomNumber) {
            case 1:
                imageView5.setImageResource(R.drawable.dice_1);
                rollNumbers.add("1");
                break;

            case 2:
                imageView5.setImageResource(R.drawable.dice_2);
                rollNumbers.add("2");
                break;

            case 3:
                imageView5.setImageResource(R.drawable.dice_3);
                rollNumbers.add("3");
                break;

            case 4:
                imageView5.setImageResource(R.drawable.dice_4);
                rollNumbers.add("4");
                break;

            case 5:
                imageView5.setImageResource(R.drawable.dice_5);
                rollNumbers.add("5");
                break;

            case 6:
                imageView5.setImageResource(R.drawable.dice_6);
                rollNumbers.add("6");
                break;
        }
    }

    private void roll6() {
        int randomNumber = rng.nextInt(6) + 1;
        tv_rollNumber.setText("you rolled a " + randomNumber);

        switch (randomNumber) {
            case 1:
                imageView6.setImageResource(R.drawable.dice_1);
                rollNumbers.add("1");
                break;

            case 2:
                imageView6.setImageResource(R.drawable.dice_2);
                rollNumbers.add("2");
                break;

            case 3:
                imageView6.setImageResource(R.drawable.dice_3);
                rollNumbers.add("3");
                break;

            case 4:
                imageView6.setImageResource(R.drawable.dice_4);
                rollNumbers.add("4");
                break;

            case 5:
                imageView6.setImageResource(R.drawable.dice_5);
                rollNumbers.add("5");
                break;

            case 6:
                imageView6.setImageResource(R.drawable.dice_6);
                rollNumbers.add("6");
                break;
        }
    }

    private void roll7() {
        int randomNumber = rng.nextInt(6) + 1;
        tv_rollNumber.setText("you rolled a " + randomNumber);

        switch (randomNumber) {
            case 1:
                imageView7.setImageResource(R.drawable.dice_1);
                rollNumbers.add("1");
                break;

            case 2:
                imageView7.setImageResource(R.drawable.dice_2);
                rollNumbers.add("2");
                break;

            case 3:
                imageView7.setImageResource(R.drawable.dice_3);
                rollNumbers.add("3");
                break;

            case 4:
                imageView7.setImageResource(R.drawable.dice_4);
                rollNumbers.add("4");
                break;

            case 5:
                imageView7.setImageResource(R.drawable.dice_5);
                rollNumbers.add("5");
                break;

            case 6:
                imageView7.setImageResource(R.drawable.dice_6);
                rollNumbers.add("6");
                break;
        }
    }
}