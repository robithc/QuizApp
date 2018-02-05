package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;



public class results extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.results);

        Intent intent = getIntent();
        String question1Ans = intent.getStringExtra(Question1.question1Answer);
        int question2Ans = intent.getIntExtra(question2.question2Answer,-1);
        int question3Ans = intent.getIntExtra(question3.question3Answer,-1);
        int question4Ans = intent.getIntExtra(question4.question4Answer,-1);
        boolean[] question5Ans = intent.getBooleanArrayExtra(question5.question5Answer);

        calculateScore(question1Ans, question2Ans, question3Ans, question4Ans, question5Ans);
    }


    private void calculateScore(String answer1, int answer2, int answer3, int answer4, boolean[] answer5)
    {

        int score = 0;
        if (answer1.toLowerCase().equals("florentino perez"))
        {
            score++;
        }

        if (answer2 == 1)
        {
            score++;
        }

        if (answer3 == 2)
        {
            score++;
        }

        if (answer4 == 1)
        {
            score++;
        }

        for (int i = 0; i < 4; i++)
        {
            if (answer5[i])
            {
                score++;
            }
        }



        String scoreMessage = getString(R.string.score) +" "+ score;

        Toast scoreToast = Toast.makeText(this, scoreMessage, Toast.LENGTH_LONG);
        scoreToast.show();
    }
}
