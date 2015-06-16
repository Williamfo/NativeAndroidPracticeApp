package hb.tedi.willapp;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

public class myTextWatcher implements TextWatcher {

	private TextView tv;

	public myTextWatcher(TextView tv) {
		this.tv = tv;
	}

	public TextView getTv() {
		return tv;
	}

	public void setTv(TextView tv) {
		this.tv = tv;
	}

	@Override
	public void beforeTextChanged(CharSequence s, int start, int count,
			int after) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTextChanged(CharSequence s, int start, int before, int count) {
		// TODO Auto-generated method stub
		s.toString();
		StringBuffer sb = new StringBuffer(s);
		tv.setText(sb.reverse());

	}

	@Override
	public void afterTextChanged(Editable s) {
		// TODO Auto-generated method stub

	}

}
