package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.RadioGroup;


public class question4 extends AppCompatActivity {


    public static final String question4Answer = "com.example.android.quizapp.Answer4";


    private String question1Ans = "";
    private int question2Ans = -1;
    private int question3Ans = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question4);


        Intent intent = getIntent();
        question1Ans = intent.getStringExtra(Question1.question1Answer);
        question2Ans = intent.getIntExtra(question2.question2Answer, -1);
        question3Ans = intent.getIntExtra(question3.question3Answer, -1);
    }

    public void goToQuestion5(View view) {

        int answer = ((RadioGroup) findViewById(R.id.question_4_answer)).getCheckedRadioButtonId();

        switch (answer) {
            case R.id.question_4_answer_1:
                answer = 0;
                break;
            case R.id.question_4_answer_2:
                answer = 1;
                break;
            case R.id.question_4_answer_3:
                answer = 2;
                break;
        }

        Intent intent = new Intent(this, question5.class);
        intent.putExtra(Question1.question1Answer, question1Ans);
        intent.putExtra(question2.question2Answer, question2Ans);
        intent.putExtra(question3.question3Answer, question3Ans);
        intent.putExtra(question4.question4Answer, answer);
        startActivity(intent);
    }


}