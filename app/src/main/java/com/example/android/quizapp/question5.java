package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;


public class question5 extends AppCompatActivity {


    public static final String question5Answer = "com.example.android.aquizapp.Answer5";


    private String question1Ans = "";
    private int question2Ans = -1;
    private int question3Ans = -1;
    private int question4Ans = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question5);


        Intent intent = getIntent();
        question1Ans = intent.getStringExtra(Question1.question1Answer);
        question2Ans = intent.getIntExtra(question2.question2Answer, -1);
        question3Ans = intent.getIntExtra(question3.question3Answer, -1);
        question4Ans = intent.getIntExtra(question4.question4Answer, -1);
    }

    public void getScore(View view) {

        boolean[] answer = new boolean[4];
        answer[0] = ((CheckBox) findViewById(R.id.checkbox1)).isChecked();
        answer[1] = ((CheckBox) findViewById(R.id.checkbox2)).isChecked();
        answer[2] = ((CheckBox) findViewById(R.id.checkbox3)).isChecked();
        answer[3] = ((CheckBox) findViewById(R.id.checkbox4)).isChecked();


        Intent intent = new Intent(this, results.class);
        intent.putExtra(Question1.question1Answer, question1Ans);
        intent.putExtra(question2.question2Answer, question2Ans);
        intent.putExtra(question3.question3Answer, question3Ans);
        intent.putExtra(question4.question4Answer, question4Ans);
        intent.putExtra(question5.question5Answer, answer);

        startActivity(intent);
    }
}