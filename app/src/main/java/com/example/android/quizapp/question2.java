package com.example.android.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class question2 extends AppCompatActivity {



   Intent intentExtras = getIntent();
   Bundle extrasBundle = intentExtras.getExtras();


    int score = extrasBundle.getInt("scoreValue");





    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question2);


        }












    public void onRadioButtonClicked(View view) {


    }



    EditText answerEditText = (EditText) findViewById(R.id.question_2_edit_text);
    String name = answerEditText.getText().toString();

    public void getCorrectAnswer() {


        String correctAnswer= "Florentino Perez";
        if (name.equals(correctAnswer))
            score = score +1 ;


    }
    public void onClickNext(View view) {


        Intent Intent = new Intent(this, question3.class);
        Intent.putExtra("score",score);
        startActivity(Intent);
        getCorrectAnswer();
    }

    public void onClickBack(View view) {
        Intent Intent = new Intent(this, Question1.class);
        startActivity(Intent);
    }
}

