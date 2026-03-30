
import java.util.Scanner;

public class loop_for {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=sc.nextInt();
         //PRINT TABLE OF ANY NUMBER
        // for(int i=n;i<=10*n;i+=n)
        // {
        //     System.out.println(i);
        // }

        //FECTORIAL OF ANY NUMBER
        // int fact;
        // fact=1;

        // for(int i=n;i>0;i--)
        // {
        //      fact=fact*i;

        // }
        // System.out.println("fectorial of any number"+fact);
    


        // REVERSE OF ANY NUMBER

        // int rev=0;
        // int rem;
        // for(int i=n;i>0;i/=10)
        // {
        //     rem=i%10;
        //     rev=(rev*10)+rem;
            
        // }
        // System.out.println("reverse of any number="+rev);

        //SUM OF DIGIT
        int rem=0;
        int sum=0;
        for(int i=n;i>0;i/=10)
        {
            rem=i%10;
            sum=sum+rem;
        }
        System.out.println("Sum of digit="+sum);

    }
    
}
