package com.cookandroid.seugoi;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class study_join_intro extends AppCompatActivity {
    Button btnJoin;
    TextView study_Name, hashtag, Dday, study_Title, study_Explain, work1, work2, work3, studyWork, recom1, recom2, recom3;

    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.study_join_intro);

        // Button
        btnJoin = findViewById(R.id.btnJoin);

        // TextView
        study_Name = findViewById(R.id.study_Name);
        hashtag = findViewById(R.id.hashtag);
        Dday = findViewById(R.id.Dday);
        study_Title = findViewById(R.id.study_Title);
        study_Explain = findViewById(R.id.study_Explain);
        work1 = findViewById(R.id.work1);
        work2 = findViewById(R.id.work2);
        work3 = findViewById(R.id.work3);
        studyWork = findViewById(R.id.studyWork);
        recom1 = findViewById(R.id.recom1);
        recom2 = findViewById(R.id.recom2);
        recom3 = findViewById(R.id.recom3);

        Intent intent = getIntent();

        // input_study_info
        // study_Name 불러오기
        String studyName = intent.getStringExtra("studyName");
        study_Name.setText(studyName);
        // hashtag 불러오기
        String studyTag = intent.getStringExtra("studyTag");
        hashtag.setText(studyTag);
        // Dday 불러오기
        String studyDay = intent.getStringExtra("studyDay");
        Dday.setText(studyDay);
        // study_Title 불러오기
        String studyTitle = intent.getStringExtra("studyTitle");
        study_Title.setText(studyTitle);
        // study_Explain 불러오기
        String studyExplain = intent.getStringExtra("studyExplain");
        study_Explain.setText(studyExplain);

        // input_study_ex
        // work1 불러오기
        String studyWork1 = intent.getStringExtra("studyWork1");
        work1.setText(studyWork1);
        // work2 불러오기
        String studyWork2 = intent.getStringExtra("studyWork2");
        work2.setText(studyWork2);
        // work3
        String studyWork3 = intent.getStringExtra("studyWork3");
        work3.setText(studyWork3);
        // studyWork 불러오기
        String work = intent.getStringExtra("work");
        studyWork.setText(work);
        // recom1 불러오기
        String re1 = intent.getStringExtra("re1");
        recom1.setText(re1);
        // recom2 불러오기
        String re2 = intent.getStringExtra("re2");
        recom2.setText(re2);
        // recom3 불러오기
        String re3 = intent.getStringExtra("re3");
        recom3.setText(re3);

        // btnJoin을 누르면 study_screen 화면으로 이동
        btnJoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), study_screen.class);
                startActivity(intent);
            }
        });
    }
}
