package OOPConceptPart1;

public class FunctionsInJava {

    //*****Main Method is the starting point of execution
    //Method and Function are used interchangeably
                                                 // **IQ: Why main method is void?
    public static void main(String[] args) {    //Ans: Main method is void because it NEVER returns a value, We NEVER write a RETURN STATEMENT inside main()

        FunctionsInJava obj = new FunctionsInJava(); //If I don't instantiate this object than I cannot call the 4 methods below, they are useless without it

//        Always remember new FunctionsInJava is the OBJECT, on the other side of eqaul = obj, is the REFERENCE VARIABLE
//
//        One object will be created, obj is the reference variable, referring to this object
//
//        after creating the object, the copy of all NON-static methods will be ASSIGNED to this object (all 4 methods below)
//
//        NON-static methods are assigned because object CANNOT HOLD STATIC METHOD so Main is NOT assigned to the obj.
//
//        If you want to call Non-Static method of ANY Class, you have to create an Object and use its Reference variable.


        obj.testRun();

        int l = obj.PQR(); //PQR method below is executed it will come up here and called by obj.PQR = 30 will be given to l as line 38 testRun() method  is executed
        System.out.println(l); //Now l = 30

        String s1 = obj.QA(); //String QA() method below, line 55 is executed it will come up here and called by obj.QA = Selenium which will be given to s1
        System.out.println(s1);

        int TrueBlue = obj.division(30, 10); //The instance variable can be a word or anything     | Executed just like above
        System.out.println(TrueBlue);

    }

    //Non-static methods
    //Return type = void (Void = means does not return any value)
    public void testRun() { //no input in parameter, no output
        System.out.println("test method");
    }

    //return type = int, if put void it will not work as there is conflict as we want result here so use return keyword below
    public int PQR() {  //Or JoeShomo(), give it any name you want   |   No input in parameter but some output
        System.out.println("PQR method");

    int a = 10;  //Inside this method we declare some variables
    int b = 20;
    int c = a + b;

    return c;   //return keyword will give us the result of above calculation

    }

     //If you put void here there is conflict as we want return of s which is String
    public String QA(){ //no input in parameter but some output
        System.out.println("qa method");
        String s1 = "Selenium";
        return s1;
    }

    //return type is int
    //Here we are using x & y in as input parameters/arguments
    public int division(int x, int y) {  //You can only have int as return type as it gives you result of integer in return d
        System.out.println("division method");
        int d = x / y;

        return d;
    }
}
