package task1.task12.view;

import task1.task11.model.CCar;
import task1.task12.Runner;
import task1.task12.controller.ListCreator;
import task1.task12.controller.VehicleFilter;

import java.io.IOException;
import java.util.List;

public class VehicleMenu {
    private VehicleFilter filter;
    private ListCreator listCreator;

    public VehicleMenu(VehicleFilter filter, ListCreator listCreator) {
        this.filter = filter;
        this.listCreator = listCreator;
    }

    public void max() throws IOException {
        System.out.print("Car with maximum speed: ");
        CCar car = filter.getCarWithMaxSpeed(listCreator.getCarList());
        System.out.println(car);
        Runner.askOperation();
    }

    public void min() throws IOException {
        System.out.print("Car with minimum speed: ");
        CCar car = filter.getCarWithMinSpeed(listCreator.getCarList());
        System.out.println(car);
        Runner.askOperation();
    }

    public void speedOrder() throws IOException {
        System.out.println(" Sort by speed: ");
        List<CCar> cars = filter.sort(listCreator.getCarList());
        for (CCar car : cars) {
            System.out.println(car);
        }
        Runner.askOperation();
    }

    public void exit() {
        System.out.println("Exit");
        System.exit(0);
    }

    public void showMenu() {
        System.out.println("1.Find fastest car");
        System.out.println("2.Find slowest csr");
        System.out.println("3.Order by speed");
        System.out.println("0.Exit");
    }
}
