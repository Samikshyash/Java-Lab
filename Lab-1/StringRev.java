import java.util.Scanner;
class StringRev
{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("enter string to reverse");
String word=sc.nextLine();
char[] arr=word.toCharArray();
System.out.println("the reverse of "+word+" is");
for(int i=arr.length-1;i>=0;i--){
    System.out.print(arr[i]);
}
sc.close();
}
}