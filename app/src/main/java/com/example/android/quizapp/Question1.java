package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class Question1 extends AppCompatActivity {

    public static final String question1Answer = "com.example.android.quizapp.Answer1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question1);
    }


    public void goToQuestion2(View view) {

        String answer = ((EditText) findViewById(R.id.question_1_edit_text)).getText().toString();


        Intent intent = new Intent(this, question2.class);
        intent.putExtra(question1Answer, answer);
        startActivity(intent);
    }
}
