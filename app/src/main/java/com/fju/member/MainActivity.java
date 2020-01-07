package com.fju.member;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final int DATA = 1;
    private EditText edNickname;
    private EditText edAge;
    private EditText edGender;
    private TextView edData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        edData = findViewById(R.id.data);
        edNickname = findViewById(R.id.nickname);
        edAge = findViewById(R.id.age);
        edGender = findViewById(R.id.gender);
        if(TextUtils.isEmpty(edNickname.getText().toString())){
            Intent intent = new Intent(this, NicknameActivity.class);
            startActivityForResult(intent, DATA);
        }else {
//            TextView text = findViewById(R.id.data);
//            text.setText(a+"\n"+b+"\n"+c);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == DATA){
            if(resultCode == RESULT_OK){
                SharedPreferences pref = getSharedPreferences("member", MODE_PRIVATE);
                String a = pref.getString("nick", "");
                edNickname.setText(a+"");
                String b = pref.getString("age", "");
                edAge.setText(b+"");
                String c = pref.getString("gender", "");
                edGender.setText(c+"");
            }
        }
    }
}
