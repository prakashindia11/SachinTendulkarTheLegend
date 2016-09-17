package com.prakashindia11.sachintendulkarthelegend;

import android.app.Activity;
import android.content.Intent;
import android.graphics.*;
import android.os.Bundle;
import android.view.*;
import android.widget.TabHost.*;
import android.widget.*;

import java.util.ArrayList;

/**
 * Created by Prakash on 14-09-2016.
 * Last Edit : 17-09-2016
 */
public class ActivityCenturiesList extends Activity
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

        setContentView(R.layout.centurieslist);

        initializeTab();
    }

    private void initializeTab()
    {
        tabHost = (TabHost) findViewById(R.id.tabHost);
        tabHost.setup();
        tabHost.getTabWidget().setStripEnabled(true);

        tabSpec = tabHost.newTabSpec("All");
        tabSpec.setContent(R.id.linearLayout_All);
        tabSpec.setIndicator("All");
        tabHost.addTab(tabSpec);
        tabHost.getTabWidget().getChildAt(0).setBackgroundColor(Color.parseColor("#FF9933"));
        initializeListAll();

        tabSpec = tabHost.newTabSpec("Test");
        tabSpec.setContent(R.id.linearLayout_Test);
        tabSpec.setIndicator("Test");
        tabHost.addTab(tabSpec);
        tabHost.getTabWidget().getChildAt(1).setBackgroundColor(Color.parseColor("#FFFFFF"));
        initializeListTest();

        tabSpec = tabHost.newTabSpec("ODI");
        tabSpec.setContent(R.id.linearLayout_ODI);
        tabSpec.setIndicator("ODI");
        tabHost.addTab(tabSpec);
        tabHost.getTabWidget().getChildAt(2).setBackgroundColor(Color.parseColor("#008000"));
        initializeListODI();
    }

    private void initializeListAll()
    {
        DBCenturies dbCenturies = new DBCenturies(this);
        dbCenturies.openDatabase();
        ArrayList<String> centuryNumber = dbCenturies.getCenturyNumber("all");
        dbCenturies.closeDatabase();

        ListAdapter listAdapter = new ArrayAdapter<String>(this, R.layout.list_black_text,R.id.list_content, centuryNumber);
        listView = (ListView) findViewById(R.id.ListView_All);
        listView.setAdapter(listAdapter);
        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener()
                {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
                    {
                        callCenturiesTableActivity(parent,position);
                    }
                }
        );
    }

    private void initializeListTest()
    {
        DBCenturies dbCenturies = new DBCenturies(this);
        dbCenturies.openDatabase();
        ArrayList<String> centuryNumber = dbCenturies.getCenturyNumber("Test");
        dbCenturies.closeDatabase();

        ListAdapter listAdapter = new ArrayAdapter<String>(this, R.layout.list_black_text,R.id.list_content, centuryNumber);
        listView = (ListView) findViewById(R.id.ListView_Test);
        listView.setAdapter(listAdapter);
        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener()
                {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
                    {
                        callCenturiesTableActivity(parent,position);
                    }
                }
        );
    }

    private void initializeListODI()
    {
        DBCenturies dbCenturies = new DBCenturies(this);
        dbCenturies.openDatabase();
        ArrayList<String> centuryNumber = dbCenturies.getCenturyNumber("ODI");
        dbCenturies.closeDatabase();

        ListAdapter listAdapter = new ArrayAdapter<String>(this, R.layout.list_black_text,R.id.list_content, centuryNumber);
        listView = (ListView) findViewById(R.id.ListView_ODI);
        listView.setAdapter(listAdapter);
        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener()
                {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
                    {
                        callCenturiesTableActivity(parent,position);
                    }
                }
        );
    }

    private void callCenturiesTableActivity(AdapterView<?> parent, int position)
    {
        String centuryNumber = String.valueOf(parent.getItemAtPosition(position)).replaceAll("[^0-9]","");
        Bundle bundle = new Bundle();
        bundle.putString("centuryNumber",centuryNumber);
        intent = new Intent("com.prakashindia11.sachintendulkarthelegend.ActivityCenturiesTable");
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
