package OvervievMetod;

public class Program {
    public static void main(String[] args) {
        Object obj = new Object();
        Class clazz = obj.getClass();
        System.out.print(clazz.getSuperclass() + ", ");
        Class clazzClazz = clazz.getClass();
        System.out.print(clazzClazz.getSuperclass());
    }
}
