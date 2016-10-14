package com.gulati.utils;

import android.app.Activity;
import android.content.Context;
import android.view.inputmethod.InputMethodManager;

public class DeviceSettingsUtil {

        public static void hideSoftKeyboard(Context context, Activity act){
    	
    	InputMethodManager inputManager = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
		inputManager.hideSoftInputFromWindow(act.getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
    
    }//hideSoftKeyboard
   }//class