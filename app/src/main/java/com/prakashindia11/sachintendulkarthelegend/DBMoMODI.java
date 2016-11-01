package com.prakashindia11.sachintendulkarthelegend;

/**
 * Created by Prakash on 18-08-2016.
 * Last Edit : 01-11-2016
 */

import android.content.*;
import android.database.*;
import android.database.sqlite.*;

import java.util.ArrayList;

public class DBMoMODI
{
    private static final String KEY_MOM_NO = "column_mom_no";
    private static final String KEY_FORMAT = "column_format";
    private static final String KEY_OPPONENT = "column_opponent";
    private static final String KEY_SERIES = "column_series";
    private static final String KEY_RUNS = "column_runs";
    private static final String KEY_BALLS = "column_balls";
    private static final String KEY_4S = "column_4s";
    private static final String KEY_6S = "column_6s";
    private static final String KEY_STRIKE_RATE = "column_strike_rate";
    private static final String KEY_BOWLING_WICKETS = "column_bowling_wickets";
    private static final String KEY_CATCHES = "column_catches";
    private static final String KEY_VENUE = "column_venue";
    private static final String KEY_DATE = "column_date";
    private static final String KEY_RESULT = "result";

    private static final String DATABASE_NAME = "SachinTendulkarMoMODIDB";
    private static final String DATABASE_TABLE = "MoMODIDBTable";
    private static final int DATABASE_VERSION  = 1;

    private DBHelper mydbhelper;
    private final Context mycontext;
    private SQLiteDatabase mysqlitedb;

    public DBMoMODI(Context context)
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
                    + KEY_RUNS + " integer not null, "
                    + KEY_BALLS + " integer not null, "
                    + KEY_4S + " integer not null, "
                    + KEY_6S + " integer not null, "
                    + KEY_STRIKE_RATE + " float  not null, "
                    + KEY_BOWLING_WICKETS + " text  not null, "
                    + KEY_CATCHES + " integer  not null, "
                    + KEY_VENUE + " text not null, "
                    + KEY_DATE + " text not null, "
                    + KEY_RESULT + " text not null);"
                    ;

            db.execSQL(queryStatement);

            ContentValues cv = new ContentValues();

            /* Man of the Match Number : 1 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Sri Lanka");
            cv.put(KEY_SERIES,"Sri Lanka in India 1990/91 - 2nd ODI");
            cv.put(KEY_RUNS,53);
            cv.put(KEY_BALLS,41);
            cv.put(KEY_4S,7);
            cv.put(KEY_6S,1);
            cv.put(KEY_STRIKE_RATE,129.27);
            cv.put(KEY_BOWLING_WICKETS,"2");
            cv.put(KEY_CATCHES,2);
            cv.put(KEY_VENUE,"Nehru Stadium, Pune");
            cv.put(KEY_DATE,"5 December 1990");
            cv.put(KEY_RESULT,"India won by 6 wickets");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 2 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"West Indies");
            cv.put(KEY_SERIES,"Wills Sharjah Trophy 1991/92 - 5th Match");
            cv.put(KEY_RUNS,11);
            cv.put(KEY_BALLS,27);
            cv.put(KEY_4S,1);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,40.74);
            cv.put(KEY_BOWLING_WICKETS,"4");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"Sharjah Cricket Association Stadium, Sharjah");
            cv.put(KEY_DATE,"22 October 1991");
            cv.put(KEY_RESULT,"India won by 7 wickets");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 3 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"South Africa");
            cv.put(KEY_SERIES,"South Africa in India 1991/92 - 1st ODI");
            cv.put(KEY_RUNS,62);
            cv.put(KEY_BALLS,73);
            cv.put(KEY_4S,8);
            cv.put(KEY_6S,1);
            cv.put(KEY_STRIKE_RATE,84.93);
            cv.put(KEY_BOWLING_WICKETS,"1");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"Eden Gardens, Kolkata");
            cv.put(KEY_DATE,"10 November 1991");
            cv.put(KEY_RESULT,"India won by 3 wickets");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 4 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"West Indies");
            cv.put(KEY_SERIES,"Benson and Hedges World Series Cup 1991/92 - 12th Match");
            cv.put(KEY_RUNS,57);
            cv.put(KEY_BALLS,88);
            cv.put(KEY_4S,2);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,64.77);
            cv.put(KEY_BOWLING_WICKETS,"0");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"Melbourne Cricket Ground, Melbourne");
            cv.put(KEY_DATE,"16 January 1992");
            cv.put(KEY_RESULT,"India won by 5 wickets");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 5 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Pakistan");
            cv.put(KEY_SERIES,"Benson and Hedges World Cup 1991/92 - 16th Match");
            cv.put(KEY_RUNS,54);
            cv.put(KEY_BALLS,62);
            cv.put(KEY_4S,3);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,87.10);
            cv.put(KEY_BOWLING_WICKETS,"1");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"Sydney Cricket Ground, Sydney");
            cv.put(KEY_DATE,"4 March 1992");
            cv.put(KEY_RESULT,"India won by 43 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 6 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Zimbabwe");
            cv.put(KEY_SERIES,"Benson and Hedges World Cup 1991/92 - 20th Match");
            cv.put(KEY_RUNS,81);
            cv.put(KEY_BALLS,77);
            cv.put(KEY_4S,8);
            cv.put(KEY_6S,1);
            cv.put(KEY_STRIKE_RATE,105.19);
            cv.put(KEY_BOWLING_WICKETS,"1");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"Trust Bank Park, Hamilton");
            cv.put(KEY_DATE,"7 March 1992");
            cv.put(KEY_RESULT,"India won by 55 runs (Rain affected match)");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 7 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"New Zealand");
            cv.put(KEY_SERIES,"India in New Zealand 1993/94 - 2nd ODI");
            cv.put(KEY_RUNS,82);
            cv.put(KEY_BALLS,49);
            cv.put(KEY_4S,15);
            cv.put(KEY_6S,2);
            cv.put(KEY_STRIKE_RATE,167.35);
            cv.put(KEY_BOWLING_WICKETS,"Did Not Bowl");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"Eden Park, Auckland");
            cv.put(KEY_DATE,"27 March 1994");
            cv.put(KEY_RESULT,"India won by 7 wickets");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 8 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Australia");
            cv.put(KEY_SERIES,"Singer World Series 1994");
            cv.put(KEY_RUNS,110);
            cv.put(KEY_BALLS,130);
            cv.put(KEY_4S,8);
            cv.put(KEY_6S,2);
            cv.put(KEY_STRIKE_RATE,84.62);
            cv.put(KEY_BOWLING_WICKETS,"0");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"R Premadasa Stadium, Colombo");
            cv.put(KEY_DATE,"9 September 1994");
            cv.put(KEY_RESULT,"India won by 31 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 9 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"New Zealand");
            cv.put(KEY_SERIES,"Wills World Series 1994/95 - 3rd Match");
            cv.put(KEY_RUNS,115);
            cv.put(KEY_BALLS,136);
            cv.put(KEY_4S,9);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,84.56);
            cv.put(KEY_BOWLING_WICKETS,"0");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"IPCL Sports Complex Ground, Vadodara");
            cv.put(KEY_DATE,"28 October 1994");
            cv.put(KEY_RESULT,"India won by 7 wickets");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 10 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"New Zealand");
            cv.put(KEY_SERIES,"Wills World Series 1994/95 - 6th Match");
            cv.put(KEY_RUNS,62);
            cv.put(KEY_BALLS,54);
            cv.put(KEY_4S,13);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,114.81);
            cv.put(KEY_BOWLING_WICKETS,"2");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"Feroz Shah Kotla, New Delhi");
            cv.put(KEY_DATE,"3 November 1994");
            cv.put(KEY_RESULT,"India won by 107 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 11 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"West Indies");
            cv.put(KEY_SERIES,"Wills World Series 1994/95 - Final");
            cv.put(KEY_RUNS,66);
            cv.put(KEY_BALLS,68);
            cv.put(KEY_4S,8);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,97.06);
            cv.put(KEY_BOWLING_WICKETS,"1");
            cv.put(KEY_CATCHES,1);
            cv.put(KEY_VENUE,"Eden Gardens, Kolkata");
            cv.put(KEY_DATE,"5 November 1994");
            cv.put(KEY_RESULT,"India won by 72 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 12 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Sri Lanka");
            cv.put(KEY_SERIES,"Pepsi Asia Cup 1994/95 - 5th Match");
            cv.put(KEY_RUNS,112);
            cv.put(KEY_BALLS,107);
            cv.put(KEY_4S,15);
            cv.put(KEY_6S,1);
            cv.put(KEY_STRIKE_RATE,104.67);
            cv.put(KEY_BOWLING_WICKETS,"Did Not Bowl");
            cv.put(KEY_CATCHES,1);
            cv.put(KEY_VENUE,"Sharjah Cricket Association Stadium, Sharjah");
            cv.put(KEY_DATE,"9 April 1995");
            cv.put(KEY_RESULT,"India won by 8 wickets");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 13 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Kenya");
            cv.put(KEY_SERIES,"Wills World Cup 1995/96 - 6th Match, Group A");
            cv.put(KEY_RUNS,127);
            cv.put(KEY_BALLS,138);
            cv.put(KEY_4S,15);
            cv.put(KEY_6S,1);
            cv.put(KEY_STRIKE_RATE,92.03);
            cv.put(KEY_BOWLING_WICKETS,"0");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"Barabati Stadium, Cuttack");
            cv.put(KEY_DATE,"18 February 1996");
            cv.put(KEY_RESULT,"India won by 7 wickets");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 14 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"West Indies");
            cv.put(KEY_SERIES,"Wills World Cup 1995/96 - 8th Match, Group A");
            cv.put(KEY_RUNS,70);
            cv.put(KEY_BALLS,91);
            cv.put(KEY_4S,8);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,76.92);
            cv.put(KEY_BOWLING_WICKETS,"Did Not Bowl");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"Captain Roop Singh Stadium, Gwalior");
            cv.put(KEY_DATE,"21 February 1996");
            cv.put(KEY_RESULT,"India won by 5 wickets");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 15 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Pakistan");
            cv.put(KEY_SERIES,"Pepsi Sharjah Cup 1995/96 - 4th Match");
            cv.put(KEY_RUNS,118);
            cv.put(KEY_BALLS,140);
            cv.put(KEY_4S,8);
            cv.put(KEY_6S,2);
            cv.put(KEY_STRIKE_RATE,84.29);
            cv.put(KEY_BOWLING_WICKETS,"2");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"Sharjah Cricket Association Stadium, Sharjah");
            cv.put(KEY_DATE,"15 April 1996");
            cv.put(KEY_RESULT,"India won by 28 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 16 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Pakistan");
            cv.put(KEY_SERIES,"Sahara 'Friendship' Cup 1996 - 1st ODI");
            cv.put(KEY_RUNS,89);
            cv.put(KEY_BALLS,89);
            cv.put(KEY_4S,9);
            cv.put(KEY_6S,3);
            cv.put(KEY_STRIKE_RATE,100.00);
            cv.put(KEY_BOWLING_WICKETS,"0");
            cv.put(KEY_CATCHES,1);
            cv.put(KEY_VENUE,"Armour Heights, Toronto");
            cv.put(KEY_DATE,"16 September 1996");
            cv.put(KEY_RESULT,"India won by 8 wickets");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 17 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Australia");
            cv.put(KEY_SERIES,"Titan World Series 1996/97 - 3rd Match");
            cv.put(KEY_RUNS,88);
            cv.put(KEY_BALLS,111);
            cv.put(KEY_4S,9);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,79.28);
            cv.put(KEY_BOWLING_WICKETS,"2");
            cv.put(KEY_CATCHES,1);
            cv.put(KEY_VENUE,"M Chinnaswamy Stadium, Bangalore");
            cv.put(KEY_DATE,"21 October 1996");
            cv.put(KEY_RESULT,"India won by 2 wickets");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 18 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"South Africa");
            cv.put(KEY_SERIES,"Pepsi Challenge (Mohinder Amarnath Benefit Match) 1996/97");
            cv.put(KEY_RUNS,114);
            cv.put(KEY_BALLS,126);
            cv.put(KEY_4S,14);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,90.48);
            cv.put(KEY_BOWLING_WICKETS,"Did Not Bowl");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"Wankhede Stadium, Mumbai");
            cv.put(KEY_DATE,"14 December 1996");
            cv.put(KEY_RESULT,"India won by 74 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 19 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Zimbabwe");
            cv.put(KEY_SERIES,"Standard Bank International Series 1996/97 - 9th Match");
            cv.put(KEY_RUNS,104);
            cv.put(KEY_BALLS,97);
            cv.put(KEY_4S,8);
            cv.put(KEY_6S,1);
            cv.put(KEY_STRIKE_RATE,107.22);
            cv.put(KEY_BOWLING_WICKETS,"0");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"Willowmoore Park Main Oval, Benoni");
            cv.put(KEY_DATE,"9 February 1997");
            cv.put(KEY_RESULT,"India won by 6 wickets");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 20 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"New Zealand");
            cv.put(KEY_SERIES,"Pepsi Independence Cup 1996/97 - 3rd Match");
            cv.put(KEY_RUNS,117);
            cv.put(KEY_BALLS,137);
            cv.put(KEY_4S,13);
            cv.put(KEY_6S,2);
            cv.put(KEY_STRIKE_RATE,85.40);
            cv.put(KEY_BOWLING_WICKETS,"0");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"M Chinnaswamy Stadium, Bangalore");
            cv.put(KEY_DATE,"14 May 199");
            cv.put(KEY_RESULT,"India won by 8 wickets");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 21 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Pakistan");
            cv.put(KEY_SERIES,"Coca-Cola Silver Jubilee Independence Cup 1997/98 - 1st Final");
            cv.put(KEY_RUNS,95);
            cv.put(KEY_BALLS,78);
            cv.put(KEY_4S,6);
            cv.put(KEY_6S,5);
            cv.put(KEY_STRIKE_RATE,121.79);
            cv.put(KEY_BOWLING_WICKETS,"3");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"Bangabandhu National Stadium, Dhaka");
            cv.put(KEY_DATE,"14 January 1998");
            cv.put(KEY_RESULT,"India won by 8 wickets");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 22 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Australia");
            cv.put(KEY_SERIES,"Pepsi Triangular Series 1997/98 - 1st Match");
            cv.put(KEY_RUNS,8);
            cv.put(KEY_BALLS,11);
            cv.put(KEY_4S,1);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,72.73);
            cv.put(KEY_BOWLING_WICKETS,"5");
            cv.put(KEY_CATCHES,1);
            cv.put(KEY_VENUE,"Nehru Stadium, Kochi");
            cv.put(KEY_DATE,"1 April 1998");
            cv.put(KEY_RESULT,"India won by 41 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 23 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Australia");
            cv.put(KEY_SERIES,"Pepsi Triangular Series 1997/98 - 4th Match");
            cv.put(KEY_RUNS,100);
            cv.put(KEY_BALLS,89);
            cv.put(KEY_4S,5);
            cv.put(KEY_6S,7);
            cv.put(KEY_STRIKE_RATE,112.36);
            cv.put(KEY_BOWLING_WICKETS,"0");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"Modi Stadium, Kanpur");
            cv.put(KEY_DATE,"7 April 1998");
            cv.put(KEY_RESULT,"India won by 6 wickets");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 24 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Australia");
            cv.put(KEY_SERIES,"Coca-Cola Sharjah Cup 1997/98  - 3rd Match");
            cv.put(KEY_RUNS,80);
            cv.put(KEY_BALLS,72);
            cv.put(KEY_4S,9);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,111.11);
            cv.put(KEY_BOWLING_WICKETS,"0");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"Sharjah Cricket Association Stadium, Sharjah");
            cv.put(KEY_DATE,"19 April 1998");
            cv.put(KEY_RESULT,"Australia won by 58 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 25 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Australia");
            cv.put(KEY_SERIES,"Coca-Cola Sharjah Cup 1997/98 - 6th Match");
            cv.put(KEY_RUNS,143);
            cv.put(KEY_BALLS,131);
            cv.put(KEY_4S,9);
            cv.put(KEY_6S,5);
            cv.put(KEY_STRIKE_RATE,109.16);
            cv.put(KEY_BOWLING_WICKETS,"1");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"Sharjah Cricket Association Stadium, Sharjah");
            cv.put(KEY_DATE,"22 April 1998");
            cv.put(KEY_RESULT,"Australia won by 26 run (D/L method)");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 26 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Australia");
            cv.put(KEY_SERIES,"Coca-Cola Sharjah Cup 1997/98 - Final");
            cv.put(KEY_RUNS,134);
            cv.put(KEY_BALLS,131);
            cv.put(KEY_4S,12);
            cv.put(KEY_6S,3);
            cv.put(KEY_STRIKE_RATE,102.29);
            cv.put(KEY_BOWLING_WICKETS,"0");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"Sharjah Cricket Association Stadium, Sharjah");
            cv.put(KEY_DATE,"24 April 1998");
            cv.put(KEY_RESULT,"India won by 6 wickets");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 27 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Kenya");
            cv.put(KEY_SERIES,"Coca-Cola Triangular Series 1997/98 - Final");
            cv.put(KEY_RUNS,100);
            cv.put(KEY_BALLS,103);
            cv.put(KEY_4S,13);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,97.09);
            cv.put(KEY_BOWLING_WICKETS,"0");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"Eden Gardens, Calcutta");
            cv.put(KEY_DATE,"31 May 1998");
            cv.put(KEY_RESULT,"India won by 9 wickets");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 28 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Sri Lanka");
            cv.put(KEY_SERIES,"Singer-Akai Nidahas Trophy 1998 - Final");
            cv.put(KEY_RUNS,128);
            cv.put(KEY_BALLS,131);
            cv.put(KEY_4S,8);
            cv.put(KEY_6S,2);
            cv.put(KEY_STRIKE_RATE,97.71);
            cv.put(KEY_BOWLING_WICKETS,"0");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"R Premadasa Stadium, Colombo");
            cv.put(KEY_DATE,"7 July 1998");
            cv.put(KEY_RESULT,"India won by 6 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 29 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Zimbabwe");
            cv.put(KEY_SERIES,"India in Zimbabwe 1998/99 - 1st ODI");
            cv.put(KEY_RUNS,127);
            cv.put(KEY_BALLS,130);
            cv.put(KEY_4S,13);
            cv.put(KEY_6S,1);
            cv.put(KEY_STRIKE_RATE,97.69);
            cv.put(KEY_BOWLING_WICKETS,"Did Not Bowl");
            cv.put(KEY_CATCHES,1);
            cv.put(KEY_VENUE,"Queens Sports Club, Bulawayo");
            cv.put(KEY_DATE,"26 September 1998");
            cv.put(KEY_RESULT,"India won by 8 wickets");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 30 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Australia");
            cv.put(KEY_SERIES,"Wills International Cup 1998/99 - Quarter Final");
            cv.put(KEY_RUNS,141);
            cv.put(KEY_BALLS,128);
            cv.put(KEY_4S,13);
            cv.put(KEY_6S,3);
            cv.put(KEY_STRIKE_RATE,110.16);
            cv.put(KEY_BOWLING_WICKETS,"4");
            cv.put(KEY_CATCHES,1);
            cv.put(KEY_VENUE,"Bangabandhu National Stadium, Dhaka");
            cv.put(KEY_DATE,"28 October 1998");
            cv.put(KEY_RESULT,"India won by 44 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 31 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Zimbabwe");
            cv.put(KEY_SERIES,"Coca-Cola Champions Trophy 1998/99 - 3rd Match");
            cv.put(KEY_RUNS,118);
            cv.put(KEY_BALLS,112);
            cv.put(KEY_4S,14);
            cv.put(KEY_6S,2);
            cv.put(KEY_STRIKE_RATE,105.36);
            cv.put(KEY_BOWLING_WICKETS,"0");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"Sharjah Cricket Association Stadium, Sharjah");
            cv.put(KEY_DATE,"8th November 1998");
            cv.put(KEY_RESULT,"India won by 7 wickets");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 32 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Zimbabwe");
            cv.put(KEY_SERIES,"Coca-Cola Champions Trophy 1998/99 - Final ");
            cv.put(KEY_RUNS,124);
            cv.put(KEY_BALLS,92);
            cv.put(KEY_4S,12);
            cv.put(KEY_6S,6);
            cv.put(KEY_STRIKE_RATE,134.78);
            cv.put(KEY_BOWLING_WICKETS,"1");
            cv.put(KEY_CATCHES,1);
            cv.put(KEY_VENUE,"Sharjah Cricket Association Stadium, Sharjah");
            cv.put(KEY_DATE,"13 November 1998");
            cv.put(KEY_RESULT,"India won by 10 wickets");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 33 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Kenya");
            cv.put(KEY_SERIES,"ICC World Cup 1999 - 16th Match, Group A");
            cv.put(KEY_RUNS,140);
            cv.put(KEY_BALLS,101);
            cv.put(KEY_4S,16);
            cv.put(KEY_6S,3);
            cv.put(KEY_STRIKE_RATE,138.61);
            cv.put(KEY_BOWLING_WICKETS,"0");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"The Royal and Sun Alliance County Ground, Bristol");
            cv.put(KEY_DATE,"23 May 1999");
            cv.put(KEY_RESULT,"India won by 94 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 34 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Zimbabwe");
            cv.put(KEY_SERIES,"Coca-Cola Singapore Challenge 1999 - 2nd Match");
            cv.put(KEY_RUNS,85);
            cv.put(KEY_BALLS,72);
            cv.put(KEY_4S,7);
            cv.put(KEY_6S,3);
            cv.put(KEY_STRIKE_RATE,118.06);
            cv.put(KEY_BOWLING_WICKETS,"Did Not Bowl");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"Kallang Ground, Singapore");
            cv.put(KEY_DATE,"4 September 1999");
            cv.put(KEY_RESULT,"India won by 115 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 35 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"New Zealand");
            cv.put(KEY_SERIES,"New Zealand in India 1999/00 - 2nd ODI");
            cv.put(KEY_RUNS,186);
            cv.put(KEY_BALLS,150);
            cv.put(KEY_4S,20);
            cv.put(KEY_6S,3);
            cv.put(KEY_STRIKE_RATE,124.00);
            cv.put(KEY_BOWLING_WICKETS,"Did Not Bowl");
            cv.put(KEY_CATCHES,1);
            cv.put(KEY_VENUE,"Lal Bahadur Shastri Stadium, Hyderabad");
            cv.put(KEY_DATE,"8 November 1999");
            cv.put(KEY_RESULT,"India won by 174 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 36 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"South Africa");
            cv.put(KEY_SERIES,"South Africa in India 1999/00 - 4th ODI");
            cv.put(KEY_RUNS,122);
            cv.put(KEY_BALLS,138);
            cv.put(KEY_4S,12);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,88.41);
            cv.put(KEY_BOWLING_WICKETS,"0");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"IPCL Sports Complex Ground, Vadodara");
            cv.put(KEY_DATE,"17 March 2000");
            cv.put(KEY_RESULT,"India won by 4 wickets");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 37 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Sri Lanka");
            cv.put(KEY_SERIES,"Coca-Cola Champions Trophy 2000/01 - 1st Match");
            cv.put(KEY_RUNS,101);
            cv.put(KEY_BALLS,140);
            cv.put(KEY_4S,3);
            cv.put(KEY_6S,1);
            cv.put(KEY_STRIKE_RATE,72.14);
            cv.put(KEY_BOWLING_WICKETS,"0");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"Sharjah Cricket Association Stadium, Sharjah");
            cv.put(KEY_DATE,"20 October 2000");
            cv.put(KEY_RESULT,"Sri Lanka won by 5 wickets");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 38 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Australia");
            cv.put(KEY_SERIES,"Australia in India 2000/01 - 3rd ODI");
            cv.put(KEY_RUNS,139);
            cv.put(KEY_BALLS,125);
            cv.put(KEY_4S,19);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,111.20);
            cv.put(KEY_BOWLING_WICKETS,"Did Not Bowl");
            cv.put(KEY_CATCHES,1);
            cv.put(KEY_VENUE,"Nehru Stadium, Indore");
            cv.put(KEY_DATE,"31 March 2001");
            cv.put(KEY_RESULT,"India won by 118 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 39 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Zimbabwe");
            cv.put(KEY_SERIES,"Coca-Cola Cup 2001 - 2nd Match");
            cv.put(KEY_RUNS,70);
            cv.put(KEY_BALLS,70);
            cv.put(KEY_4S,13);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,100.00);
            cv.put(KEY_BOWLING_WICKETS,"Did Not Bowl");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"Harare Sports Club, Harare");
            cv.put(KEY_DATE,"24 June 2001");
            cv.put(KEY_RESULT,"India won by 9 wickets");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 40 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"West Indies");
            cv.put(KEY_SERIES,"Coca-Cola Cup 2001 - 4th Match");
            cv.put(KEY_RUNS,81);
            cv.put(KEY_BALLS,110);
            cv.put(KEY_4S,8);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,73.64);
            cv.put(KEY_BOWLING_WICKETS,"0");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"Queens Sports Club, Bulawayo");
            cv.put(KEY_DATE,"30 June 2001");
            cv.put(KEY_RESULT,"India won by 6 wickets");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 41 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"West Indies");
            cv.put(KEY_SERIES,"Coca-Cola Cup 2001 - 6th Match");
            cv.put(KEY_RUNS,122);
            cv.put(KEY_BALLS,131);
            cv.put(KEY_4S,12);
            cv.put(KEY_6S,1);
            cv.put(KEY_STRIKE_RATE,93.13);
            cv.put(KEY_BOWLING_WICKETS,"0");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"Harare Sports Club, Harare");
            cv.put(KEY_DATE,"4 July 2001");
            cv.put(KEY_RESULT,"India won by 6 wickets");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 42 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Kenya");
            cv.put(KEY_SERIES,"Standard Bank Triangular Tournament 2001/02 - 9th Match");
            cv.put(KEY_RUNS,146);
            cv.put(KEY_BALLS,132);
            cv.put(KEY_4S,17);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,110.61);
            cv.put(KEY_BOWLING_WICKETS,"Did Not Bowl");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"Boland Bank Park, Paarl");
            cv.put(KEY_DATE,"24 October 2001");
            cv.put(KEY_RESULT,"India won by 186 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 43 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"England");
            cv.put(KEY_SERIES,"England in India 2001/02 - 3rd ODI");
            cv.put(KEY_RUNS,68);
            cv.put(KEY_BALLS,79);
            cv.put(KEY_4S,10);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,86.08);
            cv.put(KEY_BOWLING_WICKETS,"0");
            cv.put(KEY_CATCHES,1);
            cv.put(KEY_VENUE,"MA Chidambaram Stadium, Chennai");
            cv.put(KEY_DATE,"25 January 2002");
            cv.put(KEY_RESULT,"India won by 4 wickets");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 44 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"West Indies");
            cv.put(KEY_SERIES,"India in West Indies 2001/02 - 5th ODI");
            cv.put(KEY_RUNS,65);
            cv.put(KEY_BALLS,70);
            cv.put(KEY_4S,3);
            cv.put(KEY_6S,1);
            cv.put(KEY_STRIKE_RATE,92.86);
            cv.put(KEY_BOWLING_WICKETS,"1");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"Queen's Park Oval, Port of Spain");
            cv.put(KEY_DATE,"2 June 2002");
            cv.put(KEY_RESULT,"India won by 56 runs (D/L method)");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 45 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Sri Lanka");
            cv.put(KEY_SERIES,"NatWest Bank Series 2002 - 9th Match");
            cv.put(KEY_RUNS,113);
            cv.put(KEY_BALLS,102);
            cv.put(KEY_4S,12);
            cv.put(KEY_6S,1);
            cv.put(KEY_STRIKE_RATE,11078);
            cv.put(KEY_BOWLING_WICKETS,"0");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"The Royal and Sun Alliance County Ground, Bristol");
            cv.put(KEY_DATE,"11 July 2002");
            cv.put(KEY_RESULT,"India won by 63 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 46 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Zimbabwe");
            cv.put(KEY_SERIES,"ICC World Cup 2002/03 - 19th Match, Pool A");
            cv.put(KEY_RUNS,81);
            cv.put(KEY_BALLS,91);
            cv.put(KEY_4S,10);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,89.01);
            cv.put(KEY_BOWLING_WICKETS,"Did Not Bowl");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"Harare Sports Club, Harare");
            cv.put(KEY_DATE,"19 February 2003");
            cv.put(KEY_RESULT,"India won by 83 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 47 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Namibia");
            cv.put(KEY_SERIES,"ICC World Cup 2002/03 - 25th Match, Pool A");
            cv.put(KEY_RUNS,152);
            cv.put(KEY_BALLS,151);
            cv.put(KEY_4S,18);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,100.66);
            cv.put(KEY_BOWLING_WICKETS,"Did Not Bowl");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"City Oval, Pietermaritzburg");
            cv.put(KEY_DATE,"23 February 2003");
            cv.put(KEY_RESULT,"India won by 181 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 48 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Pakistan");
            cv.put(KEY_SERIES,"ICC World Cup 2002/03 - 36th Match, Pool A");
            cv.put(KEY_RUNS,98);
            cv.put(KEY_BALLS,75);
            cv.put(KEY_4S,12);
            cv.put(KEY_6S,1);
            cv.put(KEY_STRIKE_RATE,130.67);
            cv.put(KEY_BOWLING_WICKETS,"Did Not Bowl");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"Centurion Park, Centurion");
            cv.put(KEY_DATE,"1 March 2003");
            cv.put(KEY_RESULT,"India won by 6 wickets");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 49 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Australia");
            cv.put(KEY_SERIES,"TVS Cup 2003/04 - 2nd Match");
            cv.put(KEY_RUNS,100);
            cv.put(KEY_BALLS,119);
            cv.put(KEY_4S,9);
            cv.put(KEY_6S,1);
            cv.put(KEY_STRIKE_RATE,84.03);
            cv.put(KEY_BOWLING_WICKETS,"1");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"Captain Roop Singh Stadium, Gwalior");
            cv.put(KEY_DATE,"26 October 2003");
            cv.put(KEY_RESULT,"India won by 37 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 50 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Pakistan");
            cv.put(KEY_SERIES,"India in Pakistan 2003/04 - 2nd ODI");
            cv.put(KEY_RUNS,141);
            cv.put(KEY_BALLS,135);
            cv.put(KEY_4S,17);
            cv.put(KEY_6S,1);
            cv.put(KEY_STRIKE_RATE,104.44);
            cv.put(KEY_BOWLING_WICKETS,"0");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"Rawalpindi Cricket Stadium, Rawalpindi");
            cv.put(KEY_DATE,"16 March 2004");
            cv.put(KEY_RESULT,"Pakistan won by 12 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 51 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Bangladesh");
            cv.put(KEY_SERIES,"Asia Cup 2004 - 7th Match");
            cv.put(KEY_RUNS,82);
            cv.put(KEY_BALLS,126);
            cv.put(KEY_4S,10);
            cv.put(KEY_6S,1);
            cv.put(KEY_STRIKE_RATE,65.08);
            cv.put(KEY_BOWLING_WICKETS,"3");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"Sinhalese Sports Club Ground, Colombo");
            cv.put(KEY_DATE,"21 July 2004");
            cv.put(KEY_RESULT,"India won by 8 wickets");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 52 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"West Indies");
            cv.put(KEY_SERIES,"DLF Cup 2006/07 - 2nd Match");
            cv.put(KEY_RUNS,141);
            cv.put(KEY_BALLS,148);
            cv.put(KEY_4S,13);
            cv.put(KEY_6S,5);
            cv.put(KEY_STRIKE_RATE,95.27);
            cv.put(KEY_BOWLING_WICKETS,"Did Not Bowl");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"Kinrara Academy Oval, Kuala Lumpur");
            cv.put(KEY_DATE,"14 September 2006");
            cv.put(KEY_RESULT,"West Indies won by 29 runs (D/L method)");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 53 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"West Indies");
            cv.put(KEY_SERIES,"West Indies in India 2006/07 - 4th ODI");
            cv.put(KEY_RUNS,100);
            cv.put(KEY_BALLS,76);
            cv.put(KEY_4S,10);
            cv.put(KEY_6S,1);
            cv.put(KEY_STRIKE_RATE,131.58);
            cv.put(KEY_BOWLING_WICKETS,"Did Not Bowl");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"IPCL Sports Complex Ground, Vadodara");
            cv.put(KEY_DATE,"31 January 2007");
            cv.put(KEY_RESULT,"India won by 160 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 54 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"South Africa");
            cv.put(KEY_SERIES,"Future Cup In Ireland 2007 - 2nd ODI");
            cv.put(KEY_RUNS,93);
            cv.put(KEY_BALLS,106);
            cv.put(KEY_4S,13);
            cv.put(KEY_6S,2);
            cv.put(KEY_STRIKE_RATE,87.74);
            cv.put(KEY_BOWLING_WICKETS,"0");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"Civil Service Cricket Club, Belfast");
            cv.put(KEY_DATE,"29 June 2007");
            cv.put(KEY_RESULT,"India won by 6 wickets");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 55 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"England");
            cv.put(KEY_SERIES,"India in England 2007 - 6th ODI");
            cv.put(KEY_RUNS,94);
            cv.put(KEY_BALLS,81);
            cv.put(KEY_4S,16);
            cv.put(KEY_6S,1);
            cv.put(KEY_STRIKE_RATE,116.05);
            cv.put(KEY_BOWLING_WICKETS,"0");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"The Brit Oval, Kennington");
            cv.put(KEY_DATE,"5 September 2007");
            cv.put(KEY_RESULT,"India won by 2 wickets");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 56 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Pakistan");
            cv.put(KEY_SERIES,"Pakistan in India 2007/08 - 4th ODI");
            cv.put(KEY_RUNS,97);
            cv.put(KEY_BALLS,102);
            cv.put(KEY_4S,16);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,95.10);
            cv.put(KEY_BOWLING_WICKETS,"Did Not Bowl");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"Captain Roop Singh Stadium, Gwalior");
            cv.put(KEY_DATE,"15 November 2007");
            cv.put(KEY_RESULT,"India won by 6 wickets");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 57 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Australia");
            cv.put(KEY_SERIES,"Commonwealth Bank Series 2007/08 - 1st Final");
            cv.put(KEY_RUNS,117);
            cv.put(KEY_BALLS,120);
            cv.put(KEY_4S,10);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,97.50);
            cv.put(KEY_BOWLING_WICKETS,"Did Not Bowl");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"Sydney Cricket Ground, Sydney");
            cv.put(KEY_DATE,"2 March 2008");
            cv.put(KEY_RESULT,"India won by 6 wickets");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 58 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"New Zealand");
            cv.put(KEY_SERIES,"India in New Zealand 2008/09 - 3rd ODI");
            cv.put(KEY_RUNS,163);
            cv.put(KEY_BALLS,133);
            cv.put(KEY_4S,16);
            cv.put(KEY_6S,5);
            cv.put(KEY_STRIKE_RATE,122.56);
            cv.put(KEY_BOWLING_WICKETS,"Did Not Bowl");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"AMI Stadium, Christchurch");
            cv.put(KEY_DATE,"8 March 2009");
            cv.put(KEY_RESULT,"India won by 58 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 59 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Sri Lanka");
            cv.put(KEY_SERIES,"Compaq Cup Tri-Series 2009 - Final");
            cv.put(KEY_RUNS,138);
            cv.put(KEY_BALLS,133);
            cv.put(KEY_4S,10);
            cv.put(KEY_6S,1);
            cv.put(KEY_STRIKE_RATE,103.76);
            cv.put(KEY_BOWLING_WICKETS,"Did Not Bowl");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"R Premadasa Stadium, Colombo");
            cv.put(KEY_DATE,"14 September 2009");
            cv.put(KEY_RESULT,"India won by 46 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 60 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Australia");
            cv.put(KEY_SERIES,"Australia in India 2009/10 - 5th ODI");
            cv.put(KEY_RUNS,175);
            cv.put(KEY_BALLS,141);
            cv.put(KEY_4S,19);
            cv.put(KEY_6S,4);
            cv.put(KEY_STRIKE_RATE,124.11);
            cv.put(KEY_BOWLING_WICKETS,"Did Not Bowl");
            cv.put(KEY_CATCHES,1);
            cv.put(KEY_VENUE,"Rajiv Gandhi International Stadium, Hyderabad");
            cv.put(KEY_DATE,"5 November 2009");
            cv.put(KEY_RESULT,"Australia won by 3 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 61 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"South Africa");
            cv.put(KEY_SERIES,"South Africa in India 2009/10 - 2nd ODI");
            cv.put(KEY_RUNS,200);
            cv.put(KEY_BALLS,147);
            cv.put(KEY_4S,25);
            cv.put(KEY_6S,3);
            cv.put(KEY_STRIKE_RATE,136.05);
            cv.put(KEY_BOWLING_WICKETS,"Did Not Bowl");
            cv.put(KEY_CATCHES,0);
            cv.put(KEY_VENUE,"Captain Roop Singh Stadium, Gwalior");
            cv.put(KEY_DATE,"24 February 2010");
            cv.put(KEY_RESULT,"India won by 153 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Man of the Match Number : 62 */
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Pakistan");
            cv.put(KEY_SERIES,"ICC World Cup 2010/11 - Semi-Final");
            cv.put(KEY_RUNS,85);
            cv.put(KEY_BALLS,115);
            cv.put(KEY_4S,11);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,73.91);
            cv.put(KEY_BOWLING_WICKETS,"Did Not Bowl");
            cv.put(KEY_CATCHES,1);
            cv.put(KEY_VENUE,"Punjab Cricket Association Stadium, Mohali");
            cv.put(KEY_DATE,"30 March 2011");
            cv.put(KEY_RESULT,"India won by 29 runs");

            db.insert(DATABASE_TABLE,null,cv);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
        {
            db.execSQL("drop table if exists " + DATABASE_TABLE);
            onCreate(db);
        }
    }

    public DBMoMODI openDatabase() throws SQLException
    {
        mydbhelper = new DBHelper(mycontext);
        mysqlitedb = mydbhelper.getReadableDatabase();
        return this;
    }

    public void closeDatabase() throws SQLException
    {
        mydbhelper.close();
    }

    public ArrayList<String> getOpponentAndDate()
    {
        ArrayList<String> opponentAndDate = new ArrayList<String>();
        String queryStatement;
        Cursor cursor;

        queryStatement = "select * from " + DATABASE_TABLE;
        cursor = mysqlitedb.rawQuery(queryStatement,null);

        if (cursor.moveToFirst())
        {
            do
            {
                opponentAndDate.add(cursor.getString(cursor.getColumnIndexOrThrow(KEY_OPPONENT)) + ", " +
                        cursor.getString(cursor.getColumnIndexOrThrow(KEY_DATE)));
            }
            while (cursor.moveToNext());
        }

        if(!cursor.isClosed())
        {
            cursor.close();
        }

        return opponentAndDate;
    }

    public ContainerMoMODIDetails getMoMODIDetails(String opponent, String date)
    {
        ContainerMoMODIDetails containerMoMODIDetails = new ContainerMoMODIDetails();
        String queryStatement;
        Cursor cursor;

        queryStatement = "select * from " + DATABASE_TABLE + " where " + KEY_OPPONENT + " = '"
                + opponent + "' and " + KEY_DATE + " = '" + date + "'";

        cursor = mysqlitedb.rawQuery(queryStatement,null);

        if(cursor.moveToFirst())
        {
            containerMoMODIDetails.format = cursor.getString(cursor.getColumnIndexOrThrow(KEY_FORMAT));
            containerMoMODIDetails.opponent = cursor.getString(cursor.getColumnIndexOrThrow(KEY_OPPONENT));
            containerMoMODIDetails.series = cursor.getString(cursor.getColumnIndexOrThrow(KEY_SERIES));
            containerMoMODIDetails.runs = cursor.getString(cursor.getColumnIndexOrThrow(KEY_RUNS));
            containerMoMODIDetails.balls = cursor.getString(cursor.getColumnIndexOrThrow(KEY_BALLS));
            containerMoMODIDetails.fours = cursor.getString(cursor.getColumnIndexOrThrow(KEY_4S));
            containerMoMODIDetails.sixes = cursor.getString(cursor.getColumnIndexOrThrow(KEY_6S));
            containerMoMODIDetails.strikeRate = cursor.getString(cursor.getColumnIndexOrThrow(KEY_STRIKE_RATE));
            containerMoMODIDetails.bowlingWickets = cursor.getString(cursor.getColumnIndexOrThrow(KEY_BOWLING_WICKETS));
            containerMoMODIDetails.catches = cursor.getString(cursor.getColumnIndexOrThrow(KEY_CATCHES));
            containerMoMODIDetails.venue = cursor.getString(cursor.getColumnIndexOrThrow(KEY_VENUE));
            containerMoMODIDetails.date = cursor.getString(cursor.getColumnIndexOrThrow(KEY_DATE));
            containerMoMODIDetails.result = cursor.getString(cursor.getColumnIndexOrThrow(KEY_RESULT));
        }

        if(!cursor.isClosed())
        {
            cursor.close();
        }

        return containerMoMODIDetails;
    }

    public ContainerMoMODIDetails getPreviousOrNextOpponentDate(String opponent, String date, String swipe)
    {
        ContainerMoMODIDetails containerMoMODIDetails = new ContainerMoMODIDetails();
        Cursor cursor;
        int momNo = 0;
        String queryStatement;

        queryStatement = "select * from " + DATABASE_TABLE + " where " + KEY_OPPONENT + " = '"
                + opponent + "' and " + KEY_DATE + " = '" + date + "'";

        cursor = mysqlitedb.rawQuery(queryStatement,null);

        if(cursor.moveToFirst())
        {
            momNo = Integer.parseInt(cursor.getString(cursor.getColumnIndexOrThrow(KEY_MOM_NO)));;
        }

        if(!cursor.isClosed())
        {
            cursor.close();
        }

        if(swipe.equals("leftSwipe"))
        {
            queryStatement = "select * from " + DATABASE_TABLE + " where " + KEY_MOM_NO + " > "
                    + momNo + " order by " + KEY_MOM_NO;

        }
        else if(swipe.equals("rightSwipe"))
        {
            queryStatement = "select * from " + DATABASE_TABLE + " where " + KEY_MOM_NO + " < "
                    + momNo + " order by " + KEY_MOM_NO + " desc";
        }

        cursor = mysqlitedb.rawQuery(queryStatement,null);

        if(cursor.moveToFirst())
        {
            containerMoMODIDetails.opponent = cursor.getString(cursor.getColumnIndexOrThrow(KEY_OPPONENT));
            containerMoMODIDetails.date = cursor.getString(cursor.getColumnIndexOrThrow(KEY_DATE));
        }
        else
        {
            containerMoMODIDetails.opponent = opponent;
            containerMoMODIDetails.date = date;
        }

        if(!cursor.isClosed())
        {
            cursor.close();
        }

        return containerMoMODIDetails;
    }
}
