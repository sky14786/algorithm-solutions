import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String[] temp = sc.nextLine().toUpperCase().split("");
        HashMap<String, Integer> answer = new HashMap<String,Integer>();

        for(int i = 0 ; i < temp.length ; i++){
            if(answer.containsKey(temp[i])){
                answer.replace(temp[i], answer.get(temp[i])+1);
            }else{
                answer.put(temp[i], 1);
            }
        }
       int maxValue = -1;
       for(int value : answer.values()){
            if(value> maxValue){
                maxValue = value;
            }
       }
       
       List<String> answerList = new ArrayList<>();
       for(String key : answer.keySet()){
           if(answer.get(key) == maxValue){
               answerList.add(key);
           }
       }
       if(answerList.size()==1){
        System.out.println(answerList.get(0));
       }else{
           System.out.println("?");
       }
    }
}