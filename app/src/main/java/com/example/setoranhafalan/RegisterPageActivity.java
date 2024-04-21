package com.example.setoranhafalan;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.health.connect.datatypes.units.Length;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterPageActivity extends AppCompatActivity {
    EditText username;
    EditText password;
    Button loginButton;
    TextView loginRedirectText;
    TextView registerRedirectText;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.login_button);
        loginRedirectText = findViewById(R.id.LoginRedirectText);
        registerRedirectText = findViewById(R.id.RedirectText);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals("user") && password.getText().toString().equals("1234")) {
                    Toast.makeText(RegisterPageActivity.this, "Login Successfull", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(RegisterPageActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
        loginRedirectText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterPageActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        registerRedirectText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterPageActivity.this, RegisterPageActivity.class);
                startActivity(intent);
            }
        });
    }
}