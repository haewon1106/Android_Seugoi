package com.cookandroid.seugoi;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class study_screen_manager extends AppCompatActivity {
    TextView txtStudyTitle, txtDay;
    private ArrayList<study_screen_manager_items> items;
    private study_screen_manager_listview_Adapter mAdapter;

    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chose_study_img);

        txtStudyTitle = findViewById(R.id.txtStudyTitle);
        txtDay = findViewById(R.id.txtDay);
        ListView listView = findViewById(R.id.btnMyStudy);

        // 과제 정보를 가져와서 화면에 표시
        Intent intent = getIntent();
        String title = intent.getStringExtra("taskTitle");
        txtStudyTitle.setText(title);

        // items 리스트 초기화
        items = new ArrayList<>();
        mAdapter = new study_screen_manager_listview_Adapter(items, this);
        listView.setAdapter(mAdapter);
    }
}
