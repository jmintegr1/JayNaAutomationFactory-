package testCasesFor3Fs;

public class FinalConcept {
    public static void main(String[] args) {

        //Final is a "KEYWORD" before the variable to lock in any changes

        final int i = 10;    //Once we type final KEYWORD front of int variable, it changes to CONSTANT VALUES.  Now the subsequent values cannot automatically be updated like below cuz with final Key Word making it CONSTANT
        //i = 20;           //final with small cap, ALSO used to prevent Inheritance & prevent Method Overriding
        //i = 30;
        System.out.println(i);  //Without final keyword, i below automatically updates int i to = 30, With final now these variables will give error
    }
}
