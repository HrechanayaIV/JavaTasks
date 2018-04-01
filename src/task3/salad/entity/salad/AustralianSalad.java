package task3.salad.entity.salad;

import task3.salad.entity.ingredient.BrusselsSavoy;
import task3.salad.entity.ingredient.Cucumber;
import task3.salad.entity.ingredient.Pepper;
import task3.salad.entity.ingredient.Tomato;

//Receiver
public class AustralianSalad extends Salad {
    public AustralianSalad() {
        addIngredient(new Cucumber.CucumberBuilder().weight(100).build());
        addIngredient(new Tomato.TomatoBuilder().weight(80).build());
        addIngredient(new Pepper.PepperBuilder().weight(90).build());
        addIngredient(new BrusselsSavoy.BrusselsBuilder().weight(50).build());
        setName("Australian Salad");
    }
}
