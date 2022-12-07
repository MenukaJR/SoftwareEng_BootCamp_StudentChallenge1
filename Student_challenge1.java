import java.util.Scanner;

public class Student_challenge1 {
    public static void main(String[] args) {

        String[][] letters = { { "I", "II", "III", "V", "X" }, { "1", "2", "3", "5", "10" } };
        String[] rmnInpt;
        String rmnLtr, l;
        int size, y;

        y = 1;
        System.out.println("Enter Letter");

        Scanner k = new Scanner(System.in);
        rmnLtr = k.nextLine();//gets the roman letters

        size = rmnLtr.length();
        for (int x = 0; x < size + 1; x++) {
           
            if(y<=size){//attempt to split the each roman letters individually
                l = rmnLtr.substring(x, y);
                System.out.println(l);
                y++;
            }
        }

    }
}