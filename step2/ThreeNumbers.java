package step2;

import java.util.Scanner;

class Threenumbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int answer = 0;
        
        if(a>b){
            if(a>c){
                if(b>c){
                    answer = b;
                }else{
                    answer = c;
                }
            }else{
                answer = a;
            }
        }else{
            if(b>c){
                if(a>c){
                    answer = a;
                }else{
                    answer = c;
                }
            }else{
                answer = b;
            }
        }

        if(a>c){
            if(a>b){
                if(b>c){
                    answer = b;
                }else{
                    answer = c;
                }
            }else{
                answer = a;
            }
        }else{
            if(c>b){
                if(b>a){
                    answer = b;
                }else{
                    answer = a;
                }
            }else{
                answer =c;
            }
        }
        System.out.println(answer);
    }
}