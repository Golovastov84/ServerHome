    package Learn.superPack.subPack;
    import Learn.superPack.*;
public class SubClass extends SuperClass {
        public static void main(String[] args) {
            SuperClass superObj = new SubClass();
            SubClass subObj = new SubClass();
        }

        void subMethod(SubClass obj) {
            obj.superMethod();
            int i;
            i = obj.superVar;
        }
    }

