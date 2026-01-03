package models;
import java.util.Scanner;

public class trhrt {
    public static void main(String[] args) {
        // Создаем Scanner для чтения ввода с клавиатуры
        Scanner sc = new Scanner(System.in);

        // Читаем два числа: количество строк (n) и столбцов (m)
        int n = sc.nextInt();
        int m = sc.nextInt();

        // Создаем двумерный массив строк размером n x m
        String[][] a = new String[n][m];

        // Заполняем массив данными из ввода
        for (int i = 0; i < a.length; i++) {         // Проходим по строкам
            for (int j = 0; j < a[i].length; j++) {  // Проходим по столбцам каждой строки
                a[i][j] = sc.next();                 // Читаем следующее слово/строку
            }
        }

        // Закрываем Scanner (хорошая практика)
        sc.close();

        // Дополнительно: вывод массива для проверки
        System.out.println("\nВведенный массив:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
