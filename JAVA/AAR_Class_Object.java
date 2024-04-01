class pen{
    String Color;
    String Type;
    public void write(){
        System.out.println("Write Something");
    }

    public void print_pen (){
        System.out.println(this.Color);
        System.out.println(this.Type);
    }
}
public class AAR_Class_Object {
    public static void main(String []args){
        pen pen1 = new pen();
        pen1.Color = "blue";
        pen1.Type = "Gel";

        pen pen2 = new pen();
        pen2.Color = "Black";
        pen2.Type = "Normal";
        pen1.write();
        pen1.print_pen();
        pen2.print_pen();
    }
}
