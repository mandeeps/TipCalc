package com.mandeepshergill.tipcalc;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	EditText costField;
	EditText percField;
	TextView answer;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
        Button btn = (Button) findViewById(R.id.button1);
        btn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				EditText costField = (EditText)findViewById(R.id.editText1);
				EditText percField = (EditText)findViewById(R.id.editText2);
				TextView answer = (TextView)findViewById(R.id.textView2);
        		double cost = Double.parseDouble(costField.getText().toString());
        		double percent = Double.parseDouble(percField.getText().toString());
        		double tip = (percent * 0.01) * cost;
        		String display = "" + tip; 
        		answer.setText(display);
			}
        });
    }
}