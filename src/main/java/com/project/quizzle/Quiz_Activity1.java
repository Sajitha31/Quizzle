package com.project.quizzle;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Quiz_Activity1 extends AppCompatActivity {

    RadioButton opn11, opn12, opn13, opn14;
    TextView receive_intent_msg, score1;
    Button nxt, quit;

    ImageView back_ic1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_page1);

        quit = (Button)findViewById(R.id.quit1);
        nxt = (Button)findViewById(R.id.nxt1) ;

        receive_intent_msg = (TextView)findViewById(R.id.textViewMsg);

        Intent intent = getIntent();
        String str = intent.getStringExtra("message_key");
        String str_new = "Hello "+ str;
        receive_intent_msg.setText(str_new);

        opn11 = (RadioButton)findViewById(R.id.radioButton);
        opn12 = (RadioButton)findViewById(R.id.radioButton4);
        opn13 = (RadioButton)findViewById(R.id.radioButton5);
        opn14 = (RadioButton)findViewById(R.id.radioButton6);
        score1 = (TextView)findViewById(R.id.textViewScore1);

        String s1 = score1.getText().toString().trim();

        nxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int s01 = Integer.parseInt(score1.getText().toString().trim());
                if(opn12.isChecked()){

                    Toast.makeText(Quiz_Activity1.this, "Correct Answer", Toast.LENGTH_SHORT).show();

                    s01++;
                    String s2 = Integer.toString(s01);
                    score1.setText(s2);


                    Intent intent11 = new Intent(Quiz_Activity1.this, Quiz_Activity2.class);
                    intent11.putExtra("message_key1",s2);
                    startActivity(intent11);

                }
                else {

                    Toast.makeText(Quiz_Activity1.this, "Wrong Answer", Toast.LENGTH_SHORT).show();

                    Intent intent11 = new Intent(Quiz_Activity1.this, Quiz_Activity2.class);
                    intent11.putExtra("message_key1",s1);
                    startActivity(intent11);

                }

            }
        });


        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent12 = new Intent(Quiz_Activity1.this, HomeActivity.class);
                startActivity(intent12);
            }
        });

        back_ic1 = (ImageView)findViewById(R.id.back_icon1);
        back_ic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent_tool1 = new Intent(Quiz_Activity1.this, HomeActivity.class);
                startActivity(intent_tool1);

            }
        });

    }
}