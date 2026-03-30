
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

import java.io.*;

public class takeInputWithoutScanner {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr =new InputStreamReader(System.in);

        BufferedReader br=new BufferedReader(isr);
        System.out.println("enter the name:");
        String name =br.readLine();
        System.out.println("Name ="+name);

    }
}
