package com.anna.crimeintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Anna on 08.06.2016.
 */
public class CrimeLab {

    private static CrimeLab sCrimeLab;
    List<Crime> mCrimes;

    public CrimeLab(Context context) {
        mCrimes = new ArrayList<Crime>();
    }

    public static CrimeLab get (Context context) {

        if ( sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    public List<Crime> getCrimes() {
        return mCrimes;
    }

    public Crime getCrime (UUID id) {

        for (Crime crime:mCrimes) {
            if (crime.getId().equals(id)) {
                return crime;
            }
        }
        return null;
    }
}