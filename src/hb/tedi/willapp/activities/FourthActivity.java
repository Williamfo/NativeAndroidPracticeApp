/**
 * 
 */
package hb.tedi.willapp.activities;

import hb.tedi.willapp.R;
import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

/**
 * @author StaggerLee
 *
 */
public class FourthActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fourth);
		// The activity is being created.

		TextView myText = (TextView) findViewById(R.id.textView1);
		EditText et1 = (EditText) findViewById(R.id.et1);

		myTextWatcher twatch = new myTextWatcher(myText);
		et1.addTextChangedListener(twatch);

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

}
