package JavaBasics;

public class TwoDimensionalArray {

    public static void main(String[] args) {

        String x[][] = new String[3][5];

        System.out.println(x.length); //3  -- total # of rows (or size) = 3
        System.out.println(x[0].length);  //5 --total # of columns = 5
        System.out.println(x[2].length); //Columns will be the same from 0 and 2


        System.out.println("**************");


        //1st box represent # rows | 2nd square brackets represents columns
        //1st row = 0
        x[0][0] = "A";   //Storing values of 1st row
        x[0][1] = "B";
        x[0][2] = "C";
        x[0][3] = "D";
        x[0][4] = "E";


        //2nd Row = 1
        x[1][0] = "A1";   //Storing values of 2nd row
        x[1][1] = "B1";
        x[1][2] = "C1";
        x[1][3] = "D1";
        x[1][4] = "E1";

        //3rd Row =2
        x[2][0] = "A2";   //Storing values of 3rd row
        x[2][1] = "B2";
        x[2][2] = "C2";
        x[2][3] = "D2";
        x[2][4] = "E2";


        System.out.println(x[1][2]);
        System.out.println(x[2][2]);
        System.out.println(x[0][3]);

        System.out.println(x[0][4]);
        //row =0, col = 0 to 4
        //row =1, col = 0 to 4
        //row = 2, col = 0 to 4  out of both loops now


        System.out.println("**************");

        //***IQ: How to print ALL the values of 2 dimensional array?
        // Ans: We use TWO for loops, inner loop and outer loop. One loop is for Row and the 2nd loop is for the Column!


        for(int row=0;row<x.length;row++){  //"Outer for loop" for Row
            for(int col=0;col<x[0].length;col++){ //Inner "for loop" for column & here put zero. then call length, internal loop will execute 1ST
                System.out.println(x[row][col]); //Then print together in the order of row 1st then col]
            }
        }
    }
}

