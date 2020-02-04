import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[] numbers = sc.nextLine().split(" ");
        int answer = -1;
        for(int i = 0 ; i < numbers.length ; i++){
            int temp = reverseNumber(Integer.parseInt(numbers[i]));
            if(temp > answer){
                answer = temp;
            }
        }
        System.out.println(answer);   
    }

    public static int reverseNumber(int number){
        int result = 0;
        while(number>0){
            result = result * 10 + number%10;
            number/=10;
        }
        return result;
    }
} 