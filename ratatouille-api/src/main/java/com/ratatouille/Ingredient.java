package com.ratatouille;

import java.util.ArrayList;
import java.util.List;

public class Ingredient {
    private String description;
    private double quantity;

    //Construtor
    public Ingredient(String descriptionIngredient, double quantity) {
        this.description = descriptionIngredient;
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return " description " + this.description +
                " quantity: " + this.quantity;
    }
}
