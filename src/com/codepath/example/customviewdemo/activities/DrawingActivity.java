package com.codepath.example.customviewdemo.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.codepath.example.customviewdemo.R;

public class DrawingActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_drawing);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.drawing, menu);
		return true;
	}

}
