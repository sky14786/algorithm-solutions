import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;

class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            String[] tempArr = br.readLine().split(" ");
            int a = Integer.parseInt(tempArr[0]);
            int b = Integer.parseInt(tempArr[1]);
            if(a == 0 && b == 0){
                break;
            }   
            bw.write((a+b)+"\n");
            
        }
        bw.flush();
        bw.close();
        br.close();
    }
}