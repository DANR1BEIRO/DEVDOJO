**Testing abstract classes and methods**

<span style="color:green;">&#x2705;</span> Exercise 1: Basic Robot

Objective: Create an abstract Robot class and two concrete subclasses.

Instructions:

    Create an abstract class Robot with:
        A String name attribute
        A constructor that takes the name
        An abstract method void performTask()
        A concrete method void turnOn() that prints "Robot [name] turned on!"

    Create two subclasses: CleaningRobot and DeliveryRobot, each implementing the performTask() method differently.

    In the main method, create an object of each type and call the turnOn() and performTask() methods.

<span style="color:green;">&#x2705; </span> Exercise 2: Robots with Battery

Objective: Add battery functionality to robots.

Instructions:

    Modify the abstract Robot class to include:
        An int batteryLevel attribute (0-100)
        A concrete method void recharge() that sets the battery to 100
        A concrete method boolean hasBattery() that returns true if the battery is greater than 10
        An abstract method void consumeBattery() that each subclass will implement differently
    Modify the subclasses to implement consumeBattery():
        CleaningRobot: consumes 5 battery
        DeliveryRobot: consumes 10 battery
    Modify the performTask() method to check if there's enough battery before performing the task.

<span style="color:green;">&#x2705; </span> Exercise 3: Robot Hierarchy

Objective: Create a more complex hierarchy of robot classes.

Instructions:

    Keep the abstract Robot class as the base.

    Create an abstract IndustrialRobot class that extends Robot and adds:
        A String sector attribute
        An abstract method void checkSafety()

    Create two concrete subclasses of IndustrialRobot:
        WelderRobot: implements performTask() for welding and checkSafety() to check temperature
        AssemblerRobot: implements performTask() for assembling parts and checkSafety() to check for clear area

    In the main method, create an array of Robot containing objects of all concrete classes and demonstrate polymorphism.

Exercise 4: Robot Control System

Objective: Create a system that manages different types of robots.

Instructions:

    Create an abstract Robot class with:
        Attributes for name, batteryLevel, and status (enum: ON, OFF, MAINTENANCE)
        Abstract methods: performTask(), runDiagnostic()
        Concrete methods: turnOn(), turnOff(), recharge()

    Create at least three different concrete robot subclasses.

    Create a ControlCenter class that:
        Maintains a list of robots
        Has methods to add robots, turn all on, turn all off, perform tasks on all
        Has a method to show the status of all robots

    In the main method, demonstrate the system working.

Exercise 5: Robots with Sensors (Challenge)

Objective: Create an advanced robot system with sensors.

Instructions:

    Create an abstract Sensor class with:
        An abstract method boolean check()
        An abstract method String getType()

    Create some concrete subclasses of Sensor: TemperatureSensor, MotionSensor, LightSensor.

    Modify the abstract Robot class to:
        Have an array or list of sensors
        Have a method to add sensors
        Have an abstract method void reactToSensor(Sensor sensor, boolean reading)

    Implement robot subclasses that react differently to sensors.

    In the main method, create robots with different sensors and demonstrate how they react to different readings.