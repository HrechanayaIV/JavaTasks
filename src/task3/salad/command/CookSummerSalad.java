package task3.salad.command;

import task3.salad.entity.ingredient.Cabbage;
import task3.salad.entity.ingredient.Cucumber;
import task3.salad.entity.ingredient.Ingredient;
import task3.salad.entity.salad.SummerSalad;

//ConcreteCommand
public class CookSummerSalad implements Command {
    private SummerSalad summerSalad;

    public CookSummerSalad(SummerSalad summerSalad) {
        this.summerSalad = summerSalad;
    }


    @Override
    public void execute() {
        System.out.println("========================================");
        System.out.println("=========Process of cooking=============");
        for (Ingredient ingredient : summerSalad.getIngredients()) {
            System.out.println("chop " + ingredient.getName());
        }
        System.out.println("blend ingredients");
        System.out.println(summerSalad.getName() + " cooked");
        System.out.println("========================================");
    }
}
