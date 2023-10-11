package com.cookandroid.seugoi;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {
    EditText id, pw;
    TextView txtjoin;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        id = findViewById(R.id.id);
        pw = findViewById(R.id.pw);
        txtjoin = findViewById(R.id.txtjoin);

        txtjoin.setOnHoverListener(new View.OnHoverListener() {
            @Override
            public boolean onHover(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_HOVER_ENTER) {
                    // 호버링이 시작되면 밑줄 색상 또는 필요한 경우 다른 스타일을 변경합니다.
                    v.setBackgroundResource(R.drawable.underline_text_style_hover);
                } else if (event.getAction() == MotionEvent.ACTION_HOVER_EXIT) {
                    v.setBackgroundResource(R.drawable.underline_text_style);
                }
                return true;
            }
        });

        txtjoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), join.class);
                startActivity(intent);
            }
        });
    }
}