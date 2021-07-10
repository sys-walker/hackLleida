package com.hackaton.shareme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    Button neighbourhoodButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        neighbourhoodButton = findViewById(R.id.neighbourhood_button);

        neighbourhoodButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent nextActivity;
        switch (v.getId()){
            case R.id.neighbourhood_button:
                nextActivity= new Intent(this,RegisterActivity.class);
                startActivity(nextActivity);
                finish();
                break;
        }
    }
}