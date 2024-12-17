public class CookState implements RobotState{
    private final Robot robot;

    public CookState(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void walk() {
        this.robot.setCurrentState(this.robot.getOnState());
        System.out.println("Walking...");
    }

    @Override
    public void cook() {
        System.out.println("Cooking...");
        this.robot.setCurrentState(robot.getCookState());
    }

    @Override
    public void off() {
        System.out.println("can't be turned off while in cooking state...");
    }
}
