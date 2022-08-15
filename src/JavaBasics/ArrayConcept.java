package JavaBasics;


public class ArrayConcept {

    public static void main (String[] args){


        //Array: To store SIMILAR data type values in an array variable


        //1. int array:
        //Lowest bound/index = 0
        //Upper bound/index = n-1 (n is the size of array)
        //THESE ARE ALL ONE DIMENSIONAL ARRAY

        //1st Dis-advantages of Array: Size is fixed -- Static array -- To overcome this  issue, we use Collections -- ArrayList, HashTable, basically we use Dynamic Array
        //2nd disadvantages of Array: stores only SIMILAR data type -- To overcome this problem, we use Object Array.

        //Advantages of Array: I can store Multiple values in a single variable with SIMILAR data type


        int k [] =  new int [4];

        k[0] = 10;
        k[1] = 20;
        k[2] = 30;
        k[3] = 40;

        //k[4] = 50; //You can't input more if above array size is limited to 4 only, even though we won't get an error but when printed, we get: ArrayIndexOutofBoundException

        System.out.println(k[2]);
        System.out.println(k[3]);

        //System.out.println(k[4]);  //Array 4 will not work and get the message below
       // *IQ: What happens when the array size/location does not exist and you try to run it? Ans: we get: ArrayIndexOutOfBoundsException

        System.out.println(k.length); //This will give you the total "size" of array (We use .legnth to get size in Array. | In ArrayList, Hash table and HashMap I think IT IS .size()

        System.out.println("***************");

        //**IQ: How to print all the values of an array? Ans: We use for loop

        for(int j=0; j<k.length; j++){
            System.out.println(k[j]);  //When printing all values of Array, we use for loop
        }

        System.out.println("***************");

        for(int q=0; q<k.length; q++){
            System.out.println(k[q]);//Array object instance variable goes inside the print line statement parameter and pass in the index of..
        }

        System.out.println("***************");

        for(int z=0; z<k.length; z++){   //Here NO need to do z<k, but why not?
            System.out.println(k[z]);
        }

        System.out.println("***************");

        //2. How to run double array?
        double m[] = new double[4];  //Use keyword double
        m[0] = 12.33;
        m[1] = 13.44;
        m[2] = 45.55;
        m[3] = 67.89;

        double w[] = new double[4];
        double a[] = new double[1];


        System.out.println(m[3]);

        System.out.println(m[03]);

        System.out.println("***************");


           //3. How to declare character array?

        char c[] = new char[3]; //Just use char when instantiating the array then []
        c[0] = 'q';
        c[1] = 2;
        c[2] = '$';

        System.out.println(c[2]); //In print line statement and pass in the letter that represent the arrays on the outside and inside the array type the number I want to print


        char p[] = new char[4];

        System.out.println(p[3]);


        double v[] = new double[7];

        System.out.println(v[04]);


        //4. How to declare boolean array?

        boolean b[] = new boolean[2];
        b[0] = true;
        b[1] = false;

        System.out.println(b[01]);


        //5. How to declare String Array?

        String s[] = new String[4];   //String is always Capitalized
        s[0] = "test";
        s[1] = "Hello";
        s[2] = "World";
        s[03] = "Pure faith";

        System.out.println(s[03]);


        System.out.println(s.length);  // .length() is for static array
        System.out.println(s[1]);
        System.out.println(s[2]);
        System.out.println(s[3]);


        // 6. Object Array: (Object is a Super Class) -- Is used to store DIFFERENT Data Types values, to compensate for regular Array's
        // limitation

        Object z[] = new Object[2];

        z[0] = "Jay";
        z[01] = "Mehedi";
        //ab[2] = "Mohammed"; //Can't input more than 2 and instance variable has to be the same or get same AIOOBDE

        System.out.println(z[0]);
        System.out.println(z[1]);

        Object ob[] = new Object[6];   //Capitalize keyword Object

        ob[0] = "Tom";
        ob[1]= 25;
        ob[2]= 12.33;
        ob[3] = "1/1/1990";
        ob[4] = 'M';
        ob[5] = "London";

        System.out.println(ob[0]);
        System.out.println(ob[5]);



        System.out.println(ob.length); //In array we use .length() to get total tally   | In Collections we use .size() to get total tally

        Object cd[] = new Object[9];
        cd[0] = "Sun";
        cd[1] = "Lotion";

        System.out.println(cd[0]);

    }
}
