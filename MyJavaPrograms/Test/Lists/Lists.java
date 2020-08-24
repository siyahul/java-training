package Lists;

import java.util.*;

public class Lists {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        
        //stack-->
        /*list.push("Hello");
        list.push("hey");
        list.push("how");

        System.out.println(list.remove());
        System.out.println(list.remove());
        System.out.println(list.remove());*/
        
        //queue-->
        list.add("Hello");
        list.add("hey");
        list.add("how");
        
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        
        /*System.out.println(list.remove());
        System.out.println(list.remove());
        System.out.println(list.remove());*/
    }
}