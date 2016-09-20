package com.prakashindia11.sachintendulkarthelegend;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

/**
 * Created by Prakash on 19-08-2016.
 * Last Edit : 20-09-2016
 */

public class ActivityRecords extends Activity
{
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        /* Program for Full Screen */
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.records);

        initializeRecords();
    }

    private void initializeRecords()
    {
        String[] recordsList = {"Highest run getter in test matches (15,921 as on 20 September 2016).",
        "Highest run getter in ODIs (18,426).",
        "15,310 of his runs came while opening the innings with the aid of 45 centuries and 75 fifties in 340 innings- most by an opener",
        "Most number of centuries in Test matches – 51.",
        "Most number of centuries in ODIs – 49.",
        "Most number of man of the match awards (62) in the ODIs.",
        "Most number of man of the series awards (16) in ODIs.",
        "Best average for man of the matches in ODIs.",
        "First cricketer to reach 10000, 11000, 12000, 13000, 14000, 15000, 16000, 17000, 18000 runs in the ODIs",
        "Only player ever to cross the 14000, 15000, 16000, 17000 and 18,000 run marks in ODIs.",

                "He is the highest run scorer in World Cups (2,278 at an average of 56.95)",
        "Most number of the man of the match awards in World cups.",
        "Most number of runs in the 1996 World cup – 523 runs at an average of 87.16.",
        "Most number of runs in the 2003 World cup – 673 runs in 2003 Cricket World Cup, highest by any player in a single Cricket World Cup.",
        "Most number of Fifties in ODIs – 96.",
        "Highest number of 50+ scores in ODI’s – 145 (49 Centuries and 96 Fifties).",
        "First player to have scored over 100 innings of 50+ runs in ODIs.",
        "Appeared in most number of tests – 200.",
        "Appeared in most number of ODIs – 463.",
        "First player to score 200 runs in an ODI.",

                "Tendulkar top-scored for India on 129 occasions – most such occasions for any player in ODIs.",
        "He was the first players to complete the all-round treble of 10000 runs, 100 wickets and 100 catches.",
        "Is the only player to have made three scores of 175 or more.",
        "Is the only player with five scores of 150 or more.",
        "Holds the record for scoring 1,000 ODI runs in a calendar year on most occasions. He did so seven times – 1994, 1996, 1997, 1998, 2000, 2003 and 2007.",
        "Tendulkar has scored over 1,000 ODI runs against all major cricketing nations.",
        "Has played ODIs with 866 players (teammates and opponents) – most for any player in ODI history.",
        "He has most scores in 90s: 18 (including one not out innings).",
        "He Was involved in 99 century partnerships – most by any player.",

                "Tendulkar was the first batsman to score over 3,000 runs against an opponent (3,077 runs against Australia).Since then he has also done this against Sri Lanka (3,113 runs).",
        "Tendulkar was the fastest to reach 10,000 runs taking 259 innings and has the highest batting average among batsmen with over 10,000 ODI runs.",
        "Tendulkar is the only Indian to score a century on ODI captaincy debut (110 v Sri Lanka at Colombo RPS on 28 August 1996).",
        "Tendulkar was the first Indian player to score a century and capture four wickets in the same ODI (v Australia at Dhaka on 28 October 1998).",
        "11.27% of all the runs and 24.50% of all the hundreds scored by all Indian batsmen have come from Tendulkar’s bat. (As of 6 December 2012)",
        "His nine centuries against Australia are the most by any player against a particular country. He occupies the second place too, with eight centuries against Sri Lanka.",
        "Sachin Tendulkar with Sourav Ganguly holds the world record for the maximum number of runs scored by the opening partnership. They put together 6,609 runs in 136 matches that include 21 century partnerships and 23 fifty run partnerships. The 21 century partnerships for the opening pair is also a world record.",
        "Sachin Tendulkar and Rahul Dravid hold the world record for the highest partnership in ODIs when they scored 331 runs for the second wicket against New Zealand in 1999-00 at the Hyderabad.",
        "Only the second player (after Javed Miandad) to appear in SIX World Cups – from 1992 to 2011.",
        "Most ODI runs in a calendar year: 1,894 ODI runs in 1998.",
        "Most Centuries in a calendar year: 9 ODI centuries in 1998.",

                "Longest career span : 24 years 1 days.",
        "Between April 1990 and April 1998 Tendulkar played 185 consecutive matches – a World record.",
        "He is the only player to be in top 10 ICC Batsmen ranking for 10 years in Tests.",
        "He was the first cricketer to receive the Rajiv Gandhi Khel Ratna, India’s highest sporting honor only to be followed by Mahendra Singh Dhoni.",
        "In 2002, Wisden rated him as the second greatest Test batsman after Sir Donald Bradman.",
        "In 2003, Wisden rated Tendulkar as the No. 1 and Richards at No. 2 in all time Greatest ODI players.",
        "He was involved in unbroken 664-run partnership in a Harris Shield game in 1988 with friend and team mate Vinod Kambli.",
        "Tendulkar is the only player to score a century in all three of his Ranji Trophy, Duleep Trophy and Irani Trophy debuts.",
        "In 1992, at the age of 19, Tendulkar became the first overseas born player to represent Yorkshire.",
        "Tendulkar has been granted the Rajiv Gandhi Khel Ratna, Arjuna Award, Padma Shri and Padma Vibhushan by Indian government. He is the only Indian cricketer to get all of them.",

                "Tendulkar has scored over 1000 runs in a calendar year in ODIs 7 times.",
        "Tendulkar has scored 1894 runs in calendar year in ODIs most by any batsman.",
        "He has the least percentage of the man of the matches awards won when team loses a match in ODIs. Out of his 62-man of the match awards only 5 times India has lost.",
        "Tendulkar most number man of match awards (12) against Australia.",
        "In August 2003, Sachin Tendulkar was voted as the “Greatest Sportsman” of the country in the sport personalities category in the Best of India poll conducted by Zee News.",
        "In November 2006, Time magazine named Tendulkar as one of the Asian Heroes.",
        "The current India Poised campaign run by The Times of India has nominated him as the Face of New India next to the likes of Amartya Sen and Mahatma Gandhi among others.",
        "Tendulkar was the first batsman to score over 50 centuries in international cricket.",
        "Tendulkar was the first batsman to score over 75 centuries in international cricket.",
        "Has the most overall runs in cricket, (ODIs+Tests+Twenty20s), as of September 2016 he had accumulated almost 34,357 runs overall.",

                "Sachin Tendulkar with Sourav Ganguly hold the world record for the maximum number of runs scored by the opening partnership. They have put together 6,271 runs in 128 matches.",
        "The 22 century partnerships for opening pair with Sourav Ganguly is a world record.",
        "Sachin Tendulkar and Rahul Dravid hold the world record for the highest partnership in ODI matches when they scored 331 runs against New Zealand in 1999.",
        "Sachin Tendulkar has been involved in six 200 run partnerships in ODI matches – a record that he shares with Sourav Ganguly and Rahul Dravid.",
        "Most ODI Centuries in a calendar year: 9 centuries in 1998.",
        "Only player to have over 100 innings of 50+ runs (49 Centuries and 96 Fifties) in ODI",
        "Fourth highest individual score among Indian batsmen (200* against South Africa at Gwalior in 2010).",
        "The score of 200* is the fourth highest score recorded in ODI matches.",

                "Sachin was the fastest to reach 10,000 runs taking 259 innings and has the highest batting average among batsmen with over 10,000 ODI runs",
        "Most number of Stadium Appearances: 90 different Grounds.",
        "Consecutive ODI Appearances: 185.",
        "On his debut, Sachin Tendulkar was the second youngest debutant in the world.",
        "When Tendulkar scored his maiden century in 1990, he was the second youngest to score a century.",
        "Tendulkar’s record of five test centuries before he turned 20 is a current world record.",
        "Tendulkar holds the current record (217 against NZ in 1999/00 Season) for the highest score in Test cricket by an Indian when captaining the side.",
        "Tendulkar has scored centuries against all test playing nations.(7) He was the third batman to achieve the distinction after Steve Waugh and Gary Kirsten.",
        "He holds record for the second most number of seasons with over 1000 runs in world in a calendar year.",
        "On 3 January 2007 Sachin Tendulkar (5751) edged past Brian Lara’s (5736) world record of runs scored in Tests away from home.",

                "Tendulkar and Brian Lara are the fastest to score 10,000 runs in Test cricket history. Both of them achieved this in 195 innings.",
        "Second Indian after Sunil Gavaskar to make over 10,000 runs in Test matches.",
        "Became the first Indian to surpass the 11,000 Test run mark and the third overall.",
        "First to score 30,000 international runs.",
        "Tendulkar’s 34,357 runs in international cricket include 18,426 runs in ODIs, 15,921 Tests runs and 10 runs in the lone Twenty20 that India has played.",
        "On 10 December 2005, Tendulkar made his 35th century in Tests at Delhi against Sri Lanka . He surpassed Sunil Gavaskar’s record of 34 centuries to become the man with the most number of hundreds in Test cricket.",
        "Tendulkar is the only player who has 150 wickets and more than 15,000 runs in ODIs.",
        "Tendulkar is the first batsman in history to score 100 centuries in international cricket.",
        "Holds the record for amassing most runs in a winning cause 11157 (average 56.63), including 33 centuries, in 234 matches.",
        "Also has the highest average in a winning cause 56.63 which is the highest among the batsmen with 7000 runs or more in a winning cause.",

                "He has got 20 ducks in ODI cricket.",
        "He has scored most runs in boundaries (fours)in ODI cricket 2016*4= 8064.",
        "He has scored 195 sixes in ODI cricket."};


        ListAdapter listAdapter = new ArrayAdapter<String>(this, R.layout.list_black_text_dynamic_height,R.id.list_content, recordsList);
        listView = (ListView) findViewById(R.id.ListView_Records);
        listView.setAdapter(listAdapter);
    }
}
