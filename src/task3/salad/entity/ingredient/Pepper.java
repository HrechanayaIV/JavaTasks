package task3.salad.entity.ingredient;

import task3.salad.entity.Builder;

public class Pepper extends Ingredient{
    public Pepper(PepperBuilder pepperBuilder) {
        name = "pepper";
        caloriesPer100 = 27;
        weight = pepperBuilder.weight;
        vegetableType = VegetableType.SPICY;
    }

    public static class PepperBuilder implements Builder {
        private double weight;

        public PepperBuilder() {
        }

        public PepperBuilder weight(double weight) {
            this.weight = weight;
            return this;
        }

        @Override
        public Pepper build() {
            return new Pepper(this);
        }
    }
}
