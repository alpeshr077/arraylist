package com.alpesh1.myapplication;

import static com.alpesh1.myapplication.R.drawable.img1;
import static com.alpesh1.myapplication.R.drawable.img10;
import static com.alpesh1.myapplication.R.drawable.img2;
import static com.alpesh1.myapplication.R.drawable.img3;
import static com.alpesh1.myapplication.R.drawable.img4;
import static com.alpesh1.myapplication.R.drawable.img5;
import static com.alpesh1.myapplication.R.drawable.img6;
import static com.alpesh1.myapplication.R.drawable.img7;
import static com.alpesh1.myapplication.R.drawable.img8;
import static com.alpesh1.myapplication.R.drawable.img9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String name[] = {"whatsapp","instagram","facebook","telegram","youtube","snapchat","sharechat","pintrest","spotify","jiosavan"};

    int img[] = {img1,img2,img3,img4,img5,img6,img7,img8,img9,img10};

    TextView TextView;
    ImageView ImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}