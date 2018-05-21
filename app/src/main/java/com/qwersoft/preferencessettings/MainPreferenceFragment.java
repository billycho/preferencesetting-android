package com.qwersoft.preferencessettings;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by IT02106 on 21/05/2018.
 */

public class MainPreferenceFragment extends PreferenceFragment {
    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.pref_main);
    }
}
