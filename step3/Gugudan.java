package step3;

import java.util.Scanner;

class Gugudan{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1 ; i < 10 ; i++){
            System.out.println(n + " * " + i + " = " + i*n);
        }
    }
}