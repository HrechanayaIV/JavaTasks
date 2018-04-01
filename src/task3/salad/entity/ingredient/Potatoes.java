package task3.salad.entity.ingredient;

import task3.salad.entity.Builder;

public class Potatoes extends Ingredient {
    public Potatoes(PotatoesBuilder potatoesBuilder) {
        name = "potatoes";
        caloriesPer100 = 77;
        weight = potatoesBuilder.weight;
        vegetableType = VegetableType.TUBERS;
    }

    public static class PotatoesBuilder implements Builder {
        private double weight;

        public PotatoesBuilder() {
        }

        public PotatoesBuilder weight(double weight) {
            this.weight = weight;
            return this;
        }

        @Override
        public Potatoes build() {
            return new Potatoes(this);
        }
    }
}
