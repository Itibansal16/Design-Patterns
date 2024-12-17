public class OffState implements RobotState{
    private final Robot robot;

    public OffState(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void walk() {
        this.robot.setCurrentState(this.robot.getOnState());
        System.out.println("Walking...");
    }

    @Override
    public void cook() {
        System.out.println("Can't cook while in off state");
    }

    @Override
    public void off() {
        System.out.println("Already off..");
        robot.setCurrentState(robot.getOffState());
    }
}
