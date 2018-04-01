package task3.salad.entity.ingredient;

import task3.salad.entity.Builder;

public class Tomato extends Ingredient {
    public Tomato(TomatoBuilder tomatoBuilder) {
        name = "tomato";
        caloriesPer100 = 18;
        weight = tomatoBuilder.weight;
        vegetableType = VegetableType.TOMATO;
    }

    public static class TomatoBuilder implements Builder {
        private double weight;

        public TomatoBuilder() {
        }

        public TomatoBuilder weight(double weight) {
            this.weight = weight;
            return this;
        }

        @Override
        public Tomato build() {
            return new Tomato(this);
        }
    }
}
