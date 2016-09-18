package com.prakashindia11.sachintendulkarthelegend;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.widget.TextView;

/**
 * Created by Prakash on 13-09-2016.
 * Last Edit : 18-09-2016
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
        setTextView();
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

    private void setTextView()
    {
        Bundle bundle = getIntent().getExtras();
        String opponent = bundle.getString("opponent");
        String date = bundle.getString("date");

        DBMoMODI dbMoMODI = new DBMoMODI(this);
        dbMoMODI.openDatabase();
        ContainerMoMODIDetails containerMoMODIDetails = dbMoMODI.getMoMODIDetails(opponent,date);
        dbMoMODI.closeDatabase();

        TextViewFormat.setText(containerMoMODIDetails.format);
        TextViewOpponent.setText(containerMoMODIDetails.opponent);
        TextViewSeries.setText(containerMoMODIDetails.series);
        TextViewRuns.setText(containerMoMODIDetails.runs);
        TextViewBalls.setText(containerMoMODIDetails.balls);
        TextView4S.setText(containerMoMODIDetails.fours);
        TextView6S.setText(containerMoMODIDetails.sixes);
        TextViewStrikeRate.setText(containerMoMODIDetails.strikeRate);
        TextViewBowlingWickets.setText(containerMoMODIDetails.bowlingWickets);
        TextViewCatches.setText(containerMoMODIDetails.catches);
        TextViewVenue.setText(containerMoMODIDetails.venue);
        TextViewDate.setText(containerMoMODIDetails.date);
        TextViewResult.setText(containerMoMODIDetails.result);
    }
}
