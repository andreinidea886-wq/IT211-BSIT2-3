public class ConstantConversionRate {
    public static void main(String[] args) {

        final double EXCHANGE_RATE = 58.75;

        double usdAmount = 100;
        double pesoEquivalent = usdAmount * EXCHANGE_RATE;

        System.out.println("USD Amount: " + usdAmount);
        System.out.println("Peso Equivalent: " + pesoEquivalent);
    }
}