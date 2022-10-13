package class16;

public class Main {
    public String alphabetical(String str){
        String newStr="";

        newStr=newStr+str.charAt(0);


        for(int i=1;i<str.length();i++){
            if(str.charAt(i) > str.charAt(i-1)){
                newStr=newStr+str.charAt(i);
            }
        }


        return newStr;
    }

    public static void main(String[] args){
        Main obj = new Main();
        System.out.println(obj.alphabetical("hello"));
        System.out.println(obj.alphabetical("software"));
        System.out.println(obj.alphabetical("language"));
    }
}