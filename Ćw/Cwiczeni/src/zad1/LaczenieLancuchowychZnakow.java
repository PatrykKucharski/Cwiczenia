package zad1;
import java.util.Scanner;

public class LaczenieLancuchowychZnakow {
    public static void main(String[] args) {
        String znak1;
        String znak2;

        Scanner pobznak1 = new Scanner(System.in);
        System.out.println("Podaj pierwszy cią znaków: ");
        znak1 = pobznak1.next();

        Scanner pobznak2 = new Scanner(System.in);
        System.out.println("Podaj drugi cią znaków: ");
        znak2 = pobznak2.next();
        System.out.println();

        System.out.println(znak1+"+" +znak2+ "=" +znak1.concat(znak2));
        System.out.println(znak2+"+" +znak1+ "=" +znak2.concat(znak1));

        if(znak1.equals(znak2)){
            System.out.println("Skadnie dwóch znaków są naprzemienne");
        }
        else
        {
            System.out.println("Skadnie dwóch znaków nie są naprzemienne");
        }
    }

}
