package JavaBasics;                  //Take screen shot Exception handling time 45:08

public class ThrowKeywordExceptionHandling {  //**IQ: What is the difference between throws & throw?

    public static void main(String[] args) {  //Throw keyword is used when you have to throw exception "deliberately" cuz exception is NOT in Java and I want to customize it
                                             //Throws exceptions ARE found in Java

//        try {
//            throw new Exception("Jewell's SpecialCustomizedException"); //Throw key word MUST be surrounded around by try & catch block, as soon as you write line 10, you'll get error and option to fix with try/catch block or throws
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("ABC");




        System.out.println("*****************");     //Put line 7-13 to sleep and run this, to run above put the codes below to sleep

        //throw new Exception("Jewell Exception");

        System.out.println("PQR");

        String Exec_Flag = "N";  //Data should come from excel sheet
        if(Exec_Flag.equals("N")){  //Execution value can be N or blank
            try {
                throw new Exception("Exec flag is Blank (or NO) Exception");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("TEST will be printed because program will run cuz of try & catch block.");
        //Will also handle abnormal termination of program if handled by try & catch block, so you'll get exception messages but will also run & print out TEST wil be printed.. in console because it is handled
        //If you don't use try/catch and use throw (will show in main) then you'll get error messages and TEST will NOT be printed below
    }
}
