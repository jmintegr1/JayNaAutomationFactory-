package testCasesFor3Fs;

public class FinallyConcept { //finally is a block

    public static void main(String[] args) {
         //test1();     //Code from line 11-23
        //test2();    //Code line 26-35
        division();  //Each method will be called then JVM will go inside the corresponding code
    }

       //test1()
//     public static void test1() {  // Able to call method without creating Object cuz it is STATIC in nature
//         try {
//             System.out.println("inside test1 method");
//             throw new RuntimeException("test");
//         } catch (Exception e) {
//             System.out.println("inside catch block");
//         }
//         finally  //Finally is a like a safety net that gurantees that whatever code in finally block will be executed even with exception thrown above in the catch block
//         {                                                 //finally is a BLOCK, it is ALSO a keyword always used in association with "try catch block". finally GURANTEES
//             System.out.println("inside finally block");  //whatever code is in finally block, it will be executed after try/catch, weather there is exception or NOT.
//         }
//     }


    //test2()     //**IQ: What happens if there is NO CATCH block?
//    public static void test2() {  //STATIC in nature so Object not needed
//        try {
//            System.out.println("inside test2");  //This method is called outside try catch block or outside try block (NO Catch block here)
//        }
//        finally {
//            System.out.println("finally code in test 2 method");   //Here "just try" block (catch not included like above) and finally will ALWAYS be executed regardless of exception or not
//        }
//    }
// }

    // Division(                        Static allows us to call directly
    public static void division() {
        int i = 10;
        try {
            System.out.println("inside try block");
            int k = i / 0;  //Expect arithmetic exception here
        } catch (ArithmeticException e) {  //So catch w/ EXPECTED arithmetic exception as it should be but..

            //WILL NOT WORK HAVING TWO CATCH BLOCK, so keep this catch block commented out with unexpected exception until I run it, then comment out the above Catch block with expected ArithmeticException
        //} catch (NullPointerException e) { //Although EXPECTED Arithmetic exception but we written NullPointerException for demo, so it will NOT come inside the Catch block & JUMP to finally block to execute it for SURE

            System.out.println("Inside catch block");
            System.out.println("divide by zero error"); // W/ correct Exception in Catch block this statement would have been executed, since wrong Exception in Catch block so it did NOT execute
        } finally {
            System.out.println("execute this code EVEN AFTER any exception");
        }            //Whatever code is in finally block WILL be ALWAYS called, after try catch block regardless of Expected or Unexpected Exception
    }
}


// ****Famous interview Q: What will happen if you have different exception than what is expected like above try block of code?
//IQ**** Or say where we write NullPointerException or some other Exception instead of ArithmeticException even though in the code we are dividing by zero?
//It will run and exception will be thrown but nobody is there to catch it (because there is no CORRECT catch block).
// The core control will NOT come inside the catch block because we are expecting arithmetic exception but it is giving NullPointer.
//So right away it will JUMP inside the finally block and then it will be executed so finally block will ALWAYS be CALLED, it will always be executed.
// (Side info: Then in the console we'll get: whatever code inside the print line statements of finally block.)


