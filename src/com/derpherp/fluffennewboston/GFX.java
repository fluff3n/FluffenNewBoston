package com.derpherp.fluffennewboston;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;

public class GFX extends Activity {


	

	Fluffen ourView;
	WakeLock wL;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		//wakelock
		PowerManager pM = (PowerManager)getSystemService(Context.POWER_SERVICE);
		wL = pM.newWakeLock(PowerManager.FULL_WAKE_LOCK, "whatever");
		super.onCreate(savedInstanceState);
		wL.acquire();
		ourView = new Fluffen(this);
		setContentView(ourView);
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause(); 
		wL.release();
		
	}
	
}

