package com.cookandroid.seugoi;
//
//import android.annotation.SuppressLint;
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.ImageView;
//import android.widget.ListView;
//import android.widget.TextView;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import java.util.ArrayList;
//
//public class home extends AppCompatActivity {
//    EditText search;
//    TextView yourName, studyTitle, hashTag1, hashTag2, hashTag3, studyName, tag1, tag2, tag3;
//    ImageView studyImage, studyImg;
//    View nowIng;
//
//    private ArrayList<home_items> items;
//    private home_listview_Adapter mAdapter;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.home);
//
//        // EditText
//        search = findViewById(R.id.search);
//
//        // TextView
//        yourName = findViewById(R.id.yourName);
//        ListView listView = findViewById(R.id.listMystudy);
//        Button addStudy = findViewById(R.id.addStudy);
//
//        items = new ArrayList<>();
//        mAdapter = new home_listview_Adapter(items, this);
//        listView.setAdapter(mAdapter);
//
//        addStudy.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(), input_study_info.class);
//                startActivity(intent);
//            }
//        });



//        studyTitle = findViewById(R.id.studyTitle);
//        hashTag1 = findViewById(R.id.hashTag1);
//        hashTag2 = findViewById(R.id.hashTag2);
//        hashTag3 = findViewById(R.id.hashTag3);
//        studyName = findViewById(R.id.studyName);
//        tag1 = findViewById(R.id.tag1);
//        tag2 = findViewById(R.id.tag2);
//        tag3 = findViewById(R.id.tag3);

//        // ImageView
//        studyImage = findViewById(R.id.studyImage);
//        studyImg = findViewById(R.id.studyImg);

// btnMystudy를 누르면 study_screen_manager 화면으로 이동
//        findViewById(R.id.btnMystudy).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(), study_screen_manager.class);
//                startActivity(intent);
//            }
//        });

// btnGostudy를 누르면 study_join_intro 화면으로 이동
//        findViewById(R.id.btnGostudy).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), study_join_intro.class);
//                startActivity(intent);
//            }
//        });
//    }
//
//}


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Calendar;

public class home extends AppCompatActivity {
    private ArrayList<home_items> studyList;
    private home_listview_Adapter adapter;
    private ListView listView;
    private Button addButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listMystudy);
        addButton = findViewById(R.id.addStudy);
        studyList = new ArrayList<>();
        adapter = new home_listview_Adapter(this, studyList);
        listView.setAdapter(adapter);

        Intent in = getIntent();
        String studyName = in.getStringExtra("studyName");
        String hashTag = in.getStringExtra("hashTag");

        // txtDay 구하기
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        String txtDay =  (year + "." + month + "." + day);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 새로운 스터디 아이템을 추가
                home_items newStudy = new home_items(studyName, hashTag, txtDay);
                studyList.add(newStudy);
                // 어댑터를 통해 ListView 갱신
                adapter.notifyDataSetChanged();
                
                // 화면 이동
                Intent intent = new Intent(getApplicationContext(), input_study_info.class);
                startActivity(intent);
            }
        });

//        // EditText의 텍스트 변경을 감지하여 리스트 필터링
//        findViewById(R.id.search).addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//                filter(editable.toString());
//            }
//        });
    }

//    private void filter(String text) {
//        ArrayList<home_items> filteredList = new ArrayList<>();
//        if (text.isEmpty()) {
//            // 검색어가 없을 때는 원본 리스트를 모두 보여줍니다.
//            filteredList.addAll(studyList);
//        } else {
//            // 검색어와 일치하는 아이템만 필터링합니다.
//            for (home_items item : studyList) {
//                if (item.getStudyName().toLowerCase().contains(text.toLowerCase())) {
//                    filteredList.add(item);
//                }
//            }
//        }
//        // 어댑터를 업데이트하여 변경된 리스트를 보여줍니다.
//        adapter.clear();
//        adapter.addAll(filteredList);
//    }
}