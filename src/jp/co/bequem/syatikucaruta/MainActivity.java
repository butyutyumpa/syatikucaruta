package jp.co.bequem.syatikucaruta;

import org.androidannotations.annotations.EActivity;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
@EActivity(R.layout.activity_main)
public class MainActivity extends Activity {

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
