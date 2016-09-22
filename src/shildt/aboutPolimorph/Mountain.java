package shildt.aboutPolimorph;

/**
 * Created by Tony on 01.06.2016.
 */
public class Mountain {
    static String name = "Himalaya";
    static Mountain getMountain() {
        System.out.println("Gerring Name ");
        return  null;
    }

    public static void main(String[] args) {
        System.out.println(getMountain().name);
    }
}
