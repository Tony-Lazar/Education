package shildt.aboutAnnitations.Annotations1;
import java.lang.reflect.*;

public class Meta {
    @MyAnno(str = "Annotation example", val = 100)
    public static void myMeth(){
        Meta ob = new Meta();

        try  {
            Class c = ob.getClass();
            Method m = c.getMethod("myMeth");
            MyAnno anno = m.getAnnotation(MyAnno.class);

            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}