package com.example.team_work;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String a="jiojioio";
        String b="完成了在这打上名字：";
        Toast.makeText(MainActivity.this,a,Toast.LENGTH_SHORT).show();
    }
}
