package com.example.layouts;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**!
 * 相对布局
 * */
public class RelativeLayout extends BaseLayout {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.relativelayout);
		
		Button button = (Button)findViewById(R.id.ok);
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				openAlert();
			}
		});
	}
}
