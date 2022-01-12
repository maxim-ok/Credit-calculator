public class Main {
    public static void main(String[] args) {

        ServCreditCalculator service = new ServCreditCalculator();


        double everyMonthPay1 = (double) service.calculate(1_000_000, 12, 9.99);
        System.out.println("Сумма ежемесячного платежа составит: " + everyMonthPay1);

        double everyMonthPay2 = (double) service.calculate(1_000_000, 24, 9.99);
        System.out.println("Сумма ежемесячного платежа составит: " + everyMonthPay2);

        double everyMonthPay3 = (double) service.calculate(1_000_000, 36, 9.99);
        System.out.println("Сумма ежемесячного платежа составит: " + everyMonthPay3);

    }
}




















