package com.prakashindia11.sachintendulkarthelegend;

/**
 * Created by Prakash on 17-08-2016.
 * Last Edit : 02-10-2016
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.app.*;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class ActivityHome extends Activity implements View.OnClickListener
{

    Button ButtonBiography, ButtonCenturies, ButtonMOM, ButtonMOS, ButtonRecords,ButtonAwards;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        /* Program for Full Screen */
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.home);

        initializeDataBases();
        initializeButtons();
    }

    private void initializeDataBases()
    {
        /* Centuries Database */
        DBCenturies dbcenturies = new DBCenturies(this);
        dbcenturies.openDatabase();
        dbcenturies.closeDatabase();

        /* Man of the Series Database */
        DBMoS dbmos = new DBMoS(this);
        dbmos.openDatabase();
        dbmos.closeDatabase();

        /* Man of the Match ODI Database */
        DBMoMODI dbmomodi = new DBMoMODI(this);
        dbmomodi.openDatabase();
        dbmomodi.closeDatabase();

        /* Man of the Match Test Database */
        DBMoMTest dbmomtest = new DBMoMTest(this);
        dbmomtest.openDatabase();
        dbmomtest.closeDatabase();
    }

    private void initializeButtons()
    {
        ButtonBiography = (Button) findViewById(R.id.Button_Biography);
        ButtonCenturies = (Button) findViewById(R.id.Button_Centuries);
        ButtonMOM = (Button) findViewById(R.id.Button_MOM);
        ButtonMOS = (Button) findViewById(R.id.Button_MOS);
        ButtonRecords = (Button) findViewById(R.id.Button_Records);
        ButtonAwards = (Button) findViewById(R.id.Button_Awards);

        ButtonBiography.setOnClickListener(this);
        ButtonCenturies.setOnClickListener(this);
        ButtonMOM.setOnClickListener(this);
        ButtonMOS.setOnClickListener(this);
        ButtonRecords.setOnClickListener(this);
        ButtonAwards.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        if(v.getId() == R.id.Button_Biography)
        {

        }

        if(v.getId() == R.id.Button_Centuries)
        {
            intent = new Intent("com.prakashindia11.sachintendulkarthelegend.ActivityCenturiesList");
            startActivity(intent);
        }

        if(v.getId() == R.id.Button_MOM)
        {
            intent = new Intent("com.prakashindia11.sachintendulkarthelegend.ActivityMoMList");
            startActivity(intent);
        }

        if(v.getId() == R.id.Button_MOS)
        {
            intent = new Intent("com.prakashindia11.sachintendulkarthelegend.ActivityMoSList");
            startActivity(intent);
        }

        if(v.getId() == R.id.Button_Records)
        {
            intent = new Intent("com.prakashindia11.sachintendulkarthelegend.ActivityRecords");
            startActivity(intent);
        }

        if(v.getId() == R.id.Button_Awards)
        {
            intent = new Intent("com.prakashindia11.sachintendulkarthelegend.ActivityAwards");
            startActivity(intent);
        }
    }
}
