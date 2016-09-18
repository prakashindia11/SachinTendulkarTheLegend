package com.prakashindia11.sachintendulkarthelegend;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.widget.TextView;

/**
 * Created by Prakash on 13-09-2016.
 * Last Edit : 18-09-2016
 */
public class ActivityMoMTestTable extends Activity
{
    TextView TextViewFormat, TextViewOpponent, TextViewSeries, TextView1stInningsRuns;
    TextView TextView2ndInningsRuns, TextViewBowlingWickets, TextViewCatches, TextViewVenue;
    TextView TextViewDate, TextViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        /* Program for Full Screen */
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.momtesttable);

        initializeTextViews();
        setTextView();
    }

    private void initializeTextViews()
    {
        TextViewFormat = (TextView) findViewById(R.id.TextView_Format_Value);
        TextViewOpponent = (TextView) findViewById(R.id.TextView_Opponent_Value);
        TextViewSeries = (TextView) findViewById(R.id.TextView_Series_Value);
        TextView1stInningsRuns = (TextView) findViewById(R.id.TextView_1ST_Innings_Runs_Value);
        TextView2ndInningsRuns = (TextView) findViewById(R.id.TextView_2ND_Innings_Runs_Value);
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

        DBMoMTest dbMoMTest = new DBMoMTest(this);
        dbMoMTest.openDatabase();
        ContainerMoMTestDetails containerMoMTestDetails = dbMoMTest.getMoMTestDetails(opponent,date);
        dbMoMTest.closeDatabase();

        TextViewFormat.setText(containerMoMTestDetails.format);
        TextViewOpponent.setText(containerMoMTestDetails.opponent);
        TextViewSeries.setText(containerMoMTestDetails.series);
        TextView1stInningsRuns.setText(containerMoMTestDetails.firstInningsRuns);
        TextView2ndInningsRuns.setText(containerMoMTestDetails.secondInningsRuns);
        TextViewBowlingWickets.setText(containerMoMTestDetails.bowlingWickets);
        TextViewCatches.setText(containerMoMTestDetails.catches);
        TextViewVenue.setText(containerMoMTestDetails.venue);
        TextViewDate.setText(containerMoMTestDetails.date);
        TextViewResult.setText(containerMoMTestDetails.result);
    }
}
