package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AgeActivity extends AppCompatActivity {

    private EditText edAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);
        edAge = findViewById(R.id.age);

    }
    public void button(View view){
        String age = edAge.getText().toString();
        SharedPreferences pref = getSharedPreferences("member", MODE_PRIVATE);
        pref.edit()
                .putString("age", age)
                .apply();
        Intent intent = new Intent(this, GenderActivity.class);
        startActivity(intent);
        finish();
    }
}
