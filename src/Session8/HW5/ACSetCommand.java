package Session8.HW5;

class ACSetCommand implements Command {
    private AirConditioner ac;

    public ACSetCommand(AirConditioner ac) {
        this.ac = ac;
    }

    public void execute() {
        ac.setTemperature(28);
    }
}
