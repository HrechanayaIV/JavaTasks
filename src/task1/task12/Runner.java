package task1.task12;

import task1.task11.model.CCar;
import task1.task12.controller.ListCreator;
import task1.task12.controller.VehicleFilter;
import task1.task12.model.Amphibian;
import task1.task12.model.BatMobile;
import task1.task12.view.VehicleMenu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static VehicleFilter filter = new VehicleFilter();
    private static ListCreator creator = new ListCreator();

    public static void main(String[] args) throws IOException {
        creator.addVehicles(new BatMobile(2, 3, 38000, 380, 2018));
        creator.addVehicles(new BatMobile(100, 150, 98700, 500, 2016));
        creator.addVehicles(new Amphibian(5, 7, 1500, 170, 2011));
        creator.addVehicles(new Amphibian(4, 7, 1200, 70, 1990));

        askOperation();
    }

    public static void askOperation() throws IOException {
        VehicleMenu menu = new VehicleMenu(filter, creator);
        int choice;
        menu.showMenu();
        while (true) {
            choice = Integer.parseInt(reader.readLine());
            switch (choice) {
                case 1:
                    menu.max();
                    break;
                case 2:
                    menu.min();
                    break;
                case 3:
                    menu.speedOrder();
                    break;
                case 0:
                    menu.exit();
                    break;
                default:
                    System.out.println("You make an error, make a choice one more");
            }
        }
    }
}