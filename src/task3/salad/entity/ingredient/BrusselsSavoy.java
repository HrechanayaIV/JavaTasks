package task3.salad.entity.ingredient;

import task3.salad.entity.Builder;

public class BrusselsSavoy extends Ingredient {
    public BrusselsSavoy(BrusselsBuilder brusselsBuilder) {
        name = "brussels savoy";
        caloriesPer100 = 43;
        weight = brusselsBuilder.weight;
        vegetableType = VegetableType.CABBAGE;
    }

    public static class BrusselsBuilder implements Builder{
        private double weight;

        public BrusselsBuilder() {
        }

        public BrusselsBuilder weight(double weight) {
            this.weight = weight;
            return this;
        }

        @Override
        public BrusselsSavoy build() {
            return new BrusselsSavoy(this);
        }
    }
}
