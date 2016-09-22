package shildt.aboutPolimorph;

import java.io.IOException;

/**
 * Created by Tony on 01.06.2016.
 */
public class Overload {
    public static void main(String[] args) {
        Overload test = new Overload();
//        test.method(null);
    }

    public void method(Object o) {
        System.out.println("Object");
    }

    public void method(String s) {
        System.out.println("String");
    }

    public void method(StringBuilder sb) {
        System.out.println("StringBuilder");
    }

    /*public void method(FileNotFoundException f) {
        System.out.println("FileNotFoundException");
    }*/

    public void method(IOException i) {
        System.out.println("IOException");
    }
}
