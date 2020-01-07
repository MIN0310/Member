package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class GenderActivity extends AppCompatActivity {

    private EditText edGender;
    boolean isNext = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);
        edGender = findViewById(R.id.gender);

        Switch sw = findViewById(R.id.switch2);
        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                isNext = isChecked;
                TextView text = findViewById(R.id.switch2);
                text.setText(isNext?"女" : "男");
                EditText text2 = findViewById(R.id.gender);
                text2.setText(isNext?"女" : "男");
            }
        });
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
