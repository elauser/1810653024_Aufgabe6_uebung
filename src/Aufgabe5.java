public class Aufgabe5 {
    public static void main(String[]args){
        int length = 20;
        int height = 10;
        Integer[][] list = new Integer[length][height];

        int counter = 0;
        for(int i = 0; i < length; i++){
            for(int j = 0; j < height; j++){
                list[i][j] = counter++;
                System.out.println(list[i][j]);
            }
        }

    }
}
