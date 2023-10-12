//package com.cookandroid.seugoi;
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

