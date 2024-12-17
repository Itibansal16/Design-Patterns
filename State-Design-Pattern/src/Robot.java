public class Robot {
    private RobotState onState;
    private RobotState offState;
    private RobotState walkState;
    private RobotState cookState;
    private RobotState currentState;

    public Robot() {
        this.onState = new OnState(this);
        this.offState = new OffState(this);
        this.cookState = new CookState(this);
        this.walkState = new WalkState(this);
        this.currentState = this.offState;
    }

    public void walk() {
        this.currentState.walk();
        this.setCurrentState(walkState);
    }
    public void cook() {
        this.currentState.cook();
    }
    public void off() {
        currentState.off();
    }

    public RobotState getOnState() {
        return onState;
    }

    public void setOnState(RobotState onState) {
        this.onState = onState;
    }

    public RobotState getOffState() {
        return offState;
    }

    public void setOffState(RobotState offState) {
        this.offState = offState;
    }

    public RobotState getWalkState() {
        return walkState;
    }

    public void setWalkState(RobotState walkState) {
        this.walkState = walkState;
    }

    public RobotState getCookState() {
        return cookState;
    }

    public void setCookState(RobotState cookState) {
        this.cookState = cookState;
    }

    public RobotState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(RobotState currentState) {
        this.currentState = currentState;
    }
}
