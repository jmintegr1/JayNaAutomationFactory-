package OOPConceptPart1;

public class Car {

    //Class car:
    int model;
    int wheel;


    public static void main(String[] args) {



        Car a = new Car();   // new Car(); ---> This latter part with keyword NEW is the object of car class, not the first part
        Car b = new Car();   //a,b,c ---> are Object reference variables
        Car c = new Car();


        a.model = 2015;
        a.wheel = 4;

        b.model = 2014;
        b.wheel = 4;

        c.model = 2013;


        System.out.println("before assigning the references");

        System.out.println(a.model);
        System.out.println(a.wheel);

        System.out.println(b.model);
        System.out.println(b.wheel);

        System.out.println(c.model);
        System.out.println(c.wheel);


        System.out.println("after shifting the references");

        a=b;
        b=c;
        c=a;

        a.model =10;
        System.out.println(a.model); //Output will be 10
        System.out.println(b.model);
        c.model =20;
        System.out.println(a.model); //Now output will be 20 for a because c was changed, it changed a as well in the object after shit
        System.out.println(c.model);


    }
}
