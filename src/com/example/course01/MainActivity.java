package com.example.course01;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends Activity {
    private Spinner objshow_Ch01_Ex04_Spinner01OBJ ;
    private Spinner objshow_Ch01_Ex04_Spinner02OBJ ;
    private Spinner objshow_Ch01_Ex04_Spinner03OBJ ;
    private Spinner objshow_Ch01_Ex04_Spinner04OBJ ;
    private String strSpinner01ItemArray [] = 
    		new String [] {	"國小" , "國中" , "高中職" , "大專" , "碩士" , "博士" } ;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		objshow_Ch01_Ex04_Spinner01OBJ = 
				(Spinner) findViewById ( R.id.show_Ch01_Ex04_Spinner01 ) ;
		ArrayAdapter<String> objSpinner01Adapter = 
				new ArrayAdapter<String>(this , 
						android.R.layout.simple_spinner_item ,
						strSpinner01ItemArray) ;
		objSpinner01Adapter.setDropDownViewResource(
				android.R.layout.simple_spinner_dropdown_item) ;
		objshow_Ch01_Ex04_Spinner01OBJ.setAdapter(objSpinner01Adapter) ;
		objshow_Ch01_Ex04_Spinner02OBJ = 
				(Spinner) findViewById ( R.id.show_Ch01_Ex04_Spinner02 ) ;
		ArrayAdapter<String> objSpinner02Adapter = 
				new ArrayAdapter<String>(this , 
						android.R.layout.simple_list_item_checked ,
						new String [] {"男","女"} ) ;
		objshow_Ch01_Ex04_Spinner02OBJ.setAdapter(objSpinner02Adapter) ;
		
		objshow_Ch01_Ex04_Spinner03OBJ = 
				(Spinner) findViewById ( R.id.show_Ch01_Ex04_Spinner03 ) ;
		ArrayAdapter<String> objSpinner03Adapter = 
				new ArrayAdapter<String>(this , 
						android.R.layout.simple_list_item_single_choice ,
						new String [] {"草莓","百香果","橘子"} ) ;
		objshow_Ch01_Ex04_Spinner03OBJ.setAdapter(objSpinner03Adapter) ;
		
		objshow_Ch01_Ex04_Spinner04OBJ = 
				(Spinner) findViewById ( R.id.show_Ch01_Ex04_Spinner04 ) ;
		ArrayAdapter<String> objSpinner04Adapter = 
				new ArrayAdapter<String>(this , 
						android.R.layout.simple_list_item_single_choice ,
						new String [] {"小甜甜","中甜","全糖"} ) ;
		objshow_Ch01_Ex04_Spinner04OBJ.setAdapter(objSpinner04Adapter) ;
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main,
				menu);
		return true;
	}

}

