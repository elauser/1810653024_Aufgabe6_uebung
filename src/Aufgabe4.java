import java.util.ArrayList;
import java.util.Random;
public class Aufgabe4 {
    public static void main(String[]args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random zufall = new Random();
        int f = zufall.nextInt();
        for(int i = 0; i < f; i++){
            list.add(i);
        }
        for(Integer object: list){
            System.out.println(object);
        }
        zufall = new Random(); // neues Random Objekt, namens zufall

        System.out.println(zufall.nextInt()); //Der Rückgabewert der Methode
    }
}
