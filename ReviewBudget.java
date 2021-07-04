package com.example.wally;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ReviewBudget extends AppCompatActivity {
    private Button editButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_budget);

        editButton= (Button) findViewById(R.id.editButton);
        editButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                openEdit(view1);
            }
        });
    }
    public void openEdit(View v){
        Intent intent5 = new Intent(ReviewBudget.this, ActivityBudgetEdit.class);
        startActivity(intent5);
    }
}