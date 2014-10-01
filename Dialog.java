package com.example.testproject;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {
	private final String TAG ="MainActivity";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.d(TAG,"onCreate");
		
		Dialog d = new Dialog(this);
		d.setContentView(R.layout.dialog2);
		d.setTitle("ダイアログ2");
		
		AlertDialog.Builder alert = new AlertDialog.Builder(this);
		alert.setTitle("ダイアログタイトル");
		
		alert.setPositiveButton("OK", new DialogInterface.OnClickListener(){
			public void onClick(DialogInterface dialog, int which){
				Log.d("AlertDialog", "Positive Button is pressed");
			}
		});
		alert.create();
		alert.show();
		
		d.show();
		d.setCanceledOnTouchOutside(false);
	}
}
