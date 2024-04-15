package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button minKnapp = findViewById(R.id.my_button);

        minKnapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("==>","Injera Mmmm");
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                /*intent.putExtra("Gabriel", "1");
                startActivity(intent);*/
                intent.putExtra("name", "Gabriel"); // Optional
                intent.putExtra("number", 1); // Optional
                startActivity(intent);
            }
        });
    }
}
