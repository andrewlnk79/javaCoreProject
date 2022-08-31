package lesson3;

public class Cup<T extends Liquid> {
    private T Liquid;

    public Cup(T liquid) {
        this.Liquid = liquid;

    }
    public T getLiquid(){
        return Liquid;
    }
}
