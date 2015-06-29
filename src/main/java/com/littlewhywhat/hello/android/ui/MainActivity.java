package com.littlewhywhat.hello.android.ui;

import com.littlewhywhat.hello.android.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
	private final static String HELLO_ANDROID = "Hello Android!";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.main);
		getHello().setText(HELLO_ANDROID);
	}

	private TextView getHello() {
		return (TextView)findViewById(R.id.hello);
	}
}