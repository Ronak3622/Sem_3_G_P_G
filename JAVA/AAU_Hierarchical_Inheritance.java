class Ronak{
    void num(){
    System.out.println("Ronak");
     }
}
class Dev extends Ronak{
    void num1(){
        System.out.println("Dev");
    }
}
class Mayur extends Ronak{
    void num2(){
        System.out.println("Mayur");
    }
}

public class AAU_Hierarchical_Inheritance {
    public static void main(String [] args){
        Mayur Num4 = new Mayur();
        Num4.num2();
        Num4.num();
    }
}
