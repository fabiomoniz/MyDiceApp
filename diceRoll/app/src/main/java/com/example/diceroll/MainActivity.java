package com.example.diceroll;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.TextView;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements Serializable {

    private Random rng = new Random();
    private Button switchView;
    private Button clear;
    private ImageView imageView;
    private ImageView imageView2;
    private ImageView imageView3;
    private ImageView imageView4;
    private ImageView imageView5;
    private ImageView imageView6;
    private ImageView imageView7;
    private TextView tv_rollNumber;
    ArrayList<ArrayList<String>> listOLists;
    private NumberPicker np;

    ArrayList<Timestamp> timeStamps;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timeStamps = new ArrayList<>();
        listOLists = new ArrayList<ArrayList<String>>();
        switchView = (Button) findViewById(R.id.button3);
        clear = (Button) findViewById(R.id.clear);
        tv_rollNumber = (TextView) findViewById(R.id.tv_rollNumber);
        np = (NumberPicker) findViewById(R.id.np);
        np.setMinValue(1);
        np.setMaxValue(6);

        imageView = findViewById(R.id.image_view_dice);
        imageView2 = findViewById(R.id.image_view_dice2);
        imageView3 = findViewById(R.id.image_view_dice3);
        imageView4 = findViewById(R.id.image_view_dice4);
        imageView5 = findViewById(R.id.image_view_dice5);
        imageView6 = findViewById(R.id.image_view_dice6);
        imageView7 = findViewById(R.id.image_view_dice7);
        tv_rollNumber.setText("Click the dice to roll!!!!");


        switchView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(MainActivity.this, listActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("rollNumber", listOLists);
                bundle.putSerializable("timeStamps", timeStamps );
                mIntent.putExtras(bundle);
                startActivity(mIntent);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timeStamps.clear();
                listOLists.clear();
                clear.setVisibility(View.INVISIBLE);
                switchView.setVisibility(View.INVISIBLE);
            }
        });

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switchView.getVisibility() == View.INVISIBLE) {
                    switchView.setVisibility(View.VISIBLE);
                    clear.setVisibility(View.VISIBLE);
                }
                ArrayList<String> rollNumbers = new ArrayList<>();
                rollNumbers.add(roll());
                listOLists.add(rollNumbers);
                addTimeStamp();
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switchView.getVisibility() == View.INVISIBLE) {
                    switchView.setVisibility(View.VISIBLE);
                    clear.setVisibility(View.VISIBLE);
                }
                ArrayList<String> rollNumbers = new ArrayList<>();
                switch(np.getValue()){
                    case 2:
                        rollNumbers.add(roll2());
                        rollNumbers.add(roll3());
                        listOLists.add(rollNumbers);
                        addTimeStamp();
                        break;
                    case 3:
                        rollNumbers.add(roll2());
                        rollNumbers.add(roll3());
                        rollNumbers.add(roll5());
                        listOLists.add(rollNumbers);
                        addTimeStamp();
                        break;
                    case 4:
                        rollNumbers.add(roll2());
                        rollNumbers.add(roll3());
                        rollNumbers.add(roll4());
                        rollNumbers.add(roll7());
                        listOLists.add(rollNumbers);
                        addTimeStamp();
                        break;
                    case 5:
                        rollNumbers.add(roll2());
                        rollNumbers.add(roll3());
                        rollNumbers.add(roll4());
                        rollNumbers.add(roll6());
                        rollNumbers.add(roll7());
                        listOLists.add(rollNumbers);
                        addTimeStamp();
                        break;
                    case 6:
                        rollNumbers.add(roll2());
                        rollNumbers.add(roll3());
                        rollNumbers.add(roll4());
                        rollNumbers.add(roll5());
                        rollNumbers.add(roll6());
                        rollNumbers.add(roll7());
                        listOLists.add(rollNumbers);
                        addTimeStamp();
                        break;
                }
            }
        });

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switchView.getVisibility() == View.INVISIBLE) {
                    switchView.setVisibility(View.VISIBLE);
                    clear.setVisibility(View.VISIBLE);
                }
                ArrayList<String> rollNumbers = new ArrayList<>();
                switch(np.getValue()){
                    case 2:
                        rollNumbers.add(roll2());
                        rollNumbers.add(roll3());
                        listOLists.add(rollNumbers);
                        addTimeStamp();
                        break;
                    case 3:
                        rollNumbers.add(roll2());
                        rollNumbers.add(roll3());
                        rollNumbers.add(roll5());
                        listOLists.add(rollNumbers);
                        addTimeStamp();
                        break;
                    case 4:
                        rollNumbers.add(roll2());
                        rollNumbers.add(roll3());
                        rollNumbers.add(roll4());
                        rollNumbers.add(roll7());
                        listOLists.add(rollNumbers);
                        addTimeStamp();
                        break;
                    case 5:
                        rollNumbers.add(roll2());
                        rollNumbers.add(roll3());
                        rollNumbers.add(roll4());
                        rollNumbers.add(roll6());
                        rollNumbers.add(roll7());
                        listOLists.add(rollNumbers);
                        addTimeStamp();
                        break;
                    case 6:
                        rollNumbers.add(roll2());
                        rollNumbers.add(roll3());
                        rollNumbers.add(roll4());
                        rollNumbers.add(roll5());
                        rollNumbers.add(roll6());
                        rollNumbers.add(roll7());
                        listOLists.add(rollNumbers);
                        addTimeStamp();
                        break;
                }

            }
        });

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switchView.getVisibility() == View.INVISIBLE) {
                    switchView.setVisibility(View.VISIBLE);
                    clear.setVisibility(View.VISIBLE);
                }
                ArrayList<String> rollNumbers = new ArrayList<>();
                switch(np.getValue()){
                    case 4:
                        rollNumbers.add(roll2());
                        rollNumbers.add(roll3());
                        rollNumbers.add(roll4());
                        rollNumbers.add(roll7());
                        listOLists.add(rollNumbers);
                        addTimeStamp();
                        break;
                    case 5:
                        rollNumbers.add(roll2());
                        rollNumbers.add(roll3());
                        rollNumbers.add(roll4());
                        rollNumbers.add(roll6());
                        rollNumbers.add(roll7());
                        listOLists.add(rollNumbers);
                        addTimeStamp();
                        break;
                    case 6:
                        rollNumbers.add(roll2());
                        rollNumbers.add(roll3());
                        rollNumbers.add(roll4());
                        rollNumbers.add(roll5());
                        rollNumbers.add(roll6());
                        rollNumbers.add(roll7());
                        listOLists.add(rollNumbers);
                        addTimeStamp();
                        break;
                }
            }
        });

        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switchView.getVisibility() == View.INVISIBLE) {
                    switchView.setVisibility(View.VISIBLE);
                    clear.setVisibility(View.VISIBLE);
                }
                ArrayList<String> rollNumbers = new ArrayList<>();
                switch(np.getValue()){
                    case 3:
                        rollNumbers.add(roll2());
                        rollNumbers.add(roll3());
                        rollNumbers.add(roll5());
                        listOLists.add(rollNumbers);
                        addTimeStamp();
                        break;
                    case 6:
                        rollNumbers.add(roll2());
                        rollNumbers.add(roll3());
                        rollNumbers.add(roll4());
                        rollNumbers.add(roll5());
                        rollNumbers.add(roll6());
                        rollNumbers.add(roll7());
                        listOLists.add(rollNumbers);
                        addTimeStamp();
                        break;
                }
            }
        });

        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switchView.getVisibility() == View.INVISIBLE) {
                    switchView.setVisibility(View.VISIBLE);
                    clear.setVisibility(View.VISIBLE);
                }
                ArrayList<String> rollNumbers = new ArrayList<>();
                switch(np.getValue()){
                    case 5:
                        rollNumbers.add(roll2());
                        rollNumbers.add(roll3());
                        rollNumbers.add(roll4());
                        rollNumbers.add(roll6());
                        rollNumbers.add(roll7());
                        listOLists.add(rollNumbers);
                        addTimeStamp();
                        break;
                    case 6:
                        rollNumbers.add(roll2());
                        rollNumbers.add(roll3());
                        rollNumbers.add(roll4());
                        rollNumbers.add(roll5());
                        rollNumbers.add(roll6());
                        rollNumbers.add(roll7());
                        listOLists.add(rollNumbers);
                        addTimeStamp();
                        break;
                }
            }
        });

        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switchView.getVisibility() == View.INVISIBLE) {
                    switchView.setVisibility(View.VISIBLE);
                    clear.setVisibility(View.VISIBLE);
                }
                ArrayList<String> rollNumbers = new ArrayList<>();
                switch(np.getValue()){
                    case 4:
                        rollNumbers.add(roll2());
                        rollNumbers.add(roll3());
                        rollNumbers.add(roll4());
                        rollNumbers.add(roll7());
                        listOLists.add(rollNumbers);
                        addTimeStamp();
                        break;
                    case 5:
                        rollNumbers.add(roll2());
                        rollNumbers.add(roll3());
                        rollNumbers.add(roll4());
                        rollNumbers.add(roll6());
                        rollNumbers.add(roll7());
                        listOLists.add(rollNumbers);
                        addTimeStamp();
                        break;
                    case 6:
                        rollNumbers.add(roll2());
                        rollNumbers.add(roll3());
                        rollNumbers.add(roll4());
                        rollNumbers.add(roll5());
                        rollNumbers.add(roll6());
                        rollNumbers.add(roll7());
                        listOLists.add(rollNumbers);
                        addTimeStamp();
                        break;
                }
            }
        });


        np.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                switch (picker.getValue()){
                    case 1:
                        imageView.setVisibility(View.VISIBLE);
                        imageView2.setVisibility(View.INVISIBLE);
                        imageView3.setVisibility(View.INVISIBLE);
                        imageView4.setVisibility(View.INVISIBLE);
                        imageView5.setVisibility(View.INVISIBLE);
                        imageView6.setVisibility(View.INVISIBLE);
                        imageView7.setVisibility(View.INVISIBLE);
                        break;
                    case 2:
                        imageView.setVisibility(View.INVISIBLE);
                        imageView2.setVisibility(View.VISIBLE);
                        imageView3.setVisibility(View.VISIBLE);
                        imageView4.setVisibility(View.INVISIBLE);
                        imageView5.setVisibility(View.INVISIBLE);
                        imageView6.setVisibility(View.INVISIBLE);
                        imageView7.setVisibility(View.INVISIBLE);
                        break;
                    case 3:
                        imageView.setVisibility(View.INVISIBLE);
                        imageView2.setVisibility(View.VISIBLE);
                        imageView3.setVisibility(View.VISIBLE);
                        imageView4.setVisibility(View.INVISIBLE);
                        imageView5.setVisibility(View.VISIBLE);
                        imageView6.setVisibility(View.INVISIBLE);
                        imageView7.setVisibility(View.INVISIBLE);
                        break;
                    case 4:
                        imageView.setVisibility(View.INVISIBLE);
                        imageView2.setVisibility(View.VISIBLE);
                        imageView3.setVisibility(View.VISIBLE);
                        imageView4.setVisibility(View.VISIBLE);
                        imageView5.setVisibility(View.INVISIBLE);
                        imageView6.setVisibility(View.INVISIBLE);
                        imageView7.setVisibility(View.VISIBLE);
                        break;
                    case 5:
                        imageView.setVisibility(View.INVISIBLE);
                        imageView2.setVisibility(View.VISIBLE);
                        imageView3.setVisibility(View.VISIBLE);
                        imageView4.setVisibility(View.VISIBLE);
                        imageView5.setVisibility(View.INVISIBLE);
                        imageView6.setVisibility(View.VISIBLE);
                        imageView7.setVisibility(View.VISIBLE);
                        break;
                    case 6:
                        imageView.setVisibility(View.INVISIBLE);
                        imageView2.setVisibility(View.VISIBLE);
                        imageView3.setVisibility(View.VISIBLE);
                        imageView4.setVisibility(View.VISIBLE);
                        imageView5.setVisibility(View.VISIBLE);
                        imageView6.setVisibility(View.VISIBLE);
                        imageView7.setVisibility(View.VISIBLE);
                        break;
                }
            }
        });
    }



    private String roll() {
                int randomNumber = rng.nextInt(6) + 1;
        String number = Integer.toString(randomNumber);

                switch (randomNumber) {
                    case 1:
                        imageView.setImageResource(R.drawable.dice_1);
                        break;

                    case 2:
                        imageView.setImageResource(R.drawable.dice_2);
                        break;

                    case 3:
                        imageView.setImageResource(R.drawable.dice_3);

                        break;

                    case 4:
                        imageView.setImageResource(R.drawable.dice_4);
                        break;

                    case 5:
                        imageView.setImageResource(R.drawable.dice_5);
                        break;

                    case 6:
                        imageView.setImageResource(R.drawable.dice_6);
                        break;
                }
                return number;
        }


    private String roll2() {
        int randomNumber = rng.nextInt(6) + 1;
        String number = Integer.toString(randomNumber);

        switch (randomNumber) {
            case 1:
                imageView2.setImageResource(R.drawable.dice_1);
                break;

            case 2:
                imageView2.setImageResource(R.drawable.dice_2);
            break;

            case 3:
                imageView2.setImageResource(R.drawable.dice_3);
                break;

            case 4:
                imageView2.setImageResource(R.drawable.dice_4);
                break;

            case 5:
                imageView2.setImageResource(R.drawable.dice_5);
                break;

            case 6:
                imageView2.setImageResource(R.drawable.dice_6);
                break;
        }
        return number;
    }

    private String roll3() {
        int randomNumber = rng.nextInt(6) + 1;
        String number = Integer.toString(randomNumber);
        switch (randomNumber) {
            case 1:
                imageView3.setImageResource(R.drawable.dice_1);
                break;

            case 2:
                imageView3.setImageResource(R.drawable.dice_2);
                break;

            case 3:
                imageView3.setImageResource(R.drawable.dice_3);
                break;

            case 4:
                imageView3.setImageResource(R.drawable.dice_4);
                break;

            case 5:
                imageView3.setImageResource(R.drawable.dice_5);
                break;

            case 6:
                imageView3.setImageResource(R.drawable.dice_6);
                break;
        }
        return number;
    }

    private String roll4() {
        int randomNumber = rng.nextInt(6) + 1;
        String number = Integer.toString(randomNumber);

        switch (randomNumber) {
            case 1:
                imageView4.setImageResource(R.drawable.dice_1);
                break;

            case 2:
                imageView4.setImageResource(R.drawable.dice_2);
                break;

            case 3:
                imageView4.setImageResource(R.drawable.dice_3);
                break;

            case 4:
                imageView4.setImageResource(R.drawable.dice_4);
                break;

            case 5:
                imageView4.setImageResource(R.drawable.dice_5);
                break;

            case 6:
                imageView4.setImageResource(R.drawable.dice_6);
                break;
        }
        return number;
    }

    private String roll5() {
        int randomNumber = rng.nextInt(6) + 1;
        String number = Integer.toString(randomNumber);

        switch (randomNumber) {
            case 1:
                imageView5.setImageResource(R.drawable.dice_1);
                break;

            case 2:
                imageView5.setImageResource(R.drawable.dice_2);
                break;

            case 3:
                imageView5.setImageResource(R.drawable.dice_3);
                break;

            case 4:
                imageView5.setImageResource(R.drawable.dice_4);
                break;

            case 5:
                imageView5.setImageResource(R.drawable.dice_5);
                break;

            case 6:
                imageView5.setImageResource(R.drawable.dice_6);
                break;
        }
        return number;
    }

    private String roll6() {
        int randomNumber = rng.nextInt(6) + 1;
        String number = Integer.toString(randomNumber);

        switch (randomNumber) {
            case 1:
                imageView6.setImageResource(R.drawable.dice_1);
                break;

            case 2:
                imageView6.setImageResource(R.drawable.dice_2);
                break;

            case 3:
                imageView6.setImageResource(R.drawable.dice_3);
                break;

            case 4:
                imageView6.setImageResource(R.drawable.dice_4);
                break;

            case 5:
                imageView6.setImageResource(R.drawable.dice_5);
                break;

            case 6:
                imageView6.setImageResource(R.drawable.dice_6);
                break;
        }
        return number;
    }

    private String roll7() {
        int randomNumber = rng.nextInt(6) + 1;
        String number = Integer.toString(randomNumber);

        switch (randomNumber) {
            case 1:
                imageView7.setImageResource(R.drawable.dice_1);
                break;

            case 2:
                imageView7.setImageResource(R.drawable.dice_2);
                break;

            case 3:
                imageView7.setImageResource(R.drawable.dice_3);
                break;

            case 4:
                imageView7.setImageResource(R.drawable.dice_4);
                break;

            case 5:
                imageView7.setImageResource(R.drawable.dice_5);
                break;

            case 6:
                imageView7.setImageResource(R.drawable.dice_6);
                break;
        }
        return number;
    }

    private void addTimeStamp(){
        Date date = new Date();
        long time = date.getTime();
        Timestamp ts = new Timestamp(time);
        timeStamps.add(ts);
    }
}