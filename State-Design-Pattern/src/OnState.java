public class OnState implements RobotState{
    private final Robot robot;

    public OnState(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void walk() {
        this.robot.setCurrentState(this.robot.getOnState());
        System.out.println("walking...");
    }

    @Override
    public void cook() {
        System.out.println("Cooking...");
        this.robot.setCurrentState(robot.getCookState());
    }

    @Override
    public void off() {
        System.out.println("Turned off...");
        robot.setCurrentState(robot.getOffState());
    }
}
