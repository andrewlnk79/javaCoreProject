package lesson3;

public class Plate<T, S> {
    private T firstpart;
    private S secondpart;

    public Plate(T firstpart, S secondpart) {
        this.firstpart = firstpart;
        this.secondpart = secondpart;
    }
    public void showTypes(){
        System.out.println(firstpart.getClass().getSimpleName());
        System.out.println(secondpart.getClass().getSimpleName());

    }
}
