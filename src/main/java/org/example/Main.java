package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
    }

    public int haha() {
        if (true) {
            int b = 2;
        }

        int c = 5;
        c = c + 51;
        if (c == 1) {
            c = 5;
        }
        return c--;
    }


    public void haha1() {
        boolean p = true;
        int c = 4;
        if (p == false) {
            int b = 5   + c--;
        }
    }
}
