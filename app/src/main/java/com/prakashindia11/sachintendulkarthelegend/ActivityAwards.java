package com.prakashindia11.sachintendulkarthelegend;

/**
 * Created by Prakash on 02-10-2016.
 * Last Edit : 02-10-2016
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class ActivityAwards extends AppCompatActivity
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
    }

    private void initializeAwards()
    {
        String[] awardsList = {};

        ListAdapter listAdapter = new ArrayAdapter<String>(this, R.layout.list_black_text_dynamic_height_golden_background,R.id.list_content, awardsList);
        listView = (ListView) findViewById(R.id.ListView_Awards);
        listView.setAdapter(listAdapter);
    }
}
