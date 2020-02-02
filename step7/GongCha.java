import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int count = 0;
        List<Integer> tempArr = new ArrayList<>();
        if(size > 99){
            for(int i = 100 ; i <= size ;i ++){
                int temp = i;
                while(temp > 0){
                    tempArr.add(temp%10);
                    temp/=10;
                }
                Collections.reverse(tempArr);
                
                if(tempArr.size() == 4){                    
                    if(tempArr.get(0) - tempArr.get(1) == tempArr.get(1) - tempArr.get(2) && tempArr.get(1) - tempArr.get(2) == tempArr.get(2) - tempArr.get(3)){
                        count++;
                    }
                }else{
                    if(tempArr.get(0) - tempArr.get(1) == tempArr.get(1) - tempArr.get(2)){
                        count++;
                    }
                }
                tempArr.clear();
            }
            count += 99;
        }else{
            count += size;
        }
        System.out.println(count);
    }
}