package com.example.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button ArrayAdapter;
    Button CustomAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter = findViewById(R.id.ArrayAdapter);
        CustomAdapter = findViewById(R.id.CustomAdapter);

        View.OnClickListener listener = new AdapterButtonListener();
        ArrayAdapter.setOnClickListener(new View.OnClickListener() {
            //anonymous class helps reuse the utton activity
            @Override
            public void onClick(View view) {
                Log.d("AdapterButtonListener", "Clicked");
                Intent intent = new Intent(MainActivity.this, ArrayAdapterActivity.class);
                startActivity(intent);
            }
        });
        CustomAdapter.setOnClickListener(new View.OnClickListener() {
            //anonymous class helps reuse the utton activity
            @Override
            public void onClick(View view) {
                Log.d("AdapterButtonListener", "Clicked");
                Intent intent = new Intent(MainActivity.this, CustomAdapterActivity.class);
                startActivity(intent);
            }
        });
        //anonymous class helps reuse the utton activity


    }

    private class AdapterButtonListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Log.d("AdapterButtonListener", "Clicked");
            Intent intent = new Intent(MainActivity.this, ArrayAdapterActivity.class);
            startActivity(intent);
        }
    }
}