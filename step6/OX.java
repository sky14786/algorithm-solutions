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

        for(int i = 0 ; i < size ; i++){
            String[] temp  = br.readLine().split("");
            int score = 0;
            int count = 1;
            for(int j = 0 ; j < temp.length ; j++){
                if(temp[j].equals("O")){
                    score+=count;
                    count++;
                }else{
                    count=1;
                }
            }
            bw.write(score+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}