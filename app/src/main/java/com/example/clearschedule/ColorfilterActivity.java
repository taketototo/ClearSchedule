package com.example.clearschedule;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ColorfilterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colorfilter);

        final Button finishbutton = findViewById(R.id.finishbutton);
        finishbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ColorfilterActivity.this,HomescreenActivity.class);
                startActivity(intent);
            }
        }); /*カラーフィルタ画面からホーム画面への画面遷移*/
    }
}