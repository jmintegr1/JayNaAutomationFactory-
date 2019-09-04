package JavaBasics;

public class ExceptionHandling {

    int a = 10;     //static ExceptionHandling obj; //Also gives: NullPointerException  / If making it static then we can cut the tie of  obj1 from the object and still run it

    public static void main(String[] args) {


        //int i = 9 / 0;  //Uncaught exception: because it is not showing the error until we execute it (this line refers to maybe line 35)

        //System.out.println(i);

              //Caught exception: It will show the error immediately, right after you write the code
        //Thread.sleep(2000);     //(Thread is a class & sleep is a method)


        ExceptionHandling obj = null; //Just creating a reference of null, NOT creating an object
        ExceptionHandling obj1 = new ExceptionHandling(); //Now created an object, both (maybe together) gives the same print out in console = null
        //obj1 = null; //This line of code severs the reference of object obj1, SO you'll get: **NullPointerException** in console as garbage collector goes to work
        System.out.println(obj);
        System.out.println(obj1);  //  will give just null

        System.out.println(obj1.a); //Just obj1 in parenthesis will give = null, but calling value a as obj1.a (int a = 10 from line 5) will give = NullPointerException   | Unless we make it: static int = 10;
                                   //2 Reasons why you get NPE = 1. You did not declared variable properly or 2. Your Object reference got Null @ line 20


        System.out.println("********* To run codes below, comment out all codes above *********");


        //So how do we handle this kind of exception?    Ans: we use 3 different types of exception handling:

        // 1. Try - catch block
        try{
            int i = 9/0; //We know this code will throw the exception so we put inside try/catch block
        }
         catch(ArithmeticException e) {  //Exception reference e (SUPER SUPER CLASS of all Exceptions)
             //catch(Object e) //is the super super class of Throwable e
            //catch(Throwable e) { //This is a super class directly catch both error and exception || ****IQ: What is the SUPER CLASS of Error & Exceptions? Ans: Throwable (is the class) e
           //catch(Error e){ //if expecting error
          //catch(Exception e) { //Just Exception will cover ALL DIFFERENT TYPES of exceptionS when you are not sure, cuz it's the parent CLASS of all different types of exception
            e.printStackTrace(); //PrintStackTrace will show the NAME of the Exception, what LINE OF CODE exactly is causing the issue (although it will handle it and the program will run)
              System.out.println(e.getMessage()); //Running the program and after getting what we want printed, but also to get error MESSAGE even though it is handled by try/catch block
//            //getMessage method shows JUST the REASON: // divided by zero in console
            System.out.println("Hey this error cuz of # / by zero or whatever I want to type in catch block PLS"); //Without printStackTrace you'll just get this message after the exception handled and program ran
        }
        //try & catch block is ALSO used to report exception, pin pointing where is the exception, the reason behind it & what line of code to focus on

        System.out.println("ABC");  //Because we are "handling" the exception, it will NOT terminate the program, that's why
        System.out.println("ABC");  //we can the print out ABC 1x, 5x below or more because it is handled, even though there is ArithmeticException is thrown cuz of code line 35.
        System.out.println("ABC");
        System.out.println("ABC");
        System.out.println("ABC");

    }
}
