package zad1;

public class TablicaDwuwymiarowa {
    public static  void main(String[] args) {
        int a,b;
        int matrix[][] = new int[10][10];

        for(a=0; a<10; ++a)
        {
            for(b = 0; b <10; ++b)
            {
                matrix[1][1]= 1;
                matrix[2][2]= 2;
                matrix[3][3]= 3;
                matrix[4][4]= 4;
                matrix[5][5]= 5;
                matrix[6][6]= 6;
                matrix[7][7]= 7;
                matrix[8][8]= 8;
                matrix[9][9]= 9;

                System.out.println(matrix[a][b] + "  ");
            }
            System.out.println();
        }
        int z,x;
        int suma = 0;

        for(z=0; z<a; z++)
            for(x=0; x<a; x++)
                if(z==x)
                    suma += matrix[z][x];
        System.out.println();
        System.out.println( "suma:" + suma);
    }
}
