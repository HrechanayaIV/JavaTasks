package task3.salad.entity.salad;

import task3.salad.entity.ingredient.Cabbage;
import task3.salad.entity.ingredient.Cucumber;
import task3.salad.entity.ingredient.Potatoes;

//Receiver
public class SummerSalad extends Salad {
    public SummerSalad() {
        addIngredient(new Cabbage.CabbageBuilder().weight(150).build());
        addIngredient(new Cucumber.CucumberBuilder().weight(200).build());
        addIngredient(new Potatoes.PotatoesBuilder().weight(50).build());

        setName("Summer Salad");
    }
}
