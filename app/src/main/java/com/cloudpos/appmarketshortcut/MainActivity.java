package com.cloudpos.appmarketshortcut;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //com.com.cloudpos.appmarket
        //com.com.cloudpos.appmarket.MainActivity
        startActivity(new Intent().setClassName("com.wizarpos.appmarket","com.wizarpos.appmarket.MainActivity"));
        finish();
    }
}