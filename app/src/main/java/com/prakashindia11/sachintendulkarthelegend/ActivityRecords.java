package com.prakashindia11.sachintendulkarthelegend;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;

/**
 * Created by Prakash on 19-08-2016.
 * Last Edit : 19-09-2016
 */

public class ActivityRecords extends Activity
{
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.records);

        initializeRecords();
    }

    private void initializeRecords()
    {
        String[] recordsList = {"Record 1","Record 12","Record 3","Record 4","Record 5","Record 6","Record 7","Record 8","Record 9","Record 10"};

        ListAdapter listAdapter = new ArrayAdapter<String>(this, R.layout.list_black_text_dynamic_height,R.id.list_content, recordsList);
        listView = (ListView) findViewById(R.id.ListView_Records);
        listView.setAdapter(listAdapter);
    }
}
