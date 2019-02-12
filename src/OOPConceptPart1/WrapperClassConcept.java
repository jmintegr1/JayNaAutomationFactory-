package OOPConceptPart1;

public class WrapperClassConcept {

    public static void main(String[] args) {

        String x = "100";
        System.out.println(x+20);   //Here it executed as string concatenation


        //Data conversion: String convert to int:
        int i = Integer.parseInt(x); //Parse int means parse into integer, so this X will be converted into integer. Since x = string 100 it will be converted to int 100
        System.out.println(i+20); //Above code turn x =100 into i then the print line statement it added the two = 123

        //Wrapper Classes are: Integer, Double, Character, Boolean

        // String to double conversion:
        String y = "12.33";
        double d = Double.parseDouble(y);
        System.out.println(d+10);


        //String to boolean:
        String k = "true";
        boolean b = Boolean.parseBoolean(k);
        System.out.println(b);


        //int to String conversion:
        int j = 200;
        System.out.println(j+20);

        String s = String.valueOf(j); //"200"
        System.out.println(s+20);


        /*String u = "100A"; //If you want to convert string into inger and the String is not pure by itself or integer is not pure numeric value then what will you get?
        Integer.parseInt(u); //You will get NumberFormatException when it's hybrid and not pure in either one
*/

    }
}
