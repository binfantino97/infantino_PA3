public class Application {

    public static void modifyInterestRate(double rate) {
        savingsAccount.annualInterestRate = rate;

    }

    public static void main(String args[])
    {
        savingsAccount saver1 = new savingsAccount(2000);
        savingsAccount saver2 = new savingsAccount(3000);
        savingsAccount.modifyInterestRates(0.04);

        int i;
        for(i = 1; i<=12; i++) {
            System.out.printf("Month " + i + " -- Saver 1 interest rate is: $ %.2f \n", saver1.calculateMonthlyInterest());
            System.out.printf("Month " + i + " -- Saver 1 new Balance is: %.2f ",saver1.getBalance());
            System.out.println("");
            System.out.println("");
            System.out.printf("Month " + i + " -- Saver 2 interest rate is: $ %.2f \n", saver2.calculateMonthlyInterest());
            System.out.printf("Month " + i + " -- Saver 2 new Balance is: %.2f ",saver2.getBalance());
            System.out.println("");
            System.out.println("");
        }

        System.out.printf("Ending balance for saver 1 is %.2f \n",saver1.getBalance());
        System.out.printf("Ending balance for saver 1 is %.2f \n",saver2.getBalance());
        System.out.println("");

        modifyInterestRate(.05);

        System.out.println("Modified interest rate to 5%");
        System.out.printf("Next months interest for saver 1 is %.2f \n",saver1.calculateMonthlyInterest());
        System.out.printf("Next months interest for saver 2 is %.2f \n",saver2.calculateMonthlyInterest());

        System.out.println("");

        System.out.printf("Ending balance for saver 1 is %.2f \n",saver1.getBalance());
        System.out.printf("Ending balance for saver 2 is %.2f \n",saver2.getBalance());





    }

}
