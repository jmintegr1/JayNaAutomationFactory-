package CollectionFrameworkInJava;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

    public static void main(String[] args) {

        //HashMap is a class that implements Map Interface
        //Extends AbstractMap (Inherit AbstractMap) from parent
        //IQ: It contains Only UNIQUE elements
        //Stores the values - key - value pair
        //it may have ONE null KEY and Multiple null Values it can store
        //It maintains NO order (No storing on the basis or index or anything..)
        //Fail - Fast Condition or concurrent modification exception because of below......

        /*HashMap is NON-Synchronised - means if it is used in multi threading environment or multi threading concept, if you are using more than one thread then other

        threads can access and process the HashMap simultaneously. It means there are multiple threads that are running on. Then HashMpa object can be accessed by all the

        thread so the performance of the HashMap will be increased automatically. Because whenever we have to use FAST PERFORMANCE SYSTEM in that case, we

        have to use HashMap.

        We don't use HashTable because "HashTable" IS "Synchronized" With thread safe, it means in HasTable ONE thread at a time that can access HashTable

        object. However, HashMap can be accessible by multiple threads at the same time. It means HashMap is NON-Synchronized, it is NOT thread safe. It means multiple threads

        can attack in a multi-threading environment, if we want to use multiple threads that are available then we want to use multiple users script, if we are

        creating and we want to use this particular HashMap object, they we can access it.


        However there is a PROBLEM with HashMap and this is very very important for Interview: Naveen explains Part 5 time 19:48, he explains concurrent modification exception --

        Fail - Fast Condition: whenever we iterate the HashMap is called Fail Fast Condition, it means concurrent modification exception will occur.

        ***IQ: What do mean by concurrent modification exception? Ans: It means simultaneously if any thread modifies the Map structure

        by adding or removing the element from particular HashMap object, it is called Fail - Fast Condition or concurrent modification exception.

        */

        //KEY, Value
        HashMap<Integer, String> hm = new HashMap<Integer, String>();  //Import HashMap from Java Util package

        hm.put(1, "Selenium");
        hm.put(2, "QTP");
        hm.put(3, "TestComplete");
        //hm.put(4, "RFT");  //If we comment out RFT and print we'll get Null only..


        System.out.println(hm.get(1));  //If we want to fetch the values we use: Entry set & Entry Concept
        System.out.println(hm.get(2));
        System.out.println(hm.get(3));
        System.out.println(hm.get(4));   //4 will give you NULL if commented out above, will NOT give: NPException because HashMap does not store values on the basis of indexes


        //How to iterate HashMap?
        //use Map.Entry interface  | hm.entrySet will store the complete values from this HashMap, iterate 1 by 1..
        for (Map.Entry m : hm.entrySet()) {  //If we want to print all the values of HashMap we use for loop
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println(hm); //Here it gives you all the KEYS from above, before remove method

        hm.remove(2);   //After Remove method
        System.out.println(hm); //Print will show TestComplete gone but the numbers organizing structure remains the same, it will NOT self reorganize its self to shift the KEY up


        //Here we'll store all of Employee class references  with Java HashMap

        //Step 1: Start HashMap object
        HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
        //<Integer = Employee 1, Employee = Employee Information (name, age, dept)>


        //Step 2: Create multiple employees by creating Employee class object

        //Now in constructor we'll pass name, age, dept) to initialize it
        Employee e1 = new Employee("Asif", 25, "admin");
        Employee e2 = new Employee("Jewell", 33, "QA");
        Employee e3 = new Employee("Shams", 29, "DEV");

        //Now with help of "emp" reference variable from HashMap Object
        emp.put(1, e1); //Put() method and since key is an Integer = 1, and for value employee 1 = e1 that references the rest of the object and it's variables
        emp.put(2, e2);
        emp.put(3, e3);

        //Now to Iterate, Print everything in console or Traverse the HashMap:
        for (Map.Entry<Integer, Employee> m : emp.entrySet()) {  // m: emp.entrySet() stores all above 3 employees in m    |
            int key = m.getKey();  //Start w/ m.getKey() will return Integer
            Employee e = m.getValue(); //Start w/ m.getValue represent all 3 above Employees then the entire get value which will be stored in Employee reference e,
            System.out.println("Employees " + key + " Info: ");                                              //and e points to all three objects
            //            start w/ key append w/ + string Info

            //e points to all three objects then just call all the variables & print
            System.out.println(e.name + " " + e.age + " " + e.dept);

        }
    }
}


