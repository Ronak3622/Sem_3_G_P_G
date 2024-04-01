class shap{
    public void area(){
        System.out.println("Display Area");
    }
}

class Triangle extends shap {
    public void area(int l,int h){
        System.out.println(l+h);
    }
 }

public class AAS_Single_Inheritance{
    public static void main(String [] args){
        Triangle T1 = new Triangle();
        T1.area(400,100);
        T1.area();
    }
}