package Session8.HW3;

import java.util.Stack;

class RemoteControl {
    private Stack<Command> history = new Stack<>();

    public void pressButton(Command command) {
        command.Execute();
        history.push(command);
    }

    public void undo() {
        if (!history.isEmpty()) {
            Command last = history.pop();
            last.Undo();
        } else {
            System.out.println("Không có lệnh để undo!");
        }
    }
}
