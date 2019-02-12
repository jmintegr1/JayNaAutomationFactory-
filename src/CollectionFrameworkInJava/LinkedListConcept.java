package CollectionFrameworkInJava;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

    public static void main(String[] args) {


        LinkedList<String> ll = new LinkedList<String>();   // IQ: Different ways to print values of LinkedList?

        //add:
        ll.add("test");
        ll.add("qtp");
        ll.add("selenium");
        ll.add("RPA");
        ll.add("RFT");

        //print:
        System.out.println("content of linkedlist are:" + ll);
        //addfirst:
        ll.addFirst("JewellNaveen");
        //addlast:
        ll.addLast("Automation");
        System.out.println("content of linkedlist are:" + ll);


        //get
        System.out.println(ll.get(0));
        System.out.println(ll.get(3));
        System.out.println(ll.get(5));

        //set: this is how we insert, very simple
        ll.set(0, "Shams");
        System.out.println(ll.get(0));

        //remove first & last element
        ll.removeFirst();
        ll.removeLast();
        System.out.println("content of Linkedlist:" + ll);

        ll.remove(2);
        System.out.println("content of Linkedlist:" + ll);


        //How to print all the values of LinkedList:
        //Using for loop

        System.out.println("************using for loop to print values of LinkedList");
        for(int n=0; n<ll.size(); n++){
            System.out.println(ll.get(n));
        }


        //Using advance for loop   //This is also called for each loop

        System.out.println("******Using advance for loop");
        for(String str: ll){    //str is string of all the LinkedList object, what are the string available in this particular ll,
            System.out.println(str);    //please iterate and print one by one
        }


        //iterator
        System.out.println("********* using iterator");
        Iterator<String> it = ll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


        //while loop
        System.out.println("********* using while loop");

        int num=0;
        while(ll.size()>num){
            System.out.println(ll.get(num));
            num++;

        }

    }
}
