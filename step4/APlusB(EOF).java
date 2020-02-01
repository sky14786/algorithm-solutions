import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String temp = "";
        while((temp = br.readLine()) !=null){
            String[] tempArr = temp.split(" ");
            bw.write((Integer.parseInt(tempArr[0])+Integer.parseInt(tempArr[1]))+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}