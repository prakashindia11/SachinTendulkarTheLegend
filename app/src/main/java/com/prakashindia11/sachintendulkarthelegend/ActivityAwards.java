package com.prakashindia11.sachintendulkarthelegend;

/**
 * Created by Prakash on 02-10-2016.
 * Last Edit : 02-10-2016
 */

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;


public class ActivityAwards extends Activity
{

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        /* Program for Full Screen */
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.awards);

        initializeAwards();
    }

    private void initializeAwards()
    {
        String[] awardsList = {"" +
                "1994 : Arjuna Award Recipient for achievements in cricket" ,
                "1997 : One of the five cricketers selected as Wisden Cricketer of the Year",
                "1997 : Wisden Leading Cricketer in the World",
                "1997/98 : Rajiv Gandhi Khel Ratna - India's highest sporting honour",
                "1999 : Padma Shri, India's fourth-highest civilian award",
                "2001 : Maharashtra Bhushan Award, Maharashtra State's highest Civilian Award",
                "2003 : The \"Greatest Sportsman\" of the country in the Best of India poll by Zee News",
                "2004 : ICC World ODI XI",
                "2006 : One of the Asian Heroes by Time magazine",
                "2006 : Sportsperson of the Year",
                "2007 : ICC World ODI XI",
                "2008 : Padma Vibhushan, India's second-highest civilian award",
                "2009 : Time magazine included Sachin's Test Debut in \"Top 10 Sporting Moments\"",
                "2009 : ICC World Test XI",
                "2010 : LG People's Choice Award",
                "2010 : ICC Cricketer of the Year - Highest award in the ICC listings",
                "2010 : Sports Icon of the Year for 21 years at the NDTV Indian of the Year Awards",
                "2010 : One of the world's 100 most influential people in \"The 2010 TIME 100\" poll by Time magazine",
                "2010 : Wisden Leading Cricketer in the World",
                "2010 : ICC World ODI XI",
                "2010 : ICC World Test XI",
                "2011 : ICC World Test XI",
                "2012 : Wisden India Outstanding Achievement award",
                "2012 : Wisden Leading Cricketer in the World",
                "2012 : Honorary Member of the Order of Australia, given by the Australian government",
                "2013 : Indian Postal Service released a stamp of Tendulkar",
                "2014 : Bharat Ratna, India's highest civilian award"};

        ListAdapter listAdapter = new ArrayAdapter<String>(this, R.layout.list_black_text_dynamic_height_golden_background,R.id.list_content, awardsList);
        listView = (ListView) findViewById(R.id.ListView_Awards);
        listView.setAdapter(listAdapter);
    }
}
