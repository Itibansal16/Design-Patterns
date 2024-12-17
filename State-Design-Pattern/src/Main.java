public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.walk();
        robot.cook();
        robot.off();
        robot.cook();
        robot.walk();
        robot.off();
        robot.cook();
        robot.walk();
    }
}