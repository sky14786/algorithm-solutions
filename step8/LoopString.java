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
            String[] tempWord = temp[1].split("");
            for(int j = 0 ; j < tempWord.length ; j++){
                for(int z = 0 ; z < Integer.parseInt(temp[0]) ; z++){
                    bw.write(tempWord[j]);
                }
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }   
}