package com.example.caloriecounter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.caloriecounter.Entity.Food;

import java.util.List;

public class FoodAdapter extends BaseAdapter {

    private Context context;
    private List<Food> foodList;

    private static class FoodHolder {
        public TextView textViewFoodName;
        public TextView textViewKCal;
        public TextView textViewUnitOfMeasurement;
    }

    public FoodAdapter(Context context, List<Food> foodList) {
        this.context = context;
        this.foodList = foodList;
    }

    @Override
    public int getCount() {
        return foodList.size();
    }

    @Override
    public Object getItem(int i) {
        return foodList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        FoodHolder holder;

        if(view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.row_list_view_food, viewGroup, false);

            holder = new FoodHolder();

            holder.textViewFoodName          = view.findViewById(R.id.nameValueTextView);
            holder.textViewKCal              = view.findViewById(R.id.kcalTextView);
            holder.textViewUnitOfMeasurement = view.findViewById(R.id.unitOfWeightTextView);

            view.setTag(holder);
        } else {
            holder = (FoodHolder) view.getTag();
        }

        holder.textViewFoodName.setText(foodList.get(i).getFoodname());
        holder.textViewKCal.setText(String.valueOf(foodList.get(i).getKcalPerUnit()));
        switch (foodList.get(i).getUnitOfMeasurement()) {
            case g:
                holder.textViewUnitOfMeasurement.setText("G");
                break;
            case kg:
                holder.textViewUnitOfMeasurement.setText("kG");
                break;
            case ml:
                holder.textViewUnitOfMeasurement.setText("mL");
                break;
            case l:
                holder.textViewUnitOfMeasurement.setText("L");
                break;
        }

        return view;
    }
}


















