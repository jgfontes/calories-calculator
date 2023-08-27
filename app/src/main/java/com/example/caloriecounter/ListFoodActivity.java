package com.example.caloriecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.caloriecounter.Entity.CookOptions;
import com.example.caloriecounter.Entity.Food;
import com.example.caloriecounter.Entity.UnitOfWeight;

import java.util.ArrayList;

public class ListFoodActivity extends AppCompatActivity {

    private ListView listViewFood;
    private ArrayList<Food> foodArrayList;

    CookOptions[] cookOptionsValues = CookOptions.values();
    UnitOfWeight[] unitOfWeightValues = UnitOfWeight.values();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_food);
        listViewFood = findViewById(R.id.listViewFood);

        populateFoodList();
    }

    private void populateFoodList() {
        String[] foodNameArray = getResources().getStringArray(R.array.foodNameArray);
        String[] kcalPerUnitArray = getResources().getStringArray(R.array.kcalPerUnitArray);
        int[] unitOfMeasurementArray = getResources().getIntArray(R.array.unitOfMeasurementArray);
        int[] cookOptions = getResources().getIntArray(R.array.cookOptionsArray);
        String[] containsLactose = getResources().getStringArray(R.array.containsLactoseArray);
        String[] containsGluten = getResources().getStringArray(R.array.containsLactoseArray);

        ArrayList<Food> foodPopulateArray = new ArrayList<>();

        for(int iterator = 0; iterator < foodNameArray.length; iterator++) {
            Food food = new Food();

            food.setFoodname(foodNameArray[iterator]);
            food.setKcalPerUnit(Float.parseFloat(kcalPerUnitArray[iterator]));
            food.setUnitOfMeasurement(unitOfWeightValues[unitOfMeasurementArray[iterator]]);
            food.setCookOptions(cookOptionsValues[cookOptions[iterator]]);
            food.setContainsLactose(Boolean.parseBoolean(containsLactose[iterator]));
            food.setContainsGluten(Boolean.parseBoolean(containsGluten[iterator]));

            foodPopulateArray.add(food);
        }

        foodArrayList = foodPopulateArray;
        FoodAdapter foodAdapter = new FoodAdapter(this, foodArrayList);
        listViewFood.setAdapter(foodAdapter);
    }
}






















