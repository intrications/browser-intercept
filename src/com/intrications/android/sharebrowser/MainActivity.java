package com.intrications.android.sharebrowser;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		Intent sendIntent = new Intent();
		sendIntent.setAction(Intent.ACTION_SEND);
		sendIntent.putExtra(Intent.EXTRA_TEXT, getIntent().getDataString());
		sendIntent.setType("text/plain");
		startActivity(Intent.createChooser(sendIntent, "Share " + getIntent()
				.getDataString()));
		finish();
	}
}
