package task3.salad;

import task3.salad.command.CookAustralianSalad;
import task3.salad.command.CookSummerSalad;
import task3.salad.entity.chef.Chef;
import task3.salad.entity.chef.InnaChef;
import task3.salad.entity.salad.AustralianSalad;
import task3.salad.entity.salad.SummerSalad;
import task3.salad.service.IngredientFilterImpl;

public class TestRun {
   public static void main(String[] args) {
        AustralianSalad australianSalad = new AustralianSalad();
        SummerSalad summerSalad = new SummerSalad();
        CookSummerSalad cookSummerSalad = new CookSummerSalad(summerSalad);
        CookAustralianSalad cookAustralianSalad = new CookAustralianSalad(australianSalad);
        Chef innaChef = new InnaChef();
        innaChef.addSaladForCook(cookSummerSalad);
        innaChef.addSaladForCook(cookAustralianSalad);
        innaChef.getManagerCommands().run();

        IngredientFilterImpl filter = new IngredientFilterImpl(summerSalad.getIngredients());
        filter.showAll();
        filter.caloricity();
        filter.showIngredientByCalories(10,17);
        filter.sortByCalories();
        filter.sortByWeight();

    }

}
