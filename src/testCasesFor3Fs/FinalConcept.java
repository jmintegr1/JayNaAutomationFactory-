package testCasesFor3Fs;

//Final is a "Keyword" right after public
public class FinalConcept {
    public static void main(String[] args) {

        final int i = 10;    //Once we type final front of int it is CONSTANT VALUES,  now the subsequent values cannot be automatically modifed here like below when with final Key Word
        //i = 20;           //final with small cap is ALSO used to prevent Inheritance
        //i = 30;
        System.out.println(i);  //Without final key word, i below automatically changes to 1 = 30;
    }
}
