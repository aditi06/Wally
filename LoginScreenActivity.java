package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.content.Intent;
import android.widget.Toast;
import android.content.SharedPreferences;
import android.content.Context;

public class LoginScreenActivity extends AppCompatActivity {

    private EditText name;
    private EditText pwd;
    private Button signInAccount;
    private Button registerNow;

    private final String CHOOSE = "shared_pref";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        getSupportActionBar().setTitle("Wally");
        name = findViewById(R.id.nameofuser);
        pwd = findViewById(R.id.password);
        signInAccount = findViewById(R.id.login);
        registerNow = findViewById(R.id.register);

        registerNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginScreenActivity.this, SignUpActivity.class);
                startActivity(i);
            }
        });

        signInAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences verify = getSharedPreferences(CHOOSE, Context.MODE_PRIVATE);
                String textName = verify.getString("Username", null);
                String textpwd = verify.getString("Password", null);

                String originalName = name.getText().toString();
                String originalPassword = pwd.getText().toString();

                if(textName.equals(originalName)){
                    if(textpwd.equals(originalPassword)) {        
                        Intent changePage = new Intent(LoginScreenActivity.this, HomeActivity.class);
                        startActivity(changePage);
                    }
                }
            }
        });
    }
}