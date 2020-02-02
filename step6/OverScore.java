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
            String[] temp = br.readLine().split(" ");
            float avgTemp = 0;
            
            for(int j = 1 ; j <= Integer.parseInt(temp[0]) ; j++){
                avgTemp += Float.parseFloat(temp[j]);
            }

            avgTemp /= Float.parseFloat(temp[0]);
            int count = 0;

            for(int j = 1 ; j <= Integer.parseInt(temp[0]) ; j++){
                if(Float.parseFloat(temp[j]) > avgTemp){
                    count++;
                }
            }
            
            bw.write(String.format("%.3f",(float)count/Float.parseFloat(temp[0])*100)+"%\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}