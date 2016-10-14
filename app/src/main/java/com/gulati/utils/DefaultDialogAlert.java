package com.gulati.utils;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.util.Log;
import android.widget.EditText;
import android.widget.LinearLayout;




public class DefaultDialogAlert {
	static String TAG = "Default Alert Msg";
	static final int VALIDATE_PROMO_RESPONSE = 4;
	private static Typeface mTypeFace,mTypeFaceA;

		/*
		 * Alert Dilaog for alert only
		 * Parameters:
		 * 			1. Application context
		 * 			2. Title msg of dialog box
		 * 			3. Detail msg of default dialog alert
		 * 			4. Set option to perfom a particular task for different different calls.
		 */
	    
	    public static void alertDialogOkOnly(final Context appContext, String title, String msg , String btnText, final int option)
	    {
	    	try
	    	{
			new AlertDialog.Builder(appContext)
			  .setTitle(title)
			  .setMessage(msg)
			  .setPositiveButton(btnText, new DialogInterface.OnClickListener()
			  {
				  public void onClick(DialogInterface dialog, int whichButton)
				  	{
					  if(option==1)// if want to open Todays task list On press Ok
						{
//						  FragmentManager fragmentManager = ((Activity)appContext).getFragmentManager();
//				             FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//				             TodaysTaskFragment deleveredOptions = new TodaysTaskFragment(appContext);
//
//				           //  fragmentManager.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
//				             fragmentTransaction.replace(R.id.main_fragment_container,deleveredOptions,"yes");
//				             fragmentTransaction.addToBackStack(null);
//				             fragmentTransaction.commit();
////							(appContext).startActivity(new Intent(appContext,Home.class));
////							((Activity)appContext).finish();
							
						}
					  else if(option==2) // Posting created msg success
						{
/*//							Intent intent = new Intent(appContext, RequestReplyList.class);
//							intent.putExtra(PutExtraKeys.SELECTED_REQUEST_ID,valueToPut1 );
//							appContext.startActivity(intent);
						  RequestReplyList.RequestReplyListServiceCallFlag = true;
							((Activity)appContext).finish();*/
						}
					dialog.dismiss();
				    }
			  })
			  
			  .show();
			
		}catch(Exception e)
		{
			e.printStackTrace();
			Log.e(TAG,"---alert dilaog exception:"+e.toString());
		}
	   }// Alert dialogOkOnly
	    
	    
	    public static void alertDialogToInputValue(final Activity appContext, String title, String btnText)
	    {
	    	
		   	try
	    	{
		    	 Log.d(TAG,"---alertDialog to enetr a value--");
		    	 final EditText inputKeyword = new EditText(appContext);
		    	 inputKeyword.setHint("Enter Promo Code");
		    	 inputKeyword.setInputType(2);
		    	 LinearLayout layout = new LinearLayout(appContext);
		    	 
		    	 layout.setGravity(1);
		         layout.addView(inputKeyword);

				new AlertDialog.Builder(appContext)
				  .setTitle(title)
				  .setView(layout)
				 
				  .setPositiveButton(btnText, new DialogInterface.OnClickListener() {
					  public void onClick(DialogInterface dialog, int whichButton) {
						  String enteredPromoCode = inputKeyword.getText().toString();
						  if (!enteredPromoCode.equals("")) {
							  //AuthenticatePromoCode(appContext, enteredPromoCode);
						  } else {
//						  (appContext).startActivity(new Intent(appContext,Home.class));
//							((Activity)appContext).finish();
						  }
						  dialog.dismiss();
					  }//onclick
				  })
			  
			  .show();
		}catch(Exception e)
		{
			Log.d(TAG, "---Input Dialog Exception" + e.toString());
		}
	   }//alertDialogToInputValue

	public static void yesNoDialog(final Activity appContext, final int option)
	{
		new AlertDialog.Builder(appContext).setIcon(android.R.drawable.ic_dialog_alert).setTitle("Exit")
				.setMessage("Are you sure to exit from App?")
				.setCancelable(false)
				.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {

						// from main activity
						if (option == 0)
							BackStackClear.ExitApp(appContext);

							// from reschedule cancle order
						else if (option == 1) {
//							HomeFragment local = new HomeFragment();
//							FragmentsInitiation.replaceFragment(appContext, local);
						}

					}
				}).setNegativeButton("No", new DialogInterface.OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int which) {

				// from main activity
				if (option == 0) {
//					HomeFragment local1 = new HomeFragment();
//					FragmentsInitiation.replaceFragment(appContext, local1);
				}
				// from reschedule cancle order
				else if (option == 1)
					dialog.dismiss();
			}

		}).show();
	}

}
