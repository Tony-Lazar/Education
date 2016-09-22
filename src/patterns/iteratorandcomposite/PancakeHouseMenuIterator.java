package patterns.iteratorandcomposite;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenuIterator implements Iterator<MenuItem> {
    private ArrayList<MenuItem> items;
    private int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    @Override
    public MenuItem next( ) {
        return items.get(position++);
    }

    @Override
    public boolean hasNext( ) {
        if (position >= items.size() || items.get(position) == null)
            return false;
        else
            return true;
    }
}
