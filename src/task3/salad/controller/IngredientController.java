package task3.salad.controller;

import task3.salad.service.IngredientFilterImpl;

import java.io.IOException;

public class IngredientController {
    IngredientFilterImpl filter;

    public IngredientController(IngredientFilterImpl filter) {
        this.filter = filter;
    }

    public void giveAnswer() throws IOException {
        int choice;
        choice = Integer.parseInt(MainController.bufferedReader.readLine());
        int from;
        int to;
        switch (choice){
            case 1:
                filter.sortByCalories();
                break;
            case 2:
                filter.sortByWeight();
                break;
            case 3:
                filter.showAll();
                break;
            case 4:
                System.out.println("Input 'from' number:");
                from = Integer.parseInt(MainController.bufferedReader.readLine());
                System.out.println("Input 'to' number");
                to = Integer.parseInt(MainController.bufferedReader.readLine());
                filter.showIngredientByCalories(from,to);
                break;
            case 0:
                System.exit(0);

        }
    }


    public void askOperation(){
        System.out.println("1. sort ingredients by calories");
        System.out.println("2. sort ingredients by weight");
        System.out.println("3. show all ingredients");
        System.out.println("4. show ingredient with caloricity 'from' 'to'");
        System.out.println("0. Exit menu");
    }

}
