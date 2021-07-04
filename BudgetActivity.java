package com.example.wally;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class BudgetActivity extends AppCompatActivity {
    private Button revButton, hisButton, edButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget);

        revButton=(Button) findViewById(R.id.revSpend);
        revButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openReview(view);
            }
        });
        hisButton=(Button) findViewById(R.id.historySpend);
        hisButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHistory(view);
            }
        });
        edButton=(Button) findViewById(R.id.editSpend);
        edButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSpend(view);
            }
        });
    }
    public void openReview(View v){
        Intent intent = new Intent(BudgetActivity.this, ReviewBudget.class);
        startActivity(intent);
    }
    public void openHistory(View v){
        Intent intent = new Intent(BudgetActivity.this, ActivityBudgetSpendingHistory.class);
        startActivity(intent);
    }
    public void openSpend(View v){
        Intent intent = new Intent(BudgetActivity.this, ActivityBudgetEdit.class);
        startActivity(intent);
    }

}