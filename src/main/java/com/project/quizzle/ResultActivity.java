package com.project.quizzle;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ResultActivity extends AppCompatActivity {

    TextView right,wrong,final_score;
    Button restart;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_page);

        restart = (Button)findViewById(R.id.btn5);
        right = (TextView)findViewById(R.id.finalScore1);
        wrong = (TextView)findViewById(R.id.finalScore2);
        final_score = (TextView)findViewById(R.id.finalScore);


        Intent int_final = getIntent();
        String s61 = int_final.getStringExtra("message_key5");
        right.setText(s61);
        final_score.setText(s61);

        assert s61 != null;
        int s62 = Integer.parseInt(s61);
        int s63 = 5-s62;
        String s64 = Integer.toString(s63);
        wrong.setText(s64);



        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent6 = new Intent(ResultActivity.this, HomeActivity.class);
                startActivity(intent6);
            }
        });


    }
}