package com.example.socialpetseventcreation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TimePicker;

public class Date extends AppCompatActivity {

    public static final String DAY = "com.example.socialpetseventcreation.MESSAGE";
    public static final String MONTH = "com.example.socialpetseventcreation.MESSAGE";
    public static final String YEAR = "com.example.socialpetseventcreation.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);

    }


    //called when user taps the next button
    public void DateToTime (View view) {


        //store the day, month and year from the picker
        DatePicker datePicker = findViewById(R.id.SPdatePicker);
        int EventDay = datePicker.getDayOfMonth();
        int EventMonth = datePicker.getMonth();
        int EventYear = datePicker.getYear();

        //create intent that will be sent to show
        Intent date_intent = new Intent(this, StartTime.class);

        date_intent.putExtra(DAY,EventDay);
        date_intent.putExtra(MONTH,EventMonth);
        date_intent.putExtra(YEAR,EventYear);

        startActivity(date_intent);

    }
}
