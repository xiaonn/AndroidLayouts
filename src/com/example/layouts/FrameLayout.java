package com.example.layouts;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**!
 * 框架布局
 * */
public class FrameLayout extends BaseLayout {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.framelayout);
		
		Button button = (Button)findViewById(R.id.frameButton);
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				openAlert();
			}
		});
	}
	
}
