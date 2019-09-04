package OOPConceptPart2;

public class TestCar {
    public static void main(String[] args) {


        BMW b = new BMW(); //Grandchild
        b.start();  //start() is Overridden because child has it's own version although it's COMMON METHOD to parent but jvm will prefer child's perhaps improved method = hence it's overridden   ( MOR + RT = DP )
                   // Static polymorphismm -- AKA-- COMPILE Time Polymorphism (Poly means one to many method), also means method overloadinging

        b.theftSafety(); //theftSafety() is child's unique method the rest child inherits or has its own modified version like start() from parent
        b.stop();
        b.refuel();   //stop() & refuel() method inherited from Parent Car class
        b.engine();  //Is called from Grandparent (Vehicle class) which extends by parent (Car class).. therefore child class (BMW reference variable b) automatically inherits engine()

        System.out.println("***********");

        Car c = new Car(); //Father
        c.start();
        c.stop();
        c.refuel();
        c.engine(); //Inheriting from Car's father = Vehicle class (super class / Grandfather class)
        //c object cannot inherit theftSafety() because parent class cannot inherit from child class

        System.out.println("**********"); //Dynamic polymorphism or Run time polymorphism, you cannot access theftSafety method

        //Top Casting -- Child class object can refer to parent class reference variable (think of hybrid porject of Parent & Child). When we are Top Casting of making BMW class object referred (casting) by parent class reference variable.
        Car cb = new BMW();  //Child class object (BMW object) can be referred by parent class'( c1) reference variable, it is also called -- Dynamic Polyporphism or --> RUN TIME Polymorphism
        cb.start();  //start method is called from BMW's (child's class)   |   Top casting (widening) is allowed as we are moving small thing to big thing
        cb.stop();
        cb.refuel(); // Stop and refuel method is Called from parent's class


        //Down Casting --You are degrading cast of car(parent) class, parent class INTO child class object then referred by child class reference variable.
        // Parent class object trying to be referred by child class reference variable is NOT allowed in RUNT TIME
        //BMW b1 = new Car(); //NOT ALLOWED at ALL.. you'll get red error line as soon as you write it!
        BMW b2 = (BMW)new Car();
        //***IQ: Is down casting possible? Ans: Yes, we can do it to an "extent" as this take place in Compile Time BUT we'll get ClassCastException during RUN Time because
        //parent cannot be fit into child class or (narrowing) reference variable.

    }
}
