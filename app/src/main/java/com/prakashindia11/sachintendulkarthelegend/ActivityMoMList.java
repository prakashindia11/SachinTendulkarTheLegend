package com.prakashindia11.sachintendulkarthelegend;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.*;
import android.view.animation.Animation;
import android.widget.TabHost.*;
import android.widget.*;

import java.util.ArrayList;

/**
 * Created by Prakash on 15-09-2016.
 * Last Edit : 18-09-2016
 */
public class ActivityMoMList extends Activity
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

        setContentView(R.layout.momlist);

        initializeTab();
    }

    @SuppressLint("NewApi")
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
        DBMoMTest dbMoMTest =  new DBMoMTest(this);
        dbMoMTest.openDatabase();
        ArrayList<String> opponentAndDate = dbMoMTest.getOpponentAndDate();
        dbMoMTest.closeDatabase();

        ListAdapter listAdapter = new ArrayAdapter<String>(this, R.layout.list_black_text,R.id.list_content, opponentAndDate);
        listView = (ListView) findViewById(R.id.ListView_Test);
        listView.setAdapter(listAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                String[] opponentAndDate = String.valueOf(parent.getItemAtPosition(position)).split("\\s*,\\s*");
                String opponent = opponentAndDate[0];
                String date = opponentAndDate[1];
                Bundle bundle = new Bundle();
                bundle.putString("opponent",opponent);
                bundle.putString("date",date);

                intent = new Intent("com.prakashindia11.sachintendulkarthelegend.ActivityMoMTestTable");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }

    private void initializeListODI()
    {
        DBMoMODI dbMoMODI =  new DBMoMODI(this);
        dbMoMODI.openDatabase();
        ArrayList<String> opponentAndDate = dbMoMODI.getOpponentAndDate();
        dbMoMODI.closeDatabase();

        ListAdapter listAdapter = new ArrayAdapter<String>(this, R.layout.list_black_text,R.id.list_content, opponentAndDate);
        listView = (ListView) findViewById(R.id.ListView_ODI);
        listView.setAdapter(listAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                String[] opponentAndDate = String.valueOf(parent.getItemAtPosition(position)).split("\\s*,\\s*");
                String opponent = opponentAndDate[0];
                String date = opponentAndDate[1];
                Bundle bundle = new Bundle();
                bundle.putString("opponent",opponent);
                bundle.putString("date",date);

                intent = new Intent("com.prakashindia11.sachintendulkarthelegend.ActivityMoMODITable");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
