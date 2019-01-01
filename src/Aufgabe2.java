import java.util.ArrayList;

public class Aufgabe2 {
    public static void main (String[]args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i < 11; i++){
            list.add(i);
        }
        for(Integer object: list) System.out.println(object);


        Integer[] int1 = new Integer[]{1,2,3,4,5,6,7,8};
        for(Integer object: int1) System.out.println(object);
    }
}
