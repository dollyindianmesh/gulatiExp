package com.gulati.utils;


import android.content.Context;
import android.util.Log;
import android.view.Gravity;
import android.widget.Toast;


public class ShowMsg {
	static String TAG = "Default Alert Msg";


	/*
	* toastTimeLength: long/short
	 */
	    public static void showCenterToast(Context appContext, String msg, int  toastTimeLength )
	    {
			Toast toast = Toast.makeText(appContext,msg, toastTimeLength);
			toast.setGravity(Gravity.CENTER, 0, 0);
			toast.show();
	   }// showCenterToast
	    
	    
	    public static void Loge(Context appContext, String msg1, String msg2)
	    {
	    	
			Log.e(msg1,msg2);
	   }//printLoge

	public static void showTempToast(Context appContext, String msg, int  toastTimeLength )
	{
		Toast toast = Toast.makeText(appContext,msg, toastTimeLength);
		toast.setGravity(Gravity.CENTER, 0, 0);
		toast.show();
	}// showCenterToast


	public static void LogeTemp(Context appContext, String msg1, String msg2)
	{

		Log.e(msg1,msg2);
	}//printLoge
	    


}
