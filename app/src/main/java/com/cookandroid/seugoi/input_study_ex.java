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

        Intent intent = new Intent(getApplicationContext(), study_join_intro.class);

        // work1의 문자열을 study_join_intro에 work1(TextView)에 전달하기
        String studyWork1 = String.valueOf(work1.getText());
        intent.putExtra("studyWork1", studyWork1);

        // work2의 문자열을 study_join_intro에 work2(TextView)에 전달하기
        String studyWork2 = String.valueOf(work2.getText());
        intent.putExtra("studyWork2", studyWork2);

        // work3의 문자열을 study_join_intro에 work3(TextView)에 전달하기
        String studyWork3 = String.valueOf(work3.getText());
        intent.putExtra("studyWork3", studyWork3);

        // studyWork의 문자열을 study_join_intro에 studyWork(TextView)에 전달하기
        String work = String.valueOf(studyWork.getText());
        intent.putExtra("work", work);

        // recom1 문자열을 study_join_intro에 recom1(TextView)에 전달하기
        String re1 = String.valueOf(recom1.getText());
        intent.putExtra("re1", re1);

        // recom2 문자열을 study_join_intro에 recom2(TextView)에 전달하기
        String re2 = String.valueOf(recom2.getText());
        intent.putExtra("re2", re2);

        // recom3 문자열을 study_join_intro에 recom3(TextView)에 전달하기
        String re3 = String.valueOf(recom3.getText());
        intent.putExtra("re3", re3);

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
