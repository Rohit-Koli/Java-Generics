package com.genericClasses;

public class BeginnerQuestions {
    /*
     1️⃣Create a Generic Class

        Write a generic class Container<T> that stores a value of any type.
        Add methods setValue(T value) and T getValue().
        Test it with Integer and String.
    2️⃣ Generic Pair Class

    Create a generic class Pair<T, U> that stores two values of different types.
    Implement getFirst(), getSecond(), and displayPair().
    Example: Pair<Integer, String> p = new Pair<>(1, "One");

    3️⃣ Box with Default Value

    Modify Box<T> so that if no value is set, it returns a default value.
    Example: If Box<Integer> is empty, return 0.
     */
    public static void main(String[] args) {
        //Task -1
//        Container<Integer> integerContainer = new Container<>(10);
//        System.out.println("Integer Container Contains :"+integerContainer.getVal());
//
//        Container<String> stringContainer = new Container<>("Rohit");
//        System.out.println("String Container contains "+stringContainer.getVal());

//        Task -02
//        Pair<Integer,String> pair = new Pair<>(10,"Rohit");
//        System.out.println(pair.getxVal());
//        System.out.println(pair.getyVal());

//        Task -03
//        EmptyBox<String> emptyBox = new EmptyBox<>("Default Val");
//        System.out.println(emptyBox.getVal());
//        emptyBox.setVal("ROHIT");
//        System.out.println(emptyBox.getVal());
    }
}

//Task -1 Class
class Container<T>{
    private T val;

    public Container(T val) {
        this.val = val;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }
}

//Task -02 Class
class Pair<X,Y>{
    private X xVal;
    private  Y yVal;

    public Pair(X xVal,Y yVal) {
        this.xVal = xVal;
        this.yVal = yVal;
    }

    public X getxVal() {
        return xVal;
    }

    public void setxVal(X xVal) {
        this.xVal = xVal;
    }

    public Y getyVal() {
        return yVal;
    }

    public void setyVal(Y yVal) {
        this.yVal = yVal;
    }
}
//    Task -03 Class
class EmptyBox<T>{
    T val;
    T defaultValue;

    public EmptyBox(T defaultValue) {
        this.defaultValue = defaultValue;
        this.val = null;
    }

    public T getVal() {
        return (val!=null)?val:defaultValue;
    }

    public void setVal(T val) {
        this.val = val;
    }
}