package JavaBasics;

public class IfElseConcept {

    public static void main(String[] args) {

        int a = 30;
        int b = 40;

        if (b > a) {
            System.out.println("b is greater than a");
        } else {
            System.out.println("a is greater than b");   //If above is false then program will kick it down to Else Statement
        }


        //:Comparison operators
        //< >  <=   >=  ==(Also Comparison operators) != (Exclamation Equal means: NOT EQUAL TO)

        System.out.println("*******************");

        int c = 40;
        int d = 50;

        if (c == d) {  // = just 1 equal is an Assignment operator, ==  2 equals is Comparision Operator
            System.out.println("c and d are equal");
        } else {
            System.out.println("c and d are not equal");
        }


        System.out.println("*******************");



        //Write a logic to find out the highest number?


        int d1 = 600;
        int e1 = 500;
        int f1 = 400;


        //Nested if-else (Means = if, else, else)

        //Write a logic to find the lowest number from three variables? / Or the most accurate true/false logic?



        if (d1 > e1 & d1 > f1){  //True & True = True,  False & False = False, False & True = False   |   & = And Operator
            System.out.println("d1 is the greatest compare to the other two");
        }
        else if(e1<f1){
            System.out.println("e1 is the greatest compare to c1");
        }
        else {
            System.out.println("c1 is the greatest compare to other two");
        }


        System.out.println("*******************");


        int a1 = 400;
        int b1 = 500;
        int c1 = 300;


        //Nested if-else (Means = if, else, else)

        //Write a logic to find the lowest number from three variables? / Or the most accurate true/false logic?



        if (a1 > b1 & a1 > c1){  //True & True = True,  False & False = False, False & True = False   |   & = And Operator
            System.out.println("a1 is the truithest compare to the other two");
        }
        else if(b1<a1){
            System.out.println("b1 is the truithest compare to c1");
        }
        else {
            System.out.println("c1 is the truithest compare to other two");
        }


        System.out.println("*******************");


        //Write a logic to find out the highest number of 3 variables


    }
}
