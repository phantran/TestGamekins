package org.example;

public class SimpleExample {

    private Integer index;

    public SimpleExample(Integer index) {
        this.index = index;
    }

    public void doStuff(int i, double x) {
        double t = i + x;
    }

    public void doFoo(Integer x, String s, double d, boolean b) {
        if (x != null) {
            double dd = x + d + 2;
        }
    }

    public int simple(int x) {
        if (x < 12) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "SimpleExasdfasdfmple";
    }
}
