package com.example.caloriecounter.Entity;

public class Food {
    private String foodname;

    private float kcalPerUnit;

    private UnitOfWeight unitOfMeasurement;

    private CookOptions cookOptions;

    boolean containsLactose;
    boolean containsGluten;

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public float getKcalPerUnit() {
        return kcalPerUnit;
    }

    public void setKcalPerUnit(float kcalPerUnit) {
        this.kcalPerUnit = kcalPerUnit;
    }

    public UnitOfWeight getUnitOfMeasurement() {
        return unitOfMeasurement;
    }

    public void setUnitOfMeasurement(UnitOfWeight unitOfMeasurement) {
        this.unitOfMeasurement = unitOfMeasurement;
    }

    public CookOptions getCookOptions() {
        return cookOptions;
    }

    public void setCookOptions(CookOptions cookOptions) {
        this.cookOptions = cookOptions;
    }

    public boolean isContainsLactose() {
        return containsLactose;
    }

    public void setContainsLactose(boolean containsLactose) {
        this.containsLactose = containsLactose;
    }

    public boolean isContainsGluten() {
        return containsGluten;
    }

    public void setContainsGluten(boolean containsGluten) {
        this.containsGluten = containsGluten;
    }

    @Override
    public String toString() {
        return "Food{" +
                "foodname='" + foodname + '\'' +
                ", kcalPerUnit=" + kcalPerUnit +
                ", unitOfMeasurement=" + unitOfMeasurement +
                ", cookOptions=" + cookOptions +
                ", containsLactose=" + containsLactose +
                ", containsGluten=" + containsGluten +
                '}';
    }
}
