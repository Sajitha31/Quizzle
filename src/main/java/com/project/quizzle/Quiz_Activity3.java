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

public class Quiz_Activity3 extends AppCompatActivity {

    Button quit3, nxt3;
    RadioButton opn31, opn32, opn33, opn34;
    TextView score3;
    ImageView back_ic3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_page3);

        quit3 = (Button)findViewById(R.id.btn32);
        nxt3 = (Button)findViewById(R.id.btn31) ;

        opn31 = (RadioButton)findViewById(R.id.radioButton31);
        opn32 = (RadioButton)findViewById(R.id.radioButton32);
        opn33 = (RadioButton)findViewById(R.id.radioButton33);
        opn34 = (RadioButton)findViewById(R.id.radioButton34);
        score3 = (TextView)findViewById(R.id.textViewScore3);


        Intent int31 = getIntent();
        String scr3 = int31.getStringExtra("message_key2");
        score3.setText(scr3);

        nxt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(opn31.isChecked()){

                    Toast.makeText(Quiz_Activity3.this, "Correct Answer", Toast.LENGTH_SHORT).show();


                    Intent intent31 = getIntent();
                    String s31 = intent31.getStringExtra("message_key2");
                    int s32 = Integer.parseInt(s31);
                    s32++;
                    String s33 = Integer.toString(s32);
                    score3.setText(s33);


                    Intent intent32 = new Intent(Quiz_Activity3.this, Quiz_Activity4.class);
                    intent32.putExtra("message_key3",s33);
                    startActivity(intent32);

                }
                else {

                    Toast.makeText(Quiz_Activity3.this, "Wrong Answer", Toast.LENGTH_SHORT).show();

                    Intent intent32 = new Intent(Quiz_Activity3.this, Quiz_Activity4.class);
                    intent32.putExtra("message_key3",scr3);
                    startActivity(intent32);

                }

            }
        });


        quit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent33 = new Intent(Quiz_Activity3.this, HomeActivity.class);
                startActivity(intent33);
            }
        });

        back_ic3 = (ImageView)findViewById(R.id.back_icon3);
        back_ic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent_tool3 = new Intent(Quiz_Activity3.this, Quiz_Activity2.class);
                startActivity(intent_tool3);

            }
        });
    }
}