package com.example.labexerxise2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private  int mCount = 0;
    private TextView mShowCount;
    private Button mBtnToast, mBtnZero, mBtnCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowCount = findViewById(R.id.textView);
        mBtnToast = findViewById(R.id.toast);
        mBtnZero = findViewById(R.id.zero);
        mBtnCount = findViewById(R.id.count);

        mBtnToast.setOnClickListener(this::showToast);
        mBtnZero.setOnClickListener(this::zeroToast);
        mBtnCount.setOnClickListener(this::countUp);

    }

    public void zeroToast(View view){
        Toast toast = Toast.makeText(this, R.string.toast_message,Toast.LENGTH_LONG);
        view.setBackgroundColor(Color.CYAN);
        toast.show();


    }

    public void showToast(View view){
        Toast toast = Toast.makeText(this, R.string.toast_message,Toast.LENGTH_LONG);
        toast.show();
    }

    @SuppressLint("SetTextI18n")
    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
}