package oop.good.ocp;


import java.util.ArrayList;
import java.util.List;

/**
 * @author 潘峰
 * @date 06/02/2018 8:48 PM
 */
public class ShopCart {
    /**
     * 针对接口编程而不是实现编程
        对扩展开放，对修改关闭
     */

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
