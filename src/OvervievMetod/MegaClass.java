package OvervievMetod;

public class MegaClass {
    public String toString(){
        return getClass().getSimpleName();
    }
    public static void main(String[] args) {
        BasicClass basicClass = new BasicClass();
        System.out.println(basicClass.toString());
    }
}
class SuperClass extends MegaClass{}
class BasicClass extends SuperClass{}
