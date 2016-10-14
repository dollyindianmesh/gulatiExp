package com.gulati.utils;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;

public class ScreenDimensions {

    public static int getScreenHeight(Context con){
    	
    	DisplayMetrics metrics = new DisplayMetrics();
    	((Activity)con).getWindowManager().getDefaultDisplay().getMetrics(metrics);
        int screenHeight = metrics.heightPixels;//1280//800
		return screenHeight;
    }
    
 public static int getScreenWidth(Context con){
    	
    	DisplayMetrics metrics = new DisplayMetrics();
    	((Activity)con).getWindowManager().getDefaultDisplay().getMetrics(metrics);
        int screenWidth = metrics.widthPixels;//720//480
		return screenWidth;
    }
  }//GetScreenSize