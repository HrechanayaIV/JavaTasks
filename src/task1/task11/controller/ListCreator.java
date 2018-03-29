package task1.task11.controller;

import task1.task11.model.CVehicle;

import java.util.ArrayList;
import java.util.List;

public class ListCreator {
    private List<CVehicle> vehicles = new ArrayList<>();

    public void addVehicles(CVehicle vehicle) {
        vehicles.add(vehicle);
    }

    public List<CVehicle> getVehicles() {
        return vehicles;
    }
}
