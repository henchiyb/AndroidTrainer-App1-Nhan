package com.example.nhan.pokemonquizzapp1.activities;

import android.annotation.TargetApi;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.nhan.pokemonquizzapp1.R;
import com.example.nhan.pokemonquizzapp1.database.DatabaseAsset;
import com.example.nhan.pokemonquizzapp1.models.Pokemon;
import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class PlayActivity extends AppCompatActivity implements View.OnClickListener {

    private ProgressBar progressBar;
    private TextView tvScorePlay;
    private ImageView imagePokemon;
    private TextView btnAnswerA;
    private TextView btnAnswerB;
    private TextView btnAnswerC;
    private TextView btnAnswerD;

    private List<Pokemon> pokemonList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        init();
    }

    private void init(){
        progressBar = (ProgressBar) findViewById(R.id.progress_time);
        tvScorePlay = (TextView) findViewById(R.id.tv_play_score);
        imagePokemon = (ImageView) findViewById(R.id.image_pokemon);
        btnAnswerA = (TextView) findViewById(R.id.btn_ans_a);
        btnAnswerB = (TextView) findViewById(R.id.btn_ans_b);
        btnAnswerC = (TextView) findViewById(R.id.btn_ans_c);
        btnAnswerD = (TextView) findViewById(R.id.btn_ans_d);

        btnAnswerA.setOnClickListener(this);
        btnAnswerB.setOnClickListener(this);
        btnAnswerC.setOnClickListener(this);
        btnAnswerD.setOnClickListener(this);



        Picasso.with(this).load( "file:///android_asset/images/Abra.png").into(imagePokemon);
    }


    private void getData(){
        DatabaseAsset databaseAsset = DatabaseAsset.getInstance(getApplicationContext());
        databaseAsset.open();
        pokemonList = databaseAsset.getDataPokemon();
        databaseAsset.close();
    }
    @Override
    protected void onResume() {
        super.onResume();
//        getData();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_ans_a:
                    btnAnswerA.setBackground(getDrawable(R.drawable.textview_circle_green));
                break;
            case R.id.btn_ans_b:

                break;
            case R.id.btn_ans_c:

                break;
            case R.id.btn_ans_d:

                break;
        }
    }
}
