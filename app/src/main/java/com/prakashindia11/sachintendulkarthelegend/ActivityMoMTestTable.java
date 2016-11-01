package com.prakashindia11.sachintendulkarthelegend;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.widget.TextView;

/**
 * Created by Prakash on 13-09-2016.
 * Last Edit : 01-11-2016
 */
public class ActivityMoMTestTable extends Activity
{
    private GestureDetector gestureDetector;

    String date,opponent;

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
        DBMoMTest dbMoMTest = new DBMoMTest(this);
        dbMoMTest.openDatabase();
        ContainerMoMTestDetails containerMoMTestDetails = dbMoMTest.getPreviousOrNextOpponentDate(opponent,date,swipe);
        dbMoMTest.closeDatabase();
        opponent = containerMoMTestDetails.opponent;
        date = containerMoMTestDetails.date;
        setTextView();
    }

    /* Event to perform on Right Swipe (Backward) */
    private void onRightSwipe()
    {
        String swipe = "rightSwipe";
        DBMoMTest dbMoMTest = new DBMoMTest(this);
        dbMoMTest.openDatabase();
        ContainerMoMTestDetails containerMoMTestDetails = dbMoMTest.getPreviousOrNextOpponentDate(opponent,date,swipe);
        dbMoMTest.closeDatabase();
        opponent = containerMoMTestDetails.opponent;
        date = containerMoMTestDetails.date;
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
                    ActivityMoMTestTable.this.onLeftSwipe();
                }
                /* Right Swipe */
                else if(-difference > SWIPE_MIN_DISTANCE && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY)
                {
                    ActivityMoMTestTable.this.onRightSwipe();
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
