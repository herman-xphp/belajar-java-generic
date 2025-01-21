package muslim.dev.generic.application;

import muslim.dev.generic.util.ArrayHelper;

public class ArrayHelperApp {

    public static void main(String[] args) {

        String[] names = { "Herman", "Rahmat", "Sandi" };
        Integer[] number = { 1, 3, 5, 6, 3, 2, 5, 7, 7 };

        System.out.println(ArrayHelper.count(names));
        System.out.println(ArrayHelper.count(number));
    }
}
