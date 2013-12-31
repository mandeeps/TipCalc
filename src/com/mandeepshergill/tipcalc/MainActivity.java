package com.mandeepshergill.tipcalc;

import java.text.NumberFormat;
import java.util.Locale;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
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
	}

	public void calc(View arg0) {
		EditText costField = (EditText)findViewById(R.id.editText1);
		EditText percField = (EditText)findViewById(R.id.editText2);
		TextView answer = (TextView)findViewById(R.id.textView2);
		String tCost = costField.getText().toString();
		String tPerc = percField.getText().toString();
		if (!tCost.trim().equals("") && !tPerc.trim().equals("")) {
			double cost = Double.parseDouble(costField.getText().toString());
			double percent = Double.parseDouble(percField.getText().toString());
			double tip = (percent * 0.01) * cost;
			NumberFormat money = NumberFormat.getCurrencyInstance(Locale.US);
			answer.setText(money.format(tip));
		}
	}
}