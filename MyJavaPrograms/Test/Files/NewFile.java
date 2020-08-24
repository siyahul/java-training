package Files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.Iterator;
import java.util.LinkedList;

public class NewFile {
    public static void main(String[] args){
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter File name");
            String fileName = in.nextLine();
            System.out.print("How Many Lines Want to enter:");
            int line= in.nextInt();
            in.nextLine();
            byte i=0;
            while(i<line){
                String data =in.nextLine();
                File file = new File(fileName+".txt");
                FileWriter fr = new FileWriter(file,true);
                BufferedWriter br = new BufferedWriter(fr);
                br.write(data+"\n");
                br.close();
                fr.close();
                i++;
            }
            System.out.println();

            File readFile = new File(fileName+".txt");
            Scanner s = new Scanner(readFile);
            LinkedList<String> test = new LinkedList<String>();

            while(s.hasNextLine()){
                test.add(s.nextLine());
            }
            s.close();
            Iterator<String> check = test.iterator();
            byte count=0;
            while(check.hasNext()){
                check.next();
                count++;
            }
            System.out.println("which Line you want to Print in "+count+" lines");
            byte ln = in.nextByte();
            in.close();
            Iterator<String> it = test.iterator();
            if(ln<=count){ 
                for(i=1;i<ln;i++){
                    it.next();
                }
            }
            System.out.println(it.next());
            
            /*for(i=0;i<test.size();i++){
                System.out.println(test.get(i));
            }
            */
            
            
        } catch (Exception e) {
            //TODO: handle exception
        }
        
        
    }


}