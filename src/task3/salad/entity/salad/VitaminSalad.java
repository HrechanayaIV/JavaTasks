package task3.salad.entity.salad;

import task3.salad.entity.ingredient.Cabbage;
import task3.salad.entity.ingredient.Cucumber;
import task3.salad.entity.ingredient.Pepper;
import task3.salad.entity.ingredient.Tomato;

//Receiver
public class VitaminSalad extends Salad{
    public VitaminSalad() {
        addIngredient(new Cabbage.CabbageBuilder().weight(100).build());
        addIngredient(new Cucumber.CucumberBuilder().weight(110).build());
        addIngredient(new Pepper.PepperBuilder().weight(70).build());
        addIngredient(new Tomato.TomatoBuilder().weight(50).build());

        setName("Vitamin Salad");
    }
}
