package com.genericClasses;
/*
Intermediate Level 🔥
4️⃣ Bounded Type Generic Class

Create a generic class NumericBox<T extends Number> that only accepts numeric types (Integer, Double, etc.).
Implement a method double square() that returns the square of the number.
Example: new NumericBox<>(4).square() should return 16.0.
5️⃣ Generic Stack Implementation

Implement a generic Stack<T> class with push(T item), pop(), peek(), and isEmpty().
Test it with Integer and String stacks.
6️⃣ Swapping Two Generic Objects

Create a method swap(T a, T b) that swaps two objects.
Example: swap(10, 20); should output 20, 10.
 */

public class IntermediateQuestions {
    public static void main(String[] args) {
//        Task 04
//        NumericBox<Integer> numericBoxInteger = new NumericBox<>(10);
//        System.out.println(numericBoxInteger.square());
//        NumericBox<Double> doubleNumericBox = new NumericBox<>(5.0);
//        System.out.println(doubleNumericBox.square());
//        NumericBox<Float> floatNumericBox = new NumericBox<>(3.00f);
//        System.out.println(floatNumericBox.square());

//        Task 05






    }
}
//Task 04
class NumericBox<T extends Number>{
    private T num;

    public NumericBox(T num) {
        this.num = num;
    }
    public double square(){
        return num.doubleValue() * num.doubleValue();
    }
}

/*Task 05
5️⃣ Generic Stack Implementation

Implement a generic Stack<T> class with push(T item), pop(), peek(), and isEmpty().
Test it with Integer and String stacks.
 */
class Stack<T>{

}

