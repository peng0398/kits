package com.bob.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.bob.kits.utils.CommonUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CommonUtils.showToast(getApplication(), "Hello kits!");
    }
}
