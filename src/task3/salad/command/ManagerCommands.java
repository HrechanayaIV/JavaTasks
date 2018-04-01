package task3.salad.command;

import java.util.ArrayList;
import java.util.List;
//Invoker
public class ManagerCommands {
    private List<Command> commandList = new ArrayList<>();
    public void addCommand(Command command){
        commandList.add(command);
    }
    public void run(){
        for (Command command :commandList) {
            command.execute();
        }
    }
}
