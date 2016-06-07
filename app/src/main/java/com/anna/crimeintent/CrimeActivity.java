package com.anna.crimeintent;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.util.Log;

public class CrimeActivity extends FragmentActivity {

    private static final String TAG = CrimeActivity.class.getSimpleName() ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime_frame);
        Log.d(TAG , "onCreate");

        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment  = fragmentManager.findFragmentById(R.id.fragmentContainer);

        if (fragment == null) {

            fragment = new CrimeFragment();
            fragmentManager.beginTransaction()
                    .add(R.id.fragmentContainer, fragment)
                    .commit();

        }
    }
}
