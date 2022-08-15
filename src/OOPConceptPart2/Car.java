package OOPConceptPart2;


public class Car extends Vehicle {  //Parent

    public void start() { //O to the left is for Overridden -- cuz Child has it's own version and jvm will prefer to run the child's method

        System.out.println("Car....Run");
    }

    public void stop() {

        System.out.println("Car....Stop");
    }

    public void refuel(){

        System.out.println("Car....Refuel");
    }
}
