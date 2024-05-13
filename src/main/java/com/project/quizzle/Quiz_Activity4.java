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

import androidx.appcompat.app.AppCompatActivity;

public class Quiz_Activity4 extends AppCompatActivity {

    Button quit4, nxt4;
    RadioButton opn41, opn42, opn43, opn44;
    TextView score4;
    ImageView back_ic4;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_page4);

        quit4 = (Button)findViewById(R.id.btn42);
        nxt4 = (Button)findViewById(R.id.btn41) ;

        opn41 = (RadioButton)findViewById(R.id.radioButton41);
        opn42 = (RadioButton)findViewById(R.id.radioButton42);
        opn43 = (RadioButton)findViewById(R.id.radioButton43);
        opn44 = (RadioButton)findViewById(R.id.radioButton44);
        score4 = (TextView)findViewById(R.id.textViewScore4);


        Intent int41 = getIntent();
        String scr4 = int41.getStringExtra("message_key3");
        score4.setText(scr4);

        nxt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(opn43.isChecked()){

                    Toast.makeText(Quiz_Activity4.this, "Correct Answer", Toast.LENGTH_SHORT).show();

                    Intent intent41 = getIntent();
                    String s41 = intent41.getStringExtra("message_key3");
                    int s42 = Integer.parseInt(s41);
                    s42++;
                    String s43 = Integer.toString(s42);
                    score4.setText(s43);


                    Intent intent42 = new Intent(Quiz_Activity4.this, Quiz_ActivityFinal.class);
                    intent42.putExtra("message_key4",s43);
                    startActivity(intent42);

                }
                else {

                    Toast.makeText(Quiz_Activity4.this, "Wrong Answer", Toast.LENGTH_SHORT).show();

                    Intent intent42 = new Intent(Quiz_Activity4.this, Quiz_ActivityFinal.class);
                    intent42.putExtra("message_key4",scr4);
                    startActivity(intent42);

                }

            }
        });


        quit4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent43 = new Intent(Quiz_Activity4.this, HomeActivity.class);
                startActivity(intent43);
            }
        });

        back_ic4 = (ImageView)findViewById(R.id.back_icon4);
        back_ic4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent_tool4 = new Intent(Quiz_Activity4.this, Quiz_Activity3.class);
                startActivity(intent_tool4);

            }
        });
    }
}