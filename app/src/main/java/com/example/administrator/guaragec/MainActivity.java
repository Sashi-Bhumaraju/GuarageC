package com.example.administrator.guaragec;

import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View decorView = getWindow().getDecorView();
        int uiOPtions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOPtions);

       new  Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
            }
        },2100);
        LinearLayout l=(LinearLayout)findViewById(R.id.layout);
       l.setBackgroundResource(R.drawable.home);
    }
}
