package com.cookandroid.seugoi;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class input_study_info extends AppCompatActivity {
    EditText study_Name, hashtag, end_Day, study_Title, study_Explain;
    Button btn_Next;
    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_study_info);

        // EditText
        study_Name = findViewById(R.id.study_Name);
        hashtag = findViewById(R.id.hashtag);
        end_Day = findViewById(R.id.end_Day);
        study_Title = findViewById(R.id.study_Title);
        study_Explain = findViewById(R.id.study_Explain);

        // Button
        btn_Next = findViewById(R.id.btn_Next);

        btn_Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), study_join_intro.class);

                // study_Name의 문자열을 study_join_intro에 study_Name(TextView)에 전달하기
                String studyName = String.valueOf(study_Name.getText());
                intent.putExtra("studyName", studyName);

                // hashtag의 문자열을 study_join_intro에 hashtag(TextView)에 전달하기
                String studyTag = String.valueOf(hashtag.getText());
                intent.putExtra("studyTag", studyTag);

                // end_Day의 문자열을 study_join_intro에 Dday(TextView)에 전달하기
                String studyDay = String.valueOf(end_Day.getText());
                intent.putExtra("studyDay", studyDay);

                // study_Title의 문자열을 study_join_intro에 study_Title(TextView)에 전달하기
                String studyTitle = String.valueOf(study_Title.getText());
                intent.putExtra("studyTitle", studyTitle);

                // study_Explain의 문자열을 study_join_intro에 study_Explain(TextView)에 전달하기
                String studyExplain = String.valueOf(study_Explain.getText());
                intent.putExtra("studyExplain", studyExplain);

                // study_join_intro 클래스 시작하기
                startActivity(intent);

                // btn_Next를 누르면 input_study_ex로 넘어가기
                Intent in = new Intent(getApplicationContext(), input_study_ex.class);
                startActivity(in);
            }
        });
    }
}
