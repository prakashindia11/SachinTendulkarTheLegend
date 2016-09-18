package com.prakashindia11.sachintendulkarthelegend;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.widget.TextView;

/**
 * Created by Prakash on 13-09-2016.
 * Last Edit : 17-09-2016
 */
public class ActivityCenturiesTable extends Activity
{
    TextView TextViewCenturyNumber, TextViewFormat, TextViewOpponent, TextViewSeries, TextViewRuns;
    TextView TextViewBalls, TextView4S, TextView6S, TextViewStrikeRate, TextViewVenue, TextViewDate;
    TextView TextViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        /* Program for Full Screen */
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.centuriestable);

        initializeTextViews();
        setTextViews();
    }

    private void initializeTextViews()
    {
        TextViewCenturyNumber = (TextView) findViewById(R.id.TextView_Century_Number_Value);
        TextViewFormat = (TextView) findViewById(R.id.TextView_Format_Value);
        TextViewOpponent = (TextView) findViewById(R.id.TextView_Opponent_Value);
        TextViewSeries = (TextView) findViewById(R.id.TextView_Series_Value);
        TextViewRuns = (TextView) findViewById(R.id.TextView_Runs_Value);
        TextViewBalls = (TextView) findViewById(R.id.TextView_Balls_Value);
        TextView4S = (TextView) findViewById(R.id.TextView_4S_Value);
        TextView6S = (TextView) findViewById(R.id.TextView_6S_Value);
        TextViewStrikeRate = (TextView) findViewById(R.id.TextView_Strike_Rate_Value);
        TextViewVenue = (TextView) findViewById(R.id.TextView_Venue_Value);
        TextViewDate = (TextView) findViewById(R.id.TextView_Date_Value);
        TextViewResult = (TextView) findViewById(R.id.TextView_Result_Value);
    }

    private void setTextViews()
    {
        Bundle bundle = getIntent().getExtras();
        String centuryNumber = bundle.getString("centuryNumber");

        DBCenturies dbCenturies = new DBCenturies(this);
        dbCenturies.openDatabase();
        ContainerCenturyDetails containerCenturyDetails = dbCenturies.getCenturyDetails(centuryNumber);
        dbCenturies.closeDatabase();

        TextViewCenturyNumber.setText(containerCenturyDetails.centuryNumber);
        TextViewFormat.setText(containerCenturyDetails.format);
        TextViewOpponent.setText(containerCenturyDetails.opponent);
        TextViewSeries.setText(containerCenturyDetails.series);
        TextViewRuns.setText(containerCenturyDetails.runs);
        TextViewBalls.setText(containerCenturyDetails.balls);
        TextView4S.setText(containerCenturyDetails.fours);
        TextView6S.setText(containerCenturyDetails.sixes);
        TextViewStrikeRate.setText(containerCenturyDetails.strikeRate);
        TextViewVenue.setText(containerCenturyDetails.venue);
        TextViewDate.setText(containerCenturyDetails.date);
        TextViewResult.setText(containerCenturyDetails.result);
    }
}
