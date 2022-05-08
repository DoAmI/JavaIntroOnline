package Basics_of_software_code_development.Vetvleniya;

public class Task3 {
    /*Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой*/

    /*метод для вычисления. принимает в качестве параметров 3 объекта класса Dot*/
    private boolean isLocated(Dot a, Dot b, Dot c){
        boolean isLoc = false;
        /*
        * координаты X,Y у точки c должны быть между значениями X,Y у точек a и b
        * т.е. если точка A(1,1)
        * и точка C(3,3)
        * то точка B, лежащая между ними, должна иметь координаты 2,2
        * */
        for (int i = a.x; i < c.x; i++) {
            if(a.x+i==b.x && a.y+i==b.y){
                isLoc = true;
                break;
            }
        }
        return isLoc;
    }
}

/*класс для описания точек. у каждого объекта будет x и y координаты*/
class Dot{
    int x,y;
}
