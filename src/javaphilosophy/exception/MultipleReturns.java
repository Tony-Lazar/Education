package javaphilosophy.exception;

public class MultipleReturns {
    public static void f(int i) {
        System.out.println("Initialization, needs to be finished");
        try {
            switch (i) {
                case 1:
                    System.out.println("point 1");
                    return;
                case 2:
                    System.out.println("point 2");
                    return;
                case 3:
                    System.out.println("point 3");
                    return;
            }
        } finally {
            System.out.println("Finish");
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            f(i);
        }
    }
}
