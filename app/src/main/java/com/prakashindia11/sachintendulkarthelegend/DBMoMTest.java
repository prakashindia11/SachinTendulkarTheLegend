package com.prakashindia11.sachintendulkarthelegend;

/**
 * Created by Prakash on 30-08-2016.
 * Last Edit : 30-08-2016
 */

import android.content.*;
import android.database.*;
import android.database.sqlite.*;

public class DBMoMTest
{
    private static final String KEY_MOM_NO = "column_mom_no";
    private static final String KEY_FORMAT = "column_format";
    private static final String KEY_OPPONENT = "column_opponent";
    private static final String KEY_SERIES = "column_series";
    private static final String KEY_1st_INNINGS_RUNS = "column_1st_innings_runs";
    private static final String KEY_2nd_INNINGS_RUNS = "column_2nd_innings_runs";
    private static final String KEY_BOWLING_WICKETS = "column_bowling_wickets";
    private static final String KEY_CATCHES = "column_catches";
    private static final String KEY_VENUE = "column_venue";
    private static final String KEY_DATE = "column_date";
    private static final String KEY_RESULT = "result";

    private static final String DATABASE_NAME = "SachinTendulkarMoMTestDB";
    private static final String DATABASE_TABLE = "MoMTestDBTable";
    private static final int DATABASE_VERSION  = 1;

    private DBHelper mydbhelper;
    private final Context mycontext;
    private SQLiteDatabase mysqlitedb;

    public DBMoMTest(Context context)
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
            String queryStatement = "create table " + DATABASE_TABLE + " (" + KEY_MOM_NO + " integer not null primary key autoincrement, "
                    + KEY_FORMAT + " text not null, "
                    + KEY_OPPONENT + " text not null, "
                    + KEY_SERIES + " text not null, "
                    + KEY_1st_INNINGS_RUNS + " text not null, "
                    + KEY_2nd_INNINGS_RUNS + " text not null, "
                    + KEY_BOWLING_WICKETS + " text  not null, "
                    + KEY_CATCHES + " integer  not null, "
                    + KEY_VENUE + " text not null, "
                    + KEY_DATE + " text not null, "
                    + KEY_RESULT + " text not null);"
                    ;

            db.execSQL(queryStatement);

            ContentValues cv = new ContentValues();

            /* Man of the Match Number : 1 */
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"England");
            cv.put(KEY_SERIES,"India in England 1990 - 2nd Test");
            cv.put(KEY_1st_INNINGS_RUNS,"68");
            cv.put(KEY_2nd_INNINGS_RUNS,"119");
            cv.put(KEY_BOWLING_WICKETS,"Did Not Bowl");
            cv.put(KEY_CATCHES,2);
            cv.put(KEY_VENUE,"Old Trafford, Manchester");
            cv.put(KEY_DATE,"9 to 14 August 1990");
            cv.put(KEY_RESULT,"Match drawn");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 2 */
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"England");
            cv.put(KEY_SERIES,"England in India 1992/93 - 2nd Test");
            cv.put(KEY_1st_INNINGS_RUNS,"165");
            cv.put(KEY_2nd_INNINGS_RUNS,"Did Not Bat");
            cv.put(KEY_BOWLING_WICKETS,"0");
            cv.put(KEY_CATCHES,2);
            cv.put(KEY_VENUE,"MA Chidambaram Stadium, Chennai");
            cv.put(KEY_DATE,"11 to 15 February 1993");
            cv.put(KEY_RESULT,"India won by an innings and 22 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 3 */
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"New Zealand");
            cv.put(KEY_SERIES,"New Zealand in India 1995/96 - 2nd Test");
            cv.put(KEY_1st_INNINGS_RUNS,"52");
            cv.put(KEY_2nd_INNINGS_RUNS,"Did Not Bat");
            cv.put(KEY_BOWLING_WICKETS,"Did Not Bowl");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"MA Chidambaram Stadium, Chennai");
            cv.put(KEY_DATE,"25 to 29 October 1995");
            cv.put(KEY_RESULT,"Match drawn");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 4 */
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"Australia");
            cv.put(KEY_SERIES,"Australia in India - 1st Test");
            cv.put(KEY_1st_INNINGS_RUNS,"4");
            cv.put(KEY_2nd_INNINGS_RUNS,"155");
            cv.put(KEY_BOWLING_WICKETS,"Did Not Bowl");
            cv.put(KEY_CATCHES,1);
            cv.put(KEY_VENUE,"MA Chidambaram Stadium, Chennai");
            cv.put(KEY_DATE,"6 to 10 March 1998");
            cv.put(KEY_RESULT,"India won by 179 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 5 */
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"Pakistan");
            cv.put(KEY_SERIES,"Pakistan in India 1998/99 - 1st Test");
            cv.put(KEY_1st_INNINGS_RUNS,"0");
            cv.put(KEY_2nd_INNINGS_RUNS,"136");
            cv.put(KEY_BOWLING_WICKETS,"3");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"MA Chidambaram Stadium, Chennai");
            cv.put(KEY_DATE,"28 to 31 January 1999");
            cv.put(KEY_RESULT,"Pakistan won by 12 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 6 */
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"New Zealand");
            cv.put(KEY_SERIES,"New Zealand in India 1999/00 - 3rd Test");
            cv.put(KEY_1st_INNINGS_RUNS,"217");
            cv.put(KEY_2nd_INNINGS_RUNS,"15");
            cv.put(KEY_BOWLING_WICKETS,"0");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"Sardar Patel Stadium, Ahmedabad");
            cv.put(KEY_DATE,"29 October to 2 November 1999");
            cv.put(KEY_RESULT,"Match  drawn");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 7 */
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"Australia");
            cv.put(KEY_SERIES,"India in Australia 1999/00 - 2nd Test");
            cv.put(KEY_1st_INNINGS_RUNS,"116");
            cv.put(KEY_2nd_INNINGS_RUNS,"52");
            cv.put(KEY_BOWLING_WICKETS,"Did Not Bowl");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"Melbourne Cricket Ground, Melbourne");
            cv.put(KEY_DATE,"26 to 30 December 1999");
            cv.put(KEY_RESULT,"Australia won by 180 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 8 */
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"South Africa");
            cv.put(KEY_SERIES,"South Africa in India 1999/00 - 1st Test");
            cv.put(KEY_1st_INNINGS_RUNS,"97");
            cv.put(KEY_2nd_INNINGS_RUNS,"8");
            cv.put(KEY_BOWLING_WICKETS,"3");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"Wankhede Stadium, Mumbai");
            cv.put(KEY_DATE,"24 to 26 February 2000");
            cv.put(KEY_RESULT,"South Africa won by 4 wickets");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 9 */
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"West Indies");
            cv.put(KEY_SERIES,"West Indies in India 2002/03 - 3rd Test");
            cv.put(KEY_1st_INNINGS_RUNS,"36");
            cv.put(KEY_2nd_INNINGS_RUNS,"176");
            cv.put(KEY_BOWLING_WICKETS,"0");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"Eden Gardens, Kolkata");
            cv.put(KEY_DATE,"30 October to 3 November 2002");
            cv.put(KEY_RESULT,"Match drawn");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 10 */
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"Australia");
            cv.put(KEY_SERIES,"India in Australia 2003/04 - 4th Test");
            cv.put(KEY_1st_INNINGS_RUNS,"241");
            cv.put(KEY_2nd_INNINGS_RUNS,"Did Not Bat");
            cv.put(KEY_BOWLING_WICKETS,"1");
            cv.put(KEY_CATCHES,1);
            cv.put(KEY_VENUE,"Sydney Cricket Ground, Sydney");
            cv.put(KEY_DATE,"2 to 6 January 2004");
            cv.put(KEY_RESULT,"Match drawn");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 11 */
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"Australia");
            cv.put(KEY_SERIES,"India in Australia 2007/08 - 4th Test");
            cv.put(KEY_1st_INNINGS_RUNS,"153");
            cv.put(KEY_2nd_INNINGS_RUNS,"13");
            cv.put(KEY_BOWLING_WICKETS,"0");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"Adelaide Oval, Adelaide");
            cv.put(KEY_DATE,"24 to 28 January 2008");
            cv.put(KEY_RESULT,"Match drawn");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 12 */
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"New Zealand");
            cv.put(KEY_SERIES,"India in New Zealand 2008/09 - Test");
            cv.put(KEY_1st_INNINGS_RUNS,"160");
            cv.put(KEY_2nd_INNINGS_RUNS,"Did Not Bat");
            cv.put(KEY_BOWLING_WICKETS,"Did Not Bowl");
            cv.put(KEY_CATCHES,1);
            cv.put(KEY_VENUE,"Seddon Park, Hamilton");
            cv.put(KEY_DATE,"18 to 22 March 2009");
            cv.put(KEY_RESULT,"India won by 10 wickets");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 13 */
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"Bangladesh");
            cv.put(KEY_SERIES,"India in Bangladesh 2009/10 - 1st Test");
            cv.put(KEY_1st_INNINGS_RUNS,"105");
            cv.put(KEY_2nd_INNINGS_RUNS,"16");
            cv.put(KEY_BOWLING_WICKETS,"Did Not Bowl");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"Zohur Ahmed Chowdhury Stadium, Chittagong");
            cv.put(KEY_DATE,"17 to 21 January 2010");
            cv.put(KEY_RESULT,"India won by 113 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 14 */
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"Australia");
            cv.put(KEY_SERIES,"Austraia in India 2010/11 - 2nd Test");
            cv.put(KEY_1st_INNINGS_RUNS,"214");
            cv.put(KEY_2nd_INNINGS_RUNS,"53");
            cv.put(KEY_BOWLING_WICKETS,"Did Not Bowl");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"M Chinnaswamy Stadium, Bangalore");
            cv.put(KEY_DATE,"9 to 13 October 2010");
            cv.put(KEY_RESULT,"India won by 7 wickets");

            db.insert(DATABASE_TABLE,null,cv);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
        {
            db.execSQL("drop table if exists " + DATABASE_TABLE);
            onCreate(db);
        }
    }

    public DBMoMTest openDatabase() throws SQLException
    {
        mydbhelper = new DBHelper(mycontext);
        mysqlitedb = mydbhelper.getReadableDatabase();
        return this;
    }

    public void closeDatabase() throws SQLException
    {
        mydbhelper.close();
    }
}
