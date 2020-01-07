package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

public class NicknameActivity extends AppCompatActivity {

    private EditText edNickname;
    private ImageView button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nickname);
        edNickname = findViewById(R.id.nickname);
    }
    public void button(View view){
        String nick = edNickname.getText().toString();
        SharedPreferences pref = getSharedPreferences("member", MODE_PRIVATE);
        pref.edit()
                .putString("nick", nick)
                .apply();
        NicknameActivity.this.setResult(RESULT_OK);
        Intent intent = new Intent(this, AgeActivity.class);
        startActivity(intent);
        finish();
    }

}
