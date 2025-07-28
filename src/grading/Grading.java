
package grading;

import java.util.Scanner;


public class Grading {

    
    public static void main(String[] args) {
        Scanner grade = new Scanner(System.in);
        
        String name;
        int subjects =0;
        int total =0;
        
        System.out.print("Enter student name:");
        name = grade.nextLine();
        
        System.out.print("Enter number of subjects:");
        subjects = grade.nextInt();
        
           for(int i = 1;i <= subjects; i++){
               
               System.out.print("Enter grade for sub" +i+": ");
               total += grade.nextInt();
          
           }
            float avrg = total/subjects;
               
               System.out.println("Average: "+avrg);
               
               if (avrg <= 75){
                   System.out.println("Remarks: FAILED!");
               }else{
                   System.out.println("Remarks: PASSED!");
                   
               }
      
        
        
        
   
    }
    
}
