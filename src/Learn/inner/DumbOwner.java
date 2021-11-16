package Learn.inner;

public class DumbOwner {
    private int id; // поле основного класса
    private int koeff; // поле основного класса
    public class DumberInner {
        private int id; // поле внутреннего класса
        public void setId(int id) { // метод с локальной переменной id
            this.id = id + DumbOwner.this.id * koeff; // this.id - указывает на поле под класса
            // DumbOwner.this.id - указывает на поле основного класса
            // лучше их именовать по разному например id и out
            // ссылка на koeff можно так, а можно DumbOwner.this.koeff
        }
    }
}
