package OrientaçãoaObjetos.Equals;

public class Comparações {
    public static void main(String[] args) {
        Integer i1 = 10;
        Integer i2 = Integer.parseInt("11");
        System.out.println(i1.equals(i2));

        String string = "LEO";
        String string2 = new String("LiO");
        System.out.println(string.equals(string2));
    }
}
