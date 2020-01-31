package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;

class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i = 1 ; i <= n ;i++){
            bw.write(i+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
        
    }
}