public class SavingsAccountTest {
        public static void main(String[] args)
        {
            //create new savers an set balance
            SavingsAccount saver1 = new SavingsAccount(2000.0);
            SavingsAccount saver2 = new SavingsAccount(3000.0);

            System.out.println("Set annual interest rate to 4%");   //prompt
            //set annual interest rate at 0.04 (4%)
            SavingsAccount.modifyInterestRate(0.04);
            for(int month = 1; month <= 12; month++)    //for cycle to calculate monthly interest
            {
                saver1.calculateMonthlyInterest();
                saver2.calculateMonthlyInterest();
            }
            //display results
            System.out.println("At 4% per year, after 12 months:");    //prompt
            System.out.println("Saver1 new balance: $" + saver1.getBalance());      //display for saver 1
            System.out.println("Saver2 new balance: $" + saver2.getBalance());      //display for saver 2
            System.out.println();   //Houston, we need more space

            //set annual interest rate a 0.05 (5%)
            SavingsAccount.modifyInterestRate(0.05);
            //calculate monthly interest
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();

            //display results for 1 month
            System.out.println("At 5% per year, after 1 month:");  //prompt
            System.out.println("Saver1 new balance: $" + saver1.getBalance());      //display for saver1
            System.out.println("Saver2 new balance: $" + saver2.getBalance());      //display for saver2
        }
}
