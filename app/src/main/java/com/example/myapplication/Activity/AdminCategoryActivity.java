package com.example.myapplication.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class AdminCategoryActivity extends AppCompatActivity {

    private ImageView tieuthuyet, truyentranh, kinhte;
    private ImageView kynangsong, tieusu, ngoaingu;
    private Button btnDangxuat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        tieuthuyet = findViewById(R.id.tieuthuyet);
        truyentranh = findViewById(R.id.truyentranh);
        kinhte = findViewById(R.id.kinhte);
        kynangsong = findViewById(R.id.kynangsong);
        tieusu = findViewById(R.id.tieusu);
        ngoaingu = findViewById(R.id.ngoaingu);
        btnDangxuat = findViewById(R.id.btnDangxuat);

        //Tieu Thuyet
        tieuthuyet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddBookActivity.class);
                intent.putExtra("category", "Tiểu Thuyết");
                startActivity(intent);
            }
        });

        //Truyen Tranh
        truyentranh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddBookActivity.class);
                intent.putExtra("category", "Truyện Tranh");
                startActivity(intent);
            }
        });

        //Sach Kinh te
        kinhte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddBookActivity.class);
                intent.putExtra("category", "Sách Kinh Tế");
                startActivity(intent);
            }
        });

        //Sach Ky nang song
        kynangsong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddBookActivity.class);
                intent.putExtra("category", "Sách Kỹ năng sống");
                startActivity(intent);
            }
        });

        //Tieu su
        tieusu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddBookActivity.class);
                intent.putExtra("category", "Tiểu Sử");
                startActivity(intent);
            }
        });

        //Sach Ngoai ngu
        ngoaingu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddBookActivity.class);
                intent.putExtra("category", "Sách Ngoại ngữ");
                startActivity(intent);
            }
        });

        //btnDangxuat
        btnDangxuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, IntroActivity.class);
                startActivity(intent);
            }
        });

    }
}
