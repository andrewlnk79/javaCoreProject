package lesson3;

public class Main {
    public static void main(String[] args) {
        Water water=new Water();
        Cup<Water> waterCup=new Cup(water);
        Tea tea=new Tea();
        Cup<Tea> teaCup=new Cup<>(tea);
        tea=teaCup.getLiquid();
        System.out.println(teaCup.getLiquid().getClass().getSimpleName());
        System.out.println(waterCup.getLiquid().getClass().getSimpleName());
        Meat meat=new Meat();
        Vegetables vegetables=new Vegetables();
        Plate<Meat,Vegetables> plate=new Plate<>(meat,vegetables);
        plate.showTypes();

        Coffe coffe=new Coffe();
        Plate<Coffe,Tea> secondPlate= new Plate<>(coffe,tea);
        secondPlate.showTypes();








    }
}
