package Algorithmization.TasksMassiveOfMassive;
/*Сформировать квадратную матрицу порядка N по правилу:
* A(i,j) = sin(i^2-j^2)/N
*
* */
public class Task7 {

    public static void main(String[] args) {
        mathMatrix(9);
    }
    private static void mathMatrix(int n){
        double[][] a = new double[n][n];
        /*counter для подсчета положительных чисел*/
        int counter = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                /*вычисление a[i][j]*/
                a[i][j] = Math.sin((i*i-j*j)/n);
                /*положительные увеличивают counter*/
                if (a[i][j]>0)
                    counter++;
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("количество положительных чисел в матрице "+counter);
    }
}
