package com.prakashindia11.sachintendulkarthelegend;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.*;
import android.widget.TabHost.*;
import android.widget.*;

import java.util.ArrayList;

/**
 * Created by Prakash on 15-09-2016.
 * Last Edit : 02-11-2016
 */
public class ActivityMoSList extends Activity
{
    Intent intent;
    ListView listView;
    TabHost tabHost;
    TabSpec tabSpec;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        /* Program for Full Screen */
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.moslist);

        initializeTab();
    }

    private void initializeTab()
    {
        tabHost = (TabHost) findViewById(R.id.tabHost);
        tabHost.setup();
        tabHost.getTabWidget().setStripEnabled(true);

        tabSpec = tabHost.newTabSpec("Test");
        tabSpec.setContent(R.id.linearLayout_Test);
        tabSpec.setIndicator("Test");
        tabHost.addTab(tabSpec);
        tabHost.getTabWidget().getChildAt(0).setBackgroundColor(Color.parseColor("#FFFFFF"));
        initializeListTest();

        tabSpec = tabHost.newTabSpec("ODI");
        tabSpec.setContent(R.id.linearLayout_ODI);
        tabSpec.setIndicator("ODI");
        tabHost.addTab(tabSpec);
        tabHost.getTabWidget().getChildAt(1).setBackgroundColor(Color.parseColor("#98CBF6"));
        initializeListODI();
    }


    private void initializeListTest()
    {
        DBMoS dbMoS = new DBMoS(this);
        dbMoS.openDatabase();
        ArrayList<String> series = dbMoS.getSeries("Test");
        dbMoS.closeDatabase();

        ListAdapter listAdapter = new ArrayAdapter<String>(this, R.layout.list_black_text,R.id.list_content, series);
        listView = (ListView) findViewById(R.id.ListView_Test);
        listView.setAdapter(listAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                callMoSTableActivity(parent,position);
            }
        });
    }

    private void initializeListODI()
    {
        DBMoS dbMoS = new DBMoS(this);
        dbMoS.openDatabase();
        ArrayList<String> series = dbMoS.getSeries("ODI");
        dbMoS.closeDatabase();

        ListAdapter listAdapter = new ArrayAdapter<String>(this, R.layout.list_black_text,R.id.list_content, series);
        listView = (ListView) findViewById(R.id.ListView_ODI);
        listView.setAdapter(listAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                callMoSTableActivity(parent,position);
            }
        });
    }

    private void callMoSTableActivity(AdapterView<?> parent, int position)
    {
        String series = String.valueOf(parent.getItemAtPosition(position));
        String format = tabHost.getCurrentTabTag();
        Bundle bundle = new Bundle();
        bundle.putString("series",series);
        bundle.putString("format",format);
        intent = new Intent("com.prakashindia11.sachintendulkarthelegend.ActivityMoSTable");
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
