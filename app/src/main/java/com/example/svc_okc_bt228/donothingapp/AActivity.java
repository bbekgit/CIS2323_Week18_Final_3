package com.example.svc_okc_bt228.donothingapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AActivity extends AppCompatActivity {
    Button donothing, display;
    EditText etText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        donothing = (Button) findViewById(R.id.donothing);
        display = (Button) findViewById(R.id.display);
        etText = (EditText) findViewById(R.id.etText);
        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //display name on button click
                Toast.makeText(AActivity.this, "" + etText.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
