package com.example.help;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton temp;
    private ImageButton umid;
    private ImageButton co2;
    private ImageButton glp;
    private ImageButton hist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        temp = findViewById(R.id.temp);
        temp.setOnClickListener(view -> {
            startActivity(new Intent(this, TempActivity.class));

        });
        umid = findViewById(R.id.umid);
        umid.setOnClickListener(view -> {
            startActivity(new Intent(this, UmidActivity.class));
        });
        co2 = findViewById(R.id.co2);
        co2.setOnClickListener(view -> {
                startActivity(new Intent(this, Co2Activity.class));
        });
        glp = findViewById(R.id.glp);
        glp.setOnClickListener(view -> {
            startActivity(new Intent(this, GlpActivity.class));
        });
        hist = findViewById(R.id.hist);
        hist.setOnClickListener(view -> {
            startActivity(new Intent(this, hist.class));
        });

    }
}