package task1.task12.controller;

import task1.task11.model.CCar;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class VehicleFilter {
    public List<CCar> sort(List<CCar> carList) {
        Collections.sort(carList, new Comparator<CCar>() {
            @Override
            public int compare(CCar o1, CCar o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }
        });
        return carList;
    }

    public CCar getCarWithMaxSpeed(List<CCar> carList) {
        int size = carList.size();
        sort(carList);
        return carList.get(size - 1);
    }

    public CCar getCarWithMinSpeed(List<CCar> carList) {
        sort(carList);
        return carList.get(0);
    }
}
