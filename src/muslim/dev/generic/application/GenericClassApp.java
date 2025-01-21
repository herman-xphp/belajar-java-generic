package muslim.dev.generic.application;

import muslim.dev.generic.MyData;

public class GenericClassApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<String>("Hello");
        String valueString = stringMyData.getData();

        System.out.println(valueString);
    }
}
