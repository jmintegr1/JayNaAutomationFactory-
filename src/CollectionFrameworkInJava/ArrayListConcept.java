package CollectionFrameworkInJava;


import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
    public static <E> void main(String[] args) {

        //Dynamic array -- ArrayList
        //1. can contain duplicated values/elements
        //2. Maintains insertion order
        //3. Not Synchronized, not thread safe, that's why it's slow
        //4. Allows random access to fetch any element because it stores the values on the basis of indexes

        int a[] = new int[3]; //Static array -- size is fixed, so can't go beyond that size

        ArrayList ar = new ArrayList<>();  //Now in Java memory an object is created.. represented with ar which can hold multiple array, we can go beyond the size

        ar.add(10);//0
        ar.add(20);//1
        ar.add(30);//2

        System.out.println(ar.size());

        ar.add(40);//3      //So on the next day we added 2 more, no problem
        ar.add(50);//4

        ar.add(50);//5     //We haven't defined the generic, this is why it's called NOT GENERIC ArrayLsit object, cuz we
        ar.add(12.33); //6     //haven't defined anything here so we can use primmitive & non-primitive data type
        ar.add("Test"); //7
        ar.add('a');//8
        ar.add(true);//9
        ar.add(600);//10


        System.out.println(ar.size());  //Now updated array size shows it grows in dynamic array

        ar.remove(10);

        System.out.println(ar.get(5)); //If you want to get value from particular index then use get method with ar.get( ));

        //System.out.println(ar.get(11)); //Will give exception: IndexOutOfBoundsException

        //To print all the values from ArrayList:
        //1. Use for loop
        //2. Using iterator

        for(int i=0; i<ar.size(); i++){
            System.out.println(ar.get(i));
        }

        //Non generic vs. generic:


        ArrayList<Integer> ar1 = new ArrayList<Integer>();  //<Integer> makes it generic in java  (meaning only ONE type, here only Integer)
        ar1.add(100);
        //ar1.add("Test"); //This will give error cuz after making it generic for Integer only in/wrapper class, it can only take integer so String will not do

        ArrayList<String> ar2 = new ArrayList<String >(); //Now it is defined generic for String only
        ar2.add("Jewell");
        ar2.add("Selenium");
        //ar2.add(100); //This is not allowed because now the wrapper class is set for String only

        ArrayList<E> ar3 = new ArrayList<E>(); //Not sure what kind of data type (to keep it open so we use <E> to leave it flexible,
        //We can also define class object  | To keep if flexible you have to put <E> above, front of Main line 8: public static <E> void main(String[] args){

        //Employee class Objects:
        Employee e1 = new Employee("Jewell", 43, "QA");
        Employee e2 = new Employee("Naveen", 29, "QA");
        Employee e3 = new Employee("Peter", 25, "QA");

        //IQ: How to create ArrayList?
        ArrayList<Employee> ar4 = new ArrayList<Employee>();
        ar4.add(e1);
        ar4.add(e2);
        ar4.add(e3);


        //Iterator to traverse the values:
        Iterator<Employee> it = ar4.iterator();
        while(it.hasNext()){
            Employee emp = it.next();
            System.out.println(emp.name);
            System.out.println(emp.age);
            System.out.println(emp.dept);
            //***IQ: How to store the specific user defined class object in this particular ArrayList?

        }


        System.out.println("**************");

        ArrayList<String> ar5 = new ArrayList<String>();
        ar5.add("test");
        ar5.add("Selenium");
        ar5.add("QTP");

        ArrayList<String> ar6 = new ArrayList<String>();
        ar6.add("dev");
        ar6.add("Java");
        ar6.add("JavaScript");

        ar5.addAll(ar6);   //addAll method will merge the two ar5 and ar6 will be added inside ar5, so they will be merged

        for(int i=0; i<ar5.size(); i++){
            System.out.println(ar5.get(i));   //before ar5 only had 3 values but after merge via for loop it will have 6 values
        }


        System.out.println("**************");

        //removeAll:   Here we are removing all ar6 values from ar5
        ar5.removeAll(ar6);
        for(int i=0; i<ar5.size(); i++){
            System.out.println(ar5.get(i));
        }


        System.out.println("**************");


        //retainAll()

        ArrayList<String> ar7 = new ArrayList<String>();
        ar7.add("test");
        ar7.add("Selenium");
        ar7.add("QTP");

        ArrayList<String> ar8 = new ArrayList<String>();
        ar8.add("test");
        ar8.add("Java");

        ar7.retainAll(ar8);   //IQ: What will be printed in retainAll method? Ans: the common between the two objects, so it's test
        for(int i=0; i<ar7.size(); i++){
            System.out.println(ar7.get(i));
        }

    }
}
