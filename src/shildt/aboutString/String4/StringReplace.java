package shildt.aboutString.String4;

public class StringReplace {
    public static void main(String[] args) {
        String org = "This is a test. This is, too.";
        String search = "is";
        String sub = "was";
        String result = "";
        int i;
        while ((i = org.indexOf(search)) != -1) {
            System.out.println(org);
            result = org.substring(0, i);
            result += sub;
            result += org.substring(i + search.length());
            org = result;
        }
    }
}
