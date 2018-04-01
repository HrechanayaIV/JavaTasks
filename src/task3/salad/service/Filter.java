package task3.salad.service;

public interface Filter {
    void sortByCalories();
    void sortByWeight();
    double caloricity();
    void showAll();
    void showIngredientByCalories(double from, double to);
}
