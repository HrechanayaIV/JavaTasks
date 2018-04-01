package task3.salad.entity.ingredient;

import task3.salad.entity.Builder;

public class Cabbage extends Ingredient {
    public Cabbage(CabbageBuilder cabbageBuilder) {
        name = "cabbage";
        caloriesPer100 = 25;
        weight = cabbageBuilder.weight;
        vegetableType = VegetableType.CABBAGE;
    }

    public static class CabbageBuilder implements Builder {
        private double weight;

        public CabbageBuilder() {
        }

        public CabbageBuilder weight(double weight) {
            this.weight = weight;
            return this;
        }

        @Override
        public Cabbage build() {
            return new Cabbage(this);
        }
    }
}
