import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();

        int count = 0;
        boolean isSearch = false;
        for(int i = 0 ; i < temp.length() ; i++){
            if(isUpperCase(temp.charAt(i)) || isLowerCase(temp.charAt(i))){
                if(!isSearch){
                    isSearch=true;
                    count++;
                }
            }else{
                isSearch=false;
            }
        }
        System.out.println(count);
    }

    public static boolean isUpperCase(char ch){
       return (ch>= 'A' && ch <= 'Z');
    }
    
    public static boolean isLowerCase(char ch){
        return (ch>= 'a' && ch <= 'z');
    }
}