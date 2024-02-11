// Practical : 2 : Write a program in java to find maximum of three numbers using conditional operator.
import java.util.Scanner;
public class AB_Practical_02 {
    public static void main (String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number :");
        int a = sc.nextInt();

        System.out.println("Enter 2nd Number :");
        int b = sc.nextInt();

        System.out.println("Enter 3rd Number :");
        int c = sc.nextInt();

        int max = (a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println("Largest Amoung there"+max);
    }
}

/*
Output:-
Enter 1st Number :
55
Enter 2nd Number :
44
Enter 3rd Number :
33
Largest Amoung there55
*/