package com.example.funapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView factTextView;
    private Button showFunButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        factTextView = findViewById(R.id.textView);
        showFunButton = findViewById(R.id.button2);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomGenarator = new Random();
                int randomNumber = randomGenarator.nextInt(3);
                String fact = randomNumber + "";
                factTextView.setText(fact);
            }
        };

        showFunButton.setOnClickListener(listener);
    }
}
