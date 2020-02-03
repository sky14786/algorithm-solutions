import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[] tempArr = sc.nextLine().split("");
        int[] answer = new int[26];
        
        for(int i = 0 ; i < answer.length ; i++){
            answer[i] = -1;
        }
        
        String print = "";
        for(int i = 0 ; i < tempArr.length ; i++){
            int temp = (byte)tempArr[i].charAt(0)-97;
            if(answer[temp] == -1){
                answer[temp] = i;
            }
        }

        for(int i = 0 ; i < answer.length ; i++){
            print = print + answer[i] + " ";
        }

        System.out.println(print);
    
    }
}