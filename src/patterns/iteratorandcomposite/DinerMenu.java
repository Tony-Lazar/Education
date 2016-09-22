package patterns.iteratorandcomposite;

import java.util.Iterator;

public class DinerMenu implements Iterable<MenuItem> {
    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat", 2.99, true);
        addItem("BLT",
                "Bacon with lettuce & tomato on whole wheat", 2.99, false);
        addItem("Soup of the day",
                "Soup of the day, with a side of potato salad", 3.29, false);
        addItem("Hotdog",
                "A hot dog, with saurkraut, relish, onions, topped with cheese", 3.05, false);

    }

    public void addItem(String name, String description, double price, boolean vegetarian) {
        MenuItem menuItem = new MenuItem(name, description, price, vegetarian);
        if (numberOfItems >= MAX_ITEMS)
            System.err.println("Sorry, menu is full! Can't add item to menu");
        else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    @Override
    public Iterator<MenuItem> iterator( ) {
        return new DinerMenuIterator(menuItems);
    }
}
