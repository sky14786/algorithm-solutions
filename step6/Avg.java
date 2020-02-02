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
        int maxScore = 0;
        float avg = 0;

        for(int i = 0 ; i < temp.length ; i++){
            if(Integer.parseInt(temp[i]) > maxScore){
                maxScore = Integer.parseInt(temp[i]);
            }
        }

        for(int i = 0 ; i < temp.length ; i ++){
            avg += (Float.parseFloat(temp[i]) / (float)maxScore) * 100;
        }

        avg /= size;

        bw.write(avg + "\n");
        bw.flush();
        bw.close();
        br.close();
        
    }
}
