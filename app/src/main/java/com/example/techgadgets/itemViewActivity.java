package com.example.techgadgets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class itemViewActivity extends AppCompatActivity {
    String value;
    private TextView textView;
    private ImageView imageView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_view);
        Intent intent = getIntent();
        value = intent.getStringExtra("value");
        getSupportActionBar().setTitle(value);

        // Save widgets to variables
        textView = findViewById(R.id.textView2);
        imageView = findViewById(R.id.imageView);
        button = findViewById(R.id.button);

        textView.setText(value);
        imageView.setContentDescription(value);

    }
}