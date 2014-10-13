package com.example.layouts;

import java.util.ArrayList;
import java.util.HashMap;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;

/**!
 * 主页面
 * */
public class MainActivity extends ListActivity {

	//建立一个类名字的数组
	String[] classNames ={"com.example.layouts.LinearLayout","com.example.layouts.FrameLayout","com.example.layouts.AbsoluteLayout","com.example.layouts.RelativeLayout","com.example.layouts.TableLayout"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		//建立一个数组并且用一个for循环获取数据
		ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String,String>>();
		String[] tableNames = {"线性布局","框架布局","绝对布局","相对布局","表格布局"};
		
		for (int i = 0; i < tableNames.length; i++) {
			String name = tableNames[i];
			HashMap<String, String>map = new HashMap<String, String>();
			map.put("style_number", String.valueOf(i));
			map.put("style_name",name);
			list.add(map);
		}
		
		//简单的适配器，与listView配套使用
		SimpleAdapter listAdapter = new SimpleAdapter(this, list, R.layout.user, new String[]{"style_number" , "style_name"}, new int[]{R.id.style_number , R.id.style_name});  
	    setListAdapter(listAdapter);
	    
	}
	
	//listView点击事件的触发器，通过重写onListItemClick方法
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		
		//动态加载需要跳转的类
		String className = classNames[position];
		try {
			Class<?> nextClass = Class.forName(className);
			System.out.println(nextClass);
			Intent intent = new Intent();
			intent.setClass(this, nextClass);
			startActivity(intent);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("there's no target class");
			e.printStackTrace();
		}
		
	}

}
