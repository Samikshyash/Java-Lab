import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      
        // Taking input
        System.out.println("Enter the number of students:");
        int stdNo = sc.nextInt();
        sc.nextLine(); // consume leftover newline
      
        // Arrays to store student details
        String[] names = new String[stdNo];
        int[] rolls = new int[stdNo];
        double[] marks = new double[stdNo];
       
        for(int i = 0; i < stdNo; i++){
            System.out.println("\nEnter details for student " + (i + 1));

            System.out.print("Enter your name: ");
            names[i] = sc.nextLine();

            System.out.print("Enter your roll no: ");
            rolls[i] = sc.nextInt();

            System.out.print("Enter your marks: ");
            marks[i] = sc.nextDouble();
            sc.nextLine(); // consume leftover newline
        }

        // Display output
        System.out.println("\nStudent Details:");
        for(int i = 0; i < stdNo; i++){
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Name: " + names[i]);  
            System.out.println("Roll no: " + rolls[i]);  
            System.out.println("Marks: " + marks[i]);  
        }
        sc.close();
    }
}
