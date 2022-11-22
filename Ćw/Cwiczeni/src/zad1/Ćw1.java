package zad1;

public class Ćw1 {
    public static void main(String[] args) {

        int [] tablicaKucharski = new int[10];

        for (int i = 0; i< tablicaKucharski.length; i++){
            tablicaKucharski [i] = 9-i;
        }

        for(int PK: tablicaKucharski){
            System.out.println(PK);
        }
    }

}

