package com.example.project2;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TEST extends AppCompatActivity {
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            Toast toast=Toast.makeText(this,"Query Text=",Toast.LENGTH_SHORT);
            toast.show();
//            setContentView(R.layout.activity_main);
        }
}
