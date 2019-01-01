import javax.swing.*;

public class Aufgabe1 {
    public static void main(String[]args){
        String String1 = JOptionPane.showInputDialog("Geben Sie den ersten String ein");
        String String2 = JOptionPane.showInputDialog("Geben Sie den zweiten String ein");
        String String3 = JOptionPane.showInputDialog("Geben Sie den dritten String ein");

        String1 = String1.substring(0, 3);
        String2 = String2.substring(0, 3);
        String3 = String3.substring(0,3);

        if(String1.equals(String2)&&String2.equals(String3)) System.out.println("String 1 = String 2 = String3");
        else if(String1.equals(String2)) System.out.println("String 1 = String 2");
        else if(String1.equals(String3)) System.out.println("String 1 = String 3");
        else if(String2.equals(String3)) System.out.println("String 2 = String 3");
        else System.out.println("Keine Übereinstimmung");

    }
}
