package Basics_of_software_code_development.Cycles;

public class Task4 {
    /*Составить программу нахождения произведения квадратов первых двухсот чисел*/
    public double multiplySum(){
        int multiply = 1;

        for (int i = 1; i <= 200; i++) {
            /*статический метод pow класса Math в качестве первого аргумента принимает число, а второго аргумента - степень*/
            multiply*=i;
        }
        return Math.pow(multiply,2);
    }
}
