package patterns.iteratorandcomposite;

import java.util.Iterator;

public class Waitress {
    private DinerMenu        dinerMenu;
    private PancakeHouseMenu pancakeHouseMenu;

    public Waitress(DinerMenu dinerMenu, PancakeHouseMenu pancakeHouseMenu) {
        this.dinerMenu = dinerMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
    }

    public void printMenu( ) {
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.iterator();
        Iterator<MenuItem> dinerIterator   = dinerMenu.iterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem item = iterator.next();
            System.out.print(item.getName() + ", ");
            System.out.print(item.getPrice() + " -- ");
            System.out.println(item.getDescription());
        }
    }

    public static class MenuTestDrive {
        public static void main(String[] args) {
            DinerMenu        dinerMenu        = new DinerMenu();
            PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();

            Waitress waitress = new Waitress(dinerMenu, pancakeHouseMenu);
            waitress.printMenu();
        }
    }
}
