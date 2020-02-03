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
        String[] temp = br.readLine().split("");
        int sum = 0;
        for(int i = 0 ; i < size ; i++){
            sum += Integer.parseInt(temp[i]);
        }

        bw.write(sum+"\n");
        bw.flush();
        bw.close();
        br.close();

    }
}