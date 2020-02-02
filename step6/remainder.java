import java.util.Scanner;
import java.util.ArrayList;;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int count = 0 ; count < 10 ; count++){
            int temp = sc.nextInt()%42;
            if(arr.size()!= 1){
                boolean isMatching = false;
                for(int i = 0 ; i<arr.size() ; i++){
                    if(arr.get(i) == temp){
                       isMatching = true;
                       break;
                    }
                }
                if(!isMatching){
                    arr.add(temp);
                }
            }else{
                arr.add(temp);
            }
        }
        System.out.println(arr.size());
    }
}