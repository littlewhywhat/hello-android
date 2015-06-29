package com.littlewhywhat.hello.android.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
	private final static String HELLO_ANDROID = "Hello Android!";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		final RelativeLayout layout = new RelativeLayout(this);
		final TextView textView = new TextView(this);
		textView.setText(HELLO_ANDROID);
		layout.addView(textView);
		this.setContentView(layout);
	}
}