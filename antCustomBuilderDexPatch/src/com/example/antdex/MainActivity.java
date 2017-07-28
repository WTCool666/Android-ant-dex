package com.example.antdex;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void btn_on1(View view){
		ToastUtil.toast(this, "button1");
	}
	
	public void btn_on2(View view){
		ToastUtil.toast(this, "button2");
	}
	
	public void btn_on3(View view){
		ToastUtil.toast(this, "button3");
	}
	
	public void btn_on4(View view){
		ToastUtil.toast(this, "button4");
	}
	
	public void btn_on5(View view){
		Intent intent=new Intent(this, SecondActivity.class);
		startActivity(intent);
	}
}
