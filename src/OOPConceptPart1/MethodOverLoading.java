package OOPConceptPart1;

public class MethodOverLoading {

    public static void main(String[] args) {

        MethodOverLoading obj = new MethodOverLoading();

        obj.sum();
        obj.sum(10);
        obj.sum(10, 5);
    }

    public static void main(int p){ //We can overload MAIN Method name as long as there are different input parameters

    }

    public static void main(int p, int h) { //We can over load MAIN w/ 2 input parameters, one identical one different

    }

    public void sum(){ //Zero parameter in 1 sum method is allowed
        System.out.println("SUM method--zero parameter");

       /* public void test(){           //And we cannot create method inside a method
        }*/

    }public void sum(double d){ //Although only 1 input parameter but using different parameter than int i, we are using "double d", so this is allowed
        System.out.println("SUM method--zero parameter");

    }

    public void sum(int i ){ //Zero parameter in 2 sum method is not allowed so we put one input parameter with int i.
        System.out.println("Sum method -- 1 input parameter");
        System.out.println(i);
    }

    public void sum(int k, int m) { //2 input paramaters
        System.out.println("sum method --- 2 input parameters");
        System.out.println(k + m);
    }
}
//Method overloading --> When method name is SAME but with different "arguments or input" parameters within the SAME CLASS.
//And we CANNOT create method inside a method
//Duplicate methods are not allowed -- same method name with same number of arguments are not allowed,  methods are independent of each other
//We can overload MAIN METHOD as well

