package com.mobaff.android.tracker.sdkexample;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

import com.mobaff.android.library.tracker.InstallReceiver;

public class MarketInstallReceiver extends InstallReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		// Configure & Trigger the Install Report
		this.setTrackerKey("kjhasdkjhdaslkjdhaskljdh");
		this.setTrackerURL("http://realtime.steve.mobafftracker.com:3000");
		super.onReceive(context, intent);
	}
	
}
