package OOPConceptPart1;

public class StaticAndNonStaticConcept {

    //Global variable: The scope of global variable will available across all the funtions


    String name = "Tom";  //Non static global variable
    static int age = 25; //Static global variable, just put the keyword front of it

    public static void main(String[] args){

        //How to call static methods and variables?
        //1. by Direct Calling:
        sum();

        //2. Calling by classname:
        StaticAndNonStaticConcept.sum();

        System.out.println(age);
        System.out.println(StaticAndNonStaticConcept.age);

        //How to call non static methods and variables?
        StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
        obj.sendMail();
        System.out.println(obj.name);

        //IQ? Can I access static methods by using object reference? Yes.. this is how:
        obj.sum(); //Warning wil be giving



    }

    public void sendMail(){ //Non static method
        System.out.println("Send mail method ");
    }

    public static void sum(){ //Static method
        System.out.println("Sum method");
    }


    //Use the diagram I created that Naveen highly recommends to refer during interview

}
