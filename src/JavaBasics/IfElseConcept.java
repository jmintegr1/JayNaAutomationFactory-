package JavaBasics;

public class IfElseConcept {

    public static void main(String[] args) {

        int a = 30;
        int b = 20;

        if (b > a) {   //True statement
            System.out.println("b is greater than a");
        } else {
            System.out.println("a is greater than b");   //If above is false then program will kick it down to Else Statement
        }

        //Comparison operators:
        //< > <= >= == != (Exclamation Equal is NOT EQUAL TO)


        int c = 40;
        int d = 50;

        if (c == d) {  // = just equal to is assignment operator, == is comparision operator
            System.out.println("c and d are equal");
        } else {
            System.out.println("c and d are not equal");
        }


        //write a logic to find out the highest number
        int a1 = 400;
        int b1 = 500;
        int c1 = 300;


        //nested if-else

        if (a1 > b1 & a1 > c1){  //True & True = True,  False & False = False, False & True = False   |    & = And Operator
            System.out.println("a1 is the truithest compare to the other two");
        }
        else if(b1>c1){
            System.out.println("b1 is the truithest compare to c1");
        }
        else {
            System.out.println("c1 is the truithest compare to other two");
        }

    }    //Write a logic to find out the highest number of 3 variables
}
