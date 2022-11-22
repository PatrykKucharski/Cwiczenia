package zad1;
import java.util.Random;



public class ZadanieMiniMax {
    public static  void  main(String[] args){
        int[] tablicaKucharski = new int[10];
        Random rKucharski = new Random();
        int LiczbaKucharski = rKucharski.nextInt(1,100);

        for (LiczbaKucharski=0; LiczbaKucharski< tablicaKucharski.length; LiczbaKucharski++){
            tablicaKucharski[LiczbaKucharski] = rKucharski.nextInt(100);

        }

        for(int PK: tablicaKucharski) {
            System.out.println(PK);

        }

        int maxKucharski= tablicaKucharski[0];
        for(LiczbaKucharski=0; LiczbaKucharski< tablicaKucharski.length; LiczbaKucharski++)
        {
            if (tablicaKucharski[LiczbaKucharski] > maxKucharski)
                maxKucharski=tablicaKucharski[LiczbaKucharski];
        }
        System.out.println();
        System.out.println("Liczba max:" + maxKucharski);

        int minKucharski = tablicaKucharski[0];
        for(LiczbaKucharski=0; LiczbaKucharski< tablicaKucharski.length; LiczbaKucharski++)
        {
            if (tablicaKucharski[LiczbaKucharski] < minKucharski)
                minKucharski=tablicaKucharski[LiczbaKucharski];
        }
        System.out.println("Liczba ,in:" + minKucharski);
    }
}
