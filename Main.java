package lab_2;

public class Main {
		   public static void main(String[] args) {
		       BankAccount account1 = new BankAccount("Elisha Benson", "12345", 500.0);

		       account1.printAccountDetails();
		       account1.deposit(200.0);
		       account1.printAccountDetails();
		       account1.withdraw(100.0);
		       account1.printAccountDetails();
		       account1.withdraw(700.0);
		       for (int i = 1; i <= 3; i++) {
		           account1.deposit(50 * i);
		           account1.withdraw(20 * i);
		           account1.printAccountDetails();
		       }
		   }
		}


