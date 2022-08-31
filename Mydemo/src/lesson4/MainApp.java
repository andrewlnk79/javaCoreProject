package lesson4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainApp {


    public static void main(String[] args) {
        ArrayList<String> listOfStrings = new ArrayList<>();

        ArrayList<Integer> listOfInts = new ArrayList<>();


        listOfInts.add(1);
        listOfInts.add(2);
        listOfInts.add(3);
        listOfInts.add(1,5);
        ArrayList<Integer> secondlistOfInts=new ArrayList<>(15);
        for (Integer seconlist:secondlistOfInts){
            System.out.println(seconlist);
        }


//        for (int i = 0; i < listOfInts.size(); i++) {
//            System.out.println(listOfInts.get(i));

            for (Integer integer:listOfInts){
                System.out.println(integer);


        }
        System.out.println();
            listOfInts.remove(1);
            for (Integer integer:listOfInts){
                System.out.println(integer);
            }






Integer[] integers= new Integer[listOfInts.size()];
listOfInts.toArray(integers);

        HashMap<Integer, String> hm= new HashMap<>();
        hm.put(1, "qwerty");
        hm.put(245,"asdfgh");

      String s2=  hm.get(2);
        System.out.println(s2);

      for (Map.Entry<Integer,String> entry: hm.entrySet()){
          System.out.println(entry.getKey());
          System.out.println(entry.getValue());
      }



            }
        }






