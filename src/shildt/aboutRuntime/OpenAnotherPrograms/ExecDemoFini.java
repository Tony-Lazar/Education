package shildt.aboutRuntime.OpenAnotherPrograms;

public class ExecDemoFini {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        Process p = null;
        try {
            p = r.exec("notepad");
            p.waitFor();
        } catch (Exception e) {
            System.out.println("Error during load notepad");
        }
        System.out.println("Notepad return: " + p.exitValue());
    }
}
