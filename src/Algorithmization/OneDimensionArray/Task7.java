package Algorithmization.OneDimensionArray;

public class Task7 {
    /*Даны действительные числа a,a1,a2. найти max(a1+a2n,a2+a2n-1..)*/
    public static void main(String[] args) {
        /*начальные данные*/
        double[] a = {0.3,5.3,0.6,6,4.1,7.8};
        /*начальная сумма. берем первый и последний элемент*/
        double maxSum = a[0]+a[a.length-1];
        System.out.println(a[0]+" "+a[a.length-1]);
        /*перебор только до половины, т.к. будет вытаскиваться значение и из начала, и с конца*/
        for (int i = 1; i < (a.length)/2; i++) {
            /*берем элемент i и элемент i с конца*/
            double tempSum = a[i]+a[a.length-1-i];
            System.out.println(a[i]+" "+a[a.length-1-i]);
            if(maxSum<tempSum)
                maxSum=tempSum;
        }
        System.out.println(maxSum);
    }
}
