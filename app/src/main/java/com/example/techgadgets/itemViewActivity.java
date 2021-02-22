package com.example.techgadgets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class itemViewActivity extends AppCompatActivity {
    String value, url;
    private ImageView imageView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_view);
        Intent intent = getIntent();

        // Save extra values into variables
        value = intent.getStringExtra("value");

        getSupportActionBar().setTitle(value);

        // Save widgets to variables
        imageView = findViewById(R.id.imageView);
        button = findViewById(R.id.button);

        imageView.setContentDescription(value);

        // Set image src and url
        if (value.equals("Playstation 5"))
        {
            imageView.setImageResource(R.drawable.playstation);
            url = "https://en.wikipedia.org/wiki/PlayStation_5";
        }
        else if (value.equals("Raspberry PI"))
        {
            imageView.setImageResource(R.drawable.raspberrypi);
            url = "https://en.wikipedia.org/wiki/Raspberry_Pi";
        }
        else if (value.equals("TV"))
        {
            imageView.setImageResource(R.drawable.tv);
            url = "https://en.wikipedia.org/wiki/Television";
        }
        else if (value.equals("Laptop"))
        {
            imageView.setImageResource(R.drawable.laptop);
            url = "https://en.wikipedia.org/wiki/Laptop";
        }
        else if (value.equals("Phone"))
        {
            imageView.setImageResource(R.drawable.phone);
            url = "https://en.wikipedia.org/wiki/Telephone";
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent1);
            }
        });


    }
}