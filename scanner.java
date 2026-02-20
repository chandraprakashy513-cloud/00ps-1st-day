
import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the height:");
        float a=sc.nextFloat();

        System.out.print("enter the breadth:");
        float b=sc.nextFloat();

        float area=(float) (0.5*a*b);
        System.out.println("area of tringle="+area);



    }
    
}
