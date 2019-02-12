package JavaBasics;

public class StringConcept {

    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java"; //Here with same s1 value, memory location is same but...
        s2 = "Naveen"; //Now in memory the location for s2 is changed to 23 but s1 is not changed, that's why String is immutable
        String s3 = "c++";   //If it was mutable then s1 would have changed as well and the repercussion will follow suit like security.

        System.out.println(s1);
        System.out.println(s2);

    }
}
