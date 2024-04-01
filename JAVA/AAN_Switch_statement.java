public class AAN_Switch_statement {
    public static void main(String []args){
        int user_choice = 3;
        int a = 10;
        int b = 20;
        /*
        switch(expression){
            case 1 :
            //Code block
            break;
            case 2 :
            //Code block
            break;
            default:
            //Code block
        }
        */
        switch (user_choice) {
            case 1:
                System.out.println(a + b);
                break;

            case 2:
                System.out.println(a - b);
                break;

            default:
                System.out.println("Thanks You!");
        }
    }
}
