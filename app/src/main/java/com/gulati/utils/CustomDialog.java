package com.gulati.utils;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;

public class CustomDialog extends Dialog {
	int mLayoutId;
	String mTitle;
	int mCallerID;
	Activity mContext;
	


	public CustomDialog(Activity context, int layoutId, int callerID) {
		super(context);
		this.mContext = context;
		this.mLayoutId = layoutId;

		this.mCallerID = callerID;
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(mLayoutId);
		//setTitle(mTitle);

		

		switch(mCallerID)
		{
			// Pop up to choose payment mode
		case 1:
		{
			
					
				
			break;
		}
		// Pop up to show expected rate
		case 2:
		{
			
			break;
		}
//		case 3:
//		{
//			ListView communityListView = (ListView)findViewById(com.virtualmanger.R.id.cities_list);
//			ArrayAdapter<String> assetAdapter = new ArrayAdapter<String>(mContext, android.R.layout.simple_spinner_item, test1Array);
//			communityListView.setAdapter(assetAdapter);
//			communityListView.setOnItemClickListener(new OnItemClickListener(){
//
//				@Override
//				public void onItemClick(AdapterView<?> adapter, View v,
//						int position, long id) {
//					choosedCity = adapter.getItemAtPosition(position).toString();
//					Intent intent = new Intent(Uniquekeys.CITY_BROADCAST_UNIQUEKEY);
//					intent.putExtra(PutExtraKeys.ChoosedCityKey,choosedCity);
//					mContext.sendBroadcast(intent);
//					dismiss();
//				}
//			});
//			break;
//		}
		}//switch
	}//oncreate
}
