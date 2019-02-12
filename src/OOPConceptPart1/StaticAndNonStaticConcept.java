package OOPConceptPart1;

public class StaticAndNonStaticConcept {

    //Global variable: The scope of global variable will be available across ALL the functions with some "conditions"
    String name = "Tom";  //Non static global variable
    static int age = 25; //Static global variable, just put the keyword front of it

    public static void main(String[] args){

        //How to call STATIC Methods? 2 ways to do it:
        //1. by Direct Calling:
        sum();   //Method from line 48

        //2. Calling by classname:
        StaticAndNonStaticConcept.sum();


        //How to call STATIC Variables?

        System.out.println(age);  //1. Direct calling
        System.out.println(StaticAndNonStaticConcept.age);  //2. Calling by classname:



        //How to call NON-static methods and variables?  Ans: We have to instantiate it and calling it through an object

        StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
        obj.sendMail(); //sendMail method from line 45 is non-static method
        System.out.println(obj.name);  //name: Tom is also non-static

        //***IQ? Can you access static methods (sum method from line 48) by using "object reference" (object we made above)?
        // Ans: Yes.. we can but it is not good practice since we can call stating method directly so by calling through an object is the inefficient way
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
