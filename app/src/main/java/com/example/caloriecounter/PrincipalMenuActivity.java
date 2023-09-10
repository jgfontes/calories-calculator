package com.example.caloriecounter;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PrincipalMenuActivity extends AppCompatActivity {

    public static final int KEY_PRINCIPAL_MENU = 10;
    public static final String ACTIVITY_ORIGIN = "ACTIVITY_ORIGIN";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_menu);
    }

    public void openNewFoodActivity(View view) {
        Intent openNewFoodActivityIntent = new Intent(this, MainActivity.class);
        openNewFoodActivityIntent.putExtra("ACTIVITY_ORIGIN", KEY_PRINCIPAL_MENU);
        startActivityForResult(openNewFoodActivityIntent, KEY_PRINCIPAL_MENU);
    }

    public void openListFoodActivity(View view) {
        Intent openListFoodActivity = new Intent(this, ListFoodActivity.class);
        openListFoodActivity.putExtra("ACTIVITY_ORIGIN", KEY_PRINCIPAL_MENU);
        startActivityForResult(openListFoodActivity, KEY_PRINCIPAL_MENU);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == KEY_PRINCIPAL_MENU && resultCode == Activity.RESULT_OK) {
            Toast.makeText(this, "Food has been added", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "ERROR: Food has not been created", Toast.LENGTH_SHORT).show();
        }
    }
}