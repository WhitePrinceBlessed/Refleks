package org.example;

// не хватило воображения на разнообраные методы (можно добавить сюда ещё методов, но не придумал каких)
public class MyClass {
    @MyAnnotation(2)
    public void publicMethod(String message) {
        System.out.println("Публичный метод " + message);
    }

    @MyAnnotation(2)
    protected void protectedMethod(String message) {
        System.out.println("Защищённый метод " + message);
    }

    @MyAnnotation(2)
    private void privateMethod(String message) {
        System.out.println("Приветный Метод " + message);
    }
}
