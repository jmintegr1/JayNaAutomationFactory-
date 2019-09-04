package CollectionFrameworkInJava;

//Extension from ArrayList video time 22:45 (data from this class is used in ArrayListConcept)
// This is user defined class.. create constructor with these 3 variables then back in
// ArrayListConcept, to store the values by creating ArrayList Object then with the help of Iterator we print all the values & we have to Iterate it to traverse all the values
//from those 3 objects

public class Employee {

    String name;
    int age;
    String dept;

    Employee(String name, int age, String dept){
        this.name = name;   //If the Global variable and Local variable names are the SAME then we use "this" Keyword, variables in purple represent the global and
        this.age = age;    //variable in black represent the local
        this.dept = dept;
    }
}

  //The info here are also used to store it in Java HashMap.. refer to line 61 in HashTableConcept: