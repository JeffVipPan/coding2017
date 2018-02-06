package oop.good.ocp;


import java.util.ArrayList;
import java.util.List;

/**
 * @author ек╥Е
 * @date 06/02/2018 8:48 PM
 */
public class ShopCart {
    List<Fruit>  items = new ArrayList();

    public void addItem(Fruit fruit) {
        items.add(fruit);
    }

    public float calcutePrice() {
        float count=0f;
        for (Fruit item : items) {
            count += item.getCount();
        }
        return count;
    }
}
