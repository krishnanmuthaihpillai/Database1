package com.example.database;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		SQLiteDatabase db=openOrCreateDatabase("MYDB", MODE_PRIVATE,null);
		db.execSQL("CREATE TABLE IF NOT EXISTS Mytable(LastName VARCHAR,FirstName VARCHAR,Age Int(3));");
	    db.execSQL("INSERT INTO Mytable VALUES('KRISHNAN','SABARI',28);");
	    db.execSQL("INSERT INTO Mytable VALUES('raja','raja',26);");
	    db.execSQL("INSERT INTO Mytable VALUES('yo','yo',26);");
	    Cursor c=db.rawQuery("SELECT *FROM Mytable",null);
	    c.moveToFirst();
	    Log.d("check", c.getString(c.getColumnIndex("FirstName")));

	}

}