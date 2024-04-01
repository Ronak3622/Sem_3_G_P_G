public class AAG_Array {
    public static void main(String [] args){
        int [] marks = new int[3];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        int marks1[];
        marks1 = new int[5];

        marks1[0] = 2;
        
        //Single
        String [] Friends = {"Ronak","Dev","Mayurbhai"};
        System.out.println(Friends[0]);
        System.out.println(Friends[1]);
        System.out.println(Friends[2]);

        //two
        int [][] age = {{1,2,3},{2,4,5}};
        System.out.println(age[1][2]);
        System.out.println(age[0][2]);

        int [][] marksss = {
            {2,5,6},
            {5,8,7}
        };
        System.out.println(marksss[0][1]); 
    }
}
