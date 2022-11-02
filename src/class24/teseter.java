package class24;

import java.util.Iterator;
import java.util.LinkedList;

public class teseter {
/*    static LinkedList removes(LinkedList lists){
        for(int i=0; i<lists.size(); i++){
            if(((String)lists.get(i)).startsWith("A")){
                lists.remove(i);
            }
        }
        return lists;
    }

    public static void main(String[] args) {

        LinkedList<String> countries = new LinkedList<>();
        countries.add("Armenia");
        countries.add("USA");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");
        countries.add("Azerbaijan");
        System.out.println(removes(countries));
    }*/

    static Iterator<String> removes(Iterator<String> iterator){
        while (iterator.hasNext()){
            //  String item= iterator.next(); //better approach
            if(iterator.next().startsWith("A")){
                iterator.remove();
            }
        }
        return iterator;
    }

    public static void main(String[] args) {

        LinkedList<String> countries = new LinkedList<>();
        countries.add("Armenia");
        countries.add("USA");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");
        countries.add("Azerbaijan");
        Iterator<String> lists=countries.iterator();
        System.out.println(removes(lists));
    }
}
