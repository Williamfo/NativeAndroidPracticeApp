/**
 * 
 */
package hb.tedi.willapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.TextView;

/**
 * @author StaggerLee
 *
 */
public class ThirdActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		GridLayout layout = new GridLayout(this);

		TextView thirdtext = new TextView(this);
		EditText et1 = new EditText(this);

		layout.addView(thirdtext);
		// thirdtext.append("Get Ready!");

		layout.addView(et1);

		setContentView(layout);

	}

	@Override
	protected void onStart() {
		super.onStart();
		// The activity is about to become visible.
	}

	@Override
	protected void onResume() {
		super.onResume();
		// The activity has become visible (it is now "resumed").
	}

	@Override
	protected void onPause() {
		super.onPause();
		// Another activity is taking focus (this activity is about to be
		// "paused").
	}

	@Override
	protected void onStop() {
		super.onStop();
		// The activity is no longer visible (it is now "stopped")
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		// The activity is about to be destroyed.
	}

	public void goToMain(View view) {

		Intent intent = new Intent(ThirdActivity.this, MainActivity.class);
		startActivity(intent);
	}

}
