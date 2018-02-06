package oop.bad.ocp;

import lombok.Getter;
import lombok.Setter;

/**
 * @author ек╥Е
 * @date 06/02/2018 8:34 PM
 */
@Getter
@Setter
public class Apple {

    private String name;

    private float price;


    public static float getPrice() {
        return 3f;
    }

}
