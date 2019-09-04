package OOP3;

public abstract class Shape {  //Use KEYWORD abstract to define abstract class


    public Shape(){   //Can you create constructor of Abstract class?  Ans: Yes we can

        System.out.println("Shape class constructor"); //And write logic but we CANNOT do the same in Interface
    }   //When a constructor of an Abstract class is created, it will be called by the object of inherited/base class


    int color;

    abstract void drawing();  //Abstract method


    public void fill() {      // In abstract class we can have BOTH Regular method w/ body as well as 100% Abstract method (FULL Abstraction)
        System.out.println("Shape -- fill");    //Regulard Method

    }
}         // Can you create an object of abstract class and create the object of interface?

        // Ans: I CANNOT create the object of an abstract class nor can I create the object of interface cuz both are abstract in nature

       //In Abstract class we can have 50% abstract method and 50% regular method, or any combo (This is called partial Abstraction)
