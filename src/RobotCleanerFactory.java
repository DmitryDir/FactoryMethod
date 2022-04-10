public class RobotCleanerFactory implements RobotFactory{
    @Override
    public Robot createRobot() {
        return new RobotCleaner();
    }
}
