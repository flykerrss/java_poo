class SavingsAccount
{
    //declare variables
    private static double annualInterestRate;
    private double savingsBalance;

    //constructor
    public SavingsAccount(double balance)
    {
        this.savingsBalance = balance;
    }

    //method for calculate monthly interest
    public void calculateMonthlyInterest()
    {
        double interest = (savingsBalance * annualInterestRate) / 12;   //calculate interest
        savingsBalance += interest;     //add interest to balance
    }

    //method for modify annual interest rate
    public static void modifyInterestRate(double i)
    {
        annualInterestRate = i;
    }

    //getter for balance
    public double getBalance()
    {
        return this.savingsBalance;
    }
}