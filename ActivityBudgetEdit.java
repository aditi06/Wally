package com.example.wally;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityBudgetEdit extends AppCompatActivity {
    private Button doneButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget_edit);
        doneButton= (Button) findViewById(R.id.doneButton);
        doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                backToReview(view1);
            }
        });
    }
    public void backToReview(View v){
        Intent intent = new Intent(ActivityBudgetEdit.this, ReviewBudget.class);
        startActivity(intent);
    }
}