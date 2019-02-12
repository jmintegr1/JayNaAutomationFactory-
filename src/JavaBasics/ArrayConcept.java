package JavaBasics;


public class ArrayConcept {

    public static void main (String[] args){


        //Array: to store similar data type values in an array variable


        //1. int array:
        //Lowest bound/index = 0
        //Upper bound/index = n-1 (n is the size of array)
        //THESE ARE ALL ONE DIMENSIONAL ARRAY

        //1st Dis-advantages of Array: Size is fixed -- Static array -- To overcome this  issue, we use Collections -- ArrayList, HashTable -- we use Dynamic Array
        // 2nd disadvantages of Array: stores only similar data type -- To overcome this problem, we use Object Array.



        //Advantages of Array: I can store multiple values in a single variable with similar data type


        int i [] =  new int [4];
        i[0] = 10;
        i[1] = 20;
        i[2] = 30;
        i[3] = 40;

        System.out.println(i[2]);
        System.out.println(i[3]);

        //System.out.println(i[4]);  //Array 4 will not work and get the message below
       // *IQ: What happens where the array size/location does not exist and you try to run it? Ans: we get: ArrayIndexOutOfBoundsException

        System.out.println(i.length); //This will give you the total "size" of array

        //**IQ: How to print all the values of array? Ans: We use for loop

        for(int j=0; j<i.length; j++){
            System.out.println(i[j]);  //When printing all values of Array, we use for loop

        }

        //2. How to run double array?
        double m[] = new double[4];
        m[0] = 12.33;
        m[1] = 13.44;
        m[2] = 45.55;
        m[3] = 67.89;

        System.out.println(m[3]);


           //3. How to declare character array?

        char c[] = new char[3];
        c[0] = 'q';
        c[1] = 2;
        c[2] = '$';
        System.out.println(c[2]);


        //4. How to declare boolean array?

        boolean b[] = new boolean[2];
        b[0] = true;
        b[1] = false;

        System.out.println(b[1]);


        //5. How to declare String Array?

        String s[] = new String[3];
        s[0] = "test";
        s[1] = "Hello";
        s[2] = "World";

        System.out.println(s[1]);


        System.out.println(s.length);
        System.out.println(s[1]);
        System.out.println(s[2]);


        // 6. Object Array: (Object is a Super Class) -- is used to store different data types values, to compensate for regular Array's limitation

        Object ob[] = new Object[6];
        ob[0] = "Tom";
        ob[1]= 25;
        ob[2]= 12.33;
        ob[3] = "1/1/1990";
        ob[4] = 'M';
        ob[5] = "London";

        System.out.println(ob[5]);
        System.out.println(ob.length);

    }
}
