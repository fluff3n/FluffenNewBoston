package com.derpherp.fluffennewboston;

import java.util.Random;

import android.R.color;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputType;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class TextPlay extends Activity implements View.OnClickListener{

	Button checkCommand;
	ToggleButton passwordToggle;
	EditText input;
	TextView display;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.text);
		
		kanelBullar();
		passwordToggle.setOnClickListener(this);
		checkCommand.setOnClickListener(this);
	}
	private void kanelBullar() {
		// TODO Auto-generated method stub
		checkCommand = (Button) findViewById(R.id.bResults);
		passwordToggle = (ToggleButton) findViewById(R.id.tbPassword);
		input = (EditText) findViewById(R.id.etCommands);
		display = (TextView) findViewById(R.id.tvResults);
		
	}
	@Override
	public void onClick(View view) {
		// TODO Auto-generated method stub
		switch(view.getId()){
		case R.id.bResults:
			// TODO Auto-generated method stub
			String check = input.getText().toString();
			display.setText(check);
			if (check.contentEquals("left")){
				display.setGravity(Gravity.LEFT);
			}else if (check.contentEquals("center")){
				display.setGravity(Gravity.CENTER);
			}else if (check.contentEquals("right")){
				display.setGravity(Gravity.RIGHT);
			}else if (check.contentEquals("blue")){
				display.setTextColor(color.black);
			}else if (check.contains("WTF")){
				Random galet =  new Random();
				display.setText("VAFANDERPHERP");
				display.setTextSize(galet.nextInt(75));
				display.setTextColor(Color.rgb(galet.nextInt(255), galet.nextInt(255), galet.nextInt(255)));
				switch(galet.nextInt(3)){
				case 0:
					display.setGravity(Gravity.LEFT);
					break;
				case 1:
					display.setGravity(Gravity.CENTER);
					break;
				case 2:
					display.setGravity(Gravity.RIGHT);
					break;
					
				}
			}else{
				display.setText("invalid");
				display.setGravity(Gravity.CENTER);
				display.setTextColor(Color.WHITE);
			}
			break;
			
		case R.id.tbPassword:
			
			if (passwordToggle.isChecked()){
				input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
			}else{
				input.setInputType(InputType.TYPE_CLASS_TEXT);
			}
			break;
			
		}
		
	}
	

}
