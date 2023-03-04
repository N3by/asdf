package com.example.app_repaso_def;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class userDataActiviy extends AppCompatActivity {

    EditText etxUserNameReceive, etxUserCodeReceive;
    TextView etxGradeReceived;
    Button btnGoBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_data);

        etxUserNameReceive = findViewById(R.id.etxUserNameReceive);
        etxUserCodeReceive = findViewById(R.id.etxUserCodeReceive);
        etxGradeReceived = findViewById(R.id.etxGradeReceived);
        /* ************** botton ************* */

        btnGoBack = findViewById(R.id.btnGoBack);

        /* ************** botton ************* */

        btnGoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vuelve = new Intent(userDataActiviy.this, UserActivity.class);
                startActivity(vuelve);
            }
        });

        /* ************** botton ************* */


        etxUserNameReceive.setText(getIntent().getStringExtra("namePerson"));
        etxUserCodeReceive.setText(getIntent().getStringExtra("studentCode"));
        etxGradeReceived.setText(getIntent().getStringExtra("finalGrade"));

    }

}