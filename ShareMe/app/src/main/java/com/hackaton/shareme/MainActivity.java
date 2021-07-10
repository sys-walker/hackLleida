package com.hackaton.shareme;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button loginButton;
    Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = findViewById(R.id.login_button);
        registerButton = findViewById(R.id.register_button);

        loginButton.setOnClickListener(this);
        registerButton.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        Intent nextActivity;
        switch (v.getId()){
            case R.id.login_button:
                nextActivity= new Intent(this,HomeHostActivity.class);
                startActivity(nextActivity);
                finish();
                break;
            case R.id.register_button:
                nextActivity= new Intent(this,RegisterActivity.class);
                startActivity(nextActivity);
                finish();
                break;

        }
    }
}