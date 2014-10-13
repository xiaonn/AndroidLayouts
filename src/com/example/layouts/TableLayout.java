package com.example.layouts;

import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class TableLayout extends BaseLayout {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tablelayout);
		
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
