package shildt.aboutGeneric.Generic18.Arrays;

public class GenArray {
    public static void main(String[] args) {
        Integer nums [] = {1, 2, 3, 4, 5};

        GenNum<Integer> iOn = new GenNum<>(50, nums);

        /*GenNum<Integer> gens[] = new GenNum<Integer>[10];*/ //unacceptable

        GenNum<?> gens[] = new GenNum<?>[10]; //OK
    }
}
