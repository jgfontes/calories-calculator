package com.example.caloriecounter.Entity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import com.example.caloriecounter.R;

public class AboutThisAppActivity extends AppCompatActivity {

    private TextView aboutTheAuthorText;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_this_app);

        aboutTheAuthorText = findViewById(R.id.aboutTheAuthorText);

        StringBuilder authorText = new StringBuilder();
        authorText.append("Author: Júlio Gurgel Fontes\n");
        authorText.append("Email: ju.1996@outlook.com\n");
        authorText.append("Description: This app is a calorie calculator which the user can build his diets. " +
                "You can add single foods and then build meals composed by groups of foods and the app will calculate" +
                " automatically how many calories the user consumes in a single day.\n");
        aboutTheAuthorText.setText("");
    }
}