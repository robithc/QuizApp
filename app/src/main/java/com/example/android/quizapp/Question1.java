package com.example.android.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Question1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question1);
    }

    public void onRadioButtonClicked(View view) {


    }

    public void onClickNext(View view) {
        Intent Intent = new Intent(this, question2.class);
        startActivity(Intent);
    }

    public void onClickBack(View view) {
        Intent Intent = new Intent(this, MainActivity.class);
        startActivity(Intent);
    }


}

