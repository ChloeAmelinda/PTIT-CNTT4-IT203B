package Session8.HW5;

import java.util.*;

class SleepModeCommand implements Command {
    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command c) {
        commands.add(c);
    }

    public void execute() {
        System.out.println("\n=== Kích hoạt chế độ ngủ ===");
        for (Command c : commands) {
            c.execute();
        }
    }
}
