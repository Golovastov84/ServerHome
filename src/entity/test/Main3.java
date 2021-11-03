package entity.test;

class Animal {
    Number defineAge() {
        System.out.println("I'm a big animal");
        return 10;
    }
}
class Dog extends Animal {
    /*protected Number defineAge() {
        System.out.println("I'm small");
        return 5;
    }*///Верно
    /*public Integer defineAge(int age) {
        System.out.println("I'm not so big");
        return 5;*///Верно
    /*public Integer defineAge() {
        System.out.println("I want to be big");
        return 5;*///Верно
    /*private Number defineAge() {
        System.out.println("I want to be big");
        return 5;*///Не верно
    /*protected Float defineAge (float f) {
        System.out.println("I want to be bigger");
        return 5f;*///Верно
    Float defineAge () {
        System.out.println("I want to be bigger");
        return 5f;//Верно
    }
}
public class Main3 {
    public static void main(String[] args) {
        Animal a = new Dog();
        System.out.println(a.defineAge());
    }
}
