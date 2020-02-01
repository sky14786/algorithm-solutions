import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[] temp = Integer.toString(sc.nextInt() * sc.nextInt() * sc.nextInt()).split("");
        int[] count = new int[10];
        for(int i = 0 ; i < temp.length ; i++){
            for(int j = 0 ; j <= 9 ; j++){
                if(j==Integer.parseInt(temp[i])){
                    count[j]++;
                    break;
                }
            }
        }
        for(int i = 0 ; i < 10 ; i++){
            System.out.println(count[i]);
        }
    }
}
