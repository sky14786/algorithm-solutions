import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        String[] temp = br.readLine().split(" ");
        int min = Integer.parseInt(temp[0]);
        int max = Integer.parseInt(temp[0]);

        for(int i = 1 ; i < size ; i++){
            int tempNum = Integer.parseInt(temp[i]);
            if(tempNum< min){
                min = tempNum;
            }else if(tempNum > max){
                max = tempNum;
            }
        }
        bw.write(min + " " + max + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}