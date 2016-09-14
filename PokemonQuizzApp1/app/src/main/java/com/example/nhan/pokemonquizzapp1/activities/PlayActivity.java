package com.example.nhan.pokemonquizzapp1.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.nhan.pokemonquizzapp1.R;
import com.example.nhan.pokemonquizzapp1.database.DatabaseAsset;
import com.example.nhan.pokemonquizzapp1.models.Pokemon;

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

        DatabaseAsset databaseAsset = DatabaseAsset.getInstance(this.getBaseContext());
        databaseAsset.open();
        pokemonList = databaseAsset.getDataPokemon();
        databaseAsset.close();

        imagePokemon.set
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_ans_a:

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
