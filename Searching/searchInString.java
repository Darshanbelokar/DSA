package Searching;

public class searchInString {
    public static void main(String[] args) {
        String name="kunal";
        char target='u';
        System.out.println(search(name,target));
    }
    public static boolean search(String str,char target){
        if(str.length()==0){
            return false;
        }

        for(int i=0;i<str.length();i++){
            if(target==str.charAt(i)){
                return true;
            }
        }

        return false;
    }
}
