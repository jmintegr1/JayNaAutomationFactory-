package testCasesFor3Fs;

public class FinallyConcept { //finally is a block

    public static void main(String[] args) {
        //test1();
        // test2();
        division();
    }

/*     public static void test1() {
        try {
            System.out.println("inside test1 method");
            throw new RuntimeException("test");
        } catch (Exception e) {
            System.out.println("inside catch block");
        } finally {  //finally is a block                 It is also a keyword always used in association with try catch block, it gurantees what
            System.out.println("inside finally block");  //ever code is finally block, it will be executed after try catch weather there is exception or NOT
        }*/

    //
   /* public static void test2() {
        try {
            System.out.println("inside test2");
        } finally {
            System.out.println("finally code in test 2 method");   //Here "just try" block and finally will always be executed regardless of exception or not

        }
    }
*/
    public static void division() {
        int i = 10;
        try {
            System.out.println("inside try block");
            int k = i / 0;
        }
       /* catch (ArithmeticException e) {
            System.out.println("Inside catch block");
            System.out.println("divide by zero error");
        } finally {
            System.out.println("execute this code EVEN AFTER any exception");


        }*/ catch (NullPointerException e) { //****Famous interview tricky IQ question (FITO): What will happen if you have different exception than what is expected like above try block of code?
            System.out.println("Inside catch block"); //IQ**** Say where we get NullPointerException instead of ArithmeticException even though in the code we are dividing by zero?
            System.out.println("divide by zero error"); //It will run and exception will be thrown but nobody is there to catch it, and nobody is going to come inside the
        } //catch block. The core control will not come inside the catch block because we are expecting arithmetic but it is giving NullPointer.
        //So right away it will JUMP inside the finally block and then it will be executed so finally block will be called always.
        // Then in the counsel we'll get: what ever code inside the print line statements of try catch block and finally block.

        finally { //So it doesn't matter if any expected or unexpected catch block with Exception is is coming inside or not after the execution
            //it will execute finally key word. So whatever we have written inside the finally code, will be executed.
            System.out.println("execute this code even after any exception");
        }

    }
}
