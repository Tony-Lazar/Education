package shildt.aboutRuntime.OpenAnotherPrograms;

public class ExecDemo {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        Process p = null;
        try {
            p = r.exec("notepad");
            Thread.sleep(1000);
            p.destroy();
            System.out.println(p.exitValue());
        } catch (Exception e) {
            System.out.println("Error during load notepad");
        }
    }
}
