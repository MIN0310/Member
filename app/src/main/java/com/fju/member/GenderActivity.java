package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class GenderActivity extends AppCompatActivity {

    private EditText edGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);
        edGender = findViewById(R.id.gender);

    }
    public void button(View view){
        String gender = edGender.getText().toString();
        SharedPreferences pref = getSharedPreferences("member", MODE_PRIVATE);
        pref.edit()
                .putString("gender", gender)
                .apply();
        finish();
    }
}
