package JavaBasics;                  //Take screen shot Exception handling time 45:08

public class ThrowKeywordExceptionHandling {  //**IQ: What is the difference between throws & throw?

    public static void main(String[] args) {

        //Throw keyword is used when you have to throw exception "deliberately" cuz that exception is NOT in Java. So I want to customize it
        //ThrowS exceptionS ARE found in Java


        try {
            throw new Exception("Jewell's SpecialCustomizedException");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("ABC");  //If ABC is printed that means try/catch block did its job and caught it so program ran PLS!


        //  Throw key word MUST be surrounded around by try & catch block
        // as soon as you write line 10, you'll get error and option to fix with try/catch block or throws




        System.out.println("*****************");     //Put below code to sleep and run above, to run below code put above code to slee

        //throw new Exception("Jewell Exception");

//        System.out.println("PQR");
//
//        String Exec_Flag = "N";  //Data should come from excel sheet
//        if(Exec_Flag.equals("N")){  //Execution value can be N or blank
//            try {
//                throw new Exception("Exec flag is Blank (or NO) Exception");
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.println("TEST will be printed because program will run cuz of try & catch block.");


        //Will also handle Abnormal Termination of program if handled by try & catch block, so you'll get exception messages but it will
        // also run & print out as TEST wil be printed.. in console because it is handled
        //If you don't use try/catch and use throw (will show in main) then you'll get Error Messages and TEST will NOT be printed below
    }
}
