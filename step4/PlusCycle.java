import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 1;
        int temp = 0;
        if(num < 10){
            temp = num * 11;   
        }else{
            temp = num;
            int frontNum = temp / 10;
            int backNum = temp - (frontNum * 10);
            int sumNum = (frontNum + backNum) - (((frontNum + backNum) / 10) * 10) ;
            temp = (backNum*10) + sumNum;
        }
        while(temp != num){
            int frontNum = temp / 10;
            int backNum = temp - (frontNum * 10);
            int sumNum = (frontNum + backNum) - (((frontNum + backNum) / 10) * 10) ;
            temp = (backNum*10) + sumNum;
            count++;
        }
        System.out.println(count);
    }
}