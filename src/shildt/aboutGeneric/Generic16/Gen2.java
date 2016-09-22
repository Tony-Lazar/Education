package shildt.aboutGeneric.Generic16;

public class Gen2 extends Gen<String> {
    public Gen2(String ob) {
        super(ob);
    }

    @Override
    public String getOb() {
        System.out.println("Called String getOb(): ");
        return ob;
    }
}
