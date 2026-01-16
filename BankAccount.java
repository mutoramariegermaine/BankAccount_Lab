package lab_2;

public class BankAccount {
		   private String accountHolder;
		   private double balance;
		   private String accountNumber;

		   public BankAccount(String accountHolder, String accountNumber, double initialDeposit) {
		       this.accountHolder = accountHolder;
		       this.accountNumber = accountNumber;
		       this.balance = initialDeposit;
		   }

		   public String getAccountHolder() {
		       return accountHolder;
		   }

		   public double getBalance() {
		       return balance;
		   }

		   public void deposit(double amount) {
		       if (amount > 0) {
		           balance += amount;
		           System.out.println("Deposited: $" + amount);
		       } else {
		           System.out.println("Invalid deposit amount.");
		       }
		   }

		   public void withdraw(double amount) {
		       if (amount <= balance && amount > 0) {
		           balance -= amount;
		           System.out.println("Withdrew: $" + amount);
		       } else if (amount <= 0) {
		           System.out.println("Invalid withdrawal amount.");
		       } else {
		           System.out.println("Insufficient funds.");
		       }
		   }

		   public void printAccountDetails() {
		       System.out.println("Account Holder: " + accountHolder);
		       System.out.println("Account Number: " + accountNumber);
		       System.out.println("Current Balance: $" + balance);
		   }
		}

