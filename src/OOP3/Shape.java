package OOP3;

public abstract class Shape {  //Use keyword abstract to define abstract class


    Shape(){
        System.out.println("Shape class constructor");
    }

    int color;

    abstract void drawing();  //Abstract method

    public void fill() {  //In abstract class we class have both Regular method body as well as Abstract method
        System.out.println("Shape -- fill");// I cannot create the object of abstract class and I cannot create the object of interface as well cuz both are abstract in nature

    }
}


