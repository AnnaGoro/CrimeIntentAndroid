package com.anna.crimeintent;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.util.Log;

public class CrimeActivity extends SingleFragmentActivity {

    private static final String TAG = CrimeActivity.class.getSimpleName() ;

    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }


}
