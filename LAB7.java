import java.util.InputMismatchException;
import java.util.Scanner;

public class LAB7 {
    private int nu;
    private int de;

    public LAB7(int num, int den) {
        this.nu = num;
        this.de = den;
        System.out.println(nu + "/" + de);
    }

    public static void defaultfraction() {
        System.out.println(1 + "/" + 1);
    }

    public static void createSimpleFrac(LAB7 Fr) {
        System.out.println(Fr.nu + "/" + Fr.de);
    }

    public static void multiply(LAB7 Fr1, LAB7 Fr2) {
        int numL = Fr1.nu * Fr2.nu;
        int denL = Fr1.de * Fr2.de;
        System.out.println("Умножение: " + numL + "/" + denL);
    }

    public static void divide(LAB7 Fr1, LAB7 Fr2) {
        int numL = Fr1.nu * Fr2.de;
        int denL = Fr1.de * Fr2.nu;
        System.out.println("Деление: " + numL + "/" + denL);
    }

    public static void plus(LAB7 Fr1, LAB7 Fr2) {
        int numL = Fr1.nu * Fr2.de + Fr1.de * Fr2.nu;
        int denL = Fr1.de * Fr2.de;
        System.out.println("Сложение: " + numL + "/" + denL);
    }


    public static void minus(LAB7 Fr1, LAB7 Fr2) {
        int numL = Fr1.nu * Fr2.de - Fr1.de * Fr2.nu;
        int denL = Fr1.de * Fr2.de;
        System.out.println("Вычитание: " + numL + "/" + denL);
    }


    public static void main(String args[]) {
        defaultfraction();
        int result;
        try {
            Scanner console = new Scanner(System.in);
            System.out.println("Пожалуйста, введите числитель первой дроби:");
            int nu1 = console.nextInt();
            System.out.println("Пожалуйста, введите знаменатель первой дроби:");
            int de1 = console.nextInt();
            System.out.println("Пожалуйста, введите числитель второй дроби:");
            int nu2 = console.nextInt();
            System.out.println("Пожалуйста, введите знаменатель второй дроби:");
            int de2 = console.nextInt();
            console.close();
            result = nu1 / de1;
            result = nu2 / de2;
            LAB7 Fr1 = new LAB7(nu1, de1);
            LAB7 Fr2 = new LAB7(nu2, de2);
            plus(Fr1, Fr2);
            minus(Fr1, Fr2);
            multiply(Fr1, Fr2);
            divide(Fr1, Fr2);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка в вводе данных для дробей(перед этим перезапустите данную программу).");
        } catch (ArithmeticException e) {
            System.out.println("В одной из двух дробей или в них обеих был найден 0, который является знаменателем. Исходя из этого, деление будет невозможно,попробуйте ещё раз, не используя 0 в качестве знаменателя любой из нужных дробей(перед этим перезапустите данную программу).");
        }
    }
}