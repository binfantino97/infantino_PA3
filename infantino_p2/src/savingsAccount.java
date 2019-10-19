public class savingsAccount {
    static double annualInterestRate;
    private double savingsBalance;

    public savingsAccount(int amount) {
        savingsBalance = amount;
    }


    public double calculateMonthlyInterest()
    {
        double monthlyInterest = savingsBalance * (annualInterestRate / 12);
        savingsBalance = savingsBalance + monthlyInterest;
        return monthlyInterest;
    }

    public double getBalance() {
        return savingsBalance;
    }

    public static void modifyInterestRates(double annualInterrest)
    {
        annualInterestRate = annualInterrest;
    }


}
