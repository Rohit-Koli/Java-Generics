package com.genericMethods;

class Container<T> {
    private T item;

    public Container(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public static <T> Container<T> createContainer(T item) {
        return new Container<>(item);  // ✅ Allowed
    }

    public static void main(String[] args) {
        // Creating a Container<Integer>
        Container<Integer> intContainer = createContainer(100);
        System.out.println(intContainer.getItem()); // Output: 100

        // Creating a Container<String>
        Container<String> strContainer = createContainer("Hello");
        System.out.println(strContainer.getItem()); // Output: Hello
    }
}
