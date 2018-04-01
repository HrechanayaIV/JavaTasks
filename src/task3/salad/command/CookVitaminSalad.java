package task3.salad.command;

import task3.salad.entity.ingredient.*;
import task3.salad.entity.salad.VitaminSalad;

//ConcreteCommand
public class CookVitaminSalad implements Command {
    private VitaminSalad vitaminSalad;

    public CookVitaminSalad(VitaminSalad vitaminSalad) {
        this.vitaminSalad = vitaminSalad;
    }

    @Override
    public void execute() {
        System.out.println("========================================");
        System.out.println("==========Process of cooking=============");
        for (Ingredient ingredient : vitaminSalad.getIngredients()) {
            System.out.println("chop " + ingredient.getName());
        }
        System.out.println("blend ingredients");
        System.out.println(vitaminSalad.getName() + " cooked");
        System.out.println("========================================");
    }
}
