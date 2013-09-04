package com.derpherp.fluffennewboston;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;

public class Prefs extends PreferenceActivity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//This line below is something you have to add!!
		//PrefsFragment is a class name i came up with, which is then referred to below.
		//Might get an error until you finish the whole code
		getFragmentManager().beginTransaction().replace(android.R.id.content, new PrefsFragment()).commit();
		
	}
	
	public static class PrefsFragment extends PreferenceFragment
	{

		@Override
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			addPreferencesFromResource(R.xml.prefs);
		}
		
		
	}

}

