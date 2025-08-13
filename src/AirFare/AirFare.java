package airfare;

import java.util.Scanner;

public class AirFare {

   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Distance ( km ) : ");
        int distance = input.nextInt();
        
        System.out.print("Class (1 or 2 ) : ");
        int cass = input.nextInt();
        
        float res = 0;
        float dis;
        
        switch (cass) {
            case 1:
                res = 250 * distance;
                if( distance >= 1000 ){
                    dis = res * ( float ) 0.1;
                    res = res - dis;
                }
                System.out.printf("Total fare : %.2f\n", res );
                break;
            case 2:
                res = 500 * distance;
                if( distance >= 1000 ){
                    dis = res * ( float ) 0.1;
                    res = res - dis;
                }
                System.out.printf("Total fare : %.2f\n", res );
                break;
            default:
                System.out.println("Invalid Class! Try again!");
                break;
        }
            
        
            
            
        
    }
    
}