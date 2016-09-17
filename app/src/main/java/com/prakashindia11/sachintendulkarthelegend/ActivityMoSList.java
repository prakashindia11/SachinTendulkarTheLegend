package com.prakashindia11.sachintendulkarthelegend;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.*;
import android.widget.TabHost.*;
import android.widget.*;
/**
 * Created by Prakash on 15-09-2016.
 * Last Edit : 15-09-2016
 */
public class ActivityMoSList extends Activity implements View.OnClickListener
{
    TabHost tabHost;
    TabSpec tabSpec;

    ListView listView;

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
        String[] listTest = {"Century 10","Century 20","Century 30","Century 40","Century 50","Century 60","Century 70",
                "Century 80","Century 90","Century 100"};

        ListAdapter listAdapter = new ArrayAdapter<String>(this, R.layout.list_black_text,R.id.list_content, listTest);
        listView = (ListView) findViewById(R.id.ListView_Test);
        listView.setAdapter(listAdapter);
    }

    private void initializeListODI()
    {
        String[] listODI = {"Century 11","Century 21","Century 31","Century 41","Century 51","Century 61","Century 71",
                "Century 81","Century 91","Century 100"};

        ListAdapter listAdapter = new ArrayAdapter<String>(this, R.layout.list_black_text,R.id.list_content, listODI);
        listView = (ListView) findViewById(R.id.ListView_ODI);
        listView.setAdapter(listAdapter);
    }

    @Override
    public void onClick(View v)
    {

    }
}
