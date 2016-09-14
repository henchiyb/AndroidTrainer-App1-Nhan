package com.example.nhan.pokemonquizzapp1.activities;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.nhan.pokemonquizzapp1.R;
import com.example.nhan.pokemonquizzapp1.constants.Constant;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton btnPlay;
    private ImageButton btnSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setFullScreen();
        init();
    }

    public void setFullScreen() {
        if (Build.VERSION.SDK_INT < 19) {
            getWindow().getDecorView().setSystemUiVisibility(View.GONE);
        } else {
            getWindow().getDecorView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        }
    }

    private void init(){
        btnPlay = (ImageButton) findViewById(R.id.btn_play);
        btnSetting = (ImageButton) findViewById(R.id.btn_setting);
//        btnPlay.setLayoutParams(new LinearLayout.LayoutParams((int)Constant.getActivityWidth(this)/3,
//                (int)Constant.getActivityWidth(this)/3));
        int height = btnPlay.getLayoutParams().height;
        int width = btnPlay.getLayoutParams().width;

        btnPlay.setLayoutParams(new RelativeLayout.LayoutParams(width,height));
        btnPlay.setY(Constant.getActivityHeight(this)*5.11f/8.22f - height/2);
        btnPlay.setX(Constant.getActivityWidth(this)/2 - width/2);

        btnPlay.setOnClickListener(this);
        btnSetting.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_play:
                Intent intent = new Intent(HomeActivity.this, PlayActivity.class);
                startActivity(intent);
                break;
        }
    }
}
