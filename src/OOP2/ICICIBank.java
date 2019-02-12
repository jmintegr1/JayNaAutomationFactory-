package OOP2;

public class ICICIBank implements USBank, RBI {

    //RBI Interface
    @Override
    public void educationLoan() {
        System.out.println("icici--edu loan");
    }

    @Override
    public void homeLoan() {
        System.out.println("icici--home loan");
    }

    @Override
    public void carLoan() {
        System.out.println("icici--car loan");
    }


    //Coming from USBank Interface
    @Override
    public void debit() {
        System.out.println("icici - debit");
    }

    @Override
    public void credit() {
        System.out.println("icici - credit");
    }

    @Override
    public void trasferMoney() {
        System.out.println("icici = transfer money");
    }

    @Override
    public void trading() {
        System.out.println("icici - trading");
    }

    //ICICI bank's own class methods:
        public void mutlaFunds(){
            System.out.println("icici - mutla funds");
    }

    public void insurance() {
            System.out.println("icici - insurance");

    }
}
