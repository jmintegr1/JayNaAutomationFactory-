package OOPConceptPart1;

public class StaticAndNonStaticConcept {

    //Global variable: The scope of global variable will be available across ALL the functions with some "conditions"
    String name = "Tom";  //Non-Static global variable by nature since no Keyword indicating it
    static int age = 25; //Static global variable, just put the keyword (static) front of the variable to manually make it static

    public static void main(String[] args){

        //How to call STATIC METHODS? 2 ways to do it:
        //1. By Calling the static method directly "sum()" :
        sum();   //Method called from line 46

        //2. By using classname then call the static method:
        StaticAndNonStaticConcept.sum();

        System.out.println("Tom");

        System.out.println("*********Now calling Static Variables:");
        //How to call STATIC Variables?

        System.out.println("Directly calling the variable: " + age);  //1. Direct calling and pass in the variable name in PLS
        System.out.println("Using classname then call the variable: " + StaticAndNonStaticConcept.age);  //2. Calling by classname then pass in the variable in PLS:


        System.out.println("*****Below we are calling all NON-static methods & variables*****");
        //How to call NON-STATIC Methods and Variables?  Ans: We have to instantiate the class then call it through ORV when it's Non-Static
        //So static methods we don't have to like above!!!


        StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
        obj.sendMail(); //sendMail method from line 41 is non-static method & call it via ORV

        System.out.println("Calling non-static variable using ORV: " + obj.name);  //name: Tom is also non-static so if we want to print then we have to call them through object reference as well


        //***IQ? Can you access/call static Methods (sum method from line 46) by using "object reference" (object we made above)?
        //Ans: Yes.. we can but it is not good practice since we can call STATIC method DIRECTLY so by calling through an object is an inefficient way.
        obj.sum(); //Warning will be given: "Static method sum() from type StaticAndNonStaticConcept should be accessed in static way"

    }

    public void sendMail(){ //NON static method by nature if static is not clearly written before the method name

        System.out.println("Send mail method ");
    }

    public static void sum(){ //STATIC method created by manually writing keyword static

        System.out.println("Sum method");
    }

    //Use the diagram I created that Naveen highly recommends to refer during interview (With big Object circle and Common Memory Allocation)

}
