package com.littlewhywhat.hello.android.ui;

import com.littlewhywhat.hello.android.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.support.design.widget.Snackbar;
import android.support.design.widget.FloatingActionButton;

public class MainActivity extends Activity {
	private final static String HELLO_ANDROID = "Hello Android!";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.main);
		this.setupActionButton();
	}

	private void setupActionButton() {
		getActionButton().setOnClickListener(new View.OnClickListener() {
		    @Override
		    public void onClick(View view) {
		        Snackbar.make(view, HELLO_ANDROID, Snackbar.LENGTH_LONG)
		                .setAction("Action", null).show();
		    }
		});
	}

	private FloatingActionButton getActionButton() {
		return (FloatingActionButton)findViewById(R.id.fab);
	}
}