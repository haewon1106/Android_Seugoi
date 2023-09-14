package com.cookandroid.seugoi;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class create_study extends AppCompatActivity {
    Button btnGo;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_study);

        // Button
        btnGo = findViewById(R.id.btnGo);

        // btnGo 버튼을 누르면 study_screen_manager 화면으로 이동
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), study_screen_manager.class);
                startActivity(intent);
            }
        });
    }
}
