package task3.salad.controller;

import task3.salad.entity.chef.Chef;
import task3.salad.entity.chef.InnaChef;
import task3.salad.entity.salad.Salad;
import task3.salad.service.CommandService;
import task3.salad.service.IngredientFilterImpl;
import task3.salad.service.SaladServiceImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainController {
    private static SaladServiceImpl saladService = new SaladServiceImpl();
    private static CommandService commandService = new CommandService(saladService);
    private static IngredientController ingredientController;
    public static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    static Chef innaChef = new InnaChef();

    public static void main(String[] args) throws IOException {
        showMenu();
        while (true) {
            ingredientController.askOperation();
            ingredientController.giveAnswer();
        }

    }

    public static void showMenu() throws IOException {
        int choice;
        System.out.println("Our menu: ");
        saladService.showSalads();
        System.out.println("Choose your salad: ");
        choice = Integer.parseInt(bufferedReader.readLine());
        Salad salad = saladService.getAll().get(choice - 1);
        ingredientController = new IngredientController(new IngredientFilterImpl(salad.getIngredients()));
        System.out.println("Your salad: " + salad.getName());
        innaChef.getManagerCommands().addCommand(commandService.getCommandList().get(choice - 1));
        innaChef.getManagerCommands().run();
    }
}
