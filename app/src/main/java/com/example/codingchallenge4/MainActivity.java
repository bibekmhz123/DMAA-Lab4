package com.example.codingchallenge4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.codingchallenge";
    Button buttonOne, buttonTwo, buttonThree;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonOne = findViewById(R.id.button);
        buttonTwo = findViewById(R.id.button2);
        buttonThree = findViewById(R.id.button3);

    }

    public void btnOne(View view) {
        Intent intent =new Intent(this,ActivitySecond.class);
        String message =buttonOne.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);

    }

    public void btnTwo(View view) {
        Intent intent =new Intent(this,ActivitySecond.class);
        String message=buttonTwo.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);

    }

    public void btnThree(View view) {
        Intent intent =new Intent(this,ActivitySecond.class);
        String message=buttonThree.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);

    }
}