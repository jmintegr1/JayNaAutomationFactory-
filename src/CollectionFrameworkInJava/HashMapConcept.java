package CollectionFrameworkInJava;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

    public static void main(String[] args) {

        //HashMap is a class that implements Map Interface
        //Extends AbstractMap
        //IQ: It contains only unique elements
        //Stores the values - key - value pair
        //it may have one null key and multiple null values
        //It maintains no order
        /*HashMap is non-synchronised - means if it is used in multi threading environment or multi threading concept, if you are using more than one thread

        can access and process the HashMap simultaneously. It means there are multiple threads that are running on. Then HashMpa object can be accessed by all the

        thread so the performance of the HashMap will be increased automatically. Because whenever you have to use fast performance system in that case, we

        have to use HashMap. We don't use HashTable because "HashTable" is "synchronized" with thread safe, it means in HasTable one thread at a time can access HashTable

        object. However, HashMap can be accessible by multiple threads. It means HashMap is non-synchronized, it is not thread safe. It means multiple threads

        can attack, multi-threading environment, if you want to use multiple threads that are available and then they want to use multiple users script, if you are

        creating and they want to use this particular HashMap object, they you can access it. But there is a problem with HashMap and this is very very important for

        Interview: Naveen explains Part 5 time 19:48, he explains concurrent modification exception -- Fail - Fast Condition,  '
*/

        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(1, "Selenium");
        hm.put(2, "QTP");
        hm.put(3, "TestComplete");
        //hm.put(4, "RFT");

        System.out.println(hm.get(1));
        System.out.println(hm.get(2));
        System.out.println(hm.get(3));
        System.out.println(hm.get(4));   //4 will give you NULL, will not give: exception because it does not store values on the basis of indexes

        for(Map.Entry m: hm.entrySet()){
            System.out.println(m.getKey() +" "+ m.getValue());
        }

        System.out.println(hm); //Here it gives you all keys from above
        hm.remove(1);   //After removal method
        System.out.println(hm);

        HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();

        Employee e1 = new Employee("Tom", 25, "admin");
        Employee e2 = new Employee("Tom", 26, "QA");
        Employee e3 = new Employee("Tom", 29, "DEV");

        emp.put(1, e1);
        emp.put(2, e2);
        emp.put(3, e3);

        //Traverse the hashmap:
        for(Map.Entry<Integer, Employee> m: emp.entrySet()){
            int key = m.getKey();
            Employee e = m.getValue();
            System.out.println("Employees " + key + " Info: ");

            System.out.println(e.name + " " + e.age + " "+ e.dept );

        }
    }
}
