package com.doodat.gfgglassactionbar;

import android.app.Activity;
import android.os.Bundle;

import com.manuelpeinado.glassactionbar.GlassActionBarHelper;

public class MainActivity extends Activity {
    private GlassActionBarHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        Adding glass action bar view to the activity
        helper = new GlassActionBarHelper().contentLayout(R.layout.activity_main);
        setContentView(helper.createView(this));
    }
}