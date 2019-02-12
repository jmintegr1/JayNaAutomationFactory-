package testCases;

public class FinallyConcept { //finally is a block

    public static void main(String[] args) {
        //test1();
        //test2();
        division();
    }

    /*public static void test1() {
        try {
            System.out.println("inside test1 method");
            throw new RuntimeException("test");
        } catch (Exception e) {
            System.out.println("inside catch block");
        } finally {
            System.out.println("inside finally block");
        }*/

    //
    public static void test2(){
        try{
            System.out.println("inside test2");
        }
        finally {
            System.out.println("finally code in test 2 method");
        }
    }

    public static void division(){
        int i = 10;
        try{
            System.out.println("inside try block");
            int k = i/0;
        }
           /* catch(ArithmeticException e){
                System.out.println("Inside catch block");
                System.out.println("divide by zero error");
                */

        catch(NullPointerException e){ //Famous interview tricky question (FITO): What will happen if you have different exception than what is expected like above block of code,
            System.out.println("Inside catch block"); //where NullPointerException instead of ArithmeticException even though in the code we are dividing by zero?
            System.out.println("divide by zero error"); //It will run and exception will be thrown but nobody is there to catch it, and nobody is going to come inside the
            //catch block. The core control will not come inside the catch block because we are expecting arithmetic but it is giving NullPointer.
            //So right away it will jump inside the finally block and then it will be executed so fianlly will be called always.
            // Then in the counsel we'll get: what ever the print line statements are inside of try block and finally block.
            //
        }
        finally { //So it doesn't matter if any catch block with Exception is is coming inside or not after the execution
            //it will execute finally key word. So finally code whatever we have written inside the finally code, will be executed
            System.out.println("execute this code even after any exception");
        }
    }
}

