package com.anna.crimeintent;

import java.util.UUID;

/**
 * Created by Anna on 07.06.2016.
 */
public class Crime {

    private UUID mId;
    private String mTitle;

    public Crime () {

        mId = UUID.randomUUID();

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
}
