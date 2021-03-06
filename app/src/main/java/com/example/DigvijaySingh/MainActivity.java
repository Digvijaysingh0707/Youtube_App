package com.example.DigvijaySingh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSingle=(Button)findViewById(R.id.btnPlaySingle);
        Button btnStandAlone=(Button)findViewById(R.id.btnStandalone);
        btnSingle.setOnClickListener(this);
        btnStandAlone.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        Intent intent=null;
        switch (view.getId()){
            case R.id.btnPlaySingle:
                intent = new Intent(this,YouTubeActivity.class);
                break;
            case R.id.btnStandalone:
                intent = new Intent(this,StandAloneActivity.class);
                break;
            default:
        }
        if (intent!=null){
            startActivity(intent);
        }
    }
}
