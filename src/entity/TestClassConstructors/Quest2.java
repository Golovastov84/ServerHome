package entity.TestClassConstructors;

 class A2 {
     A2(int i){
         System.out.println("Constructor A");
        }
}
public class Quest2 extends A2{
     public static void main(String[] args) {
         Quest2 quest2 = new Quest2();
         //1
     }
     public Quest2(){
         super(2);
         //2
     }
     public void show2(){
         //3
     }
     }