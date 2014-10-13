package com.example.layouts;

import com.example.layouts.R.string;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**!
 * 线性布局
 * */
public class LinearLayout extends BaseLayout {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.linearlayout);
		
		Button button = (Button)findViewById(R.id.frameButton);
		button.setText(getString(string.test_title,11));
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				openAlert();
			}
		});
	}
}
