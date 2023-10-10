package com.cookandroid.seugoi;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class join extends AppCompatActivity {
    EditText id, emailOne, emailTwo, pw, birth, job;
    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.join);
        id = findViewById(R.id.id);
        emailOne = findViewById(R.id.emailOne);
        emailTwo = findViewById(R.id.emailTwo);
        pw = findViewById(R.id.pw);
        birth = findViewById(R.id.birth);
        job = findViewById(R.id.job);
    }
}
