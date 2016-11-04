package com.prakashindia11.sachintendulkarthelegend;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Prakash on 13-09-2016.
 * Last Edit : 02-11-2016
 */
public class ActivityMoSTable extends Activity
{
    private GestureDetector gestureDetector;

    String format,series;

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

        gestureDetector = new GestureDetector(new SwipeGestureDetector());
        initializeTextViews();

        Bundle bundle = getIntent().getExtras();
        format = bundle.getString("format");
        series = bundle.getString("series");
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

    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        if(gestureDetector.onTouchEvent(event))
        {
            return true;
        }

        return super.onTouchEvent(event);
    }

    /* Event to perform on Left Swipe (Forward) */
    private void onLeftSwipe()
    {
        String swipe = "leftSwipe";
        DBMoS dbMoS = new DBMoS(this);
        dbMoS.openDatabase();
        ContainerMoSDetails containerMoSDetails = dbMoS.getPreviousOrNextSeries(format,series,swipe);
        dbMoS.closeDatabase();

        series = containerMoSDetails.series;

        setTextViews();
    }

    /* Event to perform on Right Swipe (Backward) */
    private void onRightSwipe()
    {
        String swipe = "rightSwipe";

        DBMoS dbMoS = new DBMoS(this);
        dbMoS.openDatabase();
        ContainerMoSDetails containerMoSDetails = dbMoS.getPreviousOrNextSeries(format,series,swipe);
        dbMoS.closeDatabase();

        series = containerMoSDetails.series;

        setTextViews();
    }

    private class SwipeGestureDetector extends GestureDetector.SimpleOnGestureListener
    {
        private static final int SWIPE_MIN_DISTANCE = 120;
        private static final int SWIPE_MAX_OFF_PATH = 200;
        private static final int SWIPE_THRESHOLD_VELOCITY = 200;

        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY)
        {
            try
            {
                float differenceAbs = Math.abs(e1.getY() - e2.getY());
                float difference = e1.getX() - e2.getX();

                if(differenceAbs > SWIPE_MAX_OFF_PATH)
                {
                    return false;
                }

                /* Left Swipe */
                if(difference > SWIPE_MIN_DISTANCE && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY)
                {
                    ActivityMoSTable.this.onLeftSwipe();
                }
                /* Right Swipe */
                else if(-difference > SWIPE_MIN_DISTANCE && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY)
                {
                    ActivityMoSTable.this.onRightSwipe();
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }

            return false;
        }
    }
}
