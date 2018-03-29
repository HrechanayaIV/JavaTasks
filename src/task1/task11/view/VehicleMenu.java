package task1.task11.view;

import task1.task11.Runner;
import task1.task11.controller.ListCreator;
import task1.task11.controller.VehicleFilter;

import java.io.IOException;

public class VehicleMenu {
    private VehicleFilter vehicleFilter;
    private ListCreator listCreator;

    public VehicleMenu(VehicleFilter vehicleFilter, ListCreator listCreator) {
        this.vehicleFilter = vehicleFilter;
        this.listCreator = listCreator;
    }

    public void task1() throws IOException {
        System.out.println("The most expensive Vehicle is :");
        System.out.println(vehicleFilter.getCVehicleWithMaxPrice(listCreator.getVehicles()));
        Runner.askOperation();
    }

    public void task2() throws IOException {
        System.out.println("The vehicle with release in 2000-2005 years, speed more than 150 km/h, min price is:");
        System.out.println(vehicleFilter.filterByYearSpeedPrice(listCreator.getVehicles()));
        Runner.askOperation();
    }

    public void task3() throws IOException {
        System.out.println("The list of cars not older than 5 years");
        System.out.println(vehicleFilter.filterByNewestCars(listCreator.getVehicles()));
        Runner.askOperation();
    }

    public void task4() throws IOException {
        System.out.println("The list of Ship not older than 5 years, sort by Price:");
        System.out.println(vehicleFilter.filterByNewestShipWithSort(listCreator.getVehicles()));
        Runner.askOperation();
    }

    public void exit() {
        System.out.println("EXIT");
        System.exit(1);
    }

    public void showVehicleMenu() {
        System.out.println("1 task1");
        System.out.println("2 task2");
        System.out.println("3 task3");
        System.out.println("4 task4");
        System.out.println("0 Exit menu");
    }
}
