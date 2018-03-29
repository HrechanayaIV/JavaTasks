package task1.task12.controller;

import task1.task11.model.CCar;

import java.util.ArrayList;
import java.util.List;

public class ListCreator {
    private List<CCar> carList = new ArrayList<>();

    public void addVehicles(CCar car) {
        carList.add(car);
    }

    public List<CCar> getCarList() {
        return carList;
    }

    public void setCarList(List<CCar> carList) {
        this.carList = carList;
    }

}
