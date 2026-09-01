// Task 3 - Emergency Rescue Robot
// Abstract Class + Interfaces
// All classes in one file

// Interface for Flying
interface Flyable {
    void fly();
}

// Interface for Swimming
interface Swimmable {
    void swim();
}

// Interface for Climbing
interface Climbable {
    void climb();
}

// Abstract Class
abstract class RescueRobot {

    protected int robotId;
    protected String robotName;
    protected int batteryLevel;

    // Constructor
    public RescueRobot(int robotId, String robotName, int batteryLevel) {
        this.robotId = robotId;
        this.robotName = robotName;
        this.batteryLevel = batteryLevel;
    }

    // Concrete Method
    public void displayDetails() {
        System.out.println("-------------------------------------");
        System.out.println("Robot ID      : " + robotId);
        System.out.println("Robot Name    : " + robotName);
        System.out.println("Battery Level : " + batteryLevel + "%");
    }

    // Abstract Method
    abstract void performMission();
}

// Flying Robot
class FlyingRobot extends RescueRobot implements Flyable {

    public FlyingRobot(int id, String name, int battery) {
        super(id, name, battery);
    }

    @Override
    public void fly() {
        System.out.println("Flying to rescue location...");
    }

    @Override
    void performMission() {
        System.out.println("Mission : Air Surveillance");
        fly();
    }
}

// Swimming Robot
class SwimmingRobot extends RescueRobot implements Swimmable {

    public SwimmingRobot(int id, String name, int battery) {
        super(id, name, battery);
    }

    @Override
    public void swim() {
        System.out.println("Swimming to rescue victims...");
    }

    @Override
    void performMission() {
        System.out.println("Mission : Water Rescue");
        swim();
    }
}

// Mountain Robot
class MountainRobot extends RescueRobot implements Climbable {

    public MountainRobot(int id, String name, int battery) {
        super(id, name, battery);
    }

    @Override
    public void climb() {
        System.out.println("Climbing mountain...");
    }

    @Override
    void performMission() {
        System.out.println("Mission : Mountain Rescue");
        climb();
    }
}

// Advanced Robot
class AdvancedRobot extends RescueRobot
        implements Flyable, Swimmable, Climbable {

    public AdvancedRobot(int id, String name, int battery) {
        super(id, name, battery);
    }

    @Override
    public void fly() {
        System.out.println("Flying...");
    }

    @Override
    public void swim() {
        System.out.println("Swimming...");
    }

    @Override
    public void climb() {
        System.out.println("Climbing...");
    }

    @Override
    void performMission() {
        System.out.println("Mission : Disaster Rescue");
        fly();
        swim();
        climb();
        System.out.println("Mission Completed Successfully");
    }
}

// Main Class
public class Main {

    public static void main(String[] args) {

        // Abstract Class References
        RescueRobot[] robots = {

                new FlyingRobot(101, "SkyBot", 90),

                new SwimmingRobot(102, "WaterBot", 85),

                new MountainRobot(103, "HillBot", 95),

                new AdvancedRobot(104, "RescueX", 100)

        };

        System.out.println("========== EMERGENCY RESCUE ROBOT SYSTEM ==========");

        // Demonstrating Runtime Polymorphism
        for (RescueRobot robot : robots) {

            robot.displayDetails();
            robot.performMission();

            System.out.println();
        }

        // Interface References
        System.out.println("========== USING INTERFACE REFERENCES ==========");

        Flyable flyRobot = new FlyingRobot(201, "FlyOne", 80);
        flyRobot.fly();

        Swimmable swimRobot = new SwimmingRobot(202, "SwimOne", 75);
        swimRobot.swim();

        Climbable climbRobot = new MountainRobot(203, "ClimbOne", 70);
        climbRobot.climb();
    }
}