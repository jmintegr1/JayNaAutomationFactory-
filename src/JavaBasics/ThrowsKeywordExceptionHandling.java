package JavaBasics;
                     //THROWS KEYWORD is when we have methods chaining
public class ThrowsKeywordExceptionHandling{
                                                                          //If we comment out ArithmeticException and use try catch block in line 13 - 15
    public static void main(String[] args) throws ArithmeticException{   //Main method will catch from sum method because Main is also calling sum method
                                                                        //Then Main method is also throwing it away. So who will catch it? Ans: Now JVM will catch & handle it
        ThrowsKeywordExceptionHandling obj = new ThrowsKeywordExceptionHandling();   //Now if you run it, it will show all exceptions in console with EXCEPTION HIERARCHY
        obj.sum(); //Because main method is calling sum method so it can catch what sum method throws..
        System.out.println("ABC"); //You can have 1,000 line of codes but it won't run it nor print cuz throws keyword will terminate the program so in order to
    }                              //to run the program, we use try & catch block

    //public void sum() throws ArithmeticException{

      public void sum(){   //Comment out 12 and with just sum method w/ try catch block
        try {  //Now if we uncomment out try & catch block it will not be keep throwing till JVM & will get a print of the above statement from line 9 "ABC"
            division();   //Sum method will catch Exception from line 23 of division method because it is internally calling it here, then it will throw it to Main method
        } catch (ArithmeticException e) {

        }
    }


    public void division() throws ArithmeticException{  //Throws prevents from writing try catch block again & again if you have multiple exceptions say with 1,000 line of codes.
        int i = 9/0;    //This exception line from division method will be the 1st to be thrown to sum method above because sum method internally calling division method

    }
}
