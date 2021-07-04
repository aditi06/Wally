package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class TodoActivity extends AppCompatActivity {

    List<String> toDoList;
    ArrayAdapter<String> a;
    ListView l;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo);
        getSupportActionBar().setTitle("Wally");

        toDoList = new ArrayList<>();
        a = new ArrayAdapter<>(this,R.layout.list_view_layout, toDoList);
        l = findViewById(R.id.id_list_view);
        l.setAdapter(a);
        editText = findViewById(R.id.id_edit_text);
    }

    public void addItemToList(View v){
        toDoList.add(editText.getText().toString());
        a.notifyDataSetChanged();

        editText.setText("");
    }
}
