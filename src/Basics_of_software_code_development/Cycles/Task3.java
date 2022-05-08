package Basics_of_software_code_development.Cycles;

public class Task3 {
    /*Найти сумму квадратов первых ста чисел*/
    public double squareSum(){
        int sum = 0;

        for (int i = 0; i <= 100; i++) {
            /*статический метод pow класса Math в качестве первого аргумента принимает число, а второго аргумента - степень*/
            sum+=i;
        }

        return Math.pow(sum,2);
    }
}
