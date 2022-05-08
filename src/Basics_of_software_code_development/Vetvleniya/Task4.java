package Basics_of_software_code_development.Vetvleniya;

public class Task4 {
    /*Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие*/

    private boolean willPass(int A,int B,int x,int y,int z){
        /*кирпич пройдет, если его ширина и длина меньше или равна ширины и длины отверстия*/
        if (x<=A && x<=B)
            return true;
        else
            return false;
    }
}
