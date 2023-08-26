package com.example.caloriecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText foodName, kcalPerUnit;
    private Spinner unitOfMeasurement;

    private CheckBox containsLactose, containsGluten;

    private RadioGroup radioGroupCookOptions;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Read inputs
        foodName              = findViewById(R.id.foodNameInput);
        kcalPerUnit           = findViewById(R.id.kcalPerUnitInput);
        unitOfMeasurement     = findViewById(R.id.unitMeasurementSpinner);
        containsLactose       = findViewById(R.id.lactoseCheckbox);
        containsGluten        = findViewById(R.id.glutenCheckbox);
        radioGroupCookOptions = findViewById(R.id.radioGroupCookInfo);

        populateSpinner();
    }

    public void addNewFood(View view) {
        String foodNameStr = foodName.getText().toString().trim();
//        String unitOfMeasurementStr = unitOfMeasurement.getText().toString();

        String kcalPerUnitStr = kcalPerUnit.getText().toString().trim();

        //Validate Fields
        if (foodNameStr == null || foodNameStr.trim().isEmpty()) {
            Toast.makeText(this, R.string.empty_fields_error, Toast.LENGTH_LONG).show();
            foodName.requestFocus();
        }
        if (kcalPerUnitStr == null || kcalPerUnitStr.trim().isEmpty()) {
            Toast.makeText(this, R.string.empty_fields_error, Toast.LENGTH_LONG).show();
            kcalPerUnit.requestFocus();
        }

        Toast.makeText(this, "Food name: " + foodName.getText().toString() + " has been saved", Toast.LENGTH_LONG).show();
    }

    public void clearFields(View view) {
        foodName.setText(null);
        kcalPerUnit.setText(null);
        containsLactose.setChecked(false);
        containsGluten.setChecked(false);
        radioGroupCookOptions.clearCheck();
        RadioButton selectedRadio = getSelectedRadioButton(view);
        if(selectedRadio != null) {
            selectedRadio.setChecked(false);
        }

        Toast.makeText(this, "Fields have been cleared!", Toast.LENGTH_SHORT).show();
    }

    public void populateSpinner() {
        ArrayList<String> unitOfMeasurementValues = new ArrayList<>();

        unitOfMeasurementValues.add(getString(R.string.g));
        unitOfMeasurementValues.add(getString(R.string.kg));
        unitOfMeasurementValues.add(getString(R.string.ml));
        unitOfMeasurementValues.add(getString(R.string.l));

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, unitOfMeasurementValues);
        unitOfMeasurement.setAdapter(adapter);
    }

    public RadioButton getSelectedRadioButton(View view) {
        Integer radioButtonId = radioGroupCookOptions.getCheckedRadioButtonId();
        if (radioButtonId != null) {
            return findViewById(radioButtonId);
        }
        return null;
    }


}