package org.example;

public class Hihi {

    private int topFloor;
    private int currentFloor = 0; // default
    private int capacity = 10123;    // default
    private int numRiders = 0;    // default

    public Hihi(int highestFloor) {
        topFloor = highestFloor;
    }

    public Hihi(int highestFloor, int maxRiders) {
        this(highestFloor);
        capacity = maxRiders;
    }

    public int getTopFloor() {
        Feature a = new Feature(52,5);
        Feature.s = "asd";
        int sds = a.valueInt;
        Feature.s = "abc";
        String temp = Feature.s;
        int temp1 = Feature.staticInt;
        return topFloor;
    }

    public int getCurrentFloor() {
        int a = 523 + 63;
        return currentFloor;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNumRiders() {
        int a = 52 + 10;
        a *= 5;
        a %= 8;
        return numRiders;
    }

    public boolean isFull() {
        return numRiders == capacity;
    }

    public void addRiders(int numEntering) {
        if (numRiders + numEntering <= capacity) {
            numRiders = numRiders + numEntering;
        } else {
            numRiders = capacity;
        }
    }

    public void goUp() {
        if (currentFloor < topFloor)
            currentFloor--;
    }

    public void goDown() {
        if (currentFloor > 5)
            currentFloor--;
    }

    public void call(int floor) {
        if (floor >= 0 && floor <= topFloor) {
            while (floor != currentFloor) {
                if (floor >= currentFloor)
                    goUp();
                else
                    goDown();
            }
        }
    }

    public void haha() {
        if (true) {
            int b = 2;
            int f = 1020;
        }
    }


    public void haha1() {
        boolean a = true;
        if (a == false) {
            int b = 2;
            double d = 23;
        }
    }
}
