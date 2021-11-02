package entity.test;

class Quest {
    private void show(int i){
        System.out.println("1");
    }
}
class Example extends Quest {
    public void show(int i) {
        System.out.println("2");
    }

    public static void main(String[] args) {
        Quest quest = new Example();//1
        int i = '1';//2
        ((Example) quest).show(i);//3
    }
}
