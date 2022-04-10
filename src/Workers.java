public class Workers {

    public static void main(String[] args) {
        RobotFactory robotFactory = createRobotFactory("MaNaGER");
        Robot robot = robotFactory.createRobot();

        robot.works();
    }

    static RobotFactory createRobotFactory(String specialty) {
        if (specialty.equalsIgnoreCase("Manager")) {
            return new RobotManagerFactory();
        }
        else if (specialty.equalsIgnoreCase("Cleaner")) {
            return new RobotCleanerFactory();
        }
        else {
            throw new RuntimeException(specialty + " the robot was not created");
        }
    }
}
