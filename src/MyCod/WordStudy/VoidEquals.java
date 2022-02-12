package MyCod.WordStudy;

import java.math.BigDecimal;

public class VoidEquals {
    public static void main(String[] args) {
        double value1 = 2.0 - 1.1;
        double value2 = 0.9;
        System.out.println(value1);
        boolean comparison = Math.abs(value1 - value2) < 0.000_000_000_000_001;
        System.out.println(comparison);
        System.out.printf("%b-%s%n",comparison,value1);

        BigDecimal b1 = new BigDecimal("23.43");
        BigDecimal b2 = new BigDecimal("23.43");
        BigDecimal b3 = new BigDecimal("24");
        System.out.println("1 " + (b1.compareTo(b2) == 0)); //1
        System.out.println(b1.compareTo(b2));
        System.out.println("2 " + (b1.compareTo(b3) == 1)); //2
        //System.out.println(b1.compareTo(b3));
        System.out.println("3 " + (b1.equals(b2))); //3
        System.out.println("4 " + (b1.equals(new BigDecimal("23.43")))); //4
        //System.out.println(new BigDecimal("23.43"));
        System.out.println("5 " + (b1 == b2)); //5
        b2 = b2.add(new BigDecimal("0.57"));
        System.out.println("6 " + (b3.equals(b2))); //6

    }
}
