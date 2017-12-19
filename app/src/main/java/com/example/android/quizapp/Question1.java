package com.example.android.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Question1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question1);


    }

        int score ;

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.question_1_answer_1:
                if (checked)
                    // Pirates are the best

                    break;
            case R.id.question_1_answer_2:
                if (checked)
                    score = 1;


                // Ninjas rule
                break;
            case R.id.question_1_answer_3:
                if (checked)

                    // Ninjas rule
                    break;
        }
        Log.d("SCORE", "value: " + score);
    }
    public void onClickNext(View view) {
        Intent myIntent = new Intent(this, question2.class);
        Bundle bundle = new Bundle();
        bundle.putInt("score",score);

        myIntent.putExtras(bundle);

        startActivity(myIntent);


        Log.d("SCORE", "value: " + score);
    }

    public void onClickBack(View view) {
        Intent Intent = new Intent(this, MainActivity.class);
        startActivity(Intent);
    }


}

