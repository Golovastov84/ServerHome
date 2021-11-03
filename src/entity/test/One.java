package entity.test;

public class One {
    void method(){

    }
}
class Two extends One {
    //void method(int i) {} //Не верно
    //int method() {}//Не верно
    //void method() {} //верно
    //public void method() {} //верно
    //private void method() {} //Не верно
    protected void method() {} //верно

}
