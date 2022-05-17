package Algorithmization.TasksMassiveOfMassive;
/*Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
* { 1 1 1 1 1 ... 1 1
*   0 1 1 1 1 ... 1 0
*   0 0 1 1 1 ... 0 0
* ...................
*   0 1 1 1 1 ... 0 1
*   1 1 1 1 1 ... 1 1
* */
public class Task6 {
    public static void main(String[] args) {
        printBinary(9);
    }
    private static void printBinary(int n){
        /*переменная counter для подсчета нулей, которые нужно вписать в текущую строку*/
        int counter = 0;
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            /*перебор от значения counter до n-counter
            * 1 проход - от 0 до n
            * 2 проход - от 1 до n-1
            * таким образом, работаем только с теми ячейками, в которых должны быть 1
            * */
            for (int j = counter; j < n-counter; j++) {
                a[i][j] = 1;
            }
            /*если меньше половины строк обработано, увеличиваем counter. если больше или половину - уменьшаем*/
            if(i<n/2)
                counter++;
            else if(i>=n/2)
                counter--;
        }
        /*вывод на экран*/
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
