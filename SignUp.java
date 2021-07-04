package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.content.SharedPreferences;
import android.content.Context;

public class SignUpActivity extends AppCompatActivity {

    private EditText confirm;
    private EditText enterName;
    private final String CHOICE = "our_shared_pref";
    private Button registerAccount;
    private EditText pwd;

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
                String name = enterName.getText().toString();
                String password = pwd.getText().toString();
                String pwdConfirm = confirm.getText().toString();

            if(password.equals(pwdConfirm)){
                SharedPreferences credentials = getSharedPreferences(CHOICE, Context.MODE_PRIVATE);
                SharedPreferences.Editor change;
                change = credentials.edit();
                change.putString("Username", name);
                change.putString("Password", password);
                change.commit();
                SignUpActivity.this.finish();

            }
            }
        });

    }
}
