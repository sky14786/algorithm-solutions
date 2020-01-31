package step1;

import java.util.Scanner;

class Multiplication{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = Integer.toString(b).length() ; i > 0 ; i--){
            System.out.println(a*Integer.parseInt(Character.toString(Integer.toString(b).charAt(i-1))));
        }
        System.out.println(a*b);
        
        
    }
}