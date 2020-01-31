package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;

class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] temp = br.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        int x = Integer.parseInt(temp[1]);

        String[] tempArr = br.readLine().split(" ");
        for(int i = 0 ; i < n ; i++){
            if(Integer.parseInt(tempArr[i]) < x){
                bw.write(tempArr[i] + " ");
            }
        }        
        bw.flush();
        bw.close();
        br.close();
        
    }
}