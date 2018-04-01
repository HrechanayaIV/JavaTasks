package task3.salad.entity.chef;

import task3.salad.command.Command;
import task3.salad.command.ManagerCommands;

public abstract class Chef {
    protected String name;
    private ManagerCommands managerCommands;

    public Chef(String name) {
        this.name = name;
        this.managerCommands = new ManagerCommands();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ManagerCommands getManagerCommands() {
        return managerCommands;
    }

    public void setManagerCommands(ManagerCommands managerCommands) {
        this.managerCommands = managerCommands;
    }

    public void addSaladForCook(Command command){
        getManagerCommands().addCommand(command);
    }

    @Override
    public String toString() {
        return "Chef{" +
                "name='" + name + '\'' +
                '}';
    }
}
