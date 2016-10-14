package com.gulati.utils;




import android.app.Activity;
import android.content.Intent;

import com.gulati.LoginMainActivity;


public class BackStackClear {

    public static boolean ClearFragments(Activity con){
    	
    	
		return false;
    }
    
 public static void ClearActivities(Activity con){
	 Intent intent = new Intent(con, LoginMainActivity.class);
 	intent.putExtra("finish", true); // if you are checking for this in your other Activities
 	intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP |
 	                Intent.FLAG_ACTIVITY_CLEAR_TASK |
 	                Intent.FLAG_ACTIVITY_NEW_TASK);
 	con.startActivity(intent);
 	((Activity)con).finish();
    	
    }
 
 public static void ExitApp(Activity con){
	 Intent intent = new Intent(Intent.ACTION_MAIN);
     intent.addCategory(Intent.CATEGORY_HOME);
     intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP |
             Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
     con.startActivity(intent);
 	//((Activity)con).finish();
    	
    }
  }//GetScreenSize