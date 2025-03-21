package org.example;
import java.lang.reflect.Method;

public class Main {
    public static void invokeMethods(Object obj, String message) throws Exception{
        Method[] methods = obj.getClass().getDeclaredMethods();
        for (Method method : methods) {
            if ( method.isAnnotationPresent(MyAnnotation.class)){
                MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);

                int result = myAnnotation.value();

                method.setAccessible(true);

                for (int i = 0; i < result; i++) {
                    method.invoke(obj, message);
                }
            }
        }
    }
    public static void main(String[] args){
        try {
            MyClass myClass = new MyClass();
            String message = "Hello World!";

            invokeMethods(myClass, message);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}