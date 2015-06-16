/**
 * 
 */
package hb.tedi.willapp;

import android.app.Activity;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;

/**
 * @author StaggerLee
 *
 */
public class GPSActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gps);
		// The activity is being created.
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
	String locationProvider = LocationManager.NETWORK_PROVIDER;
	// Or use LocationManager.GPS_PROVIDER

	Location lastKnownLocation = LocationManager.getLastKnownLocation(locationProvider);
	
	
	
	}

}
