package Tests.tryblock;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test {
    public static void main(String[] args) throws IOException {
        try(InputStream is = new BufferedInputStream(System.in)) {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        }
    }
}
