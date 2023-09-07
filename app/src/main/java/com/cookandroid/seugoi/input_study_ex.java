package com.cookandroid.seugoi;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class input_study_ex extends AppCompatActivity {
    EditText work1, work2, work3, studyWork, recom1, recom2, recom3;
    Button btnNext;

    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_study_ex);

        // EditText
        work1 = findViewById(R.id.work1);
        work2 = findViewById(R.id.work2);
        work3 = findViewById(R.id.work3);
        studyWork = findViewById(R.id.studyWork);
        recom1 = findViewById(R.id.recom1);
        recom2 = findViewById(R.id.recom2);
        recom3 = findViewById(R.id.recom3);

        // Button
        btnNext = findViewById(R.id.btnNext);

        // btnNext을 누르면 create_study 화면으로 이동
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), create_study.class);
                startActivity(intent);
            }
        });
    }
}
