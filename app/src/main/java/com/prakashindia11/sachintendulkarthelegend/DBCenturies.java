package com.prakashindia11.sachintendulkarthelegend;

/**
 * Created by Prakash on 17-08-2016.
 * Last Edit : 17-09-2016
 */

import android.content.*;
import android.database.*;
import android.database.sqlite.*;

import java.util.ArrayList;

public class DBCenturies
{

    private static final String KEY_CENTURY_NUMBER = "column_century_number";
    private static final String KEY_FORMAT = "column_format";
    private static final String KEY_OPPONENT = "column_opponent";
    private static final String KEY_SERIES = "column_series";
    private static final String KEY_RUNS = "column_runs";
    private static final String KEY_BALLS = "column_balls";
    private static final String KEY_4S = "column_4s";
    private static final String KEY_6S = "column_6s";
    private static final String KEY_STRIKE_RATE = "column_strike_rate";
    private static final String KEY_VENUE = "column_venue";
    private static final String KEY_DATE = "column_date";
    private static final String KEY_RESULT = "result";

    private static final String DATABASE_NAME = "SachinTendulkarCenturiesDB";
    private static final String DATABASE_TABLE = "CenturiesDBTable";
    private static final int DATABASE_VERSION  = 1;


    private DBHelper mydbhelper;
    private final Context mycontext;
    private SQLiteDatabase mysqlitedb;

    public DBCenturies(Context context)
    {
        mycontext = context;
    }

    private class DBHelper extends SQLiteOpenHelper
    {

        public DBHelper(Context context)
        {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db)
        {
            String queryStatement = "create table " + DATABASE_TABLE + " (" + KEY_CENTURY_NUMBER + " integer not null primary key, "
                    + KEY_FORMAT + " text not null, "
                    + KEY_OPPONENT + " text not null, "
                    + KEY_SERIES + " text not null, "
                    + KEY_RUNS + " integer not null, "
                    + KEY_BALLS + " integer not null, "
                    + KEY_4S + " integer not null, "
                    + KEY_6S + " integer not null, "
                    + KEY_STRIKE_RATE + " float  not null, "
                    + KEY_VENUE + " text not null, "
                    + KEY_DATE + " text not null, "
                    + KEY_RESULT + " text not null);"
                    ;

            db.execSQL(queryStatement);

            ContentValues cv = new ContentValues();

            /* Century Number : 1 */
            cv.put(KEY_CENTURY_NUMBER,1);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"England");
            cv.put(KEY_SERIES,"India in England Test Series 1990 - 2nd Test");
            cv.put(KEY_RUNS,119);
            cv.put(KEY_BALLS,189);
            cv.put(KEY_4S,17);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,62.96);
            cv.put(KEY_VENUE,"Old Trafford, Manchester");
            cv.put(KEY_DATE,"14 August 1990");
            cv.put(KEY_RESULT,"Match Drawn");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 2 */
            cv.put(KEY_CENTURY_NUMBER,2);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"Australia");
            cv.put(KEY_SERIES,"India in Australia Test Series 1991/92 - 3rd Test");
            cv.put(KEY_RUNS,148);
            cv.put(KEY_BALLS,213);
            cv.put(KEY_4S,14);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,69.48);
            cv.put(KEY_VENUE,"Sydney Cricket Ground, Sydney");
            cv.put(KEY_DATE,"5 January 1992");
            cv.put(KEY_RESULT,"Match Drawn");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 3 */
            cv.put(KEY_CENTURY_NUMBER,3);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"Australia");
            cv.put(KEY_SERIES,"India in Australia Test Series 1991/92 - 5th Test");
            cv.put(KEY_RUNS,114);
            cv.put(KEY_BALLS,161);
            cv.put(KEY_4S,16);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,70.80);
            cv.put(KEY_VENUE,"WACA, Perth");
            cv.put(KEY_DATE,"3 February 1992");
            cv.put(KEY_RESULT,"Australia won by 300 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 4 */
            cv.put(KEY_CENTURY_NUMBER,4);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"South Africa");
            cv.put(KEY_SERIES,"India in South Africa Test Series 1992/93 - 2nd Test");
            cv.put(KEY_RUNS,111);
            cv.put(KEY_BALLS,270);
            cv.put(KEY_4S,19);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,41.11);
            cv.put(KEY_VENUE,"New Wanderers Stadium, Johannesburg");
            cv.put(KEY_DATE,"28 November 1992");
            cv.put(KEY_RESULT,"Match Drawn");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 5 */
            cv.put(KEY_CENTURY_NUMBER,5);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"England");
            cv.put(KEY_SERIES,"England in India Test Series 1992/93 - 2nd Test");
            cv.put(KEY_RUNS,165);
            cv.put(KEY_BALLS,296);
            cv.put(KEY_4S,24);
            cv.put(KEY_6S,1);
            cv.put(KEY_STRIKE_RATE,55.74);
            cv.put(KEY_VENUE,"MA Chidambaram Stadium, Chennai");
            cv.put(KEY_DATE,"12 February 1993");
            cv.put(KEY_RESULT,"India won by an innings and 22 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 6 */
            cv.put(KEY_CENTURY_NUMBER,6);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"Sri Lanka");
            cv.put(KEY_SERIES,"India in Sri Lanka Test Series 1993/94 - 2nd Test");
            cv.put(KEY_RUNS,104);
            cv.put(KEY_BALLS,161);
            cv.put(KEY_4S,11);
            cv.put(KEY_6S,1);
            cv.put(KEY_STRIKE_RATE,64.59);
            cv.put(KEY_VENUE,"Sinhalese Sports Club Ground, Colombo");
            cv.put(KEY_DATE,"31 July 1993");
            cv.put(KEY_RESULT,"India won by 235 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 7 */
            cv.put(KEY_CENTURY_NUMBER,7);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"Sri Lanka");
            cv.put(KEY_SERIES,"Sri Lanka in India Test Series 1993/94 - 1st Test");
            cv.put(KEY_RUNS,142);
            cv.put(KEY_BALLS,224);
            cv.put(KEY_4S,22);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,63.39);
            cv.put(KEY_VENUE,"KD Singh Babu Stadium, Lucknow");
            cv.put(KEY_DATE,"19 January 1994");
            cv.put(KEY_RESULT,"India won by an innings and 119 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 8 */
            cv.put(KEY_CENTURY_NUMBER,8);
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Australia");
            cv.put(KEY_SERIES,"Singer World Series 1994 - 3rd Match");
            cv.put(KEY_RUNS,110);
            cv.put(KEY_BALLS,130);
            cv.put(KEY_4S,8);
            cv.put(KEY_6S,2);
            cv.put(KEY_STRIKE_RATE,84.61);
            cv.put(KEY_VENUE,"R Premadasa Stadium, Colombo");
            cv.put(KEY_DATE,"9 September 1994");
            cv.put(KEY_RESULT,"India won by 31 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 9 */
            cv.put(KEY_CENTURY_NUMBER,9);
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"New Zealand");
            cv.put(KEY_SERIES,"Wills World Series 1994/95 - 3rd Match");
            cv.put(KEY_RUNS,115);
            cv.put(KEY_BALLS,136);
            cv.put(KEY_4S,9);
            cv.put(KEY_6S,3);
            cv.put(KEY_STRIKE_RATE,84.55);
            cv.put(KEY_VENUE,"IPCL Sports Complex Ground, Vadodara");
            cv.put(KEY_DATE,"28 October 1994");
            cv.put(KEY_RESULT,"India won by 7 wickets (with 11 balls remaining)");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 10 */
            cv.put(KEY_CENTURY_NUMBER,10);
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"West Indies");
            cv.put(KEY_SERIES,"West Indies in India ODI Series 1994/95 - 5th ODI");
            cv.put(KEY_RUNS,105);
            cv.put(KEY_BALLS,134);
            cv.put(KEY_4S,10);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,78.35);
            cv.put(KEY_VENUE,"Sawai Man Singh Stadium, Jaipur");
            cv.put(KEY_DATE,"11 November 1994");
            cv.put(KEY_RESULT,"India won by 5 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 11 */
            cv.put(KEY_CENTURY_NUMBER,11);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"West Indies");
            cv.put(KEY_SERIES,"West Indies in India Test Series 1994/95 - 2nd Test");
            cv.put(KEY_RUNS,179);
            cv.put(KEY_BALLS,322);
            cv.put(KEY_4S,24);
            cv.put(KEY_6S,1);
            cv.put(KEY_STRIKE_RATE,55.59);
            cv.put(KEY_VENUE,"Vidarbha Cricket Association Stadium, Jamtha, Nagpur");
            cv.put(KEY_DATE,"2 December 1994");
            cv.put(KEY_RESULT,"Match Drawn");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 12 */
            cv.put(KEY_CENTURY_NUMBER,12);
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Sri Lanka");
            cv.put(KEY_SERIES,"Pepsi Asia Cup 1994/95 - 5th Match");
            cv.put(KEY_RUNS,112);
            cv.put(KEY_BALLS,107);
            cv.put(KEY_4S,15);
            cv.put(KEY_6S,1);
            cv.put(KEY_STRIKE_RATE,104.67);
            cv.put(KEY_VENUE,"Sharjah Cricket Association Stadium, Sharjah");
            cv.put(KEY_DATE,"9 April 1995");
            cv.put(KEY_RESULT,"India won by 8 wickets (with 101 balls remaining)");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 13 */
            cv.put(KEY_CENTURY_NUMBER,13);
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Kenya");
            cv.put(KEY_SERIES,"Wills World Cup 1995/96 - 6th Match");
            cv.put(KEY_RUNS,127);
            cv.put(KEY_BALLS,138);
            cv.put(KEY_4S,15);
            cv.put(KEY_6S,1);
            cv.put(KEY_STRIKE_RATE,92.02);
            cv.put(KEY_VENUE,"Barabati Stadium, Cuttack");
            cv.put(KEY_DATE,"18 February 1996");
            cv.put(KEY_RESULT,"India won by 7 wickets (with 49 balls remaining)");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 14 */
            cv.put(KEY_CENTURY_NUMBER,14);
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Sri Lanka");
            cv.put(KEY_SERIES,"Wills World Cup 1995/96 - 24th Match");
            cv.put(KEY_RUNS,137);
            cv.put(KEY_BALLS,137);
            cv.put(KEY_4S,8);
            cv.put(KEY_6S,5);
            cv.put(KEY_STRIKE_RATE,100.00);
            cv.put(KEY_VENUE,"Feroz Shah Kotla, New Delhi");
            cv.put(KEY_DATE,"2 March 1996");
            cv.put(KEY_RESULT,"Sri Lanka won by 6 wickets (with 8 balls remaining)");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 15 */
            cv.put(KEY_CENTURY_NUMBER,15);
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Pakistan");
            cv.put(KEY_SERIES,"Singer Cup 1995/96 - 3rd Match");
            cv.put(KEY_RUNS,100);
            cv.put(KEY_BALLS,111);
            cv.put(KEY_4S,9);
            cv.put(KEY_6S,1);
            cv.put(KEY_STRIKE_RATE,90.09);
            cv.put(KEY_VENUE,"The Padang, Singapore");
            cv.put(KEY_DATE,"5 April 1996");
            cv.put(KEY_RESULT,"Pakistan won by 8 wickets (with 30 balls remaining) (revised target)");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 16 */
            cv.put(KEY_CENTURY_NUMBER,16);
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Pakistan");
            cv.put(KEY_SERIES,"Pepsi Sharjah Cup 1995/96 - 4th Match");
            cv.put(KEY_RUNS,118);
            cv.put(KEY_BALLS,140);
            cv.put(KEY_4S,8);
            cv.put(KEY_6S,2);
            cv.put(KEY_STRIKE_RATE,84.28);
            cv.put(KEY_VENUE,"Sharjah Cricket Association Stadium, Sharjah");
            cv.put(KEY_DATE,"15 April 1996");
            cv.put(KEY_RESULT,"India won by 28 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 17 */
            cv.put(KEY_CENTURY_NUMBER,17);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"England");
            cv.put(KEY_SERIES,"India in England Test Series 1996 - 1st Test");
            cv.put(KEY_RUNS,122);
            cv.put(KEY_BALLS,177);
            cv.put(KEY_4S,19);
            cv.put(KEY_6S,1);
            cv.put(KEY_STRIKE_RATE,68.92);
            cv.put(KEY_VENUE,"Edgbaston, Birmingham");
            cv.put(KEY_DATE,"8 June 1996");
            cv.put(KEY_RESULT,"England won by 8 wickets");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 18 */
            cv.put(KEY_CENTURY_NUMBER,18);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"England");
            cv.put(KEY_SERIES,"India in England Test Series 1996 - 3rd Match");
            cv.put(KEY_RUNS,177);
            cv.put(KEY_BALLS,360);
            cv.put(KEY_4S,26);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,49.16);
            cv.put(KEY_VENUE,"Trent Bridge, Nottingham");
            cv.put(KEY_DATE,"5 July 1996");
            cv.put(KEY_RESULT,"Match Drawn");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 19 */
            cv.put(KEY_CENTURY_NUMBER,19);
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Sri Lanka");
            cv.put(KEY_SERIES,"Singer World Series 1996 - 2nd match");
            cv.put(KEY_RUNS,110);
            cv.put(KEY_BALLS,138);
            cv.put(KEY_4S,5);
            cv.put(KEY_6S,1);
            cv.put(KEY_STRIKE_RATE,79.71);
            cv.put(KEY_VENUE,"R Premadasa Stadium, Colombo");
            cv.put(KEY_DATE,"28 August 1996");
            cv.put(KEY_RESULT,"Sri Lanka won by 9 wickets (with 34 balls remaining)");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 20 */
            cv.put(KEY_CENTURY_NUMBER,20);
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"South Africa");
            cv.put(KEY_SERIES,"Mohinder Amarnath Benefit Match 1996/97");
            cv.put(KEY_RUNS,114);
            cv.put(KEY_BALLS,126);
            cv.put(KEY_4S,14);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,90.47);
            cv.put(KEY_VENUE,"Wankhede Stadium, Mumbai");
            cv.put(KEY_DATE,"14 December 1996");
            cv.put(KEY_RESULT,"India won by 74 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 21 */
            cv.put(KEY_CENTURY_NUMBER,21);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"South Africa");
            cv.put(KEY_SERIES,"India in South Africa Test Series 1996/97 - 2nd Test");
            cv.put(KEY_RUNS,169);
            cv.put(KEY_BALLS,254);
            cv.put(KEY_4S,26);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,66.53);
            cv.put(KEY_VENUE,"Newlands, Cape Town");
            cv.put(KEY_DATE,"4 January 1997");
            cv.put(KEY_RESULT,"South Africa won by 282 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 22 */
            cv.put(KEY_CENTURY_NUMBER,22);
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Zimbabwe");
            cv.put(KEY_SERIES,"Standard Bank International One-Day Series 1996/97 - 9th match");
            cv.put(KEY_RUNS,104);
            cv.put(KEY_BALLS,97);
            cv.put(KEY_4S,8);
            cv.put(KEY_6S,1);
            cv.put(KEY_STRIKE_RATE,107.21);
            cv.put(KEY_VENUE,"Willowmoore Park, Benoni");
            cv.put(KEY_DATE,"9 February 1997");
            cv.put(KEY_RESULT,"India won by 6 wickets (with 64 balls remaining)");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 23 */
            cv.put(KEY_CENTURY_NUMBER,23);
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"New Zealand");
            cv.put(KEY_SERIES,"Pepsi Independence Cup 1997 - 3rd match");
            cv.put(KEY_RUNS,117);
            cv.put(KEY_BALLS,137);
            cv.put(KEY_4S,13);
            cv.put(KEY_6S,2);
            cv.put(KEY_STRIKE_RATE,85.40);
            cv.put(KEY_VENUE,"M Chinnaswamy Stadium, Bangalore");
            cv.put(KEY_DATE,"14 May 1997");
            cv.put(KEY_RESULT,"India won by 8 wickets (with 45 balls remaining)");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 24 */
            cv.put(KEY_CENTURY_NUMBER,24);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"Sri Lanka");
            cv.put(KEY_SERIES,"India in Sri Lanka Test Series 1997/98 - 1st Test");
            cv.put(KEY_RUNS,143);
            cv.put(KEY_BALLS,247);
            cv.put(KEY_4S,20);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,57.89);
            cv.put(KEY_VENUE,"R Premadasa Stadium, Colombo");
            cv.put(KEY_DATE,"3 August 1997");
            cv.put(KEY_RESULT,"Match Drawn");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 25 */
            cv.put(KEY_CENTURY_NUMBER,25);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"Sri Lanka");
            cv.put(KEY_SERIES,"India in Sri Lanka Test Series 1997/98 - 2nd Test");
            cv.put(KEY_RUNS,139);
            cv.put(KEY_BALLS,266);
            cv.put(KEY_4S,16);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,52.25);
            cv.put(KEY_VENUE,"Sinhalese Sports Club Ground, Colombo");
            cv.put(KEY_DATE,"10 August 1997");
            cv.put(KEY_RESULT,"Match Drawn");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 26 */
            cv.put(KEY_CENTURY_NUMBER,26);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"Sri Lanka");
            cv.put(KEY_SERIES,"Sri Lanka in India Test Series 1997/98 - 3rd Test");
            cv.put(KEY_RUNS,148);
            cv.put(KEY_BALLS,244);
            cv.put(KEY_4S,20);
            cv.put(KEY_6S,3);
            cv.put(KEY_STRIKE_RATE,60.65);
            cv.put(KEY_VENUE,"Wankhede Stadium, Mumbai");
            cv.put(KEY_DATE,"4 December 1997");
            cv.put(KEY_RESULT,"Match Drawn");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 27 */
            cv.put(KEY_CENTURY_NUMBER,27);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"Australia");
            cv.put(KEY_SERIES,"Border-Gavaskar Trophy 1997/98 - 1st Test");
            cv.put(KEY_RUNS,155);
            cv.put(KEY_BALLS,191);
            cv.put(KEY_4S,14);
            cv.put(KEY_6S,4);
            cv.put(KEY_STRIKE_RATE,81.15);
            cv.put(KEY_VENUE,"MA Chidambaram Stadium");
            cv.put(KEY_DATE,"9 March 1998");
            cv.put(KEY_RESULT,"India won by 179 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 28 */
            cv.put(KEY_CENTURY_NUMBER,28);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"Australia");
            cv.put(KEY_SERIES,"Border-Gavaskar Trophy 1997/98 - 3rd Test");
            cv.put(KEY_RUNS,177);
            cv.put(KEY_BALLS,207);
            cv.put(KEY_4S,29);
            cv.put(KEY_6S,3);
            cv.put(KEY_STRIKE_RATE,85.50);
            cv.put(KEY_VENUE,"M Chinnaswamy Stadium, Bangalore");
            cv.put(KEY_DATE,"25 March 1998");
            cv.put(KEY_RESULT,"Australia won by 8 wickets");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 29 */
            cv.put(KEY_CENTURY_NUMBER,29);
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Australia");
            cv.put(KEY_SERIES,"Pepsi Triangular Series 1997/98 - 4th match");
            cv.put(KEY_RUNS,100);
            cv.put(KEY_BALLS,89);
            cv.put(KEY_4S,5);
            cv.put(KEY_6S,7);
            cv.put(KEY_STRIKE_RATE,112.35);
            cv.put(KEY_VENUE,"Green Park, Kanpur");
            cv.put(KEY_DATE,"7 April 1998");
            cv.put(KEY_RESULT,"India won by 6 wickets (with 33 balls remaining)");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 30 */
            cv.put(KEY_CENTURY_NUMBER,30);
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Australia");
            cv.put(KEY_SERIES,"Coca-Cola Cup 1997/98 - 6th match");
            cv.put(KEY_RUNS,143);
            cv.put(KEY_BALLS,131);
            cv.put(KEY_4S,9);
            cv.put(KEY_6S,5);
            cv.put(KEY_STRIKE_RATE,109.16);
            cv.put(KEY_VENUE,"Sharjah Cricket Association, Sharjah");
            cv.put(KEY_DATE,"22 April 1998");
            cv.put(KEY_RESULT,"Australia won by 26 runs (revised target)");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 31 */
            cv.put(KEY_CENTURY_NUMBER,31);
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Australia");
            cv.put(KEY_SERIES,"Coca-Cola Cup 1997/98 - Final");
            cv.put(KEY_RUNS,134);
            cv.put(KEY_BALLS,131);
            cv.put(KEY_4S,12);
            cv.put(KEY_6S,3);
            cv.put(KEY_STRIKE_RATE,102.29);
            cv.put(KEY_VENUE,"Sharjah Cricket Association, Sharjah");
            cv.put(KEY_DATE,"24 April 1998");
            cv.put(KEY_RESULT,"India won by 6 wickets (with 9 balls remaining)");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 32 */
            cv.put(KEY_CENTURY_NUMBER,32);
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Kenya");
            cv.put(KEY_SERIES,"Coca-Cola Triangular Series 1998 - Final");
            cv.put(KEY_RUNS,100);
            cv.put(KEY_BALLS,103);
            cv.put(KEY_4S,13);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,97.08);
            cv.put(KEY_VENUE,"Eden Gardens, Kolkata");
            cv.put(KEY_DATE,"31 May 1998");
            cv.put(KEY_RESULT,"India won by 9 wickets (with 90 balls remaining)");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 33 */
            cv.put(KEY_CENTURY_NUMBER,33);
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Sri Lanka");
            cv.put(KEY_SERIES,"Singer-Akai Nidahas Trophy 1998 - Final");
            cv.put(KEY_RUNS,128);
            cv.put(KEY_BALLS,131);
            cv.put(KEY_4S,8);
            cv.put(KEY_6S,2);
            cv.put(KEY_STRIKE_RATE,97.70);
            cv.put(KEY_VENUE,"R Premadasa Stadium, Colombo");
            cv.put(KEY_DATE,"7 July 1998");
            cv.put(KEY_RESULT,"India won by 6 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 34 */
            cv.put(KEY_CENTURY_NUMBER,34);
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Zimbabwe");
            cv.put(KEY_SERIES,"India in Zimbabwe ODI Series 1998/99 - 1st ODI");
            cv.put(KEY_RUNS,127);
            cv.put(KEY_BALLS,130);
            cv.put(KEY_4S,13);
            cv.put(KEY_6S,1);
            cv.put(KEY_STRIKE_RATE,97.69);
            cv.put(KEY_VENUE,"Queens Sports Club, Bulawayo");
            cv.put(KEY_DATE,"26 September 1998");
            cv.put(KEY_RESULT,"India won by 8 wickets (with 46 balls remaining)");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 35 */
            cv.put(KEY_CENTURY_NUMBER,35);
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Australia");
            cv.put(KEY_SERIES,"Wills International Cup 1998/99 - 3rd Quarter Final");
            cv.put(KEY_RUNS,141);
            cv.put(KEY_BALLS,128);
            cv.put(KEY_4S,13);
            cv.put(KEY_6S,3);
            cv.put(KEY_STRIKE_RATE,110.15);
            cv.put(KEY_VENUE,"Bangabandhu National Stadium, Dhaka");
            cv.put(KEY_DATE,"28 October 1998");
            cv.put(KEY_RESULT,"India won by 44 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 36 */
            cv.put(KEY_CENTURY_NUMBER,36);
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Zimbabwe");
            cv.put(KEY_SERIES,"Coca-Cola Champions Trophy 1998/99 - 3rd match");
            cv.put(KEY_RUNS,118);
            cv.put(KEY_BALLS,112);
            cv.put(KEY_4S,14);
            cv.put(KEY_6S,2);
            cv.put(KEY_STRIKE_RATE,105.35);
            cv.put(KEY_VENUE,"Sharjah Cricket Association Stadium, Sharjah");
            cv.put(KEY_DATE,"8 November 1998");
            cv.put(KEY_RESULT,"India won by 7 wickets (with 56 balls remaining)");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 37 */
            cv.put(KEY_CENTURY_NUMBER,37);
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Zimbabwe");
            cv.put(KEY_SERIES,"Coca-Cola Champions Trophy 1998/99 - Final");
            cv.put(KEY_RUNS,124);
            cv.put(KEY_BALLS,92);
            cv.put(KEY_4S,12);
            cv.put(KEY_6S,6);
            cv.put(KEY_STRIKE_RATE,132.78);
            cv.put(KEY_VENUE,"Sharjah Cricket Association Stadium, Sharjah");
            cv.put(KEY_DATE,"13 November 1998");
            cv.put(KEY_RESULT,"India won by 10 wickets (with 120 balls remaining)");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 38 */
            cv.put(KEY_CENTURY_NUMBER,38);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"New Zealand");
            cv.put(KEY_SERIES,"India in New Zealand Test Series 1998/99 - 2nd Test");
            cv.put(KEY_RUNS,113);
            cv.put(KEY_BALLS,151);
            cv.put(KEY_4S,13);
            cv.put(KEY_6S,2);
            cv.put(KEY_STRIKE_RATE,74.83);
            cv.put(KEY_VENUE,"Basin Reserve, Wellington");
            cv.put(KEY_DATE,"29 December 1998");
            cv.put(KEY_RESULT,"New Zealand won by 4 wickets");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 39 */
            cv.put(KEY_CENTURY_NUMBER,39);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"Pakistan");
            cv.put(KEY_SERIES,"Pakistan in India Test Series 1998/99 - 1st Test");
            cv.put(KEY_RUNS,136);
            cv.put(KEY_BALLS,273);
            cv.put(KEY_4S,18);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,49.81);
            cv.put(KEY_VENUE,"MA Chidambaram Stadium, Chennai");
            cv.put(KEY_DATE,"31 January 1999");
            cv.put(KEY_RESULT,"Pakistan won by 12 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 40 */
            cv.put(KEY_CENTURY_NUMBER,40);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"Sri Lanka");
            cv.put(KEY_SERIES,"Asian Test Championship 1998/99 - 2nd Match");
            cv.put(KEY_RUNS,124);
            cv.put(KEY_BALLS,235);
            cv.put(KEY_4S,10);
            cv.put(KEY_6S,1);
            cv.put(KEY_STRIKE_RATE,52.76);
            cv.put(KEY_VENUE,"Sinhalese Sports Club Ground, Colombo");
            cv.put(KEY_DATE,"28 February 1999");
            cv.put(KEY_RESULT,"Match Drawn");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 41 */
            cv.put(KEY_CENTURY_NUMBER,41);
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Kenya");
            cv.put(KEY_SERIES,"ICC World Cup 1999 - 15th Match, Group A");
            cv.put(KEY_RUNS,140);
            cv.put(KEY_BALLS,101);
            cv.put(KEY_4S,16);
            cv.put(KEY_6S,3);
            cv.put(KEY_STRIKE_RATE,138.61);
            cv.put(KEY_VENUE,"County Ground, Bristol");
            cv.put(KEY_DATE,"23 May 1999");
            cv.put(KEY_RESULT,"India won by 94 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 42 */
            cv.put(KEY_CENTURY_NUMBER,42);
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Sri Lanka");
            cv.put(KEY_SERIES,"Aiwa Cup 1999 - 6th Match");
            cv.put(KEY_RUNS,120);
            cv.put(KEY_BALLS,141);
            cv.put(KEY_4S,11);
            cv.put(KEY_6S,2);
            cv.put(KEY_STRIKE_RATE,85.10);
            cv.put(KEY_VENUE,"Sinhalese Sports Club Ground, Colombo");
            cv.put(KEY_DATE,"29 August 1999");
            cv.put(KEY_RESULT,"India won by 23 runs (D/L method)");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 43 */
            cv.put(KEY_CENTURY_NUMBER,43);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"New Zealand");
            cv.put(KEY_SERIES,"New Zealand in India Test Series 1999/00 - 1st Test");
            cv.put(KEY_RUNS,126);
            cv.put(KEY_BALLS,248);
            cv.put(KEY_4S,14);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,50.80);
            cv.put(KEY_VENUE,"PCA Stadium, Mohali");
            cv.put(KEY_DATE,"13 October 1999");
            cv.put(KEY_RESULT,"Match Drawn");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 44 */
            cv.put(KEY_CENTURY_NUMBER,44);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"New Zealand");
            cv.put(KEY_SERIES,"New Zealand in India Test Series 1999/00 - 3rd Test");
            cv.put(KEY_RUNS,217);
            cv.put(KEY_BALLS,344);
            cv.put(KEY_4S,29);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,63.08);
            cv.put(KEY_VENUE,"Sardar Patel Stadium, Ahmedabad");
            cv.put(KEY_DATE,"29 October 1999");
            cv.put(KEY_RESULT,"Match Drawn");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 45 */
            cv.put(KEY_CENTURY_NUMBER,45);
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"New Zealand");
            cv.put(KEY_SERIES,"New Zealand in India ODI Series 1999/00 - 2nd ODI");
            cv.put(KEY_RUNS,186);
            cv.put(KEY_BALLS,150);
            cv.put(KEY_4S,20);
            cv.put(KEY_6S,3);
            cv.put(KEY_STRIKE_RATE,124.00);
            cv.put(KEY_VENUE,"Lal Bahadur Shastri Stadium, Hyderabad");
            cv.put(KEY_DATE,"8 November 1999");
            cv.put(KEY_RESULT,"India won by 174 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 46 */
            cv.put(KEY_CENTURY_NUMBER,46);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"Australia");
            cv.put(KEY_SERIES,"Border-Gavaskar Trophy 1999/00 - 2nd Test");
            cv.put(KEY_RUNS,116);
            cv.put(KEY_BALLS,191);
            cv.put(KEY_4S,9);
            cv.put(KEY_6S,1);
            cv.put(KEY_STRIKE_RATE,60.73);
            cv.put(KEY_VENUE,"Melbourne Cricket Ground, Melbourne");
            cv.put(KEY_DATE,"28 December 1999");
            cv.put(KEY_RESULT,"Australia won by 180 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 47 */
            cv.put(KEY_CENTURY_NUMBER,47);
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"South Africa");
            cv.put(KEY_SERIES,"South Africa in India ODI Series 1999/00 - 4th ODI");
            cv.put(KEY_RUNS,122);
            cv.put(KEY_BALLS,138);
            cv.put(KEY_4S,12);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,88.40);
            cv.put(KEY_VENUE,"IPCL Sports Complex Ground, Vadodara");
            cv.put(KEY_DATE,"17 March 2000");
            cv.put(KEY_RESULT,"India won by 4 wickets (with 1 ball remaining)");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 48 */
            cv.put(KEY_CENTURY_NUMBER,48);
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Sri Lanka");
            cv.put(KEY_SERIES,"Coca-Cola Champions Trophy 2000/01 - 1st match");
            cv.put(KEY_RUNS,101);
            cv.put(KEY_BALLS,140);
            cv.put(KEY_4S,3);
            cv.put(KEY_6S,1);
            cv.put(KEY_STRIKE_RATE,72.14);
            cv.put(KEY_VENUE,"Sharjah Cricket Association Stadium, Sharjah");
            cv.put(KEY_DATE,"20 October 2000");
            cv.put(KEY_RESULT,"Sri Lanka won by 5 wickets (with 37 balls remaining)");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 49 */
            cv.put(KEY_CENTURY_NUMBER,49);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"Zimbabwe");
            cv.put(KEY_SERIES,"Zimbabwe in India Test Series 2000/01 - 1st Test");
            cv.put(KEY_RUNS,122);
            cv.put(KEY_BALLS,233);
            cv.put(KEY_4S,19);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,52.36);
            cv.put(KEY_VENUE,"Feroz Shah Kotla, New Delhi");
            cv.put(KEY_DATE,"21 November 2000");
            cv.put(KEY_RESULT,"India won by 7 wickets");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 50 */
            cv.put(KEY_CENTURY_NUMBER,50);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"Zimbabwe");
            cv.put(KEY_SERIES,"Zimbabwe in India Test Series 2000/01 - 2nd Test");
            cv.put(KEY_RUNS,201);
            cv.put(KEY_BALLS,281);
            cv.put(KEY_4S,27);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,71.53);
            cv.put(KEY_VENUE,"Vidarbha Cricket Association Stadium, Jamtha, Nagpur");
            cv.put(KEY_DATE,"26 November 2000");
            cv.put(KEY_RESULT,"Match Drawn");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 51 */
            cv.put(KEY_CENTURY_NUMBER,51);
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Zimbabwe");
            cv.put(KEY_SERIES,"Zimbabwe in India ODI Series 2000/01 - 3rd ODI");
            cv.put(KEY_RUNS,146);
            cv.put(KEY_BALLS,153);
            cv.put(KEY_4S,15);
            cv.put(KEY_6S,2);
            cv.put(KEY_STRIKE_RATE,95.42);
            cv.put(KEY_VENUE,"Barkatullah Khan Stadium, Jodhpur");
            cv.put(KEY_DATE,"8 December 2000");
            cv.put(KEY_RESULT,"Zimbabwe won by 1 wicket (with 1 ball remaining)");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 52 */
            cv.put(KEY_CENTURY_NUMBER,52);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"Australia");
            cv.put(KEY_SERIES,"Border-Gavaskar Trophy 2000/01 - 3rd Test");
            cv.put(KEY_RUNS,126);
            cv.put(KEY_BALLS,230);
            cv.put(KEY_4S,15);
            cv.put(KEY_6S,2);
            cv.put(KEY_STRIKE_RATE,54.78);
            cv.put(KEY_VENUE,"MA Chidambaramm Stadium, Chennai");
            cv.put(KEY_DATE,"20 March 2001");
            cv.put(KEY_RESULT,"India won by 2 wickets");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 53 */
            cv.put(KEY_CENTURY_NUMBER,53);
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Australia");
            cv.put(KEY_SERIES,"Australia in India ODI Series 2000/01 - 3rd ODI");
            cv.put(KEY_RUNS,139);
            cv.put(KEY_BALLS,125);
            cv.put(KEY_4S,19);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,111.20);
            cv.put(KEY_VENUE," Nehru Stadium, Indore");
            cv.put(KEY_DATE,"31 March 2001");
            cv.put(KEY_RESULT,"India won by 118 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 54 */
            cv.put(KEY_CENTURY_NUMBER,54);
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"West Indies");
            cv.put(KEY_SERIES,"Coca-Cola Cup 2001 - 6th match");
            cv.put(KEY_RUNS,122);
            cv.put(KEY_BALLS,131);
            cv.put(KEY_4S,12);
            cv.put(KEY_6S,1);
            cv.put(KEY_STRIKE_RATE,93.12);
            cv.put(KEY_VENUE,"Harare Sports Club, Harare");
            cv.put(KEY_DATE,"4 July 2001");
            cv.put(KEY_RESULT,"India won by 6 wickets (with 11 balls remaining)");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 55 */
            cv.put(KEY_CENTURY_NUMBER,55);
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"South Africa");
            cv.put(KEY_SERIES,"Standard Bank Triangular Tournament 2001/02 - 1st Match");
            cv.put(KEY_RUNS,101);
            cv.put(KEY_BALLS,129);
            cv.put(KEY_4S,9);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,78.29);
            cv.put(KEY_VENUE,"New Wanderers Stadium, Johannesburg");
            cv.put(KEY_DATE,"5 October 2001");
            cv.put(KEY_RESULT,"South Africa won by 6 wickets (with 10 balls remaining)");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 56 */
            cv.put(KEY_CENTURY_NUMBER,56);
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Kenya");
            cv.put(KEY_SERIES,"Standard Bank Triangular Tournament 2001/02 - 9th Match");
            cv.put(KEY_RUNS,146);
            cv.put(KEY_BALLS,132);
            cv.put(KEY_4S,17);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,110.60);
            cv.put(KEY_VENUE,"Boland Bank Park, Paarl");
            cv.put(KEY_DATE,"24 October 2001");
            cv.put(KEY_RESULT,"India won by 186 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 57 */
            cv.put(KEY_CENTURY_NUMBER,57);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"South Africa");
            cv.put(KEY_SERIES,"India in South Africa Test Series 2001/02 - 1st Test");
            cv.put(KEY_RUNS,155);
            cv.put(KEY_BALLS,184);
            cv.put(KEY_4S,23);
            cv.put(KEY_6S,1);
            cv.put(KEY_STRIKE_RATE,84.23);
            cv.put(KEY_VENUE,"Goodyear Park, Bloemfontein");
            cv.put(KEY_DATE,"3 November 2001");
            cv.put(KEY_RESULT,"South Africa won by 9 wickets");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 58 */
            cv.put(KEY_CENTURY_NUMBER,58);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"England");
            cv.put(KEY_SERIES,"England in India Test Series 2001/02 - 2nd Test");
            cv.put(KEY_RUNS,103);
            cv.put(KEY_BALLS,197);
            cv.put(KEY_4S,12);
            cv.put(KEY_6S,1);
            cv.put(KEY_STRIKE_RATE,52.28);
            cv.put(KEY_VENUE,"Sardar Patel Stadium, Motera, Ahmedabad");
            cv.put(KEY_DATE,"13 December 2001");
            cv.put(KEY_RESULT,"Match Drawn");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 59 */
            cv.put(KEY_CENTURY_NUMBER,59);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"Zimbabwe");
            cv.put(KEY_SERIES,"Zimbabwe in India Test Series 2001/02 - 1st Test");
            cv.put(KEY_RUNS,176);
            cv.put(KEY_BALLS,316);
            cv.put(KEY_4S,23);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,55.69);
            cv.put(KEY_VENUE,"Vidarbha Cricket Association Stadium, Jamtha, Nagpur");
            cv.put(KEY_DATE,"23 February 2002");
            cv.put(KEY_RESULT,"India won by an innings and 101 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 60 */
            cv.put(KEY_CENTURY_NUMBER,60);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"West Indies");
            cv.put(KEY_SERIES,"India in West Indies Test Series 2001/02 - 2nd Test");
            cv.put(KEY_RUNS,117);
            cv.put(KEY_BALLS,260);
            cv.put(KEY_4S,14);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,45.00);
            cv.put(KEY_VENUE,"Queen's Park Oval, Port of Spain, Trinidad");
            cv.put(KEY_DATE,"19 April 2002");
            cv.put(KEY_RESULT,"India won by 37 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 61 */
            cv.put(KEY_CENTURY_NUMBER,61);
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"England");
            cv.put(KEY_SERIES,"NatWest Bank Series 2002 - 5th Match");
            cv.put(KEY_RUNS,105);
            cv.put(KEY_BALLS,108);
            cv.put(KEY_4S,8);
            cv.put(KEY_6S,1);
            cv.put(KEY_STRIKE_RATE,97.22);
            cv.put(KEY_VENUE,"Riverside Ground, Chester-le-Street");
            cv.put(KEY_DATE,"4 July 2002");
            cv.put(KEY_RESULT,"No Result");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 62 */
            cv.put(KEY_CENTURY_NUMBER,62);
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Sri Lanka");
            cv.put(KEY_SERIES,"NatWest Bank Series 2002 - 9th Match");
            cv.put(KEY_RUNS,113);
            cv.put(KEY_BALLS,102);
            cv.put(KEY_4S,12);
            cv.put(KEY_6S,1);
            cv.put(KEY_STRIKE_RATE,110.78);
            cv.put(KEY_VENUE,"The Royal & Sun Alliance County Ground, Bristol");
            cv.put(KEY_DATE,"11 July 2002");
            cv.put(KEY_RESULT,"India won by 63 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 63 */
            cv.put(KEY_CENTURY_NUMBER,63);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"England");
            cv.put(KEY_SERIES,"India in England Test Series 2002 - 3rd Test");
            cv.put(KEY_RUNS,193);
            cv.put(KEY_BALLS,330);
            cv.put(KEY_4S,19);
            cv.put(KEY_6S,3);
            cv.put(KEY_STRIKE_RATE,58.48);
            cv.put(KEY_VENUE,"Headingley, Leeds");
            cv.put(KEY_DATE,"23 August 2002");
            cv.put(KEY_RESULT,"India won by an innings and 46 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 64 */
            cv.put(KEY_CENTURY_NUMBER,64);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"West Indies");
            cv.put(KEY_SERIES,"West Indies in India Test Series 2002/03 - 3rd Test");
            cv.put(KEY_RUNS,176);
            cv.put(KEY_BALLS,298);
            cv.put(KEY_4S,26);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,59.06);
            cv.put(KEY_VENUE,"Eden Gardens, Kolkata");
            cv.put(KEY_DATE,"2 November 2002");
            cv.put(KEY_RESULT,"Match Drawn");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 65 */
            cv.put(KEY_CENTURY_NUMBER,65);
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Namibia");
            cv.put(KEY_SERIES,"ICC World Cup 2002/03 - 25th Match, Pool A");
            cv.put(KEY_RUNS,152);
            cv.put(KEY_BALLS,151);
            cv.put(KEY_4S,18);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,100.66);
            cv.put(KEY_VENUE,"City Oval, Pietermaritzburg");
            cv.put(KEY_DATE,"23 February 2003");
            cv.put(KEY_RESULT,"India won by 181 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 66 */
            cv.put(KEY_CENTURY_NUMBER,66);
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Australia");
            cv.put(KEY_SERIES,"TVS Cup 2003/04 - 2nd Match");
            cv.put(KEY_RUNS,100);
            cv.put(KEY_BALLS,119);
            cv.put(KEY_4S,9);
            cv.put(KEY_6S,1);
            cv.put(KEY_STRIKE_RATE,84.03);
            cv.put(KEY_VENUE,"Captain Roop Singh Stadium, Gwalior");
            cv.put(KEY_DATE,"26 October 2003");
            cv.put(KEY_RESULT,"India won by 37 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 67 */
            cv.put(KEY_CENTURY_NUMBER,67);
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"New Zealand");
            cv.put(KEY_SERIES,"TVS Cup 2003/04 - 9th Match");
            cv.put(KEY_RUNS,102);
            cv.put(KEY_BALLS,91);
            cv.put(KEY_4S,12);
            cv.put(KEY_6S,1);
            cv.put(KEY_STRIKE_RATE,112.08);
            cv.put(KEY_VENUE,"Lal Bahadur Shastri Stadium, Hyderabad");
            cv.put(KEY_DATE,"15 November 2003");
            cv.put(KEY_RESULT,"India won by 145 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 68 */
            cv.put(KEY_CENTURY_NUMBER,68);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"Australia");
            cv.put(KEY_SERIES,"Border-Gavaskar Trophy 2003/04 - 4th Test");
            cv.put(KEY_RUNS,241);
            cv.put(KEY_BALLS,436);
            cv.put(KEY_4S,33);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,55.27);
            cv.put(KEY_VENUE,"Sydney Cricket Ground, Sydney");
            cv.put(KEY_DATE,"3 January 2004");
            cv.put(KEY_RESULT,"Match Drawn");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 69 */
            cv.put(KEY_CENTURY_NUMBER,69);
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Pakistan");
            cv.put(KEY_SERIES,"India in Pakistan ODI Series 2003/04 - 2nd ODI");
            cv.put(KEY_RUNS,141);
            cv.put(KEY_BALLS,135);
            cv.put(KEY_4S,17);
            cv.put(KEY_6S,1);
            cv.put(KEY_STRIKE_RATE,104.44);
            cv.put(KEY_VENUE,"Rawalpindi Cricket Stadium, Rawalpindi");
            cv.put(KEY_DATE,"16 March 2004");
            cv.put(KEY_RESULT,"Pakistan won by 12 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 70 */
            cv.put(KEY_CENTURY_NUMBER,70);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"Pakistan");
            cv.put(KEY_SERIES,"India in Pakistan Test Series 2003/04 - 1st Test");
            cv.put(KEY_RUNS,194);
            cv.put(KEY_BALLS,348);
            cv.put(KEY_4S,21);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,55.74);
            cv.put(KEY_VENUE,"Multan Cricket Stadium, Multan");
            cv.put(KEY_DATE,"29 March 2004");
            cv.put(KEY_RESULT,"India won by an innings and 52 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 71 */
            cv.put(KEY_CENTURY_NUMBER,71);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"Bangladesh");
            cv.put(KEY_SERIES,"India in Bangladesh Test Series 2004/05 - 1st Test");
            cv.put(KEY_RUNS,248);
            cv.put(KEY_BALLS,379);
            cv.put(KEY_4S,35);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,65.43);
            cv.put(KEY_VENUE,"Bangabandhu National Stadium, Dhaka");
            cv.put(KEY_DATE,"11 Deccemer 2004");
            cv.put(KEY_RESULT,"India won by an innings and 140 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 72 */
            cv.put(KEY_CENTURY_NUMBER,72);
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Pakistan");
            cv.put(KEY_SERIES,"Pakistan in India ODI Series 2005/05 - 4th ODI");
            cv.put(KEY_RUNS,123);
            cv.put(KEY_BALLS,130);
            cv.put(KEY_4S,12);
            cv.put(KEY_6S,2);
            cv.put(KEY_STRIKE_RATE,94.61);
            cv.put(KEY_VENUE,"Sardar Patel Stadium, Motera, Ahmedabad");
            cv.put(KEY_DATE,"12 April 2005");
            cv.put(KEY_RESULT,"Pakistan won by 3 wickets (with 0 balls remaining)");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 73 */
            cv.put(KEY_CENTURY_NUMBER,73);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"Sri Lanka");
            cv.put(KEY_SERIES,"Sri Lanka in India Test Series 2005/06 - 2nd Test");
            cv.put(KEY_RUNS,109);
            cv.put(KEY_BALLS,196);
            cv.put(KEY_4S,14);
            cv.put(KEY_6S,1);
            cv.put(KEY_STRIKE_RATE,55.61);
            cv.put(KEY_VENUE,"Feroz Sha Kotla, New Delhi");
            cv.put(KEY_DATE,"10 December 2005");
            cv.put(KEY_RESULT,"India won by 188 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 74 */
            cv.put(KEY_CENTURY_NUMBER,74);
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Pakistan");
            cv.put(KEY_SERIES,"India in Pakistan ODI Series 2005/06 - 1st ODI");
            cv.put(KEY_RUNS,100);
            cv.put(KEY_BALLS,113);
            cv.put(KEY_4S,10);
            cv.put(KEY_6S,1);
            cv.put(KEY_STRIKE_RATE,88.49);
            cv.put(KEY_VENUE,"Arbab Niaz Stadium, Peshawar");
            cv.put(KEY_DATE,"6 February 2006");
            cv.put(KEY_RESULT,"Pakistan won by 7 runs (D/L method)");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 75 */
            cv.put(KEY_CENTURY_NUMBER,75);
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"West Indies");
            cv.put(KEY_SERIES,"DLF Cup 2006/07 - 2nd Match");
            cv.put(KEY_RUNS,141);
            cv.put(KEY_BALLS,148);
            cv.put(KEY_4S,13);
            cv.put(KEY_6S,5);
            cv.put(KEY_STRIKE_RATE,95.27);
            cv.put(KEY_VENUE,"Kinrara Academy Oval, Kuala Lumpur");
            cv.put(KEY_DATE,"14 September 2006");
            cv.put(KEY_RESULT,"West Indies won by 29 runs (D/L method)");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 76 */
            cv.put(KEY_CENTURY_NUMBER,76);
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"West Indies");
            cv.put(KEY_SERIES,"West Indies in India ODI Series 2007/07 - 4th ODI");
            cv.put(KEY_RUNS,100);
            cv.put(KEY_BALLS,76);
            cv.put(KEY_4S,10);
            cv.put(KEY_6S,1);
            cv.put(KEY_STRIKE_RATE,131.57);
            cv.put(KEY_VENUE,"IPCL Sports Complex Ground, Vadodara");
            cv.put(KEY_DATE,"31 January 2007");
            cv.put(KEY_RESULT,"India won by 160 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 77 */
            cv.put(KEY_CENTURY_NUMBER,77);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"Bangladesh");
            cv.put(KEY_SERIES,"India in Bangladesh Test Series 2006/07 - 1st Test");
            cv.put(KEY_RUNS,101);
            cv.put(KEY_BALLS,169);
            cv.put(KEY_4S,9);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,59.76);
            cv.put(KEY_VENUE,"Bir Shrestha Shahid Ruhul Amin Stadium, Chittagong");
            cv.put(KEY_DATE,"19 May 2007");
            cv.put(KEY_RESULT,"Match Drawn");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 78 */
            cv.put(KEY_CENTURY_NUMBER,78);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"Bangladesh");
            cv.put(KEY_SERIES,"India in Bangladesh Test Series 2006/07  - 2nd Test");
            cv.put(KEY_RUNS,122);
            cv.put(KEY_BALLS,226);
            cv.put(KEY_4S,8);
            cv.put(KEY_6S,1);
            cv.put(KEY_STRIKE_RATE,53.98);
            cv.put(KEY_VENUE,"Shere Bangla National Stadium, Mirpur");
            cv.put(KEY_DATE,"26 May 2007");
            cv.put(KEY_RESULT,"India won by an innings and 239 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 79 */
            cv.put(KEY_CENTURY_NUMBER,79);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"Australia");
            cv.put(KEY_SERIES,"Border-Gavaskar Trophy 2007/08 - 2nd Test");
            cv.put(KEY_RUNS,154);
            cv.put(KEY_BALLS,243);
            cv.put(KEY_4S,14);
            cv.put(KEY_6S,1);
            cv.put(KEY_STRIKE_RATE,63.37);
            cv.put(KEY_VENUE,"Sydney Cricket Ground, Sydney");
            cv.put(KEY_DATE,"4 January 2008");
            cv.put(KEY_RESULT,"Australia won by 122 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 80 */
            cv.put(KEY_CENTURY_NUMBER,80);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"Australia");
            cv.put(KEY_SERIES,"Border-Gavaskar Trophy 2007/08 - 4th Test");
            cv.put(KEY_RUNS,153);
            cv.put(KEY_BALLS,205);
            cv.put(KEY_4S,13);
            cv.put(KEY_6S,3);
            cv.put(KEY_STRIKE_RATE,74.63);
            cv.put(KEY_VENUE,"Adelaide Ova, Adelaide");
            cv.put(KEY_DATE,"24 January 2008");
            cv.put(KEY_RESULT,"Match Drawn");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 81 */
            cv.put(KEY_CENTURY_NUMBER,81);
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Australia");
            cv.put(KEY_SERIES,"Commonwealth Bank Series 2007/08 - 1st Final");
            cv.put(KEY_RUNS,117);
            cv.put(KEY_BALLS,120);
            cv.put(KEY_4S,10);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,97.50);
            cv.put(KEY_VENUE,"Sydney Cricket Ground, Sydney");
            cv.put(KEY_DATE,"2 March 2008");
            cv.put(KEY_RESULT,"India won by 6 wickets (with 25 balls remaining)");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 82 */
            cv.put(KEY_CENTURY_NUMBER,82);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"Australia");
            cv.put(KEY_SERIES,"Border-Gavaskar Trophy 2008/09 - 4th Test");
            cv.put(KEY_RUNS,109);
            cv.put(KEY_BALLS,188);
            cv.put(KEY_4S,12);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,57.97);
            cv.put(KEY_VENUE," Vidarbha Cricket Association Stadium, Jamtha,  Nagpur");
            cv.put(KEY_DATE,"6 November 2008");
            cv.put(KEY_RESULT,"India won by 172 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 83 */
            cv.put(KEY_CENTURY_NUMBER,83);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"England");
            cv.put(KEY_SERIES,"England in India Test Series 2008/09 - 1st Test");
            cv.put(KEY_RUNS,103);
            cv.put(KEY_BALLS,196);
            cv.put(KEY_4S,9);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,52.55);
            cv.put(KEY_VENUE,"MA Chidambaram Stadium, Chennai");
            cv.put(KEY_DATE,"15 December 2008");
            cv.put(KEY_RESULT,"India won by 6 wickets");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 84 */
            cv.put(KEY_CENTURY_NUMBER,84);
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"New Zealand");
            cv.put(KEY_SERIES,"India in New Zealand ODI Series 2008/09 - 3rd ODI");
            cv.put(KEY_RUNS,163);
            cv.put(KEY_BALLS,133);
            cv.put(KEY_4S,16);
            cv.put(KEY_6S,5);
            cv.put(KEY_STRIKE_RATE,122.55);
            cv.put(KEY_VENUE,"AMI Stadium, Christchurch");
            cv.put(KEY_DATE,"8 March 2009");
            cv.put(KEY_RESULT,"India won by 58 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 85 */
            cv.put(KEY_CENTURY_NUMBER,85);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"New Zealand");
            cv.put(KEY_SERIES,"India in New Zealand Test Series 2008/09 - 1st Test");
            cv.put(KEY_RUNS,160);
            cv.put(KEY_BALLS,260);
            cv.put(KEY_4S,26);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,61.53);
            cv.put(KEY_VENUE,"Seddon Park, Hamilton");
            cv.put(KEY_DATE,"20 March 2009");
            cv.put(KEY_RESULT,"India won by 10 wickets");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 86 */
            cv.put(KEY_CENTURY_NUMBER,86);
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Sri Lanka");
            cv.put(KEY_SERIES,"Compaq Cup 2009 - Final");
            cv.put(KEY_RUNS,138);
            cv.put(KEY_BALLS,133);
            cv.put(KEY_4S,10);
            cv.put(KEY_6S,1);
            cv.put(KEY_STRIKE_RATE,103.75);
            cv.put(KEY_VENUE,"R Premadasa Stadium, Colombo");
            cv.put(KEY_DATE,"14 September 2009");
            cv.put(KEY_RESULT,"India won by 46 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 87 */
            cv.put(KEY_CENTURY_NUMBER,87);
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Australia");
            cv.put(KEY_SERIES,"Australia in India ODI Series 2009/10 - 5th ODI");
            cv.put(KEY_RUNS,175);
            cv.put(KEY_BALLS,141);
            cv.put(KEY_4S,19);
            cv.put(KEY_6S,4);
            cv.put(KEY_STRIKE_RATE,124.11);
            cv.put(KEY_VENUE,"Rajiv Gandhi International Stadium, Uppal, Hyderabad");
            cv.put(KEY_DATE,"5 November 2009");
            cv.put(KEY_RESULT,"Australia won by 3 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 88 */
            cv.put(KEY_CENTURY_NUMBER,88);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"Sri Lanka");
            cv.put(KEY_SERIES,"Sri Lanka in India Test Series 2009/10 - 1st Test");
            cv.put(KEY_RUNS,100);
            cv.put(KEY_BALLS,211);
            cv.put(KEY_4S,11);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,47.39);
            cv.put(KEY_VENUE," Sardar Patel Stadium, Ahmedabad");
            cv.put(KEY_DATE,"20 November 2009");
            cv.put(KEY_RESULT,"Match Drawn");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 89 */
            cv.put(KEY_CENTURY_NUMBER,89);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"Bangladesh");
            cv.put(KEY_SERIES,"India in Bangladesh Test Series 2009/10 - 1st Test");
            cv.put(KEY_RUNS,105);
            cv.put(KEY_BALLS,166);
            cv.put(KEY_4S,11);
            cv.put(KEY_6S,2);
            cv.put(KEY_STRIKE_RATE,63.25);
            cv.put(KEY_VENUE,"Zahur Ahmed Chowdhury Stadium, Chittagong");
            cv.put(KEY_DATE,"18 January 2010");
            cv.put(KEY_RESULT,"India won by 113 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 90 */
            cv.put(KEY_CENTURY_NUMBER,90);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"Bangladesh");
            cv.put(KEY_SERIES,"India in Bangladesh Test Series 2009/10 - 2st Test");
            cv.put(KEY_RUNS,143);
            cv.put(KEY_BALLS,182);
            cv.put(KEY_4S,13);
            cv.put(KEY_6S,1);
            cv.put(KEY_STRIKE_RATE,78.57);
            cv.put(KEY_VENUE,"Shere Bangla National Stadium, Mirpur");
            cv.put(KEY_DATE,"25 January 2010");
            cv.put(KEY_RESULT,"India won by 10 wickets");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 91 */
            cv.put(KEY_CENTURY_NUMBER,91);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"South Africa");
            cv.put(KEY_SERIES,"South Africa in India Test Series 2009/10 - 1st Test");
            cv.put(KEY_RUNS,100);
            cv.put(KEY_BALLS,179);
            cv.put(KEY_4S,13);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,55.86);
            cv.put(KEY_VENUE,"Vidarbha Cricket Association Stadium, Jamtha, Nagpur");
            cv.put(KEY_DATE,"9 February 2010");
            cv.put(KEY_RESULT,"South Africa won by an innings and 6 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 92 */
            cv.put(KEY_CENTURY_NUMBER,92);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"South Africa");
            cv.put(KEY_SERIES,"South Africa in India Test Series 2009/10 - 2nd Test");
            cv.put(KEY_RUNS,106);
            cv.put(KEY_BALLS,206);
            cv.put(KEY_4S,12);
            cv.put(KEY_6S,0);
            cv.put(KEY_STRIKE_RATE,51.45);
            cv.put(KEY_VENUE,"Eden Gardens, Kolkata");
            cv.put(KEY_DATE,"15 February 2010");
            cv.put(KEY_RESULT,"India won by an innings and 57 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 93 */
            cv.put(KEY_CENTURY_NUMBER,93);
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"South Africa");
            cv.put(KEY_SERIES,"South Africa in India ODI Series 2009/10 - 2nd ODI");
            cv.put(KEY_RUNS,200);
            cv.put(KEY_BALLS,147);
            cv.put(KEY_4S,25);
            cv.put(KEY_6S,3);
            cv.put(KEY_STRIKE_RATE,136.05);
            cv.put(KEY_VENUE,"Captain Roop Singh Stadium, Gwalior");
            cv.put(KEY_DATE,"24 February 2010");
            cv.put(KEY_RESULT,"India won by 153 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 94 */
            cv.put(KEY_CENTURY_NUMBER,94);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"Sri Lanka");
            cv.put(KEY_SERIES,"India in Sri Lanka Test Series 2010 - 2nd Test");
            cv.put(KEY_RUNS,203);
            cv.put(KEY_BALLS,347);
            cv.put(KEY_4S,23);
            cv.put(KEY_6S,1);
            cv.put(KEY_STRIKE_RATE,58.50);
            cv.put(KEY_VENUE,"Sinhalese Sports Club Ground, Colombo");
            cv.put(KEY_DATE,"28 July 2010");
            cv.put(KEY_RESULT,"Match Drawn");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 95 */
            cv.put(KEY_CENTURY_NUMBER,95);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"Australia");
            cv.put(KEY_SERIES,"Border-Gavaskar Trophy 2010/11 - 2nd Test");
            cv.put(KEY_RUNS,214);
            cv.put(KEY_BALLS,363);
            cv.put(KEY_4S,22);
            cv.put(KEY_6S,2);
            cv.put(KEY_STRIKE_RATE,58.95);
            cv.put(KEY_VENUE,"M Chinnaswamy Stadium, Bangalore");
            cv.put(KEY_DATE,"11 October 2010");
            cv.put(KEY_RESULT,"India won by 7 wickets");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 96 */
            cv.put(KEY_CENTURY_NUMBER,96);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"South Africa");
            cv.put(KEY_SERIES,"India in South Africa Test Series 2010/11 - 1st Test");
            cv.put(KEY_RUNS,111);
            cv.put(KEY_BALLS,241);
            cv.put(KEY_4S,13);
            cv.put(KEY_6S,1);
            cv.put(KEY_STRIKE_RATE,46.05);
            cv.put(KEY_VENUE,"SuperSport Park, Centurion");
            cv.put(KEY_DATE,"19 December 2010");
            cv.put(KEY_RESULT,"South Africa won by an innings and 25 runs");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 97 */
            cv.put(KEY_CENTURY_NUMBER,97);
            cv.put(KEY_FORMAT,"Test");
            cv.put(KEY_OPPONENT,"South Africa");
            cv.put(KEY_SERIES,"India in South Africa Test Series 2010/11 - 3rd Test");
            cv.put(KEY_RUNS,146);
            cv.put(KEY_BALLS,314);
            cv.put(KEY_4S,17);
            cv.put(KEY_6S,2);
            cv.put(KEY_STRIKE_RATE,46.49);
            cv.put(KEY_VENUE,"Newlands, Cape Town");
            cv.put(KEY_DATE,"4 January 2011");
            cv.put(KEY_RESULT,"Match drawn");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 98 */
            cv.put(KEY_CENTURY_NUMBER,98);
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"England");
            cv.put(KEY_SERIES,"ICC Cricket World Cup 2010/11 - 11th Match, Group B");
            cv.put(KEY_RUNS,120);
            cv.put(KEY_BALLS,115);
            cv.put(KEY_4S,10);
            cv.put(KEY_6S,5);
            cv.put(KEY_STRIKE_RATE,104.34);
            cv.put(KEY_VENUE,"M Chinnaswamy Stadium, Bangalore");
            cv.put(KEY_DATE,"27 February 2011");
            cv.put(KEY_RESULT,"Match Tied");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 99 */
            cv.put(KEY_CENTURY_NUMBER,99);
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"South Africa");
            cv.put(KEY_SERIES,"ICC Cricket World Cup 2010/11 - 29th Match, Group B");
            cv.put(KEY_RUNS,111);
            cv.put(KEY_BALLS,101);
            cv.put(KEY_4S,8);
            cv.put(KEY_6S,3);
            cv.put(KEY_STRIKE_RATE,109.90);
            cv.put(KEY_VENUE,"Vidarbha Cricket Association Stadium, Jamtha, Nagpur");
            cv.put(KEY_DATE,"12 March 2011");
            cv.put(KEY_RESULT,"South Africa won by 3 wickets (with 2 balls remaining)");

            db.insert(DATABASE_TABLE,null,cv);

            /* Century Number : 100 */
            cv.put(KEY_CENTURY_NUMBER,100);
            cv.put(KEY_FORMAT,"ODI");
            cv.put(KEY_OPPONENT,"Bangladesh");
            cv.put(KEY_SERIES,"Asia Cup 2011/12 - 4th Match");
            cv.put(KEY_RUNS,113);
            cv.put(KEY_BALLS,147);
            cv.put(KEY_4S,12);
            cv.put(KEY_6S,1);
            cv.put(KEY_STRIKE_RATE,77.55);
            cv.put(KEY_VENUE,"Shere Bangla National Stadium, Mirpur");
            cv.put(KEY_DATE,"16 March 2012");
            cv.put(KEY_RESULT,"Bangladesh won by 5 wickets (with 4 balls remaining)");

            db.insert(DATABASE_TABLE,null,cv);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
        {
            db.execSQL("drop table if exists " + DATABASE_TABLE);
            onCreate(db);
        }
    }

    public DBCenturies openDatabase() throws SQLException
    {
        mydbhelper = new DBHelper(mycontext);
        mysqlitedb = mydbhelper.getReadableDatabase();
        return this;
    }

    public void closeDatabase() throws SQLException
    {
        mydbhelper.close();
    }

    public ArrayList<String> getCenturyNumber(String format)
    {
        ArrayList<String> centuryNumber = new ArrayList<String>();
        String queryStatement;
        Cursor cursor;

        if(format.equals("all"))
        {
            queryStatement = "select " + KEY_CENTURY_NUMBER + " from " + DATABASE_TABLE;
            cursor = mysqlitedb.rawQuery(queryStatement,null);
        }
        else
        {
            queryStatement = "select " + KEY_CENTURY_NUMBER + " from " + DATABASE_TABLE + " where "
                + KEY_FORMAT + " = '" + format + "'";
            cursor = mysqlitedb.rawQuery(queryStatement,null);
        }

        if (cursor.moveToFirst())
        {
            do
            {
                centuryNumber.add("Century " + cursor.getString(cursor.getColumnIndexOrThrow(KEY_CENTURY_NUMBER)));
            }
            while (cursor.moveToNext());
        }

        if(!cursor.isClosed())
        {
            cursor.close();
        }

        return centuryNumber;
    }

    public CenturyDetails getCenturyDetails(String centuryNumber)
    {
        CenturyDetails centuryDetails = new CenturyDetails();
        String queryStatement;
        Cursor cursor;

        queryStatement = "select * from " + DATABASE_TABLE + " where " + KEY_CENTURY_NUMBER + " = '"
        + centuryNumber + "'";

        cursor = mysqlitedb.rawQuery(queryStatement,null);

        if(cursor.moveToFirst())
        {
            centuryDetails.centuryNumber = cursor.getString(cursor.getColumnIndexOrThrow(KEY_CENTURY_NUMBER));
            centuryDetails.format = cursor.getString(cursor.getColumnIndexOrThrow(KEY_FORMAT));
            centuryDetails.opponent = cursor.getString(cursor.getColumnIndexOrThrow(KEY_OPPONENT));
            centuryDetails.series = cursor.getString(cursor.getColumnIndexOrThrow(KEY_SERIES));
            centuryDetails.runs = cursor.getString(cursor.getColumnIndexOrThrow(KEY_RUNS));;
            centuryDetails.balls = cursor.getString(cursor.getColumnIndexOrThrow(KEY_BALLS));
            centuryDetails.fours = cursor.getString(cursor.getColumnIndexOrThrow(KEY_4S));
            centuryDetails.sixes = cursor.getString(cursor.getColumnIndexOrThrow(KEY_6S));
            centuryDetails.strikeRate = cursor.getString(cursor.getColumnIndexOrThrow(KEY_STRIKE_RATE));
            centuryDetails.venue = cursor.getString(cursor.getColumnIndexOrThrow(KEY_VENUE));
            centuryDetails.date = cursor.getString(cursor.getColumnIndexOrThrow(KEY_DATE));
            centuryDetails.result = cursor.getString(cursor.getColumnIndexOrThrow(KEY_RESULT));
        }

        if(!cursor.isClosed())
        {
            cursor.close();
        }

        return centuryDetails;
    }
}
