package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.RadioGroup;


public class question2 extends AppCompatActivity {


    public static final String question2Answer = "com.example.android.quizapp.Answer2";


    private String question1Ans = "";


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question2);


        Intent intent = getIntent();
        question1Ans = intent.getStringExtra(Question1.question1Answer);


    }


    public void goToQuestion3(View view) {

        int answer = ((RadioGroup) findViewById(R.id.question_2_answer)).getCheckedRadioButtonId();


        switch (answer) {
            case R.id.question_2_answer_1:
                answer = 0;
                break;
            case R.id.question_2_answer_2:
                answer = 1;
                break;
            case R.id.question_2_answer_3:
                answer = 2;
                break;
        }


        Intent intent = new Intent(this, question3.class);
        intent.putExtra(Question1.question1Answer, question1Ans);
        intent.putExtra(question2.question2Answer, answer);
        startActivity(intent);
    }
}










