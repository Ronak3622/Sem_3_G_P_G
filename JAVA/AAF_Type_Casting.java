public class AAF_Type_Casting {
    public static void main (String [] args){

        // Widening Casting (implisit)
        int num1 = 1; // this is int 
        double num2 = num1;// This is automatic casting : int to double

        System.out.println(num1);
        System.out.println(num2);

        //Narrowing Casting (Explisit)
        double num3 = 20.00d;
        int num4 = (int) num3;//Manual casting: double to int

        System.out.println(num3);
        System.out.println(num4);
    }
}
