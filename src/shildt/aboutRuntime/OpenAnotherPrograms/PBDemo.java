package shildt.aboutRuntime.OpenAnotherPrograms;

public class PBDemo {
    public static void main(String[] args) {
        try {
            ProcessBuilder proc = new ProcessBuilder("notepad", "D:\\Programming\\Java\\Education\\Shild\\binaryOperators\\src\\shildt\\aboutRuntime\\OpenAnotherPrograms\\testfile");
            proc.start();
        } catch (Exception e) {
            System.out.println("Error during load notepad.");
        }
    }
}
