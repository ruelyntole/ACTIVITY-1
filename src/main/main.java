
package main;

import banking.bankApp;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner lyn = new Scanner(System.in);
        
        bankApp web = new bankApp();
        int attemp = 3;
       
        System.out.println("WELCOME TO MY SYSTEM!");
        System.out.println("What do you want to do todoy?");
        System.out.println("1. Banking");
        System.out.println("2. Shopping");
        System.out.println("3. Pay Bills");
       
        System.out.print("Enter your choice: ");
        int choice = lyn.nextInt();
       
             switch( choice ){
                case 1:
                    while( attemp != 0 ){
                        
                        System.out.print("Enter Account No : ");
                        int acc = lyn.nextInt();

                        System.out.print("Enter Pin No : ");
                        int pin = lyn.nextInt();

                            if (web.verifyAccount(acc, pin)){
                                System.out.println("Login Success!");
                                System.exit(0);
                            }
                            else{
                                attemp--;
                                System.out.println("Invalid Account No or Pin! Left attemp " + attemp);
                                
                            }
                            
                            if ( attemp == 0 ){
                                System.out.println("Try Again later!");
                            }
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
             }
    }
    
}