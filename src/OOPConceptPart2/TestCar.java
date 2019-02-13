package OOPConceptPart2;

public class TestCar {
    public static void main(String[] args) {


        BMW b = new BMW();
        b.start();  //start() is overridden because child has it's own version although it's COMMON METHOD but jvm will prefer child's perhaps improved method =
                   // Static polymorphismm -- AKA COMPILE Time Polymorphism (Poly means one to many method), also means method overriding

        b.theftSafety(); //theftSafety() is child's unique method the rest child inheritS or has its own modified version like start() from parent
        b.stop();
        b.refuel();  //stop() & refuel() method so it inherits from Parent Car class
        b.engine(); //Is called from Grandparent (Vechile class) which extends by parent (Car class)

        System.out.println("***********");

        Car c = new Car();
        c.start();
        c.stop();
        c.refuel();
        c.engine(); //Inheriting from Vechile super class
        //C object cannot inherit theftSafety() because parent class cannot inherit from child class

        System.out.println("**********"); //Dynamic polymorphism or Run time polymorphism, you cannot access theftSafety method

        //Top Casting -- Child class object can refer to parent class reference variable, we are Top Casting of making BMW class object referred (casting) by parent class reference variable.
        Car c1 = new BMW();  //Child class object (BMW object) can be referred by parent class'( c1) reference variable, it is called -- Dynamic Polyporphism or --> RUN TIME Polymorphism
        c1.start();  //this method calls BMW's start method       |     Top casting is allowed as we are moving small thing to big thing
        c1.stop();
        c1.refuel(); // stop and refuel method is Called from parent's class


        //Down Casting --You are degrading cast of car class, parent class INTO child class object then referred by child class reference variable. Parent class object trying to be referred by child class reference variable
        //is NOT allowed in RUNT TINME
        //BMW b1 = new Car(); //NOT ALLOWED!
        BMW b1 = (BMW)new Car(); //***IQ: Is down casting possible? Yes.. we can do it this way in Compile Time BUT you'll get ClassCastException during RUN Time because parent cannot be fit into child class reference variable  |
    }
}
