package oop.bad.ocp;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ек╥Е
 * @date 06/02/2018 8:36 PM
 */
public class ShopCart {

    List items = new ArrayList();

    public void addApple(Apple apple) {
        items.add(apple);
    }

    public void addOrange(Orange orange) {
        items.add(orange);
    }

    public float calcutePrice() {
        float count=0f;
        for (Object item : items) {
            if (item instanceof Apple) {
                count += Apple.getPrice();
            }
            if (item instanceof Orange) {
                count += Orange.getPrice();
            }
        }
        return count;
    }

}
