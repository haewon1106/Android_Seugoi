package com.cookandroid.seugoi;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class chose_study_img extends AppCompatActivity {
    Button choseImage, btnNext;
    ImageView imageView;
    private static final int PICK_IMAGE_REQUEST = 1;

    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chose_study_img);

        // Button
        choseImage = findViewById(R.id.choseImage);
        btnNext = findViewById(R.id.btnNext);

        // ImageView
        imageView = findViewById(R.id.imageView);

        choseImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 갤러리에서 이미지를 선택하기 위한 Intent 생성
                Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(intent, PICK_IMAGE_REQUEST);
            }
        });

        // btnNext를 누르면 input_study_info 화면으로 이동
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), input_study_info.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data != null && data.getData() != null) {
            // 갤러리에서 이미지를 선택한 경우

            // 선택한 이미지의 URI 가져오기
            Uri imageUri = data.getData();

            try {
                // URI를 사용하여 이미지를 비트맵으로 변환
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(), imageUri);

                // 이미지를 ImageView에 설정
                imageView.setImageBitmap(bitmap);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
