package com.example.android.quizapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Question1 extends AppCompatActivity {
    int score ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question1);





    }



    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {

            case R.id.question_1_answer_1:
                if (checked)


                    break;
                //correct answer
            case R.id.question_1_answer_2:
                if (checked)
                    score = 1;



                break;
            case R.id.question_1_answer_3:
                if (checked)


                    break;
        }
        Log.d("SCORE", "value: " + score);
    }


    public void onClickNext(View view) {


        Intent intentBundle = new Intent(this, question2.class);
        Bundle bundle = new Bundle();
        bundle.putInt("scoreValue",score);
        intentBundle.putExtras(bundle);
        startActivity(intentBundle);


        Log.d("SCORE", "value: " + score);
    }

    public void onClickBack(View v) {
        Intent Intent = new Intent(this, MainActivity.class);
        startActivity(Intent);
    }


}

