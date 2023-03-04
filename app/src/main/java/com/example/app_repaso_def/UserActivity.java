package com.example.app_repaso_def;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class UserActivity extends AppCompatActivity {

    EditText etxUserName, etxUserCode;
    Button btnConsult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        etxUserName = findViewById(R.id.etxUserName);
        etxUserCode = findViewById(R.id.etxUserCode);

        /* ***** */

        btnConsult = findViewById(R.id.btnConsult);

        /* **Creacion de nota aleatoria*** */

        Random random = new Random();
        int gradeFict = random.nextInt(10);
        final String finalGrade = String.valueOf(gradeFict);
        /* ***** */

        btnConsult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etxUserName.getText().toString().equals("")|| etxUserCode.getText().toString().equals("")){

                    Toast.makeText(UserActivity.this, "Los datos Estan incompletos", Toast.LENGTH_SHORT).show();
                }else{

                    Intent intent = new Intent(UserActivity.this, userDataActiviy.class);
                    intent.putExtra("namePerson", etxUserName.getText().toString());
                    intent.putExtra("studentCode", etxUserCode.getText().toString());
                    intent.putExtra("finalGrade", finalGrade.toString());
                    startActivity(intent);
                }
            }
        });
    }
}
