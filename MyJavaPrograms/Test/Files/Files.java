package Files;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;

public class Files{
    public static void main(String[] args) {
        try{
            File file = (new File("test.txt"));
            Scanner s = new Scanner(file);
            List<String> test = new ArrayList<String>();

            while(s.hasNextLine()){
                test.add(s.nextLine());
            }
            System.out.println(test);
            for(int i=0;i<test.size();i++){
                System.out.println(test.get(i));
            }
            s.close(); }
        catch (Exception FileNotFoundException){
            //exception
        }
    }
}