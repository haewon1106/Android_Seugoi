//package com.cookandroid.seugoi;
//
//import android.annotation.SuppressLint;
//import android.content.Intent;
//import android.os.Bundle;
//import android.widget.TextView;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//public class study_join_intro_manager extends AppCompatActivity {
//
//    TextView study_Name, hashtag, study_Title, study_Explain, work1, work2, work3, studyWork, recom1, recom2, recom3;
//    @SuppressLint("MissingInflatedId")
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.study_join_intro_manager);
//
//        // TextView
//        study_Name = findViewById(R.id.study_Name);
//        hashtag = findViewById(R.id.hashtag);
//        study_Title = findViewById(R.id.study_Title);
//        study_Explain = findViewById(R.id.study_Explain);
//        work1 = findViewById(R.id.work1);
//        work2 = findViewById(R.id.work2);
//        work3 = findViewById(R.id.work3);
//        studyWork = findViewById(R.id.studyWork);
//        recom1 = findViewById(R.id.recom1);
//        recom2 = findViewById(R.id.recom2);
//        recom3 = findViewById(R.id.recom3);
//
//        Intent intent = getIntent();
//
//        // input_study_info
//        study_Name.setText(intent.getStringExtra("studyName"));
//        hashtag.setText(intent.getStringExtra("studyTag"));
//        study_Title.setText(intent.getStringExtra("studyTitle"));
//        study_Explain.setText(intent.getStringExtra("studyExplain"));
//
//        // input_study_ex
//        work1.setText(intent.getStringExtra("studyWork1"));
//        work2.setText(intent.getStringExtra("studyWork2"));
//        work3.setText(intent.getStringExtra("studyWork3"));
//        studyWork.setText(intent.getStringExtra("work"));
//        recom1.setText(intent.getStringExtra("re1"));
//        recom2.setText(intent.getStringExtra("re2"));
//        recom3.setText(intent.getStringExtra("re3"));
//    }
//}
