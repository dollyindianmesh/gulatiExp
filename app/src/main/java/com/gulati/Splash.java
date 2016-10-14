package com.gulati;


import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

import com.gulati.constants.SharedPreferenceskeys;
import com.gulati.utils.SharedPrefCustom;


public class Splash extends Activity {
	SharedPreferences mSharedPreferences;
	Editor editor;
	SharedPrefCustom saveInPref;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		this.requestWindowFeature(Window.FEATURE_NO_TITLE);

		setContentView(R.layout.splash);

		initializations();
		start();

	}// Oncreate

	public void initializations()
	{
		saveInPref = new SharedPrefCustom(getApplicationContext());
	}
	
	private void start() {
		// TODO Auto-generated method stub
		new Handler().postDelayed(new Runnable() {

			@Override
			public void run() {
				String savedUserId =saveInPref.getFromPrefsString(SharedPreferenceskeys.USER_ID,"");


				if(savedUserId.equals(""))
				{
					Intent i = new Intent(Splash.this, LoginMainActivity.class);
					startActivity(i);
					finish();
				}
				else
				{
					Intent intent = new Intent(Splash.this, MainActivity.class);
					startActivity(intent);
					finish();
				}
				
				
			}
		}, 1000);
	}// Thread Start
	
	
}
