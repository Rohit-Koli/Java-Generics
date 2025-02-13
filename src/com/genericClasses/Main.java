package com.genericClasses;

public class Main {
    public static void main(String[] args) {
        Box<Integer> intgerBox = new Box<>(10);
        System.out.println("Integer Box Value :"+intgerBox.getVal());

        Box<String> stringBox = new Box<>("BOX");
        System.out.println("String Box :"+stringBox.getVal());
    }
}

//T Demonstrate the type of Class that can Hold
class Box<T>{

    private T val;
    public Box(T val) {
        this.val = val;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }
}
