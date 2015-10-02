import java.util.*;


public class Assignment1 {


	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int pin = 1234;
		//Asks for PIN
		int pinEntered;
		System.out.println("Enter PIN number");
		pinEntered = input.nextInt();
		//boolean isBanking sets the exit switch
		boolean isBanking = true;
		double balance = 0.00;
		//boolean authorized checks if PIN is correct
		boolean authorized = false;
		//if pin is correct, user is authorized and starts banking
		if(pin == pinEntered){
			authorized = true;
		}
		//until user enters correct pin, they will continue to see this incorrect prompt
		while(authorized == false) {
			System.out.println("Incorrect.\nEnter PIN number");
		
			pinEntered = input.nextInt();
			System.out.println();
			if(pin == pinEntered){
				authorized = true;
			}
		}
		
			
			do{
				System.out.println("Welcome.");
				System.out.printf("Current balance is $%.2f.\n", balance);
				//Asks customer to choose option
				System.out.println("Please choose an option.\n\n1. Make a deposit\n2. Make a withdrawal\n3. Exit");
				System.out.print("Your selection: ");
				int x = input.nextInt();
				switch(x) {
					case 1:
					//Making a deposit
						System.out.print("Enter an amount to deposit: $");
						double deposit = input.nextDouble();
						//valid deposit
						if(deposit >= 0){
							balance += deposit;
							System.out.println("\n");
						}
						//error when trying to deposit negative numbers
						else{
							System.out.println("Error. Must deposit positive number.\n");
							
						}
						break;
					case 2:
					//Making a withdrawal
						System.out.print("Enter an amount to withdraw: $");
						double withdraw = input.nextDouble();
						//if no funds or trying to withdraw more than is in the balance an error occurs
						if(withdraw < 0 || withdraw > balance){
							System.out.println("Error. Insufficient funds.\n");
						
						}
						//successful withdraw
						else{
							balance -= withdraw;
							System.out.println();
						}
						break;
					case 3:
						//Exit
						System.out.println("\nThank you for your business.");
						isBanking = false;
						break;
				
				}
			}
				while(isBanking == true);
		}
		
	
}
