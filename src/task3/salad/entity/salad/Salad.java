package task3.salad.entity.salad;


import task3.salad.entity.ingredient.Ingredient;

import java.util.ArrayList;
import java.util.List;

public abstract class Salad {
    protected String name;
    protected List<Ingredient> ingredients = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public void addIngredient(Ingredient ingredient){
        getIngredients().add(ingredient);
    }
    @Override
    public String toString() {
        return "Salad{" +
                "name='" + name + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
