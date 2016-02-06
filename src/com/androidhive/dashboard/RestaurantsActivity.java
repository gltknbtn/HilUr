package com.androidhive.dashboard;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import androidhive.dashboard.R;

public class RestaurantsActivity extends Activity {
	 /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurants_layout);
        
        // Dashboard Header textview
        final TextView tvHeader = (TextView) findViewById(R.id.tvHeader);
        tvHeader.setText("LOKANTALAR");
    }
}
