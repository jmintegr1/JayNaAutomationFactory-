package JavaBasics;

public class LoopsConcept {

    public static void main(String[] args) {

        //1. While loop:
        //Disadvantage of while loop: it will generate infinite amount of loop if you don't give incremental/decremental limit
        //Print 1 to 10

        /*int i = 1; //Initialization
        while (i <= 10) {  //Conditional -is TRUE so run the loop again by increment/decrement until condition is false
            System.out.println(i);
            i = i + 1; //Incremental or Decremental
        }



      System.out.println("*******************");

        //j++ or  j = j+1  ...  Either one works

        //2. for loop:

        for (int j = 1; j <= 10; j++) { //Initialization, conditional, finally incremental part
            System.out.println(j);

        }*/



  /*      System.out.println("*******************");


        //print 10 to 1
        // k-- means k = k-1
        //10 9 8 7 6 5 4 3 2 1
        for (int k = 10; k >= 1; k--) {
            System.out.println(k);
        }
*/

        System.out.println("*******************");

        //-1>-10 True
        //1>10 False


        //print 10 to 1
        // k-- means k = k-1
        //10 9 8 7 6 5 4 3 2 1
        for (int k = 10; k >= -10; k--) {   //Initialization, conditional, finally it is decremental
            System.out.println(k);

        }
    }
}

