package com.gulati.utils;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.util.Log;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import com.gulati.R;
import com.gulati.constants.Common_static_msgs;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;



/**
 * Created by Praveen_2 on 6/6/2016.
 */
public class DateTimePickers {

    static String newChoosedDate = "";
    static String newChoosedTime = "";

    public static String getDate(final Context con, final TextView txtDate) {

        final Calendar c = Calendar.getInstance();
        int mYear = c.get(Calendar.YEAR);
        int mMonth = c.get(Calendar.MONTH);
        int mDay = c.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog dpd = new DatePickerDialog(con,
                new DatePickerDialog.OnDateSetListener() {

                    @Override
                    public void onDateSet(DatePicker view, int year,
                                          int monthOfYear, int dayOfMonth) {
                        if (view.isShown()) {
                            newChoosedDate = "";
                            c.set(Calendar.YEAR, year);
                            c.set(Calendar.MONTH, monthOfYear);
                            c.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                            String myFormat = "yyyy-MM-dd"; //2016-05-09
                            SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);
                            newChoosedDate = sdf.format(c.getTime());


                            CompareTwoDates(con, newChoosedDate, txtDate);

                        } else {
                            System.out.println("dialog not shown");
                        }

                    }

                }, mYear, mMonth, mDay);
        dpd.show();
        return newChoosedDate;
    }

    public static String getTime(final Context con, final TextView txtTime) {
        final Calendar mcurrentTime = Calendar.getInstance();
        int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
        int minute = mcurrentTime.get(Calendar.MINUTE);
        final int SECOND = mcurrentTime.get(Calendar.SECOND);

        TimePickerDialog mTimePicker;
        mTimePicker = new TimePickerDialog(con,
                new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay,
                                          int minute) {
                        if (view.isShown()) {
                            newChoosedTime = "";
                            mcurrentTime.set(Calendar.HOUR_OF_DAY, hourOfDay);
                            mcurrentTime.set(Calendar.MINUTE, minute);
                            mcurrentTime.set(Calendar.SECOND, SECOND);
                            String myFormat = "HH:mm:ss"; //  05:19:09
                            SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);
                            newChoosedTime = sdf.format(mcurrentTime.getTime());
                            // 16:09:28
                            TimeValidation(con,newChoosedTime,txtTime);
                        } else {
                            System.out.println("dialog not shown");
                        }

                    }
                }, hour, minute, false);// Yes 24 hour time
        //	mTimePicker.setTitle("Collection Time");
        mTimePicker.show();
        return newChoosedTime;
    }

    private static void CompareTwoDates(Context con, String chooseddate, TextView txtDate) {
        Date choosedDateTime = DateFormatting.getDateObjFromString(chooseddate);
        Date currentDateTime = DateFormatting.getDateObjFromString(DateFormatting.getCurrentDate());

        // Compare date with three days after date
        Date newDate = DateFormatting.getDateObjFromString(DateFormatting.AddNDaysInCurrentDate(3));

        if (!choosedDateTime.equals(null) || !currentDateTime.equals(null)) {
            if (choosedDateTime.after(currentDateTime) || choosedDateTime.equals(currentDateTime)) {
                Log.e("", "greater from current");
            } else {
                DefaultDialogAlert.alertDialogOkOnly(con, con.getText(R.string.dialog_alert_title).toString(), Common_static_msgs.choose_largedate_from_currentdate, con.getText(R.string.dialog_alert_ok).toString(), 0);
            }

            if (choosedDateTime.before(newDate) && (choosedDateTime.after(currentDateTime) || choosedDateTime.equals(currentDateTime))) {
                Log.e("", "within3");
                txtDate.setText(chooseddate);
            } else {
                DefaultDialogAlert.alertDialogOkOnly(con, con.getText(R.string.dialog_alert_title).toString(), Common_static_msgs.choose_date_within_threedays, con.getText(R.string.dialog_alert_ok).toString(), 0);
            }
        } else {
            DefaultDialogAlert.alertDialogOkOnly(con, con.getText(R.string.dialog_alert_title).toString(), Common_static_msgs.date_null, con.getText(R.string.dialog_alert_ok).toString(), 0);
        }
    } //Compare two dates

    private static void TimeValidation(Context con, String choosedTime, TextView txtDate)
    {
        Date choosedTimeObj = DateFormatting.getTimeObjFromString(choosedTime);
        Date currentTimeobj = DateFormatting.getTimeObjFromString(DateFormatting.getCurrentTime());

        Date newAddedTime = DateFormatting.getTimeObjFromString(DateFormatting.AddNHourInCurrentTime(2));

        if (!choosedTimeObj.equals(null) || !currentTimeobj.equals(null)) {
            if (choosedTimeObj.after(currentTimeobj) &&  choosedTimeObj.after(newAddedTime)) {
                Log.e("", "after");
                txtDate.setText(choosedTime);
            }
            else
            {
                DefaultDialogAlert.alertDialogOkOnly(con, con.getText(R.string.dialog_alert_title).toString(), Common_static_msgs.choose_picktime_two_hours_later, con.getText(R.string.dialog_alert_ok).toString(), 0);
            }

            }

    }
}
