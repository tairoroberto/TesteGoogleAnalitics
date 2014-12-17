package com.example.testegoogleanalitics;

import com.google.analytics.tracking.android.Fields;
import com.google.analytics.tracking.android.GoogleAnalytics;
import com.google.analytics.tracking.android.MapBuilder;
import com.google.analytics.tracking.android.Tracker;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

public class Tela2 extends ActionBarActivity {
	
	GoogleAnalytics instance;
	Tracker tracker;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela2);
		
		instance = GoogleAnalytics.getInstance(this);
		tracker = instance.getTracker("UA-57764334-1");
		tracker.set(Fields.SCREEN_NAME, "tela 2 - Personalizada");
	}
	
	
	//onStar e onStop para monitorar app com Google
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		tracker.send(MapBuilder.createAppView().build());
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tela2, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
