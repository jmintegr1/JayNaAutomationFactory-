package JavaBasics;

public class CarConstructorConcept {

    String name;
    String modelNumber;
    int price;
    String engine;

    public CarConstructorConcept(String name, String modelNumber, int price, String engine){
        this.name = name;
        this.modelNumber = modelNumber;
        this.price = price;
        this.engine = engine;
    }

    public static void main(String[] args) {

        CarConstructorConcept obj1 = new CarConstructorConcept("Tesla", "Model 3",  35,"Automatic");
        CarConstructorConcept obj2 = new CarConstructorConcept("Audi", "A8", 65,"Automatic");
        CarConstructorConcept obj3 = new CarConstructorConcept("Honda",  "Accord", 25, "Manual");
        CarConstructorConcept obj4 = new CarConstructorConcept("Ford","Mustang", 40, "Manual ");

        System.out.println(obj1.name + " " + obj1.modelNumber  + " " + obj1.price + " " + obj1.engine);
        System.out.println(obj2.name + " " + obj1.modelNumber + " " + obj2.price + " " + obj2.engine);
        System.out.println(obj3.name + " " + obj3.modelNumber + " " + obj3.price + " " + obj3.engine);
        System.out.println(obj4.price + " " + obj4.modelNumber + " " + obj4.engine + " " + obj4.name); //Here rearranged a bit
    }
}
