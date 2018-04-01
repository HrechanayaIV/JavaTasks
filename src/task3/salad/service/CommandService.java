package task3.salad.service;

import task3.salad.command.Command;
import task3.salad.command.CookAustralianSalad;
import task3.salad.command.CookSummerSalad;
import task3.salad.command.CookVitaminSalad;
import task3.salad.entity.salad.AustralianSalad;
import task3.salad.entity.salad.SummerSalad;
import task3.salad.entity.salad.VitaminSalad;

import java.util.ArrayList;
import java.util.List;

public class CommandService {
    private SaladService saladServices;
    private List<Command> commandList = new ArrayList<>();

    public CommandService(SaladService saladServices) {
        this.saladServices = saladServices;
        commandList.add(new CookAustralianSalad((AustralianSalad) saladServices.getAll().get(0)));
        commandList.add(new CookSummerSalad((SummerSalad)saladServices.getAll().get(1)));
        commandList.add(new CookVitaminSalad((VitaminSalad)saladServices.getAll().get(2)));
    }

    public List<Command> getCommandList() {
        return commandList;
    }

    public void setCommandList(List<Command> commandList) {
        this.commandList = commandList;
    }
}
