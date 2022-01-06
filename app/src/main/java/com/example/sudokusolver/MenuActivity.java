package com.example.sudokusolver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
    private Button startBTN;
    private Button aboutBTN;
    private Button exitBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        getSupportActionBar().hide();

        startBTN = findViewById(R.id.startButton);
        startBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();
            }
        });

        aboutBTN = findViewById(R.id.aboutButton);
        aboutBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openInfoActivity();
            }
        });

        exitBTN = findViewById(R.id.exitButton);
        exitBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });
    }

    public void openMainActivity(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void openInfoActivity(){
        Intent intent = new Intent(this,InfoActivity.class);
        startActivity(intent);
    }

}