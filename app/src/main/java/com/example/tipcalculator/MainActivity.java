package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculatePercent(View v){
        TextView totalTextView = (TextView) findViewById(R.id.totaltextview);
        EditText billEditText = (EditText) findViewById(R.id.bill);
        TextView tipTextView = (TextView) findViewById(R.id.tip);

        CheckBox simpleCheckBox = (CheckBox) findViewById(R.id.onestar);
        Boolean checkBox1State = simpleCheckBox.isChecked();

        //CheckBox simpleCheckBox = (CheckBox) findViewById(R.id.twostar);
        //Boolean checkBox2State = simpleCheckBox.isChecked();

        //CheckBox simpleCheckBox = (CheckBox) findViewById(R.id.threestar);
        //Boolean checkBox3State = simpleCheckBox.isChecked();

        double tip;

        if(checkBox1State){
            tip = 0.05;
        }

        //if(checkBox2State){
            //tip = 0.1;
       // }
        //if(checkBox3State){
            //tip = 0.15;
       // }


    }

    public void oneStarTip(View v){
        TextView tipTextView = (TextView) findViewById(R.id.tip);
        CheckBox simpleCheckBox = (CheckBox) findViewById(R.id.onestar);
        Boolean checkBoxState = simpleCheckBox.isChecked();

        if(checkBoxState){
            tipTextView.setText("5%");
        }
    }

    public void twoStarTip(View v){
        TextView tipTextView = (TextView) findViewById(R.id.tip);
        CheckBox simpleCheckBox = (CheckBox) findViewById(R.id.twostar);
        Boolean checkBoxState = simpleCheckBox.isChecked();

        if(checkBoxState){
            tipTextView.setText("10%");
        }
    }

    public void threeStarTip(View v){
        TextView tipTextView = (TextView) findViewById(R.id.tip);
        CheckBox simpleCheckBox = (CheckBox) findViewById(R.id.threestar);
        Boolean checkBoxState = simpleCheckBox.isChecked();

        if(checkBoxState){
            tipTextView.setText("15%");
        }
    }
}
