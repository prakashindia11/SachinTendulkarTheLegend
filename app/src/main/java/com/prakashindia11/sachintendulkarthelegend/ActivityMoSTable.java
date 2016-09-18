package com.prakashindia11.sachintendulkarthelegend;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.widget.TextView;

/**
 * Created by Prakash on 13-09-2016.
 * Last Edit : 18-09-2016
 */
public class ActivityMoSTable extends Activity
{
    TextView TextViewFormat, TextViewOpponent, TextViewSeries, TextViewMatches, TextViewInnings;
    TextView TextViewNotOut, TextViewRuns, TextViewHighScore, TextViewAverage, TextViewStrikeRate;
    TextView TextView100S, TextView50S, TextViewBowlingWickets, TextViewCatches;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        /* Program for Full Screen */
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.mostable);

        initializeTextViews();
        setTextViews();
    }

    private void initializeTextViews()
    {
        TextViewFormat = (TextView) findViewById(R.id.TextView_Format_Value);
        TextViewSeries = (TextView) findViewById(R.id.TextView_Series_Value);
        TextViewOpponent = (TextView) findViewById(R.id.TextView_Opponent_Value);
        TextViewMatches = (TextView) findViewById(R.id.TextView_Matches_Value);
        TextViewInnings = (TextView) findViewById(R.id.TextView_Innings_Value);
        TextViewNotOut = (TextView) findViewById(R.id.TextView_Not_Out_Value);
        TextViewRuns = (TextView) findViewById(R.id.TextView_Runs_Value);
        TextViewHighScore = (TextView) findViewById(R.id.TextView_High_Score_Value);
        TextViewAverage = (TextView) findViewById(R.id.TextView_Average_Value);
        TextViewStrikeRate = (TextView) findViewById(R.id.TextView_Strike_Rate_Value);
        TextView100S = (TextView) findViewById(R.id.TextView_100S_Value);
        TextView50S = (TextView) findViewById(R.id.TextView_50S_Value);
        TextViewBowlingWickets = (TextView) findViewById(R.id.TextView_Bowling_Wickets_Value);
        TextViewCatches = (TextView) findViewById(R.id.TextView_Catches_Value);
    }

    private void setTextViews()
    {
        Bundle bundle = getIntent().getExtras();
        String series = bundle.getString("series");

        DBMoS dbMoS = new DBMoS(this);
        dbMoS.openDatabase();
        ContainerMoSDetails containerMoSDetails = dbMoS.getMoSDetails(series);
        dbMoS.closeDatabase();

        TextViewFormat.setText(containerMoSDetails.format);
        TextViewSeries.setText(containerMoSDetails.series);
        TextViewOpponent.setText(containerMoSDetails.opponent);
        TextViewMatches.setText(containerMoSDetails.matches);
        TextViewInnings.setText(containerMoSDetails.innings);
        TextViewNotOut.setText(containerMoSDetails.notOut);
        TextViewRuns.setText(containerMoSDetails.runs);
        TextViewHighScore.setText(containerMoSDetails.highScore);
        TextViewAverage.setText(containerMoSDetails.average);
        TextViewStrikeRate.setText(containerMoSDetails.strikeRate);
        TextView100S.setText(containerMoSDetails.hundreds);
        TextView50S.setText(containerMoSDetails.fifties);
        TextViewBowlingWickets.setText(containerMoSDetails.bowlingWickets);
        TextViewCatches.setText(containerMoSDetails.catches);
    }
}
