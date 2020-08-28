package examples.lesson2;

import java.util.List;

public class A extends B implements I {
    public static final String s = "ABC";

    public static void printHi(){
        System.out.println(s);
    }

    private final int intData;
    private final String stringData;

    public A(int intData) {
        this(intData, "");
    }

    public A(int intData, String stringData) {
        this.intData = intData;
        this.stringData = stringData;
    }

    public int getIntData() {
        if (intData > 5)
            return intData;
        return 0;
    }

//    public void setIntData(int intData) {
//        this.intData = intData;
//    }

    public String getStringData() {
        return stringData;
    }

    @Override
    public void printData() {
        System.out.println("string = " + stringData + " int = " + intData);
    }

//    public void setStringData(String stringData) {
//        this.stringData = stringData;
//    }
}
