package OOPConceptPart1;

public class StaticAndNonStaticConcept {

    //Global variable: The scope of global variable will be available across ALL the functions with some "conditions"
    String name = "Tom";  //Non-Static global variable
    static int age = 25; //Static global variable, just put the keyword (static) front of it

    public static void main(String[] args){

        //How to call STATIC Methods? 2 ways to do it:
        //1. by Direct Calling:
        sum();   //Method from line 45

        //2. Calling by classname:
        StaticAndNonStaticConcept.sum();

        // System.out.println(StaticAndNonStaticConcept"Tom"); Guess String is not allowed to call this way
        System.out.println("Tom");

        //How to call STATIC Variables?

        System.out.println(age);  //1. Direct calling
        System.out.println(StaticAndNonStaticConcept.age);  //2. Calling by classname:



        //How to call NON-static Methods and Variables?  Ans: We have to instantiate it and call it through an object when it's Non-Static
        //So static methods we don't have to..

        StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
        obj.sendMail(); //sendMail method from line 40 is non-static method
        System.out.println(obj.name);  //name: Tom is also non-static so if we want to print then we have to call them through object reference as well

        //***IQ? Can you access static methods (sum method from line 46) by using "object reference" (object we made above)?
        //Ans: Yes.. we can but it is not good practice since we can call STATIC method DIRECTLY so by calling through an object is an inefficient way.
        obj.sum(); //Warning wil be given: "Static method sum() from type StaticAndNonStaticConcept should be accessed in static way"

    }

    public void sendMail(){ //NON static method

        System.out.println("Send mail method ");
    }

    public static void sum(){ //STATIC method

        System.out.println("Sum method");
    }

    //Use the diagram I created that Naveen highly recommends to refer during interview (With big Object circle and Common Memory Allocation)

}
