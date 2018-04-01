package task3.salad.service;

import task3.salad.entity.salad.Salad;

import java.util.List;
import java.util.Set;

public interface SaladService {
    List<Salad> getAll();
    void showSalads();
}
