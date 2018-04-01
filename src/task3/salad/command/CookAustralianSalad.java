package task3.salad.command;

import task3.salad.entity.ingredient.Cucumber;
import task3.salad.entity.ingredient.Ingredient;
import task3.salad.entity.ingredient.Tomato;
import task3.salad.entity.salad.AustralianSalad;

//ConcreteCommand
public class CookAustralianSalad implements Command {
    AustralianSalad australianSalad;

    public CookAustralianSalad(AustralianSalad australianSalad) {
        this.australianSalad = australianSalad;
    }

    @Override
    public void execute() {
        System.out.println("========================================");
        System.out.println("==========Process of cooking=============");
        for (Ingredient ingredient : australianSalad.getIngredients()) {
            System.out.println("chop " + ingredient.getName());
        }
        System.out.println("blend ingredients");
        System.out.println(australianSalad.getName() + " cooked");
        System.out.println("========================================");
    }
}
