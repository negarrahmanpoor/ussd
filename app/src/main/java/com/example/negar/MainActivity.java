package com.example.negar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public static final String MyPr  ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText name = findViewById(R.id.name1);
        EditText ussd = findViewById(R.id.ussd);
        EditText ussd2 = findViewById(R.id.ussd2);
        ImageView key1 = findViewById(R.id.key1);
        SharedPreferences sh =getSharedPreferences(MyPr,MODE_PRIVATE);
        SharedPreferences.Editor editor=sh.edit();
        editor.putString("name" ,"poulstar");
//        editor.apply();
        editor.putString("name","poulgilan");

        key1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



    }
}