package com.example.count2;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

	TextView kko;
	TextView jyou; // test
	int num;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		num = 0;

		kko = (TextView) findViewById(R.id.textView1);
		jyou = (TextView) findViewById(R.id.textView2);
		kko.setText(String.valueOf(num));
	}

	public void plus(View v) {
		num = num + 1;
		kko.setText(String.valueOf(num));
		if (num % 3 == 0) {
			jyou.setText("3の倍数だよ〜");
		}
	}

	public void minasu(View v) {
		num = num - 1;
		kko.setText(String.valueOf(num));
		if (num % 3 == 0) {
			jyou.setText("3の倍数だよ〜");
		}
	}

	public void clia(View v) {
		num = 0;
		kko.setText(String.valueOf(num));

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
