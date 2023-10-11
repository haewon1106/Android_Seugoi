package com.cookandroid.seugoi;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class main extends AppCompatActivity {
    FrameLayout btnMystudy, btnGostudy;
    EditText search;
    TextView yourName, studyTitle, hashTag1, hashTag2, hashTag3, Dday, studyName, day, tag1, tag2, tag3;
    ImageView studyImage, studyImg;
    View nowIng;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // FrameLayout
        btnMystudy = findViewById(R.id.btnMystudy);
        btnGostudy = findViewById(R.id.btnGostudy);

        // EditText
        search = findViewById(R.id.search);

        // TextView
        yourName = findViewById(R.id.yourName);
        studyTitle = findViewById(R.id.studyTitle);
        hashTag1 = findViewById(R.id.hashTag1);
        hashTag2 = findViewById(R.id.hashTag2);
        hashTag3 = findViewById(R.id.hashTag3);
        Dday = findViewById(R.id.Dday);
        studyName = findViewById(R.id.studyName);
        day = findViewById(R.id.day);
        tag1 = findViewById(R.id.tag1);
        tag2 = findViewById(R.id.tag2);
        tag3 = findViewById(R.id.tag3);

        // ImageView
        studyImage = findViewById(R.id.studyImage);
        studyImg = findViewById(R.id.studyImg);

        // View
        nowIng = findViewById(R.id.nowIng);

        // btnMystudy을 누르면 study_screen_manager 화면으로 이동
        btnMystudy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), study_screen_manager.class);
                startActivity(intent);
            }
        });

        // btnGostudy을 누르면 study_join_intro 화면으로 이동
        btnGostudy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), study_join_intro.class);
                startActivity(intent);
            }
        });
    }
}

