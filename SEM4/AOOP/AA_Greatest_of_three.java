// Write a program in JAVA to find maximum of three numbers using conditional operator.
import java.util.Scanner;
public class AA_Greatest_of_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter secound  number");
        int b = sc.nextInt();
        System.out.println("Enter third number");
        int c = sc.nextInt();

        if (a>b && a>c) {
            System.out.println( a+ " is greater");
        }
        else if(b>a && b>c ) {
            System.out.println(b + " is greater ");
        }
        else {
            System.out.println(c + " is greater");
        }

    }
} 

/*
OUTPUT :-
Enter first number
10
Enter secound  number
20
Enter third number
30
C is greater
*/