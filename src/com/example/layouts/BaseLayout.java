package com.example.layouts;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

/**!
 * 建立一个基类，并实现按钮的点击事件
 * */
public class BaseLayout extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}

	public void openAlert() {

		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("提示");
		builder.setMessage("要返回上一个界面吗?");
		builder.setPositiveButton("确认",
				new android.content.DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						dialog.dismiss();
						BaseLayout.this.finish();
					}
				});
		
		builder.setNegativeButton("取消", null);
		
		builder.show();

	}
}
