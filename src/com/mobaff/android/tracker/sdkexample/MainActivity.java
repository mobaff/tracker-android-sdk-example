package com.mobaff.android.tracker.sdkexample;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class MainActivity extends Activity {
	
	public static final String PREFS_NAME = "MAFT_SDK_Example_Prefs";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // Make the logo send us to MobAff Tracker
        ImageView img = (ImageView) findViewById(R.id.img_MobAff_Logo);
        img.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
            	Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mobafftracker.com"));
            	startActivity(browserIntent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    @Override
    protected void onStop(){
        super.onStop();
     }
}
