import java.util.Scanner;

public class first{
    public static void main(String[] args){
  Scanner sc =new Scanner(System.in);
  System.out.println("Enter the first number :");
  int num =sc.nextInt();
  System.out.println("Enter the second number :");
  int num1=sc.nextInt();

  int sum=num+num1;
  System.out.println("The sum of given numbers is :"+sum);
    }
}