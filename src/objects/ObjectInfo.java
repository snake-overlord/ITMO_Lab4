package objects;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ObjectInfo {
    public static void analyzeClass(Object o) {
        Class c = o.getClass();
        System.out.println("Имя класса: " + c);
        System.out.println("Поля класса: " + Arrays.toString(c.getDeclaredFields()));
        System.out.println("Закрытые поля: " + Arrays.toString(c.getDeclaredFields()));
        System.out.println("Методы класса: " +  Arrays.toString(c.getDeclaredMethods()));
        System.out.println("Конструкторы класса: " + Arrays.toString(c.getConstructors()));
        System.out.println("Суперкласс: " + c.getSuperclass());
    }

    public static void getSecretInfo() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
     Method secret = Obj.class.getDeclaredMethod("secretInfo");
     secret.setAccessible(true);
     secret.invoke(new Object());
    }

}
