package Algorithmization.OneDimensionArray;

public class Task4 {
    /*Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.*/

    public static void main(String[] args) {
        int[] a = minmaxChanging(new int[]{10, 6, 3, -1});
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
    private static int[] minmaxChanging(int[] a){
        /*начальное инициирование индексов минимального и максимального числа*/
        int minIndex = 0, maxIndex = 0, temp;
        /*перебор элементов и их сравнение. нулевой элемент пропускаем, т.к. он уже присвоен индексам*/
        for (int i = 1; i < a.length; i++) {
            if(a[i]>a[maxIndex])
                maxIndex = i;
            if(a[i]<a[minIndex])
                minIndex = i;
        }
        /*смещение значений максимального и минимального элемента с помощью переменной temp*/
        temp = a[minIndex];
        a[minIndex] = a[maxIndex];
        a[maxIndex] = temp;
        return a;
    }
}
