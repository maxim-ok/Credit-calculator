public class ServCreditCalculator {
    public double calculate(int amountOfCredit, int numOfMonths, double rate) {

        double monthRate = rate / 100 / 12; //Расчитываем месячную процентную ставку
        double exponentiation = Math.pow((1 + monthRate), numOfMonths); //Расчитывам "степенную" составляющую из формулы расчета аннуитеного платежа

        double annuity = monthRate + (monthRate / (exponentiation - 1)); //Расчитываем аннуитетный коэффициент

        return  Math.round(amountOfCredit * annuity);

    }

}
