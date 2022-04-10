public class RobotManagerFactory implements RobotFactory{
    @Override
    public Robot createRobot() {
        return new RobotManager();
    }
}
