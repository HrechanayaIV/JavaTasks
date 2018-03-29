package task1.task11;

import task1.task11.controller.ListCreator;
import task1.task11.controller.VehicleFilter;
import task1.task11.model.CCar;
import task1.task11.model.CShip;
import task1.task11.view.VehicleMenu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static VehicleFilter filter = new VehicleFilter();
    private static ListCreator creator = new ListCreator();

    public static void main(String[] args) throws IOException {

        creator.addVehicles(new CCar(2, 7, 130, 60, 2000));
        creator.addVehicles(new CCar(8, 7, 2025, 150, 2003));
        creator.addVehicles(new CCar(0, 5, 1899, 220, 2016));
        creator.addVehicles(new CCar(8, 7, 987, 180, 2015));
        creator.addVehicles(new CCar(3, 5, 1000, 260, 2000));
        creator.addVehicles(new CShip(3, 5, 8000, 100, 2016, 250, "Ukraine"));
        creator.addVehicles(new CShip(8, 2, 6078, 170, 2001, 150, "Russia"));
        creator.addVehicles(new CShip(1, 6, 9000, 165, 2005, 200, "Germany"));
        creator.addVehicles(new CShip(6, 3, 6050, 180, 2014, 120, "USA"));

        askOperation();
    }

    public static void askOperation() throws IOException {
        VehicleMenu menu = new VehicleMenu(filter, creator);
        int choice;
        menu.showVehicleMenu();
        while (true) {
            choice = Integer.parseInt(reader.readLine());
            switch (choice) {
                case 1:
                    menu.task1();
                    break;
                case 2:
                    menu.task2();
                    break;
                case 3:
                    menu.task3();
                    break;
                case 4:
                    menu.task4();
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
