package entity.TestClassConstructors;

 class A4 {
     private A4 (int length) {}
     A4 (String str){}
}
class B4 extends A4 {
     public B4() {
         // Line 0
         //this();//No correct
         //this(100);//No correct
         //this("");//correct
         super("");
     }
     public B4 (String str) {
         super(str);
     }
}