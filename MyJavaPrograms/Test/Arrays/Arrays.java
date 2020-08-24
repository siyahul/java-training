package Arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte size;
        System.out.println("enter array size ");
        size=in.nextByte();
        int[] array= new int[size];
        
        System.out.println("Enter the elements of array: ");
        for(int i = 0; i < size;i++){
            array[i] = in.nextInt();
        }
        System.out.println("The Elements of arrays are: ");
        for(int i =0;i<size;i++){
            System.out.println(array[i]);
        }
        in.close();

    }
}