package shildt.aboutString.String5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UseTrim {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter 'stop' to finish");
        System.out.println("Enter state: ");
        while (!(str = br.readLine()).equals("stop")) {
            str = str.trim();
            if (str.equals("Illinoise"))
                System.out.println("Capital - Springfield.");
            else if (str.equals("Missury"))
                System.out.println("Capital - Jephersone-city");
            else if (str.equals("California"))
                System.out.println("Capital - Sacramento");
            //...
        }
    }
}
