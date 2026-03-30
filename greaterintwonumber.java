
import java.util.Scanner;

public class  greaterintwonumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the first number:");
        int a=sc.nextInt();

        System.out.println("Enter the second number");
        int b=sc.nextInt();

        System.out.println("Enetr the third number");
        int c=sc.nextInt();


        // if(a>b)
        // {
        //     System.out.println("a is greater");
        // }
        // else
        // {
        //     System.out.println("b is Greater");
        // }

        //GREATER THEN IN THREE NUMBER
        if(a>b){
            if(a>c)
            {
                System.out.println("a is graeter");
            }
            else{
                System.out.println("c is greater");
            }
        }
        else if(b>c)
        {
            System.out.println("b is graeter");
        }
        else 
        {
            System.out.println("c is greater");
        }
    }
}
    

