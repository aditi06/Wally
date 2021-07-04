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

    private EditText name, pwd;
    private Button signInAccount,registerNow;

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
            public void onClick(View v) {
                Intent i = new Intent(LoginScreenActivity.this, SignUpActivity.class);
                startActivity(i);
            }
        });

        signInAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences verify = getSharedPreferences("shared_pref", Context.MODE_PRIVATE);
                String textName = verify.getString("Username", null);
                String textpwd = verify.getString("Password", null);
                String originalName = name.getText().toString();
                String originalPassword = pwd.getText().toString();

                if(textName.equals(originalName) && (textpwd.equals(originalPassword)) {        
                        Intent changePage = new Intent(LoginScreenActivity.this, HomeActivity.class);
                        startActivity(changePage);
                    }
                }
            }
        });
    }
}
