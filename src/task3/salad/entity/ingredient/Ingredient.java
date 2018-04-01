package task3.salad.entity.ingredient;

public abstract class Ingredient {
    String name;
    double weight;
    double caloriesPer100;
    VegetableType vegetableType;

    public Ingredient() {
    }

    public Ingredient(String name, double weight, double caloriesPer100, VegetableType vegetableType) {
        this.name = name;
        this.weight = weight;
        this.caloriesPer100 = caloriesPer100;
        this.vegetableType = vegetableType;
    }

    public VegetableType getVegetableType() {
        return vegetableType;
    }

    public void setVegetableType(VegetableType vegetableType) {
        this.vegetableType = vegetableType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCalories() {
        return caloriesPer100;
    }

    public void setCalories(double calories) {
        this.caloriesPer100 = calories;
    }

    @Override
    public String toString() {
        return "Vegetable{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", caloriesPer100=" + caloriesPer100 +
                '}';
    }
}
