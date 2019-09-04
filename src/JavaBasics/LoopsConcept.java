package JavaBasics;

public class LoopsConcept {

    public static void main(String[] args) {

        //1. While loop:
        //What is the Disadvantage of while loop? Ans: it will generate infinite amount of loop if we don't set incremental/decremental limit
        //Print 1 to 10 using While loop

        int i = 1; //Initialization     |    Can you print 1 to 10?
        while (i <= 10) {  //Conditional is TRUE so run the loop again by increment/decrement until condition is false (so it will WHILE condition it's true)
            System.out.println(i);
            i = i + 1; //Incremental or Decremental
        }


        System.out.println("****************");


        int o = 1;
        while (o <=7){
            System.out.println(o);
            o++;
        }


        System.out.println("****************");

        //Can you print 1 - 13?

        int v = 1; //Since we are going from 1 and higher, initialize with starting point of 1 & go up
        while (v <= 13) { //NO ; after while conditional   | In condition we want go from 1 to 13, so just replace to w/ <= .. Logic is simple: 1 is less than 13, and we want to go up to 13 so that means eqaul so <=
            System.out.println(v);
            v++;
        }



        System.out.println("*****************");

        //j++ or  j = j+1  ...  Either one works

        //Can you print 1 to 10 using for loop?

        //2. for loop:

        for (int j = 1; j <= 10; j++) { //Initialization, conditional, & incremental part
            System.out.println(j);

        }

        System.out.println("*****************");

        //Print from 1 to 7
        for (int z = 1; z <= 7; z = z + 1) {
            System.out.println(z);
        }


        System.out.println("*******************");


        //print 10 to 1 using for loop  (Now going down so think opposite logic from above with same syntax

        // k-- means k = k-1
        //Can you print from 8 to 1? = 8 7 6 5 4 3 2 1

        for (int k = 10; k >= 1; k--) {  //Decrement
            System.out.println(k);
        }

        System.out.println("*******************");


        //Print  8 to 1 using for loop
        for (int h = 8; h >= 1; h--) {
            System.out.println(h);
        }


        System.out.println("*******************");

        //-1>-10 True
        //1>10 False


        //print 9 to 1
        // k-- means k = k-1
        //10 9 8 7 6 5 4 3 2 1
        for (int l = 9; l >= -9; l--) {   //Initialization, conditional, and is decremental
            System.out.println(l);

        }
    }
}

