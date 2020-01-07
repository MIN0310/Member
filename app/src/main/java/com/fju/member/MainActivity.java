package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView edData = findViewById(R.id.data);
        if(TextUtils.isEmpty(edData.getText().toString())){
            Intent intent = new Intent(this, NicknameActivity.class);
            startActivityForResult(intent, MODE_PRIVATE);
        }
    }
}
