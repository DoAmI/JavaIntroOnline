package Algorithmization.TasksMassiveOfMassive;

import java.util.Scanner;

/*В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
пользователь с клавиатуры.
*/
public class Task8 {
    public static void main(String[] args) {
        /*создание, заполнение и вывод первоначального массива*/
        int[][] a = new int[10][10];
        for (int i = 0; i<a.length; i++) {
            for (int j = 0; j<a[i].length; j++) {
                a[i][j] = i+j;
                System.out.print(a[i][j]+"|");
            }
            System.out.println();
        }
        /*ввод номеров столбцов для смены значений*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите номер столбца A");
        int rowA = scanner.nextInt();
        System.out.println("введите номер столбца B");
        int rowB = scanner.nextInt();

        /*если номера столбцов не в пределах от 0 до 9, то выбрасывается исключение*/
        if(rowA>9 || rowB>9 || rowA<0 || rowB<0){
            throw new ArrayIndexOutOfBoundsException("номера столбцов должны быть от 0 до 9");
        }

        /*меняются значения из 2 столбцов*/
        int temp;
        for (int i = 0; i < a.length; i++) {
            temp = a[i][rowA];
            a[i][rowA] = a[i][rowB];
            a[i][rowB] = temp;
        }
        /*вывод измененной матрицы*/
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
