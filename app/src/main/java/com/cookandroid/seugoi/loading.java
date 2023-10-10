package com.cookandroid.seugoi;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class loading extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loading);

        // 화면이 띄워진 후 일정 시간(2초)이 지나면 MainActivity로 이동
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // MainActivity로 이동하는 Intent 생성
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish(); // 현재 화면을 종료
            }
        }, 2000);
    }
}
