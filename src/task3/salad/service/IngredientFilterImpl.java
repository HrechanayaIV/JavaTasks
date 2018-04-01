package task3.salad.service;

import task3.salad.entity.ingredient.Ingredient;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class IngredientFilterImpl implements Filter {
    private List<Ingredient> ingredients;

    public IngredientFilterImpl(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public void sortByCalories() {
        Collections.sort(ingredients, new Comparator<Ingredient>() {
            @Override
            public int compare(Ingredient o1, Ingredient o2) {
                return (int) (o1.getCalories() - o2.getCalories());
            }
        });
        showAll();
    }

    @Override
    public void sortByWeight() {
        Collections.sort(ingredients, new Comparator<Ingredient>() {
            @Override
            public int compare(Ingredient o1, Ingredient o2) {
                return (int) (o1.getWeight() - o2.getWeight());
            }
        });
        showAll();
    }

    @Override
    public double caloricity() {
        double caloricity = 0;
        for (Ingredient ingredient : ingredients) {
            caloricity += ingredient.getCalories();
        }
        return caloricity;
    }

    @Override
    public void showIngredientByCalories(double from, double to) {
        for (Ingredient ingredient : ingredients) {
            if (ingredient.getCalories() >= from && ingredient.getCalories() <= to) {
                System.out.print(ingredient + "; ");
            }
        }
        System.out.println();
    }

    @Override
    public void showAll() {
        for (Ingredient ingredient : ingredients) {
            System.out.print(ingredient + " ");
        }
        System.out.println();
    }
}
