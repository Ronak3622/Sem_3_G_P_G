// Practical : 4 Write a program in java to two 3*3 matrices.
import java.util.ArrayList;
public class AD_Practical_4 {
    public static void main(String []args)
    {
        int matrixone[][]={{1,3,6},{2,8,9},{3,17,21}};
        int matrixtwo[][]={{9,2,16},{1,7,13},{4,10,8}};
        int sum=0;
        ArrayList<Integer>sumList=new ArrayList();

        for(int i=0;i<matrixone.length;i++)
        {
            for(int j=0;j<matrixtwo.length;j++){
                sum=matrixone[i][j]+matrixtwo[i][j];
                sumList.add(sum);
            }
        }
        for(Integer num : sumList){
            System.out.println(num);
        }
    }
}
/*
Output :- 
10
5
22
3
15
22
7
27
29
 */
