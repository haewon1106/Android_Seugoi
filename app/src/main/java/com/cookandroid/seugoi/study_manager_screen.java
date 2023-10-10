package com.cookandroid.seugoi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class study_manager_screen extends AppCompatActivity {
    EditText task_Title, task_Content;
    Button make_Task;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.study_manager_screen);

        // EditText
        task_Title = findViewById(R.id.task_Title);
        task_Content = findViewById(R.id.task_Content);

        // Button
        make_Task = findViewById(R.id.make_Task);

        // make_Task 버튼 클릭 시
        make_Task.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 입력한 과제 정보 가져오기
                String taskTitle = task_Title.getText().toString();
                String taskContent = task_Content.getText().toString(); // 과제 내용은 댓글 화면에 전달하기

                // study_screen_manager로 데이터 전달
                Intent intent = new Intent(getApplicationContext(), study_screen_manager.class);
                intent.putExtra("taskTitle", taskTitle);
                intent.putExtra("taskContent", taskContent);
                startActivity(intent);
            }
        });
    }
}
