package com.echessa.noteapp;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class NoteAppApplication extends Application {
	
	@Override
	public void onCreate() {
		super.onCreate();

		Parse.initialize(this, APPLICATION_ID, CLIENT_KEY);

		ParseObject testObject = new ParseObject("TestObject");
		testObject.put("foo", "bar");
		testObject.saveInBackground();
	}

}
