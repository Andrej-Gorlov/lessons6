package output;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class BaseMenu {
    protected final Scanner scn;

    protected void cloceScanner(){
        this.scn.close();
    }

    public BaseMenu(){
        this.scn = new Scanner(System.in);
    }

    public int getUserChoice (){
        try {
            menuDefault();
            return this.scn.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введите целое число.");
            this.scn.next(); // Очистка неверного ввода
        }
        return  0;
    }

    private  void menuDefault(){
        System.out.println("\n Выберите процесс.");
        System.out.println(" 1) Сортировка объектов");
        System.out.println(" 2) Корзина интернет магазина");
        System.out.println(" 3) Проверка дублирующего значения");
        System.out.println(" 4) Удаление строк четной длины");
        System.out.println(" 5) Выполнение всех процессов");
        System.out.println(" 0) Выход \n");
    }
}
