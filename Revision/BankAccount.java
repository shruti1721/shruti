package Revision;
import java.util.Scanner;
//Write a program for banking system to displaying the balancing, withdrawing, depositing.
public class BankAccount {
	String AccountName;
	double AccountNumber;
	double balance;
	double withdraw;
	double deposit;
	Scanner sc=new Scanner(System.in);
	void GetAccHolderDetail() {
		System.out.println("Enter your bank account holders name: ");
		AccountName= sc.nextLine();
		System.out.println("Enter the bank account number: ");
		AccountNumber=sc.nextDouble();
	}
	void GetChoice() {
		System.out.println("Choose the following bank service: ");
		System.out.println("1. Deposit Money");
		System.out.println("2. Wihtdraw Money");
		System.out.println("3. Display balance");
		System.out.println("4. quit");
	}
	void AmountBalance() {
		System.out.println("Your current balance is: "+balance);
	}
	void DepositAmount() {
		System.out.println("Enter the amount to deposit: ");
		deposit = sc.nextDouble();
		balance+=deposit;
		System.out.println("Your deposit amount is: "+ deposit);
		}	
	void WithdrawnAmount() {
		System.out.println("Enter the amount to withdraw: ");
		withdraw = sc.nextDouble();
		if(withdraw<balance) {
			balance-=withdraw;}
		else {
			System.out.println("Not enough balance");
		}
		System.out.println("Your recently withdrawn amount is: "+withdraw);
	}	
	public static void main(String[] args) {                                          
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		BankAccount x1 = new BankAccount();
		x1.GetAccHolderDetail();
		boolean Flag =true;
		do {
			x1.GetChoice();
			int choice = sc.nextInt();
			switch(choice) 
			{
				case 1:				
					x1.DepositAmount();
					break;
			    case 2:
			    	x1.WithdrawnAmount();
					break;
				case 3:
					x1.AmountBalance();
					break;
				case 4:
					Flag=false;
					break;
			}	
		}		
		while(Flag);
		System.out.println("Thankyou!");
}
}

