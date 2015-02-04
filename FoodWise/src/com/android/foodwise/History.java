package com.android.foodwise;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class History extends Activity {
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_main);
		Toast toast = Toast.makeText(this, "In the History Class", Toast.LENGTH_LONG);
		toast.show();
	}
	

}
