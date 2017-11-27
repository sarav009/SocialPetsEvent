package com.example.socialpetseventcreation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.socialpetseventcreation.EndTime.END_HOUR;
import static com.example.socialpetseventcreation.EndTime.END_MINUTE;
import static com.example.socialpetseventcreation.StartTime.START_HOUR;
import static com.example.socialpetseventcreation.StartTime.START_MINUTE;

public class ShowEvent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_event);

        //get intent of prev activity
        Intent show_intent = getIntent();
        //change to int arrays?
        Integer messageEndHour = show_intent.getIntExtra(END_HOUR,0);
        Integer messageEndMinute = show_intent.getIntExtra(END_MINUTE,0);
        Integer messageStartHour = show_intent.getIntExtra(StartTime.START_HOUR,0);
        Integer messageStartMinute = show_intent.getIntExtra(StartTime.START_MINUTE,0);
        Integer messageDay = show_intent.getIntExtra(Date.DAY,0);
        Integer messageMonth = show_intent.getIntExtra(Date.MONTH,0);
        Integer messageYear = show_intent.getIntExtra(Date.YEAR,0);

        // Capture the layout's TextView and set the string as its text
        TextView textView1 = findViewById(R.id.EndTimeText);
        TextView textView2 = findViewById(R.id.StartTimeText);
        TextView textView3 = findViewById(R.id.DateText);
        String EndTime = "End Time: " + messageEndHour.toString() + ":" + messageEndMinute.toString();
        String StartTime = "Start Time: " + messageStartHour.toString() + ":" + messageStartMinute.toString();
        String Date = "Date:" + messageMonth.toString() + "/" + messageDay.toString() + "/" + messageYear.toString();
        textView1.setText(EndTime);
        textView2.setText(StartTime);
        textView3.setText(Date);
    }


}
