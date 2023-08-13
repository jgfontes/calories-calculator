package com.example.caloriecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText foodName;
    private EditText unitOfMeasurement;
    private EditText kcalPerUnit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Read text inputs
        foodName          = findViewById(R.id.foodNameInput);
        unitOfMeasurement = findViewById(R.id.unitOfMeasurementInput);
        kcalPerUnit       = findViewById(R.id.kcalPerUnitInput);
    }

    public void addNewFood(View view) {
        System.out.println(foodName.getText().toString());

        Toast.makeText(this, "Food name: " + foodName.getText().toString(), Toast.LENGTH_LONG).show();
    }
}