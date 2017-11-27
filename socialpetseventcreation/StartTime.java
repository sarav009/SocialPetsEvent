package com.example.socialpetseventcreation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TimePicker;

import static com.example.socialpetseventcreation.Date.DAY;
import static com.example.socialpetseventcreation.Date.MONTH;
import static com.example.socialpetseventcreation.Date.YEAR;

public class StartTime extends AppCompatActivity {

    public static final String START_HOUR = "com.example.socialpetseventcreation.MESSAGE";
    public static final String START_MINUTE = "com.example.socialpetseventcreation.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

    }

    //called when user presses the next button
    public void StartToEnd (View view) {
        //get time picker
        TimePicker STARTtimePicker = findViewById(R.id.STARTtimePicker);
        int StartHour = STARTtimePicker.getHour();
        int StartMinute = STARTtimePicker.getMinute();

        //get intent from prev activity
        Intent date_intent = getIntent();
        Integer EventDay = date_intent.getIntExtra(DAY,0);
        Integer EventMonth = date_intent.getIntExtra(Date.MONTH,0);
        Integer EventYear = date_intent.getIntExtra(Date.YEAR,0);

        //create intent that will be sent to end, then show activities
        Intent start_intent = new Intent(this, EndTime.class);

        start_intent.putExtra(StartTime.START_HOUR,StartHour);
        start_intent.putExtra(StartTime.START_MINUTE,StartMinute);

        start_intent.putExtra(DAY, EventDay);
        start_intent.putExtra(MONTH, EventMonth);
        start_intent.putExtra(YEAR, EventYear);

        startActivity(start_intent);
    }

}
