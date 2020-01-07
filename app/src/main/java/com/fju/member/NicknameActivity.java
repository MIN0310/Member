package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class NicknameActivity extends AppCompatActivity {

    private EditText edNickname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nickname);
        edNickname = findViewById(R.id.nickname);
    }
}
