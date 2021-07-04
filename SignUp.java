package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.content.SharedPreferences;
import android.content.Context;

public class SignUpActivity extends AppCompatActivity {

    private EditText confirm, enterName, pwd;
    private Button registerAccount;


    @Override
    protected void onCreate(Bundle instance) {
        super.onCreate(instance);
        setContentView(R.layout.activity_sign_up);
        getSupportActionBar().setTitle("Wally");
        confirm = findViewById(R.id.passwordConfirmation);
        registerAccount = findViewById(R.id.makeAccount);
        enterName = findViewById(R.id.nameofuser);
        pwd = findViewById(R.id.password);

        registerAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View c) {
                String name;
                String password;
                String pwdConfirm;
                name = enterName.getText().toString();
                password = pwd.getText().toString();
                pwdConfirm = confirm.getText().toString();

            if(password.equals(pwdConfirm)){
                SharedPreferences.Editor change = getSharedPreferences("our_shared_pref", Context.MODE_PRIVATE).edit();
                change.putString("Username", name);
                change.putString("Password", password);
                SignUpActivity.this.finish();

            }
            }
        });

    }
}
