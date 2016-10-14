package com.gulati.utils;

import android.content.Context;
import android.content.res.Configuration;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.widget.Toast;

/**
 * Created by Praveen_2 on 6/17/2016.
 */

public class DeviceInfo {

    // not used in functinality
    public static void screenResolution(Context context)
    {
        int screenSize = context.getResources().getConfiguration().screenLayout &
                Configuration.SCREENLAYOUT_SIZE_MASK;
        int density= context.getResources().getDisplayMetrics().densityDpi;
        switch(density)
        {
            case DisplayMetrics.DENSITY_LOW:
                Toast.makeText(context, density+" "+screenSize+"LDPI", Toast.LENGTH_SHORT).show();
                break;
            case DisplayMetrics.DENSITY_MEDIUM:
                Toast.makeText(context, density+" "+screenSize+"MDPI", Toast.LENGTH_SHORT).show();
                break;
            case DisplayMetrics.DENSITY_HIGH:
                Toast.makeText(context, density+" "+screenSize+"HDPI", Toast.LENGTH_SHORT).show();
                break;
            case DisplayMetrics.DENSITY_XHIGH:
                Toast.makeText(context, density+" "+screenSize+"XHDPI", Toast.LENGTH_SHORT).show();
            case DisplayMetrics.DENSITY_XXHIGH:
                Toast.makeText(context, density+" "+screenSize+"XXHDPI", Toast.LENGTH_SHORT).show();
            case DisplayMetrics.DENSITY_XXXHIGH:
                Toast.makeText(context, density+" "+screenSize+"XXXHDPI", Toast.LENGTH_SHORT).show();
                break;
        }
    } // screen resolution

    public static String getDeviceId(Context context)
    {
        // using for splash service.
        String m_androidId = Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);
        return m_androidId;
    }
}
