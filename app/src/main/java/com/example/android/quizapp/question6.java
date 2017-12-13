package com.example.android.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class question6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question6);
    }

    public void onRadioButtonClicked(View view) {


    }

    public void onClickNext(View view) {
        Intent Intent = new Intent(this, test.class);
        startActivity(Intent);
    }

    public void onClickBack(View view) {
        Intent Intent = new Intent(this, question5.class);
        startActivity(Intent);
    }


}

