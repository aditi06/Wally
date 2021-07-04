package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    private Button buttonHouse;
    private Button buttonWork;
    private Button toDo;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().setTitle("Wally");


        buttonHouse = findViewById(R.id.button_house);
        buttonWork = findViewById(R.id.button_work);
        toDo = findViewById(R.id.button_todo);

        buttonHouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, HousingActivity.class);
                startActivity(i);
            }
        });
        buttonWork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, WorkActivity.class);
                startActivity(i);
            }
        });

        toDo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, TodoActivity.class);
                startActivity(i);
            }
        });
    }

}
