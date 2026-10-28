package Sintaxe;

public class tiposWrappers {
    static void main(String[] args) {
        Double numeroDouble = 123.56;
        Integer numeroInt = numeroDouble.intValue();
        System.out.println(numeroInt);

        String num = "100";
        int i = Integer.parseInt(num);
        System.out.println(i);

        Integer obj1 = Integer.valueOf("578");
        Integer obj2 = Integer.valueOf("578");
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.compareTo(obj2));

    }
}
