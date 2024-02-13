import java.util.Scanner;
public class percentage {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculating Percetages of Students");

        int s1,s2,s3,s4,s5;
      System.out.println("Enter marks of Students :");
        s1=sc.nextInt();
        s2=sc.nextInt();
        s3=sc.nextInt();
        s4=sc.nextInt();
        s5=sc.nextInt();

        float per = ((s1+s2+s3+s4+s5)/500f)*100;

        System.out.print("Percentage is :"+per);
        
    }
    
}
