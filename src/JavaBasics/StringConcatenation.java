package JavaBasics;


public class StringConcatenation {

    public static void main (String[] args){   //+ is concatenation operator, so STRING CONCATENATION

        int a = 100;    //Println -- is used to print on the console with a new line so it will end after this
        int b = 200;    //Print -- is used JUST to print on the console

        String x = "Hello";
        String y = "World";

        double c = 12.33;
        double d = 10.33;

        System.out.println(a + b); //Here we add

        System.out.println(x + y);  //Text are put side by side | If we don't put println then it will print numbers and text side by side and not start on the next line   = HelloWorld

        System.out.println(a + b + x + y); //Since Numbers FIRST, it gets added then text can only be printed side by side  = 300HelloWorld

        System.out.println(x+y+a+b);  //When String first, so x+y+a BECOME new string then add to b that too become a new string.  The answer is HelloWorld100200 left to right, here we don't add, just print side by side

        System.out.println(x+y+(a+b)); //Here it's string first then we add what is inside the parenthesis (a+b)) like we DO in math

        System.out.println(a+b+x+y+a+x+b+y);

        System.out.println(a+b+x+y+a+b); //We always do the calculation first, since a+b in the main parenthesis that gets added once, the a+b at the end is not calculated exclusively since it was done at the beginning. To add again at the end, we need to do it (a+b));

        System.out.println(a+b+x+y+(+a+b));

        System.out.println(c+d);

        System.out.println(x+y+c+d);

        System.out.println("HelloWorld");

        System.out.println(a);

        System.out.println("The value of a is: " + a);

        System.out.println("the value b is: " + b);

        System.out.println("the addition of a & b is: " + (+a+b));

        System.out.print("Hellooooooo Seleniummmm.... ");//Here not using ln after print (ln = line new) so it will print it and continue the subsequent 2 lines below

        System.out.print("I am beginning to love automation so  I say: "); //and ends when it prints Hello Testing because the last line has println

        System.out.print("Hellooooooo Automation Testingggggggggg");

    }
}
