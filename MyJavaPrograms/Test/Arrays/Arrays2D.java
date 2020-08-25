package Arrays;

public class Arrays2D{
    public static void main(String[] args) {
       int[][] data ={
           {10,50,20},
           {24,30,40,25,60},
           {87,81,91,77}
       };
       for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data[i].length; j++){
                System.out.print(data[i][j]+"\t");
            }
            System.out.println();
       }
    }
}