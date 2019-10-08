package com.example.myapplication.Activity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class AdminAddBookActivity extends AppCompatActivity {

    private String CategoryName;
    private Button AddBook;
    private EditText bookname, bookdescription, bookprice;
    private ImageView bookimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_add_book);

        //Get Category's Name
        CategoryName = getIntent().getExtras().get("category").toString();
        Toast.makeText(this, CategoryName, Toast.LENGTH_SHORT).show();

        AddBook = findViewById(R.id.btnAdd);
        bookimage = findViewById(R.id.select_image);
        bookname = findViewById(R.id.bookname);
        bookdescription = findViewById(R.id.bookdescription);
        bookprice = findViewById(R.id.bookprice);

    }
}
