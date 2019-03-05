package com.example.diceroll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class listActivity extends AppCompatActivity {


    ListView mListView;

    ArrayList<String> rollNumber;

    String[] rollNumbers = {};
    int[] dies = {R.drawable.dice_1,
                 R.drawable.dice_2,
                 R.drawable.dice_3,
                 R.drawable.dice_4,
                 R.drawable.dice_5,
                 R.drawable.dice_6};

    int[] die = new int[100000];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Bundle mBundle = getIntent().getExtras();
        rollNumber = (ArrayList<String>) mBundle.getSerializable("rollNumber");

        setRolls();
        setDice();
        mListView = (ListView) findViewById(R.id.listView);
        MyAdapter myAdapter = new MyAdapter(listActivity.this, rollNumbers, die);
        mListView.setAdapter(myAdapter);

    }

    String[] setRolls(){
        return rollNumbers = rollNumber.toArray(new String[0]);
    }

    void setDice(){

        for (int i = 0; i < rollNumber.size(); i++ )
        {
            switch(rollNumber.get(i)){
                case "1":
                    die[i] = dies[0];
                    break;
                case "2":
                    die[i] = dies[1];
                    break;
                case "3":
                    die[i] = dies[2];
                    break;
                case "4":
                    die[i] = dies[3];
                    break;
                case "5":
                    die[i] = dies[4];
                    break;
                case "6":
                    die[i] = dies[5];
                    break;

            }
        }


    }
}
