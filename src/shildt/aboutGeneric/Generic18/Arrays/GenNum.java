package shildt.aboutGeneric.Generic18.Arrays;

public class GenNum<T extends Number> {
    T ob;

    T vals[];

    GenNum(T ob, T[] nums) {
        this.ob = ob;

        /*this.vals = new T[10];*/ //unacceptable

        this.vals = nums;
    }
}
