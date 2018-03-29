package task1.task11.controller;

import task1.task11.model.CCar;
import task1.task11.model.CShip;
import task1.task11.model.CVehicle;

import java.util.*;

public class VehicleFilter {
    private int currentYear = Calendar.getInstance().get(Calendar.YEAR);

    public CVehicle getCVehicleWithMaxPrice(List<CVehicle> vehicles) {
        double maxPrice = 0;
        CVehicle vehicle = null;

        for (CVehicle vehicle1 : vehicles) {
            if (vehicle1.getPrice() > maxPrice) {
                vehicle = vehicle1;
                maxPrice = vehicle.getPrice();
            }
        }
        return vehicle;
    }

    public CVehicle getCVehicleWithMinPrice(List<CVehicle> vehicles) {
        double minPrice = vehicles.get(0).getPrice();
        CVehicle vehicle = vehicles.get(0);

        for (CVehicle vehicle1 : vehicles) {
            if (vehicle1.getPrice() < minPrice) {
                vehicle = vehicle1;
                minPrice = vehicle.getPrice();
            }
        }
        return vehicle;
    }

    public CVehicle filterByYearSpeedPrice(List<CVehicle> vehicles) {
        List<CVehicle> vehiclesList = new ArrayList<>();

        for (CVehicle vehicle : vehicles) {
            if (vehicle.getRelease() <= 2005 && vehicle.getRelease() >= 2000) {
                if (vehicle.getSpeed() > 150) {
                    vehiclesList.add(vehicle);
                }
            }
        }
        return getCVehicleWithMinPrice(vehiclesList);
    }

    public List<CCar> filterByNewestCars(List<CVehicle> vehicles) {
        List<CCar> cars = new ArrayList<>();
        for (CVehicle vehicle : vehicles) {
            if ((vehicle instanceof CCar) && (currentYear - vehicle.getRelease() <= 5)) {
                cars.add((CCar) vehicle);
            }
        }
        return cars;
    }

    public List<CShip> filterByNewestShipWithSort(List<CVehicle> vehicles) {
        List<CShip> ships = new ArrayList<>();
        for (CVehicle vehicle : vehicles) {
            if ((vehicle instanceof CShip) && (currentYear - vehicle.getRelease() <= 5)) {
                ships.add((CShip) vehicle);
            }
        }
        Collections.sort(ships, new Comparator<CShip>() {
            @Override
            public int compare(CShip o1, CShip o2) {
                return (int) (o2.getPrice() - o1.getPrice());
            }
        });
        return ships;
    }

}
