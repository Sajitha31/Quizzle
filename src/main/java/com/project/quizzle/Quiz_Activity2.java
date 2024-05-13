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

public class Quiz_Activity2 extends AppCompatActivity {

    RadioButton opn21, opn22, opn23, opn24;
    TextView score2;
    Button quit2, nxt2;
    ImageView back_ic2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_page2);

        quit2 = (Button)findViewById(R.id.btn22);
        nxt2 = (Button)findViewById(R.id.btn21) ;

        opn21 = (RadioButton)findViewById(R.id.radioButton21);
        opn22 = (RadioButton)findViewById(R.id.radioButton22);
        opn23 = (RadioButton)findViewById(R.id.radioButton23);
        opn24 = (RadioButton)findViewById(R.id.radioButton24);
        score2 = (TextView)findViewById(R.id.textViewScore2);

        Intent int21 = getIntent();
        String scr2 = int21.getStringExtra("message_key1");
        score2.setText(scr2);


        nxt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(opn22.isChecked()){

                    Toast.makeText(Quiz_Activity2.this, "Correct Answer", Toast.LENGTH_SHORT).show();


                    Intent intent21 = getIntent();
                    String s21 = intent21.getStringExtra("message_key1");
                    int s22 = Integer.parseInt(s21);
                    s22++;
                    String s23 = Integer.toString(s22);
                    score2.setText(s23);

                    Intent intent22 = new Intent(Quiz_Activity2.this, Quiz_Activity3.class);
                    intent22.putExtra("message_key2",s23);
                    startActivity(intent22);

                }
                else {

                    Toast.makeText(Quiz_Activity2.this, "Wrong Answer", Toast.LENGTH_SHORT).show();

                    Intent intent22 = new Intent(Quiz_Activity2.this, Quiz_Activity3.class);
                    intent22.putExtra("message_key2",scr2);
                    startActivity(intent22);

                }

            }
        });


        quit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent23 = new Intent(Quiz_Activity2.this, HomeActivity.class);
                startActivity(intent23);
            }
        });

        back_ic2 = (ImageView)findViewById(R.id.back_icon2);
        back_ic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent_tool2 = new Intent(Quiz_Activity2.this, Quiz_Activity1.class);
                startActivity(intent_tool2);

            }
        });

    }
}