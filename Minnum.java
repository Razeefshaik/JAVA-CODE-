import java.util.Scanner;
//import java.util.ArrayList;

public class Minnum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int ar[]=new int[5];

        for(int i=0;i<ar.length;i++)
        {
            System.out.printf("Enter the value of ar[%d]=",i+1);
            ar[i]=in.nextInt();
        }
        System.out.printf("[");
        for(int i=0;i<ar.length;i++){
            System.out.printf("%d,",ar[i]);
        }
        System.out.printf("]");


        for(int i=0;i<ar.length;i++){
            for(int j=i+1;j<ar.length;j++){
                if(ar[j]>ar[i]){
                    int t=ar[j];
                    ar[j]=ar[i];
                    ar[i]=t;

                }
            }
        }
         
        System.out.printf("\n\nThe sorted array is :");
         for(int i=0;i<ar.length;i++){

            System.out.printf("%d,",ar[i]);
           
         }


         System.out.printf("\nThe maximum number is :%d",ar[0]);

    
} }
