package JavaBasics;

public class IncrementAndDecerementOperator {

    public static void main(String[] args) {

        //++
        //--

        int i = 1;
        int j = i++;  //Post increment -- Give the value of I to J as is, since it is 1 so j does not go up. Then increment by it increases the value of i by 1 so now i = 2

        System.out.println(i);
        System.out.println(j);     //So when the letter is first followed by i++ is Post increment. When the letter is behind ++i then it's pre increment

        System.out.println("*****************");

        int a = 1;     ////Pre increment: Increase the value of A by 1 first, the result..
        int b = ++a;  //..then give it to b = (Increasing by 1 first then give it to b)

        System.out.println(a);
        System.out.println(b);

        System.out.println("*****************");


        int m = 2;      //Give the value of M to N as is
        int n = m--;  //then decrease it by 1.. Post decrement, when the decrement is after the letter it's Post decrement
        System.out.println(m);
        System.out.println(n);

        System.out.println("*****************");


        int p = 2; //Pre decrement p by 1 =  1. Since we first decrease the value of P by 1 from 2..
        int q = --p;  //..then give to to Q
        System.out.println(p);
        System.out.println(q); //1 = After first action in P, now Q is also 1

    }
}
