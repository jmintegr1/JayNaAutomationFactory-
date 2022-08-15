package JavaBasics;

public class StringConceptWhyStringIS_Immutable {

    public static void main(String[] args) {

        //A mutable object can be changed after it's created, and an immutable object can't. That said, if you're defining your own class, you can
        //make its objects immutable by making all fields FINAL and PRIVATE.

        //Naveen's why String is immutable: https://www.youtube.com/watch?v=VJAcActe6fo
        // Ans: It's for better optimization, this is how Strings are designed in Java. String is the most common used Data Type for any
        // application. That's why Java has to optimize for String constant pool(SCP)

        //Naveen's interview question https://www.youtube.com/watch?v=AH0ZcgzWMBw

        String s1 = "Java";
        String s2 = "Java"; //Here with same s1 value, memory location is same but...
        s2 = "Naveen"; //Now in memory the location for s2 changed to 23 but s1 has not changed, that's why String is immutable
        String s3 = "c++";   //If it was mutable then s1 would have changed as well and the repercussion will follow suit like security.
                            //So a hacker can easily change things and hack

        System.out.println(s1);
        System.out.println(s2);

    }
}