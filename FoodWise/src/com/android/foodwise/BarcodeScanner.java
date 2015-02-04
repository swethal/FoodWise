package com.android.foodwise;

import android.app.Activity;
import android.content.Intent;
import android.net.wifi.ScanResult;
import android.os.Bundle;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegator;
import com.google.zxing.integration.android.IntentResult;

public class BarcodeScanner extends Activity{
	
	public void oncreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		IntentIntegator scanIntegrator = new IntentIntegator(this);
		scanIntegrator.initiateScan();
	}
	
	public void onActivityResult(int requestCode,int resultCode,Intent intent){
		IntentResult scanResult = IntentIntegator.parseActivityResult(requestCode, resultCode, intent);
		
		if(scanResult != null){
			String scanContents = scanResult.getContents();
			String scanFormat = scanResult.getFormatName();
			System.out.println("Contents of the scanned item " +scanContents);
			System.out.println("format" +scanFormat);
		}
		else {
			Toast toast = Toast.makeText(getApplicationContext(), "No Scan data received", Toast.LENGTH_LONG);
			toast.show();
		}
	}

}
