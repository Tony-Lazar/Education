package shildt.aboutGeneric.Generic6;

public class BoundedWildcard {
    static void showXY(Coords<? extends TwoD> c) {
        System.out.println("X Y coordinates: ");

        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y);
        }
        System.out.println();
    }

    public static void showXYZ(Coords<? extends ThreeD> c) {
        System.out.println("X Y Z coordinates: ");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " +
                               c.coords[i].y + " " +
                               c.coords[i].z);
        }
        System.out.println();
    }

    public static void showAll(Coords<? extends FourD> c) {
        System.out.println("X Y Z T Coordinates: ");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " +
                              c.coords[i].y + " " +
                              c.coords[i].z + " " +
                              c.coords[i].t);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TwoD td[] = {
                new TwoD(0, 0),
                new TwoD(7, 9),
                new TwoD(18, 4),
                new TwoD(-1, -2)
        };

        Coords<TwoD> tdlocs = new Coords<>(td);

        System.out.println("tdlocs content: ");
        showXY(tdlocs);

        FourD fd[] = {
                new FourD(1, 2, 3, 4),
                new FourD(6, 8, 14, 8),
                new FourD(22, 9, 4, 9),
                new FourD(3, -2, -23, 17)
        };


        Coords<FourD> fdlocs = new Coords<>(fd);
        showXY(fdlocs);
        showXYZ(fdlocs);
        showAll(fdlocs);
    }
}
