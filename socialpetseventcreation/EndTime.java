package com.example.socialpetseventcreation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TimePicker;

import static com.example.socialpetseventcreation.StartTime.START_HOUR;
import static com.example.socialpetseventcreation.StartTime.START_MINUTE;

public class EndTime extends AppCompatActivity {
    public static final String END_HOUR = "com.example.socialpetseventcreation.MESSAGE";
    public static final String END_MINUTE = "com.example.socialpetseventcreation.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_time);
    }
    //called when user presses the next button
    public void EndToShow (View view) {

        //get time picker vals
        TimePicker ENDtimePicker = findViewById(R.id.ENDTimePicker);
        int EndHour = ENDtimePicker.getHour();
        int EndMinute = ENDtimePicker.getMinute();

        //get intent from prev activity
        Intent start_intent = getIntent();
        Integer StartHour = start_intent.getIntExtra(StartTime.START_HOUR,0);
        Integer StartMinute = start_intent.getIntExtra(StartTime.START_MINUTE,0);
        Integer EventDay = start_intent.getIntExtra(Date.DAY,0);
        Integer EventMonth = start_intent.getIntExtra(Date.MONTH,0);
        Integer EventYear = start_intent.getIntExtra(Date.YEAR,0);


        //create intent to send to show activity
        Intent end_intent = new Intent(this, ShowEvent.class);

        end_intent.putExtra(END_HOUR,EndHour);
        end_intent.putExtra(END_MINUTE,EndMinute);

        end_intent.putExtra(StartTime.START_HOUR,StartHour);
        end_intent.putExtra(StartTime.START_MINUTE,StartMinute);

        end_intent.putExtra(Date.DAY,EventDay);
        end_intent.putExtra(Date.MONTH,EventMonth);
        end_intent.putExtra(Date.YEAR,EventYear);

        startActivity(end_intent); } //goes to ShowEvent Activity
}
