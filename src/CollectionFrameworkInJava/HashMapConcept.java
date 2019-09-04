package CollectionFrameworkInJava;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

    public static void main(String[] args) {

        //HashMap is a class that implements Map Interface
        //Extends AbstractMap (Inherit AbstractMap) from parent
        //**IQ: What kind of element does HashMap  contains? -- It contains Only UNIQUE elements
        //Stores the values on key & value pair basis
        //It may have ONE NULL KEY but Multiple Null Values can stored
        //It maintains NO order (No storing on the basis of index or anything..)
        //Fail - Fast Condition or concurrent modification exception because of below......

        /*HashMap is NON-Synchronised - means if it is used in multi threading environment or multi threading concept, if you are using more than one thread then other

        threads can access and process the HashMap simultaneously. It means there are multiple threads that are running on. So HashMap object can be accessed by all the

        threads therefore, the performance of the HashMap will increases automatically. Because whenever we have to use FAST PERFORMANCE SYSTEM in that case, we

        have to use HashMap.

        We don't use HashTable because "HashTable" IS "Synchronized" With thread safe, it means in HasTable ONE thread at a time that can access HashTable

        object. However, HashMap can be accessible by multiple threads at the same time. It means HashMap is NON-Synchronized, it is NOT thread safe. It means multiple threads

        can attack in a multi-threading environment, if we want to use multiple threads that are available then we want to use multiple users script, if we are

        creating and we want to use this particular HashMap object, they we can access it.


        However there is a PROBLEM with HashMap and this is very very important for ***IQ: Naveen explains Part 5 time 19:48, he explains ConcurrentModificationException --

        Fail - Fast Condition: whenever we iterate the HashMap, it is called Fail Fast Condition. It means concurrent modification exception will occur.

        ***IQ: What do mean by concurrent modification exception? Ans: If any Thread simultaneously MODIFIES the Map Structure

        by Adding or Removing the element from particular HashMap object, it is called Fail - Fast Condition or ConcurrentModificationException.

        */

                  //KEY, Value
        HashMap<Integer, String> hm = new HashMap<Integer, String>();  //Import HashMap from Java Util package

        //Keys (Integer) & Values (String)
        hm.put(1, "Selenium");
        hm.put(2, "QTP");
        hm.put(3, "TestComplete");
        //hm.put(4, "RFT");  //If we comment out RFT and print we'll get Null ONLY..   give: NullPointerException


        System.out.println(hm.get(1));   //If we want to fetch the values we use: Entry set & Entry Concept
        System.out.println(hm.get(2));
        System.out.println(hm.get(3));
        System.out.println(hm.get(4));   //4 will give you NULL without hm.put(4, "RFT") above so  if commented in out above then run it, it will NOT give: NullPointerException because HashMap does NOT store the values on the basis of INDEXES


        System.out.println("************");


        //How to iterate HashMap?
        //With the help of for loop, We use Map.Entry interface & give it a reference variable then colon, then HashMap instance variable so hm.entrySet() method  will store the complete values from this HashMap & iterate 1 by 1
        for (Map.Entry m : hm.entrySet()) {  //If we want to print all the values of HashMap, we use for loop with Map.Entry interface (Short literate answer)
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println(hm); //Here it gives you all the KEYS from above in parallel fashion inside {}, before remove method

        hm.remove(2);   //After Remove method
        System.out.println(hm); //Print will show QTP missing here but the number organizing structure remains the same, it will NOT self reorganize its self to shift the KEY up to 2

        System.out.println("************");


        //Here we'll store all of Employee class references  with Java HashMap

        //Step 1: Start HashMap object
        HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
        //<Integer = Employee 1, Employee = Employee Information (name, age, dept)>


        //Step 2: Create multiple employees by creating Employee class object

        //Now with help of constructor we'll pass the (name, age, dept) to initialize it
        Employee e1 = new Employee("Asif", 28, "admin");
        Employee e2 = new Employee("Jewell", 33, "QA");
        Employee e3 = new Employee("Shams", 29, "DEV");
        Employee e4 = new Employee("Ibrahim", 24, "SDET");

        //Now with the help of "emp" reference variable from HashMap Object
        emp.put(1, e1); //Put() method, since key is an Integer = 1, and for value employee 1 = e1 that references the rest of the object and it's variables inside the constructor/parameter
        emp.put(2, e2);
        emp.put(3, e3);
        emp.put(4, e4);

        //Now to Iterate, Print everything in console and Traverse the HashMap:
        for (Map.Entry<Integer, Employee> m : emp.entrySet()) {  // m: emp.entrySet() stores all above 3 employees in m reference variable
            int key = m.getKey();  //Start w/ m.getKey() will return Integer
            Employee e = m.getValue(); //Start w/ m.getValue() represents all 3 above Employees' & their values which will be stored in Employee reference e on the other side of =
            System.out.println("Employees " + key + " Info: ");                                                                           //and e points to all three objects
                      //start w/ key append it + string Info

            //e points to all three objects and call their variables & print them
            System.out.println(e.name + " " + e.age + " " + e.dept);

        }
    }
}


