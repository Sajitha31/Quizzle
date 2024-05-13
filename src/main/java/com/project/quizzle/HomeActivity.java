package com.project.quizzle;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputLayout;

public class HomeActivity extends AppCompatActivity {

    TextInputLayout name_lay;
    EditText name_reg;
    TextView about;
    Button start;

    private InputValidation inputValidation;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        name_lay = (TextInputLayout)findViewById(R.id.textInputLayout);
        name_reg = (EditText)findViewById(R.id.editText1);
        start = (Button)findViewById(R.id.btn1);
        about = (TextView)findViewById(R.id.textView1);

        inputValidation = new InputValidation(HomeActivity.this);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inputValidation.isInputEditTextFilled(name_reg, name_lay, "Please enter your name")) {

                    return;
                }

                else {

                    String ed_text = name_reg.getText().toString().trim();
                    Intent intent1 = new Intent(HomeActivity.this,Quiz_Activity1.class);
                    intent1.putExtra("message_key",ed_text);
                    startActivity(intent1);

                }
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(HomeActivity.this, About_activity.class);
                startActivity(intent2);
            }
        });

    }
}