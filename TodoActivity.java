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

    List<String> list;
    ListView l;
    EditText e;
    ArrayAdapter<String> a;
   
    @Override
    protected void onCreate(Bundle instance) {
        list = new ArrayList<>();
        a = new ArrayAdapter<>(this,R.layout.list_view_layout, list);
        l = findViewById(R.id.id_list_view);
        l.setAdapter(a);
        e = findViewById(R.id.id_edit_text);
        super.onCreate(instance);
        setContentView(R.layout.activity_todo);
        getSupportActionBar().setTitle("Wally");

    }

    public void add(View v){
        list.add(e.getText().toString());
    }
}
