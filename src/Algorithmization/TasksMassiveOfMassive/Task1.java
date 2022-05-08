package Algorithmization.TasksMassiveOfMassive;
/* Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.*/
public class Task1 {
    private void printer(int[][] a){
        /*перебор каждого 2 элемента, начиная с 1*/
        for (int i = 1; i < a.length; i+=2) {
            /*если первый элемент i-го столбца больше последнего элемента i-го столбца*/
            if(a[i][1]>a[i][a[i].length-1]){
                /*вывод на экран каждого элемента i-го столбца*/
                for (int j = 0; j < a[i].length; j++) {
                    System.out.println(a[i][j]);
                }
            }
        }
    }
}
