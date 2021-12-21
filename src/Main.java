public class Main {
    public static void main(String[] args) {
        ServCreditCalculator service = new ServCreditCalculator();

        double rate = 9.99;
        int amountOfCredit = 1_000_000;
        int numOfMonths = 12;

        double everyMonthPay = (double) service.calculate(amountOfCredit, numOfMonths, rate);
        System.out.println("Сумма ежемесячного платежа составит: " + everyMonthPay);


















    }
}
