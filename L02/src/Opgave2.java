public class Opgave2 {
    public static void main(String[] arg) {
        String ord1 = "Datamatiker";
        String ord2 = "Uddannelsen";
        String ord3 = ord1 + ord2.toLowerCase();

        String upper = ord1.toUpperCase();
        String lower = ord2.toLowerCase();

        System.out.println(upper);
        System.out.println(lower);
        System.out.println(ord1 + " " + ord2);
        System.out.println(ord3.length());

        System.out.println(ord1.substring(0, 7));
        System.out.println(ord2.substring(3, 7));
        System.out.println(ord3.substring(ord3.length() / 2));


    }
}
