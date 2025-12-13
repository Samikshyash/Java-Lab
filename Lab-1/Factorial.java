import java.util.Scanner;
class Factorail{
  public static void main(String[] args){
Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number to find its factorial:");
    int n=sc.nextInt();
    int fact=1;
    for(int i=1;i<=n;i++){
        
         fact =fact*i;
         
    }
    System.out.println("The factorail of the given number is "+fact);
      sc.close();

  }
}
   