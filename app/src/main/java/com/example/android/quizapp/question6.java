package com.example.android.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class question6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question6);
    }
    Bundle bundle = this.getIntent().getExtras();
    String score = bundle.getString("score");

    public void onRadioButtonClicked(View view) {


    }

    public void onClickBack(View view) {
        Intent Intent = new Intent(this, question5.class);
        Intent.putExtra("score",score);
        startActivity(Intent);
    }

    public void onClickSubmitAnswer(View view) {
        Toast.makeText(this,"Your score is: " + score,Toast.LENGTH_LONG).show();
    }


}

