package com.example.android.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class question3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question3);
    }
    Bundle bundle = this.getIntent().getExtras();
    String score = bundle.getString("score");

    public void onRadioButtonClicked(View view) {


    }

    public void onClickNext(View view) {
        Intent Intent = new Intent(this, question4.class);
        Intent.putExtra("score",score);
        startActivity(Intent);
    }

    public void onClickBack(View view) {
        Intent Intent = new Intent(this, question2.class);
        startActivity(Intent);
    }


}

