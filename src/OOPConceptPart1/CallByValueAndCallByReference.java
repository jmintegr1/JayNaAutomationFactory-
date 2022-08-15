package OOPConceptPart1;

public class CallByValueAndCallByReference {  //Call by reference is possible in Java. So how to achieve call by reference or call by value in Java?

    int p;  //Global or class variable are right below class name as declared here
    int q;

    public static void main(String[] args) {

        CallByValueAndCallByReference obj = new CallByValueAndCallByReference();
        int x = 10;
        int y = 20;

        //obj.testSum(x,y);  //Call by value or pass by value, so the COPY of x & y will be called and value of it will be given to a & b
        //obj.testSum(10,20); //as below)

        System.out.println(x+y);

        obj.p = 50;  //Class variable above, their values assigned here by INITIALIZED 1st with above Object reference "obj"
        obj.q = 60;

        obj.swap(obj); //after swap() method/function line 36 then we pass obj reference variable as it's instantiated, now p = 60 & q = 50 as printed in console
        System.out.println(obj.p);
        System.out.println(obj.q);
    }


    //Call by value or Pass by value the COPY of A & B will be called and value of it will be given to a & b, & it will NOT affect the value of x & y above
    public int testSum(int a, int b){
        a = 30;
        b = 40;
        int c = a+b;
        return c;
    }

    //Obj reference now passing to SWAP method below //T LINE 36, is only the class reference, it cannot take any value
    public void swap(CallByValueAndCallByReference t) { //We make SWAP function/method & pass the reference variable of the CLASS and now T is the reference variable
        int temp; //temp is not a keyword, it is just a NAME for a local variable. You can call it temp, blub or better: entry or value (to have a meaningful name for this variable)
        temp = t.p;   //temp = 50
        t.p = t.q;   //t.p = 60 after SWAPED it takes the value of q
        t.q = temp; //After SWAPED the function/method as temp is = 50 and it is assigned to t.q so now Q = 50 & P = 6
                   //So the letter value on the RIGHT side (standard) of = EQUAL SIGN is assigned to the value on the left side of it (Rise to standard)

//        ***IQ: Is it possible to call by Reference in Java?
//        Ans: Yes, by using object references, basically we pass the Object Reference.

//
//        *IQ: What is the difference between call by VALUE and call by REFERENCE?
//
//        Ans: Call By Value: This is a parameter passing method, values of actual parameters are copied to function’s formal parameters and the two types of parameters
//        are stored in different memory locations. So any changes made inside functions are not reflected in actual parameters of caller.
//
//        Call by Reference: Both the actual and formal parameters refer to same locations, so any changes made inside the function are actually reflected in
//        actual parameters of caller.

    }

}
