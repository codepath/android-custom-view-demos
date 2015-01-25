package com.codepath.example.customviewdemo.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import com.codepath.example.customviewdemo.R;
import com.codepath.example.customviewdemo.views.ShapeSelectorView;

public class ShapeDemoActivity extends Activity {
	private Button btnSelect;
	private ShapeSelectorView shapeSelector;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_shape_demo);
		shapeSelector = (ShapeSelectorView) findViewById(R.id.shapeSelector);
		btnSelect = (Button) findViewById(R.id.btnSelect);
		btnSelect.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(ShapeDemoActivity.this, "You selected: " + 
			       shapeSelector.getSelectedShape(), Toast.LENGTH_LONG).show();
			}
		});
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.shape_demo, menu);
		return true;
	}

}
