package task3.salad.service;

import task3.salad.entity.salad.AustralianSalad;
import task3.salad.entity.salad.Salad;
import task3.salad.entity.salad.SummerSalad;
import task3.salad.entity.salad.VitaminSalad;

import java.util.ArrayList;
import java.util.List;

public class SaladServiceImpl implements SaladService{
    private List<Salad> salads = new ArrayList<>();

    public SaladServiceImpl() {
        salads.add(new AustralianSalad());
        salads.add(new SummerSalad());
        salads.add(new VitaminSalad());
    }

    @Override
    public List<Salad> getAll() {
        return salads;
    }

    @Override
    public void showSalads() {
        for (int i = 1; i<= salads.size(); i++) {
            System.out.println(i + ". " + salads.get(i-1));
        }
    }
}
