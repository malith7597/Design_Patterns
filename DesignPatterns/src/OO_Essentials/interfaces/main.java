package OO_Essentials.interfaces;

public class main {
    public static void main(String[] args) {
        taxCalculator();
    }

    public static TaxCalculator taxCalculator() {
        return new Tax2019();
    }
}
