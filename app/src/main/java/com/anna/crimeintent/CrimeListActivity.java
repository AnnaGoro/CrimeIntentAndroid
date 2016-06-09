package com.anna.crimeintent;

import android.support.v4.app.Fragment;

/**
 * Created by Anna on 10.06.2016.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
