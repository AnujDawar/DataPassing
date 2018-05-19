package com.example.anujdawar.datapassing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnClick(View v)
    {
        Intent i =new Intent(this, Main2Activity.class);
        i.putExtra("data","Hello anuj\n"+1+"\n"+true);
        startActivity(i);
    }
}
