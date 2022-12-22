package prac3;

public class task2_1 {
    public static void main(String[] args) {
        Double d1 = Double.valueOf("3.14");
        System.out.println(d1);
        d1 = Double.parseDouble("12.34");
        double d = d1;
        float f = d1.floatValue();
        byte b = d1.byteValue();
        short sh = d1.shortValue();
        int i = d1.intValue();
        long l = d1.longValue();
        System.out.println(d+" "+f+" "+b+" "+sh+" "+i+" "+l);

        Boolean bl1;
        Byte b1;
        Character c1;
        Float f1;
        Integer i1;
        Long l1;
        Short sh1;
    }
}
