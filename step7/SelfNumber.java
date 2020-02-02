class Main{
    public static void main(String args[]){
        boolean[] tempArr = new boolean[10000];
       
        for(int i = 1 ; i <= 10000 ; i++){
            int temp = i;
            int sum = 0;   
            while(temp > 0){
                sum += temp%10;
                temp /= 10;
            }
            if(i+sum-1 < 10000){
                tempArr[i+sum-1] = true;
            }
        }

        for(int i = 0 ; i < tempArr.length ; i++){
            if(tempArr[i] == false){
                System.out.println(i+1);
            }
        }
    }
}