package com.example.clearschedule;

import android.app.Activity;
import android.content.Intent;
import android.graphics.ColorFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class StartscreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_startscreen);

        final Button pbutton = findViewById(R.id.button2);
        pbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(StartscreenActivity.this,ColorfilterActivity.class);
                startActivity(intent);
            }
        }); /*P型のボタンを押してP型のカラーフィルタへの画面遷移*/

        final Button skipbutton = findViewById(R.id.skipbutton);
        skipbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(StartscreenActivity.this, HomescreenActivity.class);
                startActivity(intent);
            }
        }); /*skipボタンの画面遷移*/
    }
}