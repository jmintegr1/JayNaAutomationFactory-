package OOPConceptPart1;

public class FunctionsInJava {

    //Main Method is the starting point of execution

    public static void main(String[] args) {  //Main method is void because it never returns a value. We never write a return statement inside main

        FunctionsInJava obj = new FunctionsInJava();
        //One object will be created, obj is the reference variable, referring to this object
        //after creating the object, the copy of all NON-static methods will be given to this object
        //NON-static method because object CANNOT HOLD STATIC METHOD so Main is not giving to the obj

        obj.testRun();

        int l = obj.PQR();
        System.out.println(l);

        String s = obj.QA();    //The instance variable can be letter like s or a word or anything
        System.out.println(s);

        int TrueBlue = obj.division(30, 10); //The instance variable can be a word or anything
        System.out.println(TrueBlue);

    }

    //Non-static methods
    //Void -- does not return any value
    //Return type = void
    public void testRun() { //no input, no output

        System.out.println("test method");
    }

    //return type = int
    public int PQR() {  //no input, some output
        System.out.println("PQR method");

    int a = 10;
    int b = 20;
    int c = a + b;

    return c;

    }

    public String QA(){ //no input, some output
        System.out.println("qa method");
        String s = "Selenium";

        return s;
    }


    //return tuype -->int
    //x,y --> input parameters/arguments
    public int division(int x, int y) {    //You can only have int as return type as it gives you result of integer
        System.out.println("division method");
        int d = x / y;

        return d;

    }
}
