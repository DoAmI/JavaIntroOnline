package Algorithmization.TasksMassiveOfMassive;
/*Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * 1    1   1
 * 2    2   ...
 * 3    ... n-2
 * ...  n-1 0
 * n    0   0
 */
public class Task5 {
    public static void main(String[] args) {
        forming(10);
    }
    private static int[][] forming(int n){
        /*создание массива*/
        int[][] a = new int[n][n];
        /*перебор всех строк*/
        int formatter;
        for (int i = 0; i < n; i++) {
            /*переменная, которая содержит номер столбца, с которого все дальнейшие цифры будут обнуляться
            * n-i = номер последнего столбца. если от него отнять 0,1,2..., то получим 9,8,7-столбец, до которого заполняются цифры
            * и после которого будут нули
            * */
            formatter = n-1-i;
            /*начиная с formatter и заканчивая 0, заполнить строку i значением i+1(плюс 1 потому, что отсчет строк начинается с 0, а не с 1)*/
            for (int j = formatter;j>=0;j--) {
                a[i][j] = i+1;
            }
        }

        /*вывод на экран*/
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        return a;
    }
}
