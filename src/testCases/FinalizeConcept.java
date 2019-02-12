package testCases;

public class FinalizeConcept {

    public void finalize(){  //finalize is a method
        System.out.println("finalize method");
    }



    public static void main(String[] args) {


        FinalizeConcept f1 = new FinalizeConcept();

        FinalizeConcept f2 = new FinalizeConcept();

        f1 = null;
        f2 = null;

        System.gc();


        //IQ: What is the purpose of finalize? Ans: Just before the garbage collector, automatically the finalized method will be called for clean up process of unreferenced object.

        //The garbage collector method will come in and clean up by destroying object that does not have any references (no one is is using
        // it) to make space in Java memory








    }
}
