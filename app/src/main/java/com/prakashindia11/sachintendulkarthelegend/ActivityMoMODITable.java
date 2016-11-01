package com.prakashindia11.sachintendulkarthelegend;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Prakash on 13-09-2016.
 * Last Edit : 01-11-2016
 */
public class ActivityMoMODITable extends Activity
{
    private GestureDetector gestureDetector;

    String date,opponent;

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

        gestureDetector = new GestureDetector(new SwipeGestureDetector());
        initializeTextViews();

        Bundle bundle = getIntent().getExtras();
        opponent = bundle.getString("opponent");
        date = bundle.getString("date");

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
        DBMoMODI dbMoMODI = new DBMoMODI(this);
        dbMoMODI.openDatabase();
        ContainerMoMODIDetails containerMoMODIDetails = dbMoMODI.getPreviousOrNextOpponentDate(opponent,date,swipe);
        dbMoMODI.closeDatabase();
        opponent = containerMoMODIDetails.opponent;
        date = containerMoMODIDetails.date;
        setTextView();
    }

    /* Event to perform on Right Swipe (Backward) */
    private void onRightSwipe()
    {
        String swipe = "rightSwipe";
        DBMoMODI dbMoMODI = new DBMoMODI(this);
        dbMoMODI.openDatabase();
        ContainerMoMODIDetails containerMoMODIDetails = dbMoMODI.getPreviousOrNextOpponentDate(opponent,date,swipe);
        dbMoMODI.closeDatabase();
        opponent = containerMoMODIDetails.opponent;
        date = containerMoMODIDetails.date;
        setTextView();
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
                    ActivityMoMODITable.this.onLeftSwipe();
                }
                /* Right Swipe */
                else if(-difference > SWIPE_MIN_DISTANCE && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY)
                {
                    ActivityMoMODITable.this.onRightSwipe();
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
