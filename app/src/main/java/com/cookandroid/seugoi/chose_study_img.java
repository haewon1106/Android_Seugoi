package com.cookandroid.seugoi;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class chose_study_img extends AppCompatActivity {
    ImageView choseImage;
    Button btnNext;

    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chose_study_img);

        // ImageView
        choseImage = findViewById(R.id.choseImage);

        // Button
        btnNext = findViewById(R.id.btnNext);

        // btnNext를 누르면 input_study_info 화면으로 이동
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), input_study_info.class);
                startActivity(intent);
            }
        });
    }
}
