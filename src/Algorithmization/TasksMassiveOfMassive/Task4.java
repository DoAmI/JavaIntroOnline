package Algorithmization.TasksMassiveOfMassive;
/* Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
* { 1 2 3 ... n
*   n n-1 n-2 ... 1
* */
public class Task4 {
    public static void main(String[] args) {
        forming(10);
    }
    private static void forming(int n){
        /*создание нового массива размерами n на n*/
        int[][] a = new int[n][n];

        /*перебор по 2 строки, т.к. нужны правила заполнения для 2 строк, которые потом просто повторяются*/
        for (int i = 0; i < n; i+=2) {
            for (int j = 0; j < n; j++) {
                /*в четных строках и 0 строке записать цифры от 1 до n*/
                a[i][j] = j+1;
                /*в нечетных строках записать цифры от n до 1*/
                a[i+1][j] = n-j;
                /*вывести текущую строку*/
                System.out.print(a[i][j]+" ");
            }
            /*пустой вывод на экран, чтобы не перемешивались строки*/
            System.out.println();
            for (int j = 0; j < a.length; j++) {
                /*вывести следующую строку*/
                System.out.print(a[i+1][j]+" ");
            }
            System.out.println();
        }
    }
}
