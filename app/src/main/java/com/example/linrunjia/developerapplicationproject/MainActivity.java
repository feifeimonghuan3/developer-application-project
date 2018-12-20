package com.example.linrunjia.developerapplicationproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.linrunjia.developerapplicationproject.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("hayashi", "hayashi");
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivityForResult(intent, 1);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        String req = requestCode + "";
        Log.i("hayashi", req);// 回的数据
        super.onActivityResult(requestCode, resultCode, data);
        String result = data.getStringExtra("result"); //得到新Activity 关闭后返
        Log.i("hayashi", result);// 回的数据
    }
}
