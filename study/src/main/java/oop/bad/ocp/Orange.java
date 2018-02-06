package oop.bad.ocp;

import lombok.Getter;
import lombok.Setter;

/**
 * @author ек╥Е
 * @date 06/02/2018 8:33 PM
 */
@Getter
@Setter
public class Orange {
    private String name;
    private float price;

    public static float getPrice() {
        return 4f;
    }

}
