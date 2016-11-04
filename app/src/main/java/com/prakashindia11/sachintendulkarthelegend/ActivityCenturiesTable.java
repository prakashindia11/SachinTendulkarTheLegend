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
public class ActivityCenturiesTable extends Activity
{
    private GestureDetector gestureDetector;

    String centuryNumber,format;

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
        gestureDetector = new GestureDetector(new SwipeGestureDetector());

        initializeTextViews();

        Bundle bundle = getIntent().getExtras();
        centuryNumber = bundle.getString("centuryNumber");
        format = bundle.getString("format");
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
        DBCenturies dbCenturies = new DBCenturies(this);
        dbCenturies.openDatabase();
        ContainerCenturyDetails containerCenturyDetails = dbCenturies.getPreviousOrNextCentury(format,centuryNumber,swipe);
        dbCenturies.closeDatabase();

        centuryNumber = containerCenturyDetails.centuryNumber;

        setTextViews();
    }

    /* Event to perform on Right Swipe (Backward) */
    private void onRightSwipe()
    {
        String swipe = "rightSwipe";
        DBCenturies dbCenturies = new DBCenturies(this);
        dbCenturies.openDatabase();
        ContainerCenturyDetails containerCenturyDetails = dbCenturies.getPreviousOrNextCentury(format,centuryNumber,swipe);
        dbCenturies.closeDatabase();

        centuryNumber = containerCenturyDetails.centuryNumber;

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
                    ActivityCenturiesTable.this.onLeftSwipe();
                }
                /* Right Swipe */
                else if(-difference > SWIPE_MIN_DISTANCE && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY)
                {
                    ActivityCenturiesTable.this.onRightSwipe();
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
