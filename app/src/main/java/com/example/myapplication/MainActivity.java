package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public MediaPlayer mediac1, mediac2, mediac3,mediac4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mediac1 =MediaPlayer.create(this,R.raw.c1_rec);
        mediac2 =MediaPlayer.create(this,R.raw.c2_rec);

        mediac3 =MediaPlayer.create(this,R.raw.c3_rec);

        mediac4 =MediaPlayer.create(this,R.raw.c4_rec);


    }




    public void clickNew(View c){
        if(c.getId() == R.id.ka_id)
            mediac1.start();
        if(c.getId()==R.id.kha_id)
            mediac2.start();
        if(c.getId() == R.id.ga_id)
            mediac3.start();
        if(c.getId() == R.id.gha_id)
            mediac4.start();

    }
}
