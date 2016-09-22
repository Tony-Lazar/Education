package forExample.DenTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double sum, per, lim, term;
        sum =   Double.parseDouble(br.readLine());
        per =     Double.parseDouble(br.readLine());
        lim =     Double.parseDouble(br.readLine());
        term =  0;

        while(sum < lim) {
            sum += per / 100 * sum;

            double temp = sum - (int)sum;
            temp = (int)(temp * 100);

            sum = (int)sum + temp / 100;

            term++;
        }
        System.out.println("term = " + term);
        System.out.println("sum = " + sum);
    }
}
