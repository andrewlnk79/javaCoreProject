package lesson2;

public class Exeption {
    public static void main(String[] args) {
        try {
            int[] ints = new int[3];

            ints[3] = 4;
            try {
                int test = 1 / 0;
            } catch (ArithmeticException ex) {
                System.out.println("деление на 0 поймали");
                System.out.println(ints[3]);
            } }catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("поймали");
            }



    }
}
