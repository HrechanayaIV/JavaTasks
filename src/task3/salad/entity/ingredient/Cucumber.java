package task3.salad.entity.ingredient;

import task3.salad.entity.Builder;

public class Cucumber extends Ingredient {
    public Cucumber(CucumberBuilder cucumberBuilder) {
        name = "cucumber";
        caloriesPer100 = 16;
        weight = cucumberBuilder.weight;
        setVegetableType(VegetableType.PUMPKIN);
    }

    public static class CucumberBuilder implements Builder{
        private double weight;

        public CucumberBuilder(){

        }
        public CucumberBuilder weight(double weight) {
            this.weight = weight;
            return this;
        }

        @Override
        public Cucumber build() {
            return new Cucumber(this);
        }
    }
}
