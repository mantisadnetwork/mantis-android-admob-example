package com.mantisadnetwork.android.sample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.mantisadnetwork.android.admob.Context;

public class MainActivity extends Activity {
	private AdView mAdView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.main);
		Context.get().setPropertyId("YOUR PROPERTY ID"); // CHANGE ME!
		
		mAdView = new AdView(this);
		mAdView.setAdUnitId("ca-app-pub-XXXXX"); 		// CHANGE ME!
		mAdView.setAdSize(AdSize.BANNER);
		
		RelativeLayout layout = (RelativeLayout) findViewById(R.id.mainLayout);
		RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.FILL_PARENT,
				RelativeLayout.LayoutParams.WRAP_CONTENT);
		layout.addView(mAdView, params);
		
		mAdView.loadAd(new AdRequest.Builder().build());
		
		// This would typically be set every time you transition screens
		Context.get().setScreen("Homepage");
		Context.get().setTitle("Latest News");
	}

	@Override
	protected void onPause() {
		mAdView.pause();
		super.onPause();
	}

	@Override
	protected void onResume() {
		super.onResume();
		mAdView.resume();
	}

	@Override
	protected void onDestroy() {
		mAdView.destroy();
		super.onDestroy();
	}
}
