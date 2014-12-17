package com.example.testegoogleanalitics;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.analytics.tracking.android.EasyTracker;
import com.google.analytics.tracking.android.MapBuilder;

public class MainActivity extends ActionBarActivity {
	//Id Analitics
   //UA-57764334-1

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
	}
	
	public void tela1(View view) {
		EasyTracker.getInstance(this).send(MapBuilder.createEvent("botão", "click", "Tela 1", 1L).build());
		Intent intent = new Intent(MainActivity.this, Tela1.class);
		startActivity(intent);
	}
	
	public void tela2(View view) {
		EasyTracker.getInstance(this).send(MapBuilder.createEvent("botão", "click", "Tela 2", 2L).build());
		Intent intent = new Intent(MainActivity.this, Tela2.class);
		startActivity(intent);
	}
	
	
	
	//onStar e onStop para monitorar app com Google
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		EasyTracker.getInstance(this).activityStart(this);
	}
	
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		EasyTracker.getInstance(this).activityStop(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
