package com.prakashindia11.sachintendulkarthelegend;

/**
 * Created by Prakash on 18-08-2016.
 * Last Edit : 02-11-2016
 */

import android.content.*;
import android.database.*;
import android.database.sqlite.*;

import java.util.ArrayList;

public class DBMoS
{
    private static  final String KEY_MOS_NO = "column_mos_no";
    private static  final String KEY_FORMAT = "column_format";
    private static  final String KEY_SERIES = "column_series";
    private static  final String KEY_OPPONENTS = "column_opponents";
    private static  final String KEY_MATCHES = "column_matches";
    private static  final String KEY_INNINGS = "column_innings";
    private static  final String KEY_NOT_OUT = "column_not_out";
    private static  final String KEY_RUNS = "column_runs";
    private static  final String KEY_HIGH_SCORE = "column_high_score";
    private static  final String KEY_AVERAGE = "column_average";
    private static  final String KEY_STRIKE_RATE = "column_strike_rate";
    private static  final String KEY_50S = "column_50s";
    private static  final String KEY_100S = "column_100s";
    private static  final String KEY_BOWLING_WICKETS = "column_bowling_wickets";
    private static  final String KEY_CATCHES = "column_catches";

    private static final String DATABASE_NAME = "SachinTendulkarMoSDB";
    private static final String DATABASE_TABLE = "MoSDBTable";
    private static final int DATABASE_VERSION  = 1;

    private DBHelper mydbhelper;
    private final Context mycontext;
    private SQLiteDatabase mysqlitedb;

    public DBMoS(Context context)
    {
        mycontext = context;
    }

    private class DBHelper extends SQLiteOpenHelper
    {
        public DBHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db)
        {
            String queryStatement = "create table " + DATABASE_TABLE + " (" + KEY_MOS_NO + " integer not null primary key autoincrement, "
                    + KEY_FORMAT + " text not null, "
                    + KEY_SERIES + " text not null, "
                    + KEY_OPPONENTS + " text not null, "
                    + KEY_MATCHES + " integer not null,"
                    + KEY_INNINGS + " integer not null, "
                    + KEY_NOT_OUT + " integer not null, "
                    + KEY_RUNS + " integer not null, "
                    + KEY_HIGH_SCORE + " integer not null, "
                    + KEY_AVERAGE + " float not null, "
                    + KEY_STRIKE_RATE + " float not null, "
                    + KEY_100S + " integer not null, "
                    + KEY_50S + " integer not null, "
                    + KEY_BOWLING_WICKETS + " text not null, "
                    + KEY_CATCHES + " integer not null);"
                    ;

            db.execSQL(queryStatement);

            ContentValues cv = new ContentValues();

            /* Man of the Series - ODIs */

            /* Man of the Series Number : 1 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_SERIES,"Singer World Series 1994");
            cv.put(KEY_OPPONENTS,"Australia, Sri Lanka");
            cv.put(KEY_MATCHES,4);
            cv.put(KEY_INNINGS,3);
            cv.put(KEY_NOT_OUT,1);
            cv.put(KEY_RUNS,127);
            cv.put(KEY_HIGH_SCORE,110);
            cv.put(KEY_AVERAGE,42.33);
            cv.put(KEY_STRIKE_RATE,83.00);
            cv.put(KEY_100S,1);
            cv.put(KEY_50S,0);
            cv.put(KEY_BOWLING_WICKETS,"0");
            cv.put(KEY_CATCHES,0);

            db.insert(DATABASE_TABLE,null,cv);

             /* Man of the Series Number : 2 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_SERIES,"West Indies in India ODI Tour 1994/95");
            cv.put(KEY_OPPONENTS,"West Indies");
            cv.put(KEY_MATCHES,5);
            cv.put(KEY_INNINGS,5);
            cv.put(KEY_NOT_OUT,0);
            cv.put(KEY_RUNS,247);
            cv.put(KEY_HIGH_SCORE,105);
            cv.put(KEY_AVERAGE,49.40);
            cv.put(KEY_STRIKE_RATE,77.67);
            cv.put(KEY_100S,1);
            cv.put(KEY_50S,2);
            cv.put(KEY_BOWLING_WICKETS,"1");
            cv.put(KEY_CATCHES,1);

            db.insert(DATABASE_TABLE,null,cv);

             /* Man of the Series Number : 3 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_SERIES,"Wills World Series 1994/95");
            cv.put(KEY_OPPONENTS,"West Indies, New Zealand");
            cv.put(KEY_MATCHES,5);
            cv.put(KEY_INNINGS,5);
            cv.put(KEY_NOT_OUT,0);
            cv.put(KEY_RUNS,285);
            cv.put(KEY_HIGH_SCORE,115);
            cv.put(KEY_AVERAGE,57.00);
            cv.put(KEY_STRIKE_RATE,86.62);
            cv.put(KEY_100S,1);
            cv.put(KEY_50S,2);
            cv.put(KEY_BOWLING_WICKETS,"8");
            cv.put(KEY_CATCHES,3);

            db.insert(DATABASE_TABLE,null,cv);

             /* Man of the Series Number : 4 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_SERIES,"Silver Jubliee Independence Cup 1997/98");
            cv.put(KEY_OPPONENTS,"Bangladesh, Pakistan");
            cv.put(KEY_MATCHES,5);
            cv.put(KEY_INNINGS,5);
            cv.put(KEY_NOT_OUT,0);
            cv.put(KEY_RUNS,258);
            cv.put(KEY_HIGH_SCORE,95);
            cv.put(KEY_AVERAGE,51.60);
            cv.put(KEY_STRIKE_RATE,112.17);
            cv.put(KEY_100S,0);
            cv.put(KEY_50S,3);
            cv.put(KEY_BOWLING_WICKETS,"5");
            cv.put(KEY_CATCHES,6);

            db.insert(DATABASE_TABLE,null,cv);

             /* Man of the Series Number : 5 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_SERIES,"Coca-Cola Sharjah Cup 1997/98");
            cv.put(KEY_OPPONENTS,"Australia, New Zealand");
            cv.put(KEY_MATCHES,5);
            cv.put(KEY_INNINGS,5);
            cv.put(KEY_NOT_OUT,0);
            cv.put(KEY_RUNS,435);
            cv.put(KEY_HIGH_SCORE,143);
            cv.put(KEY_AVERAGE,87.00);
            cv.put(KEY_STRIKE_RATE,100.46);
            cv.put(KEY_100S,2);
            cv.put(KEY_50S,1);
            cv.put(KEY_BOWLING_WICKETS,"2");
            cv.put(KEY_CATCHES,0);

            db.insert(DATABASE_TABLE,null,cv);

             /* Man of the Series Number : 6 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_SERIES,"India in Zimbabwe ODI Tour 1998/99");
            cv.put(KEY_OPPONENTS,"Zimbabwe");
            cv.put(KEY_MATCHES,3);
            cv.put(KEY_INNINGS,3);
            cv.put(KEY_NOT_OUT,1);
            cv.put(KEY_RUNS,158);
            cv.put(KEY_HIGH_SCORE,127);
            cv.put(KEY_AVERAGE,79);
            cv.put(KEY_STRIKE_RATE,100.63);
            cv.put(KEY_100S,1);
            cv.put(KEY_50S,0);
            cv.put(KEY_BOWLING_WICKETS,"0");
            cv.put(KEY_CATCHES,1);

            db.insert(DATABASE_TABLE,null,cv);

             /* Man of the Series Number : 7 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_SERIES,"Coca-Cola Championship Trophy 1998/99");
            cv.put(KEY_OPPONENTS,"Zimbabwe, Sri Lanka");
            cv.put(KEY_MATCHES,5);
            cv.put(KEY_INNINGS,5);
            cv.put(KEY_NOT_OUT,2);
            cv.put(KEY_RUNS,274);
            cv.put(KEY_HIGH_SCORE,124);
            cv.put(KEY_AVERAGE,91.33);
            cv.put(KEY_STRIKE_RATE,109.60);
            cv.put(KEY_100S,2);
            cv.put(KEY_50S,0);
            cv.put(KEY_BOWLING_WICKETS,"2");
            cv.put(KEY_CATCHES,1);

            db.insert(DATABASE_TABLE,null,cv);

             /* Man of the Series Number : 8 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_SERIES,"South Africa in India ODI Tour 1999/00");
            cv.put(KEY_OPPONENTS,"South Africa");
            cv.put(KEY_MATCHES,5);
            cv.put(KEY_INNINGS,5);
            cv.put(KEY_NOT_OUT,0);
            cv.put(KEY_RUNS,274);
            cv.put(KEY_HIGH_SCORE,122);
            cv.put(KEY_AVERAGE,54.80);
            cv.put(KEY_STRIKE_RATE,88.10);
            cv.put(KEY_100S,1);
            cv.put(KEY_50S,1);
            cv.put(KEY_BOWLING_WICKETS,"6");
            cv.put(KEY_CATCHES,1);

            db.insert(DATABASE_TABLE,null,cv);

             /* Man of the Series Number : 9 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_SERIES,"Coca-Cola Cup 2001");
            cv.put(KEY_OPPONENTS,"West Indies, Zimbabwe");
            cv.put(KEY_MATCHES,5);
            cv.put(KEY_INNINGS,5);
            cv.put(KEY_NOT_OUT,3);
            cv.put(KEY_RUNS,282);
            cv.put(KEY_HIGH_SCORE,122);
            cv.put(KEY_AVERAGE,141.00);
            cv.put(KEY_STRIKE_RATE,82.45);
            cv.put(KEY_100S,1);
            cv.put(KEY_50S,2);
            cv.put(KEY_BOWLING_WICKETS,"0");
            cv.put(KEY_CATCHES,0);

            db.insert(DATABASE_TABLE,null,cv);

             /* Man of the Series Number : 10 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_SERIES,"England in India ODI Tour 2001/02");
            cv.put(KEY_OPPONENTS,"England");
            cv.put(KEY_MATCHES,6);
            cv.put(KEY_INNINGS,6);
            cv.put(KEY_NOT_OUT,1);
            cv.put(KEY_RUNS,266);
            cv.put(KEY_HIGH_SCORE,87);
            cv.put(KEY_AVERAGE,53.20);
            cv.put(KEY_STRIKE_RATE,93.99);
            cv.put(KEY_100S,0);
            cv.put(KEY_50S,2);
            cv.put(KEY_BOWLING_WICKETS,"2");
            cv.put(KEY_CATCHES,3);

            db.insert(DATABASE_TABLE,null,cv);

             /* Man of the Series Number : 11 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_SERIES,"ICC World Cup 2002/03");
            cv.put(KEY_OPPONENTS,"Holland, Australia, Zimbabwe, Namibia, England, Pakistan, New Zealand, Kenya, Sri Lanka");
            cv.put(KEY_MATCHES,11);
            cv.put(KEY_INNINGS,11);
            cv.put(KEY_NOT_OUT,0);
            cv.put(KEY_RUNS,673);
            cv.put(KEY_HIGH_SCORE,152);
            cv.put(KEY_AVERAGE,61.18);
            cv.put(KEY_STRIKE_RATE,89.25);
            cv.put(KEY_100S,1);
            cv.put(KEY_50S,6);
            cv.put(KEY_BOWLING_WICKETS,"2");
            cv.put(KEY_CATCHES,4);

            db.insert(DATABASE_TABLE,null,cv);

             /* Man of the Series Number : 12 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_SERIES,"TVS Cup 2003/04");
            cv.put(KEY_OPPONENTS,"Australia, New Zealand");
            cv.put(KEY_MATCHES,7);
            cv.put(KEY_INNINGS,7);
            cv.put(KEY_NOT_OUT,1);
            cv.put(KEY_RUNS,466);
            cv.put(KEY_HIGH_SCORE,102);
            cv.put(KEY_AVERAGE,77.66);
            cv.put(KEY_STRIKE_RATE,89.10);
            cv.put(KEY_100S,2);
            cv.put(KEY_50S,2);
            cv.put(KEY_BOWLING_WICKETS,"1");
            cv.put(KEY_CATCHES,0);

            db.insert(DATABASE_TABLE,null,cv);

             /* Man of the Series Number : 13 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_SERIES,"West Indies in India ODI Tour 2006/07");
            cv.put(KEY_OPPONENTS,"West Indies");
            cv.put(KEY_MATCHES,4);
            cv.put(KEY_INNINGS,4);
            cv.put(KEY_NOT_OUT,1);
            cv.put(KEY_RUNS,191);
            cv.put(KEY_HIGH_SCORE,100);
            cv.put(KEY_AVERAGE,63.66);
            cv.put(KEY_STRIKE_RATE,102.68);
            cv.put(KEY_100S,1);
            cv.put(KEY_50S,1);
            cv.put(KEY_BOWLING_WICKETS,"3");
            cv.put(KEY_CATCHES,0);

            db.insert(DATABASE_TABLE,null,cv);

             /* Man of the Series Number : 14 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_SERIES,"Future Cup In Ireland 2007");
            cv.put(KEY_OPPONENTS,"South Africa");
            cv.put(KEY_MATCHES,3);
            cv.put(KEY_INNINGS,3);
            cv.put(KEY_NOT_OUT,0);
            cv.put(KEY_RUNS,200);
            cv.put(KEY_HIGH_SCORE,99);
            cv.put(KEY_AVERAGE,66.66);
            cv.put(KEY_STRIKE_RATE,77.82);
            cv.put(KEY_100S,0);
            cv.put(KEY_50S,2);
            cv.put(KEY_BOWLING_WICKETS,"2");
            cv.put(KEY_CATCHES,1);

            db.insert(DATABASE_TABLE,null,cv);

             /* Man of the Series Number : 15 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_SERIES,"Compaq Cup Tri-Series 2009");
            cv.put(KEY_OPPONENTS,"New Zealand, Sri Lanka");
            cv.put(KEY_MATCHES,3);
            cv.put(KEY_INNINGS,3);
            cv.put(KEY_NOT_OUT,0);
            cv.put(KEY_RUNS,211);
            cv.put(KEY_HIGH_SCORE,138);
            cv.put(KEY_AVERAGE,70.33);
            cv.put(KEY_STRIKE_RATE,95.47);
            cv.put(KEY_100S,1);
            cv.put(KEY_50S,0);
            cv.put(KEY_BOWLING_WICKETS,"Did Not Bowl");
            cv.put(KEY_CATCHES,0);

            db.insert(DATABASE_TABLE,null,cv);

             /* Man of the Series Number : 16 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_SERIES,"South Africa in India ODI Tour 2009/10");
            cv.put(KEY_OPPONENTS,"South Africa");
            cv.put(KEY_MATCHES,2);
            cv.put(KEY_INNINGS,2);
            cv.put(KEY_NOT_OUT,1);
            cv.put(KEY_RUNS,204);
            cv.put(KEY_HIGH_SCORE,200);
            cv.put(KEY_AVERAGE,204.00);
            cv.put(KEY_STRIKE_RATE,134.21);
            cv.put(KEY_100S,1);
            cv.put(KEY_50S,0);
            cv.put(KEY_BOWLING_WICKETS,"Did Not Bowl");
            cv.put(KEY_CATCHES,0);

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Series - Tests */

            /* Man of the Series Number : 1 */
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_SERIES,"Australia in India Test Series 1997/98");
            cv.put(KEY_OPPONENTS,"Australia");
            cv.put(KEY_MATCHES,3);
            cv.put(KEY_INNINGS,5);
            cv.put(KEY_NOT_OUT,1);
            cv.put(KEY_RUNS,446);
            cv.put(KEY_HIGH_SCORE,177);
            cv.put(KEY_AVERAGE,111.50);
            cv.put(KEY_STRIKE_RATE,0);
            cv.put(KEY_100S,2);
            cv.put(KEY_50S,1);
            cv.put(KEY_BOWLING_WICKETS,"1");
            cv.put(KEY_CATCHES,2);

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Series Number : 2 */
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_SERIES,"India in Australia Test Series 1999/00");
            cv.put(KEY_OPPONENTS,"Australia");
            cv.put(KEY_MATCHES,3);
            cv.put(KEY_INNINGS,6);
            cv.put(KEY_NOT_OUT,0);
            cv.put(KEY_RUNS,278);
            cv.put(KEY_HIGH_SCORE,116);
            cv.put(KEY_AVERAGE,46.33);
            cv.put(KEY_STRIKE_RATE,0);
            cv.put(KEY_100S,1);
            cv.put(KEY_50S,2);
            cv.put(KEY_BOWLING_WICKETS,"1");
            cv.put(KEY_CATCHES,0);

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Series Number : 3 */
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_SERIES,"England in India Test Series 2001/02");
            cv.put(KEY_OPPONENTS,"England");
            cv.put(KEY_MATCHES,3);
            cv.put(KEY_INNINGS,4);
            cv.put(KEY_NOT_OUT,0);
            cv.put(KEY_RUNS,307);
            cv.put(KEY_HIGH_SCORE,103);
            cv.put(KEY_AVERAGE,76.75);
            cv.put(KEY_STRIKE_RATE,0);
            cv.put(KEY_100S,1);
            cv.put(KEY_50S,2);
            cv.put(KEY_BOWLING_WICKETS,"1");
            cv.put(KEY_CATCHES,4);

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Series Number : 4 */
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_SERIES,"India in Bangladesh Test Series 2007");
            cv.put(KEY_OPPONENTS,"Bangladesh");
            cv.put(KEY_MATCHES,2);
            cv.put(KEY_INNINGS,3);
            cv.put(KEY_NOT_OUT,1);
            cv.put(KEY_RUNS,254);
            cv.put(KEY_HIGH_SCORE,122);
            cv.put(KEY_AVERAGE,127.00);
            cv.put(KEY_STRIKE_RATE,0);
            cv.put(KEY_100S,2);
            cv.put(KEY_50S,0);
            cv.put(KEY_BOWLING_WICKETS,"3");
            cv.put(KEY_CATCHES,4);

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Series Number : 5 */
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_SERIES,"Australia in India Test Series 2010/11");
            cv.put(KEY_OPPONENTS,"Australia");
            cv.put(KEY_MATCHES,1);
            cv.put(KEY_INNINGS,4);
            cv.put(KEY_NOT_OUT,1);
            cv.put(KEY_RUNS,403);
            cv.put(KEY_HIGH_SCORE,214);
            cv.put(KEY_AVERAGE,134.33);
            cv.put(KEY_STRIKE_RATE,0);
            cv.put(KEY_100S,1);
            cv.put(KEY_50S,2);
            cv.put(KEY_BOWLING_WICKETS,"Did Not Bowl");
            cv.put(KEY_CATCHES,0);

            db.insert(DATABASE_TABLE,null,cv);

            /* Template
            cv.put(KEY_FORMAT,"");
            cv.put(KEY_SERIES,"");
            cv.put(KEY_OPPONENTS,"");
            cv.put(KEY_MATCHES,);
            cv.put(KEY_INNINGS,);
            cv.put(KEY_NOT_OUT,);
            cv.put(KEY_RUNS,);
            cv.put(KEY_HIGH_SCORE,);
            cv.put(KEY_AVERAGE,);
            cv.put(KEY_STRIKE_RATE,);
            cv.put(KEY_50S,);
            cv.put(KEY_100S,);
            cv.put(KEY_BOWLING_WICKETS,"");
            cv.put(KEY_CATCHES,);

            db.insert(DATABASE_TABLE,null,cv); */
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
        {
            db.execSQL("drop table if exists " + DATABASE_TABLE);
            onCreate(db);
        }
    }

    public DBMoS openDatabase() throws SQLException
    {
        mydbhelper = new DBHelper(mycontext);
        mysqlitedb = mydbhelper.getReadableDatabase();
        return this;
    }

    public void closeDatabase() throws SQLException
    {
        mydbhelper.close();
    }

    public ArrayList<String> getSeries(String format)
    {
        ArrayList<String> series = new ArrayList<String>();
        String queryStatement;
        Cursor cursor;

        queryStatement = "select " + KEY_SERIES + " from " + DATABASE_TABLE + " where "
                + KEY_FORMAT + " = '" + format + "'";
        cursor = mysqlitedb.rawQuery(queryStatement,null);


        if (cursor.moveToFirst())
        {
            do
            {
                series.add(cursor.getString(cursor.getColumnIndexOrThrow(KEY_SERIES)));
            }
            while (cursor.moveToNext());
        }

        if(!cursor.isClosed())
        {
            cursor.close();
        }

        return series;
    }

    public ContainerMoSDetails getMoSDetails(String series)
    {
        ContainerMoSDetails containerMoSDetails = new ContainerMoSDetails();
        String queryStatement;
        Cursor cursor;

        queryStatement = "select * from " + DATABASE_TABLE + " where " + KEY_SERIES + " = '"
                + series + "'";

        cursor = mysqlitedb.rawQuery(queryStatement,null);

        if(cursor.moveToFirst())
        {
            containerMoSDetails.format = cursor.getString(cursor.getColumnIndexOrThrow(KEY_FORMAT));
            containerMoSDetails.series = cursor.getString(cursor.getColumnIndexOrThrow(KEY_SERIES));
            containerMoSDetails.opponent = cursor.getString(cursor.getColumnIndexOrThrow(KEY_OPPONENTS));
            containerMoSDetails.matches = cursor.getString(cursor.getColumnIndexOrThrow(KEY_MATCHES));
            containerMoSDetails.innings = cursor.getString(cursor.getColumnIndexOrThrow(KEY_INNINGS));
            containerMoSDetails.notOut = cursor.getString(cursor.getColumnIndexOrThrow(KEY_NOT_OUT));
            containerMoSDetails.runs = cursor.getString(cursor.getColumnIndexOrThrow(KEY_RUNS));
            containerMoSDetails.highScore = cursor.getString(cursor.getColumnIndexOrThrow(KEY_HIGH_SCORE));
            containerMoSDetails.average = cursor.getString(cursor.getColumnIndexOrThrow(KEY_AVERAGE));
            containerMoSDetails.strikeRate = cursor.getString(cursor.getColumnIndexOrThrow(KEY_STRIKE_RATE));
            containerMoSDetails.hundreds = cursor.getString(cursor.getColumnIndexOrThrow(KEY_100S));
            containerMoSDetails.fifties = cursor.getString(cursor.getColumnIndexOrThrow(KEY_50S));
            containerMoSDetails.bowlingWickets = cursor.getString(cursor.getColumnIndexOrThrow(KEY_BOWLING_WICKETS));
            containerMoSDetails.catches = cursor.getString(cursor.getColumnIndexOrThrow(KEY_CATCHES));
        }

        if(!cursor.isClosed())
        {
            cursor.close();
        }

        return containerMoSDetails;
    }

    public ContainerMoSDetails getPreviousOrNextSeries(String format,String series,String swipe)
    {
        ContainerMoSDetails containerMoSDetails = new ContainerMoSDetails();

        Cursor cursor;
        int mosNo = 0;
        String queryStatement;

        queryStatement = "select * from " + DATABASE_TABLE + " where " + KEY_SERIES + " = '"
                + series + "' and " + KEY_FORMAT + " = '" + format + "'";

        cursor = mysqlitedb.rawQuery(queryStatement,null);

        if(cursor.moveToFirst())
        {
            mosNo = Integer.parseInt(cursor.getString(cursor.getColumnIndexOrThrow(KEY_MOS_NO)));;
        }

        if(!cursor.isClosed())
        {
            cursor.close();
        }

        if(swipe.equals("leftSwipe"))
        {
            queryStatement = "select * from " + DATABASE_TABLE + " where " + KEY_MOS_NO + " > "
                    + mosNo + " and " + KEY_FORMAT + " = '" + format + "' order by " + KEY_MOS_NO;

        }
        else if(swipe.equals("rightSwipe"))
        {
            queryStatement = "select * from " + DATABASE_TABLE + " where " + KEY_MOS_NO + " < "
                    + mosNo + " and " + KEY_FORMAT + " = '" + format + "' order by " + KEY_MOS_NO
                    + " desc";
        }

        cursor = mysqlitedb.rawQuery(queryStatement,null);

        if(cursor.moveToFirst())
        {
            containerMoSDetails.series = cursor.getString(cursor.getColumnIndexOrThrow(KEY_SERIES));
        }
        else
        {
            containerMoSDetails.series = series;

        }

        if(!cursor.isClosed())
        {
            cursor.close();
        }

        return containerMoSDetails;
    }

}
