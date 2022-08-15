package OOPConceptPart2;

public class TestCar {  ///This is the runner class
    public static void main(String[] args) {


        BMW b = new BMW(); //Grandchild
        b.start();
        //start() is Overridden because child has it's own version although it's COMMON METHOD to parent (Car class) but jvm will prefer child's
        // perhaps improved method = hence it's overridden of the parent's method so Dynamic Polymorphism( MOR + RT = DP )


        // Static polymorphism -- AKA-- COMPILE Time Polymorphism (Poly means one to many method), also means method overloading
        //Method OverLoading + is related to + Compile Time aka + or Static Polymorphism. (MOL + CT = SP) AKA Has-A relation

        b.theftSafety(); //theftSafety() is child's unique method the rest child inherits or has its own modified version like start() from parent
        b.stop();
        b.refuel();   //stop() & refuel() method inherited from Parent's Car class
        b.engine();  //Is called from Grandparent (Vehicle class) which extends by parent (Car class).. therefore child class
                    // (BMW reference variable b) automatically inherits engine() from both father and grandfather

        System.out.println("*********************");

        Car c = new Car(); //FatherJhI
        c.start();
        c.stop();
        c.refuel();
        c.engine();          //Inheriting from Car's father = Vehicle class (super class / Grandfather class)
        //c.theftSafety(); //c object cannot inherit theftSafety() because parent class cannot inherit from child class

        System.out.println("**********"); //In Dynamic polymorphism or Run time polymorphism, you cannot access theftSafety method

          //Top Casting -- Child class object can refer to parent class reference variable (think of hybrid project of Parent & Child).
        // When we are Top Casting of making BMW class object referred (casting) by parent class reference variable.
                              //Child class object (BMW object) can be referred by parent class'( cb) reference variable, it is also called
        Car cb = new BMW(); // -Dynamic Polyporphism or --> RUN TIME Polymorphism
        cb.start();     //start() method is called from BMW's (child's class) as it has it's own same method name | So Top casting (widening) is
        cb.stop();    //allowed as we are moving small thing to big thing
        cb.refuel();// Stop and refuel method is Called from parent's class


        //Down Casting --You are degrading cast of car(parent) class, parent class INTO child class object then referred by child class reference variable.
        // Parent class object trying to be referred by child class reference variable is NOT allowed in RUNT TIME
        //BMW b1 = new Car(); //NOT ALLOWED at ALL.. you'll get red error line as soon as you write it!

        BMW b2 = (BMW)new Car();  //If commented out then I won't see ClassCastException

        //***IQ: Is down casting possible? Ans: Yes, we can do it to an "extent" as this take place in Compile Time BUT we'll get
        // ClassCastException during RUN Time because parent cannot fit into child class or (narrowing) reference variable.

    }
}
