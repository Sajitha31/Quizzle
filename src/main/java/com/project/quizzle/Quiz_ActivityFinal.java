package com.project.quizzle;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Quiz_ActivityFinal extends AppCompatActivity {

    RadioButton opn51, opn52, opn53, opn54;
    TextView score5;
    Button quit5, nxt5;
    ImageView back_ic5;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_pagefinal);

        quit5 = findViewById(R.id.btn52);
        nxt5 = (Button)findViewById(R.id.btn51) ;

        opn51 = (RadioButton)findViewById(R.id.radioButton51);
        opn52 = (RadioButton)findViewById(R.id.radioButton52);
        opn53 = (RadioButton)findViewById(R.id.radioButton53);
        opn54 = (RadioButton)findViewById(R.id.radioButton54);
        score5 = (TextView)findViewById(R.id.textViewScore5);

        Intent int51 = getIntent();
        String scr5 = int51.getStringExtra("message_key4");
        score5.setText(scr5);

        nxt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(opn54.isChecked()){

                    Toast.makeText(Quiz_ActivityFinal.this, "Correct Answer", Toast.LENGTH_SHORT).show();

                    Intent intent51 = getIntent();
                    String s51 = intent51.getStringExtra("message_key4");
                    int s52 = Integer.parseInt(s51);
                    s52++;
                    String s53 = Integer.toString(s52);
                    score5.setText(s53);


                    Intent intent52 = new Intent(Quiz_ActivityFinal.this, ResultActivity.class);
                    intent52.putExtra("message_key5",s53);
                    startActivity(intent52);

                }
                else {

                    Toast.makeText(Quiz_ActivityFinal.this, "Wrong Answer", Toast.LENGTH_SHORT).show();

                    Intent intent52 = new Intent(Quiz_ActivityFinal.this, ResultActivity.class);
                    intent52.putExtra("message_key5",scr5);
                    startActivity(intent52);

                }
            }
        });

        quit5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent52 = new Intent(Quiz_ActivityFinal.this, HomeActivity.class);
                startActivity(intent52);
            }
        });

        back_ic5 = (ImageView)findViewById(R.id.back_icon5);
        back_ic5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent_tool5 = new Intent(Quiz_ActivityFinal.this, Quiz_Activity4.class);
                startActivity(intent_tool5);

            }
        });

    }
}