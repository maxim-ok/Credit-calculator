public class ServCreditCalculator {
    public double calculate ( int amountOfCredit, int numOfMonths, double rate ) {

        double monthRate = rate/100/12; //Расчитываем месячную процентную ставку
        double exponentiation = Math.pow( (1+monthRate), numOfMonths); //Расчитывам "степнную" составляющую из формулы расчета аннуитеного платежа

        double annuity = monthRate + ( monthRate/(exponentiation-1)); //Расчитываем аннуитетный коэффициент
        //double everyMonthMoney =  amountOfCredit * annuity; //Расчитываем ежемесячный платеж

        return  Math.round(amountOfCredit * annuity);

    }

}
