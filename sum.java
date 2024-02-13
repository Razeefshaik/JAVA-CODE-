import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ar[];
        ar=new int [4];

        for(int i=0;i<ar.length;i++)
        {
            System.out.printf("\nEntter the value of ar[%d]=",i+1);
            ar[i]=sc.nextInt();
        }
       
        int sum=0;

        for(int i=0;i<ar.length;i++)
        {
          sum=sum+ar[i];
        }

        System.out.printf("Sum of elements in array is : %d",sum);


    }
}
