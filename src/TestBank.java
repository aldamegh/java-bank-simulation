// Mohammed AlDamegh

import java.util.Scanner;
public class TestBank {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		Bank b1 = new Bank(5);

		Bank b2 = new Bank(2);
		b2.addClient("Mike", 1000);
		b2.addClient("Joe", 3000);


		System.out.println("******************************\n" +
						   "* 1- Add Client.              *\n" +
						   "* 2- Close a client account.  *\n" +
						   "* 3- Deposit.                 *\n" +
						   "* 4- Withdraw.                *\n" +
						   "* 5- Transfer.                *\n" +
						   "* 6- Transfer to another bank.*\n" +
						   "* 7- Display balance.	      *\n" +
						   "* 8- Find the richest client. *\n" +
						   "* 9- Exit.                    *\n" +
						   "*******************************");
		System.out.print("=> ");
		int option=kb.nextInt();

		while(option!=9) {

			 if(option==1) {

				 System.out.print("Enter name and balance: ");
				String name= kb.next(); double balance = kb.nextDouble();
				 boolean found =b1.addClient(name, balance);

				 if (found==true) {
					 System.out.println("DONE");}
					 else if (found==false)  System.out.println("ERROR");
			}

			else if(option==2) {
				System.out.print("Enter name: ");
				String name= kb.next();
				boolean found = b1.deleteClient(name);

				if (found==true) {
					 System.out.println("DONE");}
					 else if (found==false)  System.out.println("ERROR");


			}

			else if(option==3) {
				System.out.print("Enter name and amount: ");
				String name= kb.next(); double amount = kb.nextDouble();
				boolean found = b1.deposit(name, amount);

				if (found==true) {
					 System.out.println("DONE");}
					 else if (found==false)  System.out.println("ERROR");
			}
			else if(option==4) {
				System.out.print("Enter name and amount: ");
				String name= kb.next(); double amount = kb.nextDouble();
				boolean found = b1.withdraw(name, amount);

				if (found==true) {
					 System.out.println("DONE");}
					 else if (found==false)  System.out.println("ERROR");
			}
			else if(option==5) {
				System.out.print("Enter from name, to name, and amount: ");
				String fName= kb.next(); String tName= kb.next(); double amount = kb.nextDouble();
				boolean found = b1.transfer(fName, tName, amount);

				if (found==true) {
					 System.out.println("DONE");}
					 else if (found==false)  System.out.println("ERROR");
			}
			else if(option==6) {
				System.out.print("Enter from name (this bank), to name (other bank), and amount: ");
				String fName= kb.next(); String tName= kb.next(); double amount = kb.nextDouble();
				boolean found = b1.transferToBank(fName, b2, tName, amount);

				if (found==true) {
					 System.out.println("DONE");}
					 else if (found==false)  System.out.println("ERROR");
			}
			else if(option==7) {
				System.out.print("Enter name: ");
				String name = kb.next();
				b1.display(name);
			}
			else if(option==8) {
				if (b1.findMax()==null) System.out.println("No clients");
				else b1.display(b1.findMax());
			}
			else System.out.println("Invalid");

			 System.out.println("******************************\n" +
					   "* 1- Add Client.              *\n" +
					   "* 2- Close a client account.  *\n" +
					   "* 3- Deposit.                 *\n" +
					   "* 4- Withdraw.                *\n" +
					   "* 5- Transfer.                *\n" +
					   "* 6- Transfer to another bank.*\n" +
					   "* 7- Display balance.	      *\n" +
					   "* 8- Find the richest client. *\n" +
					   "* 9- Exit.                    *\n" +
					   "*******************************");
			 	System.out.print("=> ");
			 	 option=kb.nextInt();


		}
		System.out.print("Goodbye");
	}

	}
