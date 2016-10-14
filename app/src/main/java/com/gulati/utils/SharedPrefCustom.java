package com.gulati.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPrefCustom {
    private Context _context;
    private SharedPreferences sharedPrefs;
    private String SHARED_NAME = "foorprintuser";
    private SharedPreferences.Editor editor;


    public SharedPrefCustom(Context c) {
        _context = c;
        sharedPrefs = _context.getSharedPreferences(SHARED_NAME,
                Context.MODE_PRIVATE);
        editor = sharedPrefs.edit();
    }
    public void saveString(String key, String value) {
    	

        editor.putString(key,value);
        editor.commit();
    }
   
    public void saveInt(String key, Integer value) {

        editor.putInt(key,value);
        editor.commit();
    }
    
    public void saveBoolean(String key, Boolean value) {

        editor.putBoolean(key,value);
        editor.commit();
    }
    /**
     * Called to retrieve required value from shared preferences, identified by given key.
     * Default value will be returned of no value found or error occurred.
     * @param  // context Context of caller activity
     * @param key Key to find value against
     * @param defaultValue Value to return if no data found against given key
     * @return Return the value found against given key, default if not found or any error occurs
     */
    public String getFromPrefsString(String key, String defaultValue) {

        try {
            return sharedPrefs.getString(key, defaultValue);
        } catch (Exception e) {
             e.printStackTrace();
             return defaultValue;
        }
    }
    public Integer getFromPrefsInt(Context context, String key, Integer defaultValue) {

        try {
            return sharedPrefs.getInt(key, defaultValue);
        } catch (Exception e) {
             e.printStackTrace();
             return defaultValue;
        }
    }
    public Boolean getFromPrefsBoolean(Context context, String key, Boolean defaultValue) {

        try {
            return sharedPrefs.getBoolean(key, defaultValue);
        } catch (Exception e) {
             e.printStackTrace();
             return defaultValue;
        }
    }

    public Boolean clearSharedPrefs() {

        try {
            editor.clear();
            editor.commit();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}