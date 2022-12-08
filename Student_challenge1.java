import java.util.Scanner;

public class Student_challenge1 {
    public static void main(String[] args) {

        String[] letters = {"I","1","II","2","III","3","V","5","X","10"};
        int[] rmnConv;
        String rmnLtr, l;
        int size, y,odIndex;

        y = 1;
        System.out.println("Enter Letter");

        Scanner k = new Scanner(System.in);
        rmnLtr = k.nextLine();// gets the roman letters
        k.close();

        size = rmnLtr.length();
        rmnConv = new int[size];
        for (int x = 0; x < size + 1; x++) {

            if (y <= size) {// attempt to split the each roman letters individually
                l = rmnLtr.substring(x, y);

                y++;

                for (int p = 0; p <= letters.length; p++) {// trying to compare the splitted letters with their
                                                            // matching number from the multiDem. array
                    // String check = letters[0][p];
                    //System.out.println(p);
                    //if(p%2!= 0){//check if the "p" variable is Odd or not
                    
                    if(p<=9){
                    if(l.equals(letters[p])){
                            System.out.println(letters[p+1]);
                        }
                    }
                    //}
                    
                }
            }

            /*  for (int u = 0; u <= letters.length - 1; u++) {
                System.out.println(letters[u][u]);
            }*/

        }
    }
}