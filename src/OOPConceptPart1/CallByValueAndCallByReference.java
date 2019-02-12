package OOPConceptPart1;

public class CallByValueAndCallByReference {

    int p;  //Global or class variable which are right below class name
    int q;

    public static void main(String[] args) {

        CallByValueAndCallByReference obj = new CallByValueAndCallByReference();
        int x = 10;
        int y = 20;
        obj.testSum(x,y);  //Call by value or pass by value, so the copy of x & y will be called and value of it will be given to a & b)

        System.out.println(x+y);

        obj.p = 50;
        obj.q = 60;

        obj.swap(obj);
        //after swap
        System.out.println(obj.p);
        System.out.println(obj.q);
    }

    public int testSum(int a, int b){
        a = 30;
        b = 40;
        int c = a+b;
        return c;
    }

    //Call by reference (we are passing by value of object reference)
    public void swap(CallByValueAndCallByReference t) {
        int temp;                  //IQ: Is it possible to call by reference in Java? Ans: Yes, by using object reference, we have to pass the object references.
        temp = t.p;   //temp = 50   //IQ: What is the difference between call by value and call by reference?
        t.p = t.q;   //t.p = 60
        t.p = temp; //t.q = 50

    }

}
