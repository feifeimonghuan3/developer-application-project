package com.example.linrunjia.developerapplicationproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.textView1);
        textView.setText(message);
    }

    public void back(View view) {
        Intent intent1 = new Intent();
        intent1.putExtra("result", "你搜索到并选择的数据");
        this.setResult(1, intent1);
        this.finish();
    }
}
