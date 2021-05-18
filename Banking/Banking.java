import java.util.Scanner;

public class Banking extends Thread{
    Scanner scan = new Scanner(System.in);
    private int nav,balance,balCheck;
    CustomerResponse user = new CustomerRespose();


    public void run(){
        System.out.println("Hello valued customer");
        do {
            //Displays choices that the user can choose from
            System.out.println("How may we help you today? \n" +
                    "1) Transactions \n" +
                    "2) Check Balance \n" +
                    "3) Check Account information \n" +
                    "4) Exit ATM \n" +
                    "Type the number of where you wish to go");
            nav = scan.nextInt();
            //check what user has choose
            if (nav == 1){
                do {
                    System.out.println("1) Deposit" + "\n2) Withdrawal" + "\n3) Return to main menu");
                    nav = scan.nextInt();
                    if(nav == 1){
                        System.out.println("How much do you wish to deposit?");
                        balance = scan.nextInt();
                    }
                    else if(nav ==2){
                        System.out.println("How much would you like to withdrawal?");
                        balCheck = scan.nextInt();
                        if(balCheck > balance){
                            System.out.println("You don't have enough money");
                        }
                        else if(balCheck <= balance) {
                            balance -= balCheck;
                            System.out.println("New balance :$" + balance);
                        }
                    }
                    else if(nav == 3){
                        break;
                    }
                    else{
                        System.out.println("This is not a valid choice\n");
                    }
                }while(true);
            }
            else if(nav == 2){
                //Call getBalance method
                System.out.println("Balance: $" + balance);
            }
            else if(nav == 3){
                //Get User first and last name, and customer id
                user.toString();
            }
            else if(nav == 4){
                break;
            }
            else{
                System.out.println("This is not a valid choice\n");
            }
        }while(true); // Repeats the choices until a valid choice has been given
        //Program end
        System.out.println("Thank you for using our Atm. \n" +
                           "Please come again.");
    }
}
