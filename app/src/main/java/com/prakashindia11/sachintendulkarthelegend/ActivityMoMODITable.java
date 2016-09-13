package com.prakashindia11.sachintendulkarthelegend;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.widget.TextView;

/**
 * Created by Prakash on 13-09-2016.
 * Last Edit : 13-09-2016
 */
public class ActivityMoMODITable extends Activity
{
    TextView TextViewFormat, TextViewOpponent, TextViewSeries, TextViewRuns;
    TextView TextViewBalls, TextView4S, TextView6S, TextViewStrikeRate, TextViewBowlingWickets;
    TextView TextViewCatches, TextViewVenue, TextViewDate, TextViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        /* Program for Full Screen */
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.momoditable);

        initializeTextViews();
    }

    private void initializeTextViews()
    {
        TextViewFormat = (TextView) findViewById(R.id.TextView_Format_Value);
        TextViewOpponent = (TextView) findViewById(R.id.TextView_Opponent_Value);
        TextViewSeries = (TextView) findViewById(R.id.TextView_Series_Value);
        TextViewRuns = (TextView) findViewById(R.id.TextView_Runs_Value);
        TextViewBalls = (TextView) findViewById(R.id.TextView_Balls_Value);
        TextView4S = (TextView) findViewById(R.id.TextView_4S_Value);
        TextView6S = (TextView) findViewById(R.id.TextView_6S_Value);
        TextViewStrikeRate = (TextView) findViewById(R.id.TextView_Strike_Rate_Value);
        TextViewBowlingWickets = (TextView) findViewById(R.id.TextView_Bowling_Wickets_Value);
        TextViewCatches = (TextView) findViewById(R.id.TextView_Catches_Value);
        TextViewVenue = (TextView) findViewById(R.id.TextView_Venue_Value);
        TextViewDate = (TextView) findViewById(R.id.TextView_Date_Value);
        TextViewResult = (TextView) findViewById(R.id.TextView_Result_Value);

    }
}