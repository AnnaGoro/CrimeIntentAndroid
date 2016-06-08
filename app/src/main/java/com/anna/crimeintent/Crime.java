package com.anna.crimeintent;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by Anna on 07.06.2016.
 */
public class Crime {

    private UUID mId;
    private String mTitle;
    private String mDate;
    private boolean mSolved;
    SimpleDateFormat dateFormat;



    public Crime () {

        mId = UUID.randomUUID();
        dateFormat = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        mDate = dateFormat.format( new Date() ) ;

    }

    public UUID getId() {
        return mId;
    }



    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getDate() {
        return mDate;
    }

    public void setDate(String date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }
}
